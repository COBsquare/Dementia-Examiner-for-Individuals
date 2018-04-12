package ImageProcessing.application;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

import App.User;
import ImageProcessing.Utils.Utils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class WebcamTestController {
	@FXML
	private ImageView webcamViewer;
	@FXML
	private Button btn_yes;
	@FXML
	private Button btn_no;

	private boolean cameraActive;
	private VideoCapture capture;
	private ScheduledExecutorService timer;

	private Stage stage;

	protected void init() {

		this.cameraActive = false;
		this.capture = new VideoCapture();

		openWebcam();
	}

	public void openWebcam() {
		// set a fixed width for the frame
		this.webcamViewer.setFitWidth(600);
		// preserve image ratio
		this.webcamViewer.setPreserveRatio(true);

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
						if (webcamViewer != null) {
							// effectively grab and process a single frame
							Mat frame = grabFrame();

							//Show the frame
							webcamViewer.setVisible(true);
							updateImageView(webcamViewer, Utils.mat2Image(frame));
						}

					}
				};

				this.timer = Executors.newSingleThreadScheduledExecutor();
				this.timer.scheduleAtFixedRate(frameGrabber, 0, 33, TimeUnit.MILLISECONDS);

			} else {
				// log the error
				System.err.println("Impossible to open the camera connection...");
			}
		}
	}

	@FXML
	protected void select_yes() {
		User.setMicCheck(true);
		stage.close();
	}

	@FXML
	protected void select_no() {
		User.setMicCheck(false);
		stage.close();
	}

	// Update the {@link ImageView} in the JavaFX main thread
	public static void updateImageView(ImageView view, Image image) {
		Utils.onFXThread(view.imageProperty(), image);
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

	// Set the current stage (needed for the FileChooser modal window)
	public void setStage(Stage stage) {
		this.stage = stage;
	}
}
