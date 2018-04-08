package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.opencv.core.Point;

import ImageProcessing.Models.CCircle;
import ImageProcessing.Models.CLine;

public class ImageProcessing_Models_Tests {

	// CCircle class test cases
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
		circle.center.x = 1;
		circle.center.y = 2;

		assertTrue(circle.getCenter().x == 1 && circle.getCenter().y == 2);
	}

	// CLine class test cases
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

		assertTrue(line.getEnd().x == 1 && line.getEnd().y == 1);
	}

	@Test
	public void test_lengthOfLine() {
		CLine line = new CLine(new Point(0, 0), new Point(0, 4));

		assertTrue(line.lengthOfLine() == 4);
	}

}
