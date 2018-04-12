package ImageProcessing.application;

import org.opencv.core.Core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class WebcamTestMain extends Application{
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("WebcamTest.fxml"));
			BorderPane root = (BorderPane) loader.load();
			Scene scene = new Scene(root, 770, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Webcam Test");
			this.primaryStage.setScene(scene);
			this.primaryStage.show();

			WebcamTestController controller = loader.getController();
			controller.setStage(this.primaryStage);
			controller.init();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		launch(args);
		
	}

}
