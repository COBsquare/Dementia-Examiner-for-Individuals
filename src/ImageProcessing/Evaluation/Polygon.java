package ImageProcessing.Evaluation;

import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

import App.User;
import ImageProcessing.Models.CLine;
import ImageProcessing.Utils.Find;
import ImageProcessing.Utils.Recognition;
import javafx.scene.image.ImageView;

public final class Polygon {
	static double score = 0;

	// Evaluate the illiterate polygon which is a square
	public static int evaluatePolygon_Illiterate(Mat frame, ImageView imageViewer) {

		Mat lines = new Mat();
		lines = Recognition.houghlineTransform(frame);

		// Dividing the lines acording to their locations
		CLine top_edge = new CLine();
		CLine bottom_edge = new CLine();
		CLine left_edge = new CLine();
		CLine right_edge = new CLine();

		CLine area1_edge = new CLine();
		CLine area2_edge = new CLine();
		CLine area3_edge = new CLine();
		CLine area4_edge = new CLine();

		double[] temps = { 1000, 0, 1000, 0, 1000, 0, 1000, 0, 0, 0, 1000, 1000, 1000, 0, 1000, 0 };

		for (int i = 0; i < lines.rows(); i++) {
			double line_angle = Math.toDegrees(Math.atan2(lines.get(i, 0)[1] - lines.get(i, 0)[3], lines.get(i, 0)[0]
					- lines.get(i, 0)[2]));
			if (line_angle < 0) {
				line_angle += 360;
			}
			// Top-lines
			if (line_angle > 170 && line_angle < 190 && lines.get(i, 0)[1] < frame.height() / 2) {
				if (lines.get(i, 0)[0] < temps[0]) {
					temps[0] = lines.get(i, 0)[0];
					top_edge.start.x = lines.get(i, 0)[0];
					top_edge.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[2] > temps[1]) {
					temps[1] = lines.get(i, 0)[2];
					top_edge.end.x = lines.get(i, 0)[2];
					top_edge.end.y = lines.get(i, 0)[3];
				}

			}
			// Bottom-lines
			else if (line_angle > 170 && line_angle < 190 && lines.get(i, 0)[1] > frame.height() / 2) {
				if (lines.get(i, 0)[0] < temps[2]) {
					temps[2] = lines.get(i, 0)[0];
					bottom_edge.start.x = lines.get(i, 0)[0];
					bottom_edge.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[2] > temps[3]) {
					temps[3] = lines.get(i, 0)[2];
					bottom_edge.end.x = lines.get(i, 0)[2];
					bottom_edge.end.y = lines.get(i, 0)[3];
				}

			}
			// Left-lines
			else if (line_angle > 80 && line_angle < 100 && lines.get(i, 0)[0] < frame.width() / 2) {
				if (lines.get(i, 0)[1] < temps[4]) {
					temps[4] = lines.get(i, 0)[1];
					left_edge.start.x = lines.get(i, 0)[0];
					left_edge.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[3] > temps[5]) {
					temps[5] = lines.get(i, 0)[3];
					left_edge.end.x = lines.get(i, 0)[2];
					left_edge.end.y = lines.get(i, 0)[3];
				}

			}
			// Right-lines
			else if (line_angle > 80 && line_angle < 100 && lines.get(i, 0)[0] > frame.width() / 2) {
				if (lines.get(i, 0)[1] < temps[6]) {
					temps[6] = lines.get(i, 0)[1];
					right_edge.start.x = lines.get(i, 0)[0];
					right_edge.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[3] > temps[7]) {
					temps[7] = lines.get(i, 0)[3];
					right_edge.end.x = lines.get(i, 0)[2];
					right_edge.end.y = lines.get(i, 0)[3];
				}

			}

			// Area(+,-)
			else if (line_angle > 120 && line_angle < 150 && lines.get(i, 0)[1] > frame.height() / 2 && lines.get(i,
					0)[0] > frame.width() / 2) {
				if (lines.get(i, 0)[1] > temps[8]) {
					temps[8] = lines.get(i, 0)[1];
					area4_edge.start.x = lines.get(i, 0)[0];
					area4_edge.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[2] > temps[9]) {
					temps[9] = lines.get(i, 0)[2];
					area4_edge.end.x = lines.get(i, 0)[2];
					area4_edge.end.y = lines.get(i, 0)[3];
				}
			}

			// Area(-,+)
			else if (line_angle > 120 && line_angle < 150 && lines.get(i, 0)[1] < frame.height() / 2 && lines.get(i,
					0)[0] < frame.width() / 2) {
				if (lines.get(i, 0)[0] < temps[10]) {
					temps[10] = lines.get(i, 0)[0];
					area1_edge.start.x = lines.get(i, 0)[0];
					area1_edge.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[3] < temps[11]) {
					temps[11] = lines.get(i, 0)[3];
					area1_edge.end.x = lines.get(i, 0)[2];
					area1_edge.end.y = lines.get(i, 0)[3];
				}
			}

			// Area(+,+)
			else if (line_angle > 205 && line_angle < 255 && lines.get(i, 0)[0] > frame.width() / 2 && lines.get(i,
					0)[1] < frame.height() / 2) {

				if (lines.get(i, 0)[1] < temps[12]) {
					temps[12] = lines.get(i, 0)[1];
					area2_edge.start.x = lines.get(i, 0)[0];
					area2_edge.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[2] > temps[13]) {
					temps[13] = lines.get(i, 0)[2];
					area2_edge.end.x = lines.get(i, 0)[2];
					area2_edge.end.y = lines.get(i, 0)[3];
				}

			}

			// Area(-,-)
			else if (line_angle > 205 && line_angle < 255 && lines.get(i, 0)[0] < frame.width() / 2 && lines.get(i,
					0)[1] > frame.height() / 2) {

				if (lines.get(i, 0)[1] < temps[14]) {
					temps[14] = lines.get(i, 0)[1];
					area3_edge.start.x = lines.get(i, 0)[0];
					area3_edge.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[2] > temps[15]) {
					temps[15] = lines.get(i, 0)[2];
					area3_edge.end.x = lines.get(i, 0)[2];
					area3_edge.end.y = lines.get(i, 0)[3];
				}
			}
		}

		if (imageViewer != null) {
			Imgproc.cvtColor(frame, frame, Imgproc.COLOR_GRAY2BGR);
			// Square
			Recognition.display(frame, imageViewer, top_edge, new Scalar(250, 0, 0));
			Recognition.display(frame, imageViewer, bottom_edge, new Scalar(250, 0, 0));
			Recognition.display(frame, imageViewer, left_edge, new Scalar(0, 0, 250));
			Recognition.display(frame, imageViewer, right_edge, new Scalar(0, 0, 250));

			// Inner Square
			Recognition.display(frame, imageViewer, area1_edge, new Scalar(0, 250, 250));
			Recognition.display(frame, imageViewer, area4_edge, new Scalar(0, 250, 250));
			Recognition.display(frame, imageViewer, area2_edge, new Scalar(0, 250, 0));
			Recognition.display(frame, imageViewer, area3_edge, new Scalar(0, 250, 0));
			Imgproc.cvtColor(frame, frame, Imgproc.COLOR_BGR2GRAY);

		}

		System.out.println("EVALUATION OF PENTAGON");
		System.out.println("-----------------------");

		// Compare the edges lengths with their opposites
		double[][] edgeTwins = new double[][] {
				{ top_edge.lengthOfLine(), bottom_edge.lengthOfLine() },
				{ left_edge.lengthOfLine(), right_edge.lengthOfLine() },
				{ area1_edge.lengthOfLine(), area4_edge.lengthOfLine() },
				{ area2_edge.lengthOfLine(), area3_edge.lengthOfLine() } };

		for (int i = 0; i < 4; i++) {
			// Find the biggest of two edges
			// And define a ratio which is acceptable 
			double big = Math.max(edgeTwins[i][0], edgeTwins[i][1]);
			double ratio = big * 20 / 100;

			if (ratio >= Math.abs(edgeTwins[i][0] - edgeTwins[i][1])) {
				score++;
			}
		}

		User.setScore_polygon(score);

		// If the total score equals or bigger than 3
		// then the polygon can be scored fully otherwise polygon drawing is not sufficent
		if (score >= 3) {
			System.out.println("All edges were drawn correctly.");
			System.out.println("Polygon drawing is correct.");
			User.addAnswer_MMSE("SATISFIED");
			return 1;
		} else {
			System.out.println("Polygon drawing is not sufficient.");
			User.addAnswer_MMSE("NOT SATISFIED");
			return 0;

		}

	}

	// Evaluate the literate polygon which is a pentagon
	public static int evaluatePolygon_Literate(Mat frame, ImageView imageViewer) {

		Mat lines = new Mat();
		lines = Recognition.houghlineTransform(frame);

		// Dividing the lines acording to their locations
		// a: left pentagon, b: right pentagon
		// All edges have their twins on another pentagon
		// edge1a is left bottom, edge1b is right top 
		// Others come in clockwise direction
		CLine edge_1a = new CLine();
		CLine edge_1b = new CLine();
		CLine edge_2a = new CLine();
		CLine edge_2b = new CLine();
		CLine edge_3a = new CLine();
		CLine edge_3b = new CLine();
		CLine edge_4a = new CLine();
		CLine edge_4b = new CLine();
		CLine edge_5a = new CLine();
		CLine edge_5b = new CLine();

		double[] temps = { 1000, 0, 1000, 0, 0, 1000, 0, 1000, 0, 1000, 0, 1000, 0, 1000, 0, 1000, 0, 0, 1000, 1000 };

		for (int i = 0; i < lines.rows(); i++) {
			double line_angle = Math.toDegrees(Math.atan2(lines.get(i, 0)[1] - lines.get(i, 0)[3], lines.get(i, 0)[0]
					- lines.get(i, 0)[2]));
			if (line_angle < 0) {
				line_angle += 360;
			}
			// edge1b-Right pentagon's top
			if (line_angle > 170 && line_angle < 190 && lines.get(i, 0)[1] < frame.height() / 2) {
				if (lines.get(i, 0)[0] < temps[0]) {
					temps[0] = lines.get(i, 0)[0];
					edge_1b.start.x = lines.get(i, 0)[0];
					edge_1b.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[2] > temps[1]) {
					temps[1] = lines.get(i, 0)[2];
					edge_1b.end.x = lines.get(i, 0)[2];
					edge_1b.end.y = lines.get(i, 0)[3];
				}

			}
			// edge1a-Left pentagon's bottom
			else if (line_angle > 170 && line_angle < 190 && lines.get(i, 0)[1] > frame.height() / 2) {
				if (lines.get(i, 0)[0] < temps[2]) {
					temps[2] = lines.get(i, 0)[0];
					edge_1a.start.x = lines.get(i, 0)[0];
					edge_1a.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[2] > temps[3]) {
					temps[3] = lines.get(i, 0)[2];
					edge_1a.end.x = lines.get(i, 0)[2];
					edge_1a.end.y = lines.get(i, 0)[3];
				}

			}
			// edge_2a
			else if (line_angle > 225 && line_angle < 295 && lines.get(i, 0)[0] < frame.width() / 2) {
				if (lines.get(i, 0)[1] > temps[4]) {
					temps[4] = lines.get(i, 0)[1];
					edge_2a.start.x = lines.get(i, 0)[0];
					edge_2a.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[3] < temps[5]) {
					temps[5] = lines.get(i, 0)[3];
					edge_2a.end.x = lines.get(i, 0)[2];
					edge_2a.end.y = lines.get(i, 0)[3];
				}
			}
			// edge_2b
			else if (line_angle > 225 && line_angle < 295 && lines.get(i, 0)[0] > frame.width() / 2) {
				if (lines.get(i, 0)[1] > temps[6]) {
					temps[6] = lines.get(i, 0)[1];
					edge_2b.start.x = lines.get(i, 0)[0];
					edge_2b.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[0] < temps[7]) {
					temps[7] = lines.get(i, 0)[0];
					edge_2b.end.x = lines.get(i, 0)[0];
					edge_2b.end.y = lines.get(i, 0)[1];
				}

			}
			// edge_3a
			else if (line_angle > 150 && line_angle < 180 && lines.get(i, 0)[0] < frame.width() / 2) {
				if (lines.get(i, 0)[1] > temps[8]) {
					temps[8] = lines.get(i, 0)[1];
					edge_3a.start.x = lines.get(i, 0)[0];
					edge_3a.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[3] < temps[9]) {
					temps[9] = lines.get(i, 0)[3];
					edge_3a.end.x = lines.get(i, 0)[2];
					edge_3a.end.y = lines.get(i, 0)[3];
				}

			}
			// edge_3b
			else if (line_angle > 150 && line_angle < 180 && lines.get(i, 0)[0] > frame.width() / 2) {
				if (lines.get(i, 0)[1] > temps[10]) {
					temps[10] = lines.get(i, 0)[1];
					edge_3b.start.x = lines.get(i, 0)[0];
					edge_3b.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[3] < temps[11]) {
					temps[11] = lines.get(i, 0)[3];
					edge_3b.end.x = lines.get(i, 0)[2];
					edge_3b.end.y = lines.get(i, 0)[3];
				}

			}
			// edge_4a
			else if (line_angle > 185 && line_angle < 225 && lines.get(i, 0)[1] < frame.height() / 2) {
				if (lines.get(i, 0)[3] > temps[12]) {
					temps[12] = lines.get(i, 0)[3];
					edge_4a.start.x = lines.get(i, 0)[2];
					edge_4a.start.y = lines.get(i, 0)[3];
				}

				if (lines.get(i, 0)[3] < temps[13]) {
					temps[13] = lines.get(i, 0)[3];
					edge_4a.end.x = lines.get(i, 0)[2];
					edge_4a.end.y = lines.get(i, 0)[3];
				}

			}
			// edge_4b 
			else if (line_angle > 185 && line_angle < 225 && lines.get(i, 0)[1] > frame.height() / 2) {
				if (lines.get(i, 0)[3] > temps[14]) {
					temps[14] = lines.get(i, 0)[3];
					edge_4b.start.x = lines.get(i, 0)[2];
					edge_4b.start.y = lines.get(i, 0)[3];
				}

				if (lines.get(i, 0)[0] < temps[15]) {
					temps[15] = lines.get(i, 0)[0];
					edge_4b.end.x = lines.get(i, 0)[0];
					edge_4b.end.y = lines.get(i, 0)[1];
				}

			}
			// edge_5a
			else if (line_angle > 100 && line_angle < 135 && lines.get(i, 0)[1] > frame.height() / 2) {
				if (lines.get(i, 0)[0] > temps[16]) {
					temps[16] = lines.get(i, 0)[1];
					edge_5a.start.x = lines.get(i, 0)[0];
					edge_5a.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[2] > temps[17]) {
					temps[17] = lines.get(i, 0)[2];
					edge_5a.end.x = lines.get(i, 0)[2];
					edge_5a.end.y = lines.get(i, 0)[3];
				}

			}
			// edge_5b 
			else if (line_angle > 100 && line_angle < 135 && lines.get(i, 0)[1] < frame.height() / 2) {
				if (lines.get(i, 0)[0] < temps[18]) {
					temps[18] = lines.get(i, 0)[0];
					edge_5b.start.x = lines.get(i, 0)[0];
					edge_5b.start.y = lines.get(i, 0)[1];
				}

				if (lines.get(i, 0)[3] < temps[19]) {
					temps[19] = lines.get(i, 0)[3];
					edge_5b.end.x = lines.get(i, 0)[2];
					edge_5b.end.y = lines.get(i, 0)[3];
				}

			}

		}

		if (imageViewer != null) {

			Imgproc.cvtColor(frame, frame, Imgproc.COLOR_GRAY2BGR);
			// Left pentagon
			Recognition.display(frame, imageViewer, edge_1a, new Scalar(250, 0, 0));
			Recognition.display(frame, imageViewer, edge_2a, new Scalar(250, 250, 0));
			Recognition.display(frame, imageViewer, edge_3a, new Scalar(0, 250, 0));
			Recognition.display(frame, imageViewer, edge_4a, new Scalar(0, 250, 250));
			Recognition.display(frame, imageViewer, edge_5a, new Scalar(0, 0, 250));

			// Right pentagon
			// Twins has the same color
			Recognition.display(frame, imageViewer, edge_1b, new Scalar(250, 0, 0));
			Recognition.display(frame, imageViewer, edge_2b, new Scalar(250, 250, 0));
			Recognition.display(frame, imageViewer, edge_3b, new Scalar(0, 250, 0));
			Recognition.display(frame, imageViewer, edge_4b, new Scalar(0, 250, 250));
			Recognition.display(frame, imageViewer, edge_5b, new Scalar(0, 0, 250));
			Imgproc.cvtColor(frame, frame, Imgproc.COLOR_BGR2GRAY);
		}
		System.out.println("EVALUATION OF PENTAGON");
		System.out.println("-----------------------");

		// Compare the edges lengths with their opposites
		double[][] edgeTwins = new double[][] {
				{ edge_1a.lengthOfLine(), edge_1b.lengthOfLine() },
				{ edge_2a.lengthOfLine(), edge_2b.lengthOfLine() },
				{ edge_3a.lengthOfLine(), edge_3b.lengthOfLine() },
				{ edge_4a.lengthOfLine(), edge_4b.lengthOfLine() },
				{ edge_5a.lengthOfLine(), edge_5b.lengthOfLine() } };

		for (int i = 0; i < 5; i++) {
			// Find the biggest of two edges
			// And define a ratio which is acceptable 
			double big = Math.max(edgeTwins[i][0], edgeTwins[i][1]);
			double ratio = big * 20 / 100;

			if (ratio >= Math.abs(edgeTwins[i][0] - edgeTwins[i][1])) {
				score++;
			}
		}

		// Find intersections 
		// Intersected lines: 5b-4a && 5a-4b
		// Angle between them should be appr. 90 degress
		CLine[] intersected_lines = new CLine[] { edge_5b, edge_4a, edge_5a, edge_4b };
		double[] line_angles = { 0, 0, 0, 0 };
		for (int i = 0; i < 4; i++) {
			line_angles[i] = Find.Angle(intersected_lines[i]);
		}

		double angle_between1 = line_angles[0] - line_angles[1];
		double angle_between2 = line_angles[2] - line_angles[3];

		if (angle_between1 > 80 && angle_between1 < 100 && angle_between2 > 80 && angle_between2 < 100)
			score += 5;

		User.setScore_polygon(score);

		// If the total score equals or bigger than 9,
		// then the pentagon can be scored fully otherwise drawing is not sufficent
		if (score >= 9) {
			System.out.println("All edges were drawn correctly.");
			System.out.println("Two points were intersected.");
			System.out.println("Polygon drawing is correct.");
			User.addAnswer_MMSE("SATISFIED");
			return 1;
		} else {
			System.out.println("Polygon drawing is not sufficient.");
			User.addAnswer_MMSE("NOT SATISFIED");
			return 0;

		}

	}

	public static final double getEdges_score() {
		return score;
	}

	public static final void setEdges_score(int edges_score) {
		Polygon.score = edges_score;
	}

}
