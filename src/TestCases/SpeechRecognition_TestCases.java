package TestCases;

import static org.junit.Assert.*;
import org.junit.Test;

import ImageProcessing.application.ImageRecognitionController;
import SpeechRecognition.Evaluation;


public class SpeechRecognition_TestCases {

	@Test
	public void test_setgetDrawingType() {
		ImageRecognitionController.setDrawingType("Clock Drawing");

		assertTrue(ImageRecognitionController.getDrawingType() == "Clock Drawing");
	}

}


