package ImageProcessing.Utils;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.imgproc.Imgproc;

import ImageProcessing.Models.CCircle;
import ImageProcessing.Models.CLine;

public final class Find {
	// Finds boundary boxes in given frame
	public static Rect[] AllBoundaryBoxes(Mat frame) {
		List<MatOfPoint> contours = new ArrayList<>();
		Mat hierarchy = new Mat();
		Mat frame_BB = new Mat();

		Imgproc.threshold(frame, frame_BB, 1, 255, 0);
		Imgproc.findContours(frame_BB, contours, hierarchy, Imgproc.RETR_CCOMP, Imgproc.CHAIN_APPROX_SIMPLE);

		// We need array type of contours
		MatOfPoint[] contours_array = new MatOfPoint[contours.size()];
		for (int i = 0; i < contours.size(); i++) {
			contours_array[i] = contours.get(i);
		}

		Rect[] boundRect = new Rect[contours.size()];

		for (int i = 0; i < contours.size(); i++) {
			MatOfPoint2f temp_contours = new MatOfPoint2f();
			MatOfPoint2f temp_poly = new MatOfPoint2f();
			MatOfPoint contours_poly = new MatOfPoint();

			// Convert contours(i) from MatOfPoint to MatOfPoint2f
			contours_array[i].convertTo(temp_contours, CvType.CV_32FC2);

			// Functions expect MatOfPoint2f
			// Because of that, we made temporary conversion
			// Get bounding rects and circles
			Imgproc.approxPolyDP(temp_contours, temp_poly, 3.0, true);

			temp_poly.convertTo(contours_poly, CvType.CV_32S);
			boundRect[i] = Imgproc.boundingRect(contours_poly);

			// Convert back
			temp_contours.convertTo(contours.get(i), CvType.CV_32S);
		}

		return boundRect;

	}

	// Finds biggest boundary boxes
	public static Mat LargestBoundaryBox(Mat frame, int match) {

		Rect[] boundRect = AllBoundaryBoxes(frame);

		// Find the biggest rectangle acording to the matching order
		int index = 0;
		ArrayList<Integer> found_index = new ArrayList<Integer>();
		int tol = 0;
		while (tol < match) {
			double maxArea = 0;
			for (int i = 0; i < boundRect.length; i++) {
				if (boundRect[i].area() > maxArea && !found_index.contains(i)) {
					maxArea = boundRect[i].area();
					index = i;
				}
			}
			found_index.add(index);
			tol++;
		}

		// Mark the defined area
		Rect rectCrop = new Rect(boundRect[index].x, boundRect[index].y, boundRect[index].width,
				boundRect[index].height);

		// Crop the specified area
		Mat frame_rectangle = new Mat(frame, rectCrop);

		return frame_rectangle;
	}

	// Finds circle boundary boxes in given frame
	// Returns Circle type with the radius and center attributes
	public static CCircle LargestCircle(Mat frame) {
		List<MatOfPoint> contours = new ArrayList<>();
		Mat hierarchy = new Mat();
		Mat frame_BB = new Mat();

		Imgproc.threshold(frame, frame_BB, 0, 255, 0);
		Imgproc.findContours(frame_BB, contours, hierarchy, Imgproc.RETR_CCOMP, Imgproc.CHAIN_APPROX_SIMPLE);

		// We need array type of contours
		MatOfPoint[] contours_array = new MatOfPoint[contours.size()];
		for (int i = 0; i < contours.size(); i++) {
			contours_array[i] = contours.get(i);
		}

		Point[] center = new Point[contours.size()];
		float[] radius = new float[contours.size()];

		for (int i = 0; i < contours.size(); i++) {
			MatOfPoint2f temp_contours = new MatOfPoint2f();
			MatOfPoint2f temp_poly = new MatOfPoint2f();

			// Convert contours(i) from MatOfPoint to MatOfPoint2f
			contours_array[i].convertTo(temp_contours, CvType.CV_32FC2);

			// Functions expect MatOfPoint2f
			// Because of that, we made temporary conversion
			// Get bounding rects and circles
			Imgproc.approxPolyDP(temp_contours, temp_poly, 3.0, true);

			// Convert back
			temp_contours.convertTo(contours.get(i), CvType.CV_32S);

			// Initialize center avoiding null
			center[i] = new Point();
			center[i].x = 0;
			center[i].y = 0;

			// Initialize temp radius
			float[] r = new float[1];
			r[0] = 0;
			Imgproc.minEnclosingCircle(temp_poly, center[i], r);
			radius[i] = r[0];

		}

		// Find the biggest circle in paper
		// Second circle is the clock

		int index = 0;
		int found = -1;
		int tol = 0;
		while (tol < 2) {
			float maxRadius = 0;
			for (int i = 0; i < radius.length; i++) {
				if (radius[i] > maxRadius && i != found) {
					maxRadius = radius[i];
					index = i;
				}
			}
			found = index;
			tol++;
		}

		return new CCircle(radius[index], center[index]);
	}

	public static double Angle(CLine line) {
		double angle = Math.toDegrees(Math.atan2(line.start.y - line.end.y, line.start.x - line.end.x));
		if (angle < 0) {
			angle += 360;
		}

		return angle;
	}

}
