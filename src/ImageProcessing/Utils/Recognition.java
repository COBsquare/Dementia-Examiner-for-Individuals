package ImageProcessing.Utils;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfInt;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

import ImageProcessing.Models.CCircle;
import ImageProcessing.Models.CLine;
import ImageProcessing.application.ImageRecognitionController;
import javafx.scene.image.ImageView;

public final class Recognition {

	// Calls and operates functions in proper order to find clock drawing and polygon shapes
	public static Mat getFigure(Mat frame_original) {

		// Create histogram and find threshold
		Mat frame_afterHist = Recognition.createHistogram(frame_original);

		// Blur, erode, and dilate
		Mat frame_morpOut = Recognition.morpOperations(frame_afterHist);

		// Find the boundary boxes
		// First rectangle-assume it is paper
		Mat frame_paper = Find.LargestBoundaryBox(frame_morpOut, 1);
		//this.updateImageView(clock_image, Utils.mat2Image(frame_paper));

		// Second BB-Figure
		// Clockface or Polygon shape
		Mat frame_figure = Find.LargestBoundaryBox(frame_paper, 2);
		//this.updateImageView(clock_image, Utils.mat2Image(frame_figure));

		return frame_figure;
	}

	// Creates histogram and finds density and peak points to specify threshold
	// After thresholding returns new cropped image
	public static Mat createHistogram(Mat frame_original) {

		// Split the frames in multiple images
		List<Mat> images = new ArrayList<Mat>();
		Core.split(frame_original, images);

		// Set the number of bins at 256
		MatOfInt histSize = new MatOfInt(256);
		// Only one channel (Gray scale)
		MatOfInt channels = new MatOfInt(0);
		// Set the ranges
		MatOfFloat histRange = new MatOfFloat(0, 256);

		// Compute the histogram
		Mat histogram = new Mat();
		Imgproc.calcHist(images.subList(0, 1), channels, new Mat(), histogram, histSize, histRange, false);
		// View the histogram
		//System.out.println(histogram.dump());

		// Find peak point (Global maximum)
		double max_value = 0;
		int peak = 0;
		for (int i = 0; i < 256; i++) {
			if (histogram.get(i, 0)[0] > max_value) {
				max_value = histogram.get(i, 0)[0];
				peak = i;
			}
		}
		
		//System.out.println("Peak Value & Index: " + histogram.get(peak, 0)[0] + "-" + peak);

		// Find left most peak point for threshold (Local maximum)
		int tol = 0;
		double value = max_value;
		int left_peak = 0;
		
		for (int i = peak - 1; i > 0; i--) {
			if (tol < 10) {
				if (value > histogram.get(i, 0)[0]) {
					value = histogram.get(i, 0)[0];
				} else {
					tol++;
					left_peak = i;
				}
			}
		}

		//System.out.println("Threshold Value & Index: " + histogram.get(left_peak, 0)[0] + "-" + left_peak);

		// Define threshold for the new image
		Mat frame_afterHist = new Mat();
		Imgproc.threshold(frame_original, frame_afterHist, left_peak, 255, 0);

		return frame_afterHist;
	}

	// Blur, dilate, and erode
	public static Mat morpOperations(Mat frame) {
		// Remove some noise
		Mat blurredImage = new Mat();
		Mat morphOutput = new Mat();
		Imgproc.blur(frame, blurredImage, new Size(2, 2));

		// Morphological operators
		Mat dilateElement = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(3, 3));
		Mat erodeElement = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(3, 3));

		// Dilate and erode in series
		Imgproc.erode(blurredImage, morphOutput, erodeElement);
		Imgproc.dilate(morphOutput, morphOutput, dilateElement);

		return morphOutput;
	}

	// Applies canny edge detector and find lines with the hough line transformation
	public static Mat houghlineTransform(Mat frame) {
		// Apply canny edge detector
		// canny detector, with ratio of lower:upper threshold of 3:1
		Mat detectedEdges = new Mat();
		Imgproc.Canny(frame, detectedEdges, 30, 70);

		// Probabilistic Hough Line Transform
		/*
		Imgproc.HoughLinesP(dst, lines, rho, theta, threshold, minLineLength, maxLineGap);
		
		dst: Output of the edge detector. It should be a grayscale image (although in fact it is a binary one)
		lines: A vector that will store the parameters (x_{start}, y_{start}, x_{end}, y_{end}) of the detected lines
		rho : The resolution of the parameter r in pixels. We use 1 pixel.
		theta: The resolution of the parameter \theta in radians. We use 1 degree (CV_PI/180)
		threshold: The minimum number of intersections to “detect” a line
		minLineLength: The minimum number of points that can form a line. Lines with less than this number of points are disregarded.
		maxLineGap: The maximum gap between two points to be considered in the same line.
		*/

		Mat lines = new Mat();
		// Values are based on experiments
		Imgproc.HoughLinesP(detectedEdges, lines, 1, Math.PI / 180, 5, 10, 2);

		return lines;
	}

	// Display methods for circle and rectangle
	public static void display(Mat frame, ImageView view, CCircle c, Scalar color) {
		Imgproc.circle(frame, c.center, (int) c.radius, color, 3);
		ImageRecognitionController.updateImageView(view, Utils.mat2Image(frame));
	}

	public static void display(Mat frame, ImageView view, Rect r) {
		Imgproc.rectangle(frame, r.tl(), r.br(), new Scalar(250, 0, 0), 3);
		ImageRecognitionController.updateImageView(view, Utils.mat2Image(frame));
	}

	public static void display(Mat frame, ImageView view, CLine line, Scalar color) {
		Imgproc.line(frame, line.start, line.end, color, 8);
		ImageRecognitionController.updateImageView(view, Utils.mat2Image(frame));
	}

	public static void display(Mat frame, ImageView view, Rect[] components, Scalar color) {
		// Display the components
		for (int i = 0; i < components.length; i++) {
			Imgproc.rectangle(frame, components[i].tl(), components[i].br(), color, 3);
		}
		ImageRecognitionController.updateImageView(view, Utils.mat2Image(frame));
	}

}
