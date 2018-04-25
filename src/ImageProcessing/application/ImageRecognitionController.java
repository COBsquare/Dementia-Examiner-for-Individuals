package ImageProcessing.application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;

import ImageProcessing.Evaluation.Clock;
import ImageProcessing.Evaluation.Polygon;
import ImageProcessing.Utils.Recognition;
import ImageProcessing.Utils.Utils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ImageRecognitionController {

	@FXML
	private ImageView imageViewer;
	@FXML
	private Button browse_image;
	@FXML
	private Button open_webcam;
	@FXML
	private Button save_image;

	// Variables for image browser
	private FileChooser fileChooser;
	private Stage stage;
	private Mat image;
	private List<Mat> planes;

	// Variables for starting webcam
	private boolean cameraActive;
	private VideoCapture capture;
	private ScheduledExecutorService timer;
	private Mat catch_frame;

	// Variables for image processing operations
	public static int CLOCK_SCORE;
	public int LIT_POLY_SCORE;
	public int ILL_POLY_SCORE;

	static String drawingType;

	public static void setDrawingType(String type) {
		drawingType = type;
	}
	
	public static String getDrawingType() {
		return drawingType;
	}

	protected void init() {
		this.fileChooser = new FileChooser();
		this.image = null;
		this.planes = new ArrayList<>();

		this.cameraActive = false;
		this.capture = new VideoCapture();
		this.catch_frame = new Mat();

		CLOCK_SCORE = 0;
		LIT_POLY_SCORE = 0;
		ILL_POLY_SCORE = 0;

		drawingType = "Clock Drawing";

	}

	// Browse image
	@FXML
	protected void loadImage() {
		// show the open dialog window
		File file = this.fileChooser.showOpenDialog(this.stage);
		if (file != null) {
			// read the image in color
			this.image = Imgcodecs.imread(file.getAbsolutePath(), Imgcodecs.CV_LOAD_IMAGE_COLOR);
			// show the image
			imageViewer.setVisible(true);
			ImageRecognitionController.updateImageView(imageViewer, Utils.mat2Image(this.image));
			// set a fixed width
			this.imageViewer.setFitWidth(600);
			// preserve image ratio
			this.imageViewer.setPreserveRatio(true);

			// empty the image planes and the image views if it is not the first
			// loaded image
			if (!this.planes.isEmpty()) {
				this.planes.clear();
			}

		}
	}

	// Set the current stage (needed for the FileChooser modal window)
	public void setStage(Stage stage) {
		this.stage = stage;
	}

	// Capture image from webcam
	@FXML
	protected void startCamera() {
		// set a fixed width for the frame
		this.imageViewer.setFitWidth(600);
		// preserve image ratio
		this.imageViewer.setPreserveRatio(true);

		if (!this.cameraActive) {
			// start the video capture
			this.capture.open(0);

			// is the video stream available?
			if (this.capture.isOpened()) {
				this.cameraActive = true;

				// grab a frame every 33 ms (30 frames/sec)
				Runnable frameGrabber = new Runnable() {

					@Override
					public void run() {
						// effectively grab and process a single frame
						Mat frame = grabFrame();

						//Show the frame
						imageViewer.setVisible(true);
						updateImageView(imageViewer, Utils.mat2Image(frame));
						catch_frame = frame;
					}
				};

				this.timer = Executors.newSingleThreadScheduledExecutor();
				this.timer.scheduleAtFixedRate(frameGrabber, 0, 33, TimeUnit.MILLISECONDS);

				// update the button content
				this.open_webcam.setText("Capture Image");
			} else {
				// log the error
				System.err.println("Impossible to open the camera connection...");
			}
		} else {
			// Capture the image
			this.image = catch_frame;

			// the camera is not active at this point
			this.cameraActive = false;
			// update again the button content
			this.open_webcam.setText("Start Camera Again");

			// stop the timer
			this.stopAcquisition();
		}
	}

	// Get a frame from the opened video stream (if any)
	private Mat grabFrame() {
		Mat frame = new Mat();

		// check if the capture is open
		if (this.capture.isOpened()) {
			try {
				// read the current frame
				this.capture.read(frame);
			} catch (Exception e) {
				// log the error
				System.err.println("Exception during the frame elaboration: " + e);
			}
		}

		return frame;
	}

	// Stop the acquisition from the camera and release all the resources
	private void stopAcquisition() {
		if (this.timer != null && !this.timer.isShutdown()) {
			try {
				// stop the timer
				this.timer.shutdown();
				this.timer.awaitTermination(33, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				// log any exception
				System.err.println("Exception in stopping the frame capture, trying to release the camera now... " + e);
			}
		}

		if (this.capture.isOpened()) {
			// release the camera
			this.capture.release();
		}
	}

	// Update the {@link ImageView} in the JavaFX main thread
	public static void updateImageView(ImageView view, Image image) {
		Utils.onFXThread(view.imageProperty(), image);
	}

	// Keep current image and start processing
	@FXML
	protected void saveImage() throws IOException {
		// Clear the console
		for (int i = 0; i < 100; i++) {
			System.out.println("");
		}

		if (image != null) {
			try {
				Imgproc.cvtColor(image, image, Imgproc.COLOR_BGR2GRAY);
			} catch (Exception e) {
				image = null;
			}

			Mat frame_figure = Recognition.getFigure(image);

			if (drawingType == "Clock Drawing") {
				
				Imgcodecs.imwrite("Resources\\Answers\\user_clock.jpg", frame_figure);
				CLOCK_SCORE = Clock.evaluateClock(frame_figure, imageViewer);

			} else if (drawingType == "Literate Polygon") {
				
				Imgcodecs.imwrite("Resources\\Answers\\user_poly.jpg", frame_figure);
				LIT_POLY_SCORE = Polygon.evaluatePolygon_Literate(frame_figure, imageViewer);

			} else if (drawingType == "Illiterate Polygon") {

				Imgcodecs.imwrite("Resources\\Answers\\user_poly.jpg", frame_figure);
				ILL_POLY_SCORE = Polygon.evaluatePolygon_Illiterate(frame_figure, imageViewer);

			}

		} else {
			JOptionPane.showMessageDialog(null, "Please browse or capture image to process.", "Info: " + "No image",
					JOptionPane.INFORMATION_MESSAGE);
		}
		

	}

	
	public int getCLOCK_SCORE() {
		return CLOCK_SCORE;
	}

	public void setCLOCK_SCORE(int cLOCK_SCORE) {
		CLOCK_SCORE = cLOCK_SCORE;
	}

	public int getLIT_POLY_SCORE() {
		return LIT_POLY_SCORE;
	}

	public void setLIT_POLY_SCORE(int lIT_POLY_SCORE) {
		LIT_POLY_SCORE = lIT_POLY_SCORE;
	}

	public int getILL_POLY_SCORE() {
		return ILL_POLY_SCORE;
	}

	public void setILL_POLY_SCORE(int iLL_POLY_SCORE) {
		ILL_POLY_SCORE = iLL_POLY_SCORE;
	}

	
}
