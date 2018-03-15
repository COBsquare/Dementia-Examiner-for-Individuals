package ImageProcessing.Models;

import org.opencv.core.Point;

//Subclass for the line's features
public class CLine {
	public Point start;
	public Point end;

	public CLine(Point start, Point end) {
		this.start = start;
		this.end = end;
	}
	
	public CLine(){
		start=new Point();
		end=new Point();
	}

	public double lengthOfLine(){
		return Math.hypot(start.x - end.x, start.y - end.y);
	}
}