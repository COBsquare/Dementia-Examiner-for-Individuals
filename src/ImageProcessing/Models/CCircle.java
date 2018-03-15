package ImageProcessing.Models;

import org.opencv.core.Point;

//Subclass for the clock face's center and radius
public class CCircle {
	public double radius;
	public Point center;

	public CCircle(double radius, Point center) {

		this.radius = radius;
		this.center = center;
	}
}
