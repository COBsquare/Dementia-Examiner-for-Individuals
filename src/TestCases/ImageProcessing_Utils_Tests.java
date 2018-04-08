package TestCases;

import static org.junit.Assert.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import ImageProcessing.Utils.Find;
import ImageProcessing.Utils.Recognition;
import javafx.scene.image.Image;

public class ImageProcessing_Utils_Tests {

	// "Find" class test cases
	
	@Test
	public void test_AllBoundaryBoxes() {
		File file = new File("Resources/Samples/_clockSample2.jpg");
		Mat image = Imgcodecs.imread(file.getAbsolutePath(), Imgcodecs.CV_LOAD_IMAGE_COLOR);
		Imgproc.cvtColor(image, image, Imgproc.COLOR_BGR2GRAY);

		Mat frame = Recognition.getFigure(image);

		Rect[] rects=Find.AllBoundaryBoxes(frame);
		
		assertTrue(rects.length>0);
	}

	@Test
	public void test_LargestBoundaryBox() {

	}

	@Test
	public void test_LargestCircle() {

	}

	@Test
	public void test_Angle() {

	}

	// "Network" class test cases
	
	@Test
	public void test_train() {

	}

	@Test
	public void test_main() {

	}

	// "Recognition" class test cases
	
	@Test
	public void test_getFigure() {

	}

	@Test
	public void test_createHistogram() {

	}

	@Test
	public void test_morpOperations() {

	}

	@Test
	public void test_houghlineTransform() {

	}

	@Test
	public void test_displayCircle() {

	}

	@Test
	public void test_displayRect() {

	}

	@Test
	public void test_displayLine() {

	}

	@Test
	public void test_displayComponents() {

	}

	// "Utils" class test cases
	
	@Test
	public void test_mat2Image() {

	}

	@Test
	public void test_onFXThread() {

	}

	@Test
	public void test_matToBufferedImage() {

	}

}
