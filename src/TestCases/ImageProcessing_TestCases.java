package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.opencv.core.Point;

import ImageProcessing.Models.CCircle;
import ImageProcessing.Models.CLine;
import ImageProcessing.application.ImageRecognitionController;

public class ImageProcessing_TestCases {

	// "ImageRecognitionController" class test cases
	@Test
	public void test_setgetDrawingType() {
		ImageRecognitionController.setDrawingType("Clock Drawing");

		assertTrue(ImageRecognitionController.getDrawingType() == "Clock Drawing");
	}
	@Test
	public void test_setgetClockScore() {
		ImageRecognitionController contr = new ImageRecognitionController();
		contr.setCLOCK_SCORE(10);

		assertTrue(contr.getCLOCK_SCORE() == 10);
	}
	@Test
	public void test_setgetPolyIlliterateScore() {
		ImageRecognitionController contr = new ImageRecognitionController();
		contr.setILL_POLY_SCORE(5);

		assertTrue(contr.getILL_POLY_SCORE() == 5);
	}
	@Test
	public void test_setgetPolyLiterateScore() {
		ImageRecognitionController contr = new ImageRecognitionController();
		contr.setLIT_POLY_SCORE(3);

		assertTrue(contr.getLIT_POLY_SCORE() == 3);
	}

	// "CCircle" class test cases
	@Test
	public void test_CCirleConst() {
		CCircle circle = new CCircle();

		assertTrue(circle != null);
	}
	@Test
	public void test_CCirleConstParam() {
		CCircle circle = new CCircle(3, new Point(1, 2));

		assertTrue(circle.radius == 3 && circle.center.x == 1 && circle.center.y == 2);
	}
	@Test
	public void test_setRadius() {
		CCircle circle = new CCircle();
		circle.setRadius(10);

		assertTrue(circle.radius == 10);
	}
	@Test
	public void test_getRadius() {
		CCircle circle = new CCircle();
		circle.radius = 10;

		assertTrue(circle.getRadius() == 10);
	}
	@Test
	public void test_setCenter() {
		CCircle circle = new CCircle();
		circle.setCenter(new Point(4, 5));

		assertTrue(circle.center.x == 4 && circle.center.y == 5);
	}
	@Test
	public void test_getCenter() {
		CCircle circle = new CCircle();
		circle.setCenter(new Point(1,2));

		assertTrue(circle.getCenter().x == 1 && circle.getCenter().y == 2);
	}

	// "CLine" class test cases
	@Test
	public void test_ClineConst() {
		CLine line = new CLine();

		assertTrue(line != null);
	}
	@Test
	public void test_ClineConstParam() {
		CLine line = new CLine(new Point(1, 2), new Point(3, 4));

		assertTrue(line.start.x == 1 && line.start.y == 2 && line.end.x == 3 && line.end.y == 4);
	}
	@Test
	public void test_setStart() {
		CLine line = new CLine();
		line.setStart(new Point(3, 5));

		assertTrue(line.start.x == 3 && line.start.y == 5);
	}
	@Test
	public void test_getStart() {
		CLine line = new CLine(new Point(1, 1), new Point(2, 2));

		assertTrue(line.getStart().x == 1 && line.getStart().y == 1);
	}
	@Test
	public void test_setEnd() {
		CLine line = new CLine();
		line.setEnd(new Point(8, 9));

		assertTrue(line.end.x == 8 && line.end.y == 9);
	}
	@Test
	public void test_getEnd() {
		CLine line = new CLine(new Point(1, 1), new Point(2, 2));

		assertTrue(line.getEnd().x == 2 && line.getEnd().y == 2);
	}
	@Test
	public void test_lengthOfLine() {
		CLine line = new CLine(new Point(0, 0), new Point(0, 4));

		assertTrue(line.lengthOfLine() == 4);
	}

	// "Clock" class test cases
	@Test
	public void test_setgetClockface() {
		ImageProcessing.Evaluation.Clock.setClockface(new CCircle(1, new Point(2, 3)));

		assertTrue(ImageProcessing.Evaluation.Clock.getClockface().radius == 1 && ImageProcessing.Evaluation.Clock
				.getClockface().center.x == 2);
	}
	@Test
	public void test_setgetClockfaceScore() {
		ImageProcessing.Evaluation.Clock.setClockface_score(2);

		assertTrue(ImageProcessing.Evaluation.Clock.getClockface_score() == 2);
	}
	@Test
	public void test_setgetNumbersScore() {
		ImageProcessing.Evaluation.Clock.setNumbers_score(4);

		assertTrue(ImageProcessing.Evaluation.Clock.getNumbers_score() == 4);
	}
	@Test
	public void test_setgetHandsScore() {
		ImageProcessing.Evaluation.Clock.setHands_score(3);

		assertTrue(ImageProcessing.Evaluation.Clock.getHands_score() == 3);
	}

	// "Polygon" class test cases
	@Test
	public void test_setgetEdgesScore() {
		ImageProcessing.Evaluation.Polygon.setEdges_score(13);

		assertTrue(ImageProcessing.Evaluation.Polygon.getEdges_score()==13);
	}

	
}
