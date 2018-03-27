package ImageProcessing.Evaluation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.neuroph.core.NeuralNetwork;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

import ImageProcessing.Models.CCircle;
import ImageProcessing.Models.CLine;
import ImageProcessing.Utils.Find;
import ImageProcessing.Utils.Recognition;
import javafx.scene.image.ImageView;

public final class Clock {
	public static CCircle clockface;

	// Checking clockface for the numbers, hands, and its circular orientation
	// Return scoring of clockface (out of 2)
	public static int evaluateClockface(Mat frame, ImageView imageViewer) {
		System.out.println("CLOCK FACE----------------------------------");

		int clockface_score = 0;

		// Compare optimal circumference with the real one 
		// Evaluate the clockface depending on the deviation
		double r1 = frame.width() / 2;
		double r2 = frame.height() / 2;
		double circumference_real = (2 * Math.PI) * Math.sqrt(0.5 * ((r1 * r1) + (r2 * r2)));
		double circumference_optimal = (2 * Math.PI) * clockface.radius;
		System.out.println("Optimal circumference: " + circumference_optimal);
		System.out.println("Real circumference: " + circumference_real);

		// Count the number of components: numbers and hands if they are presented
		Rect[] numbers_hands = Find.AllBoundaryBoxes(frame);
		System.out.println("Number of components in clockface: " + numbers_hands.length);

		// Check the conditions
		// 1. Deviation from the optimal circumference
		// 2. Clock components' presentation
		Boolean[] condition = {
				Math.abs(circumference_optimal - circumference_real) <= 500,
				numbers_hands.length > 12 };
		String[] outcome = { "Clock face is presented", "Numbers and hands are presented" };

		// Display the results
		for (int i = 0; i < 2; i++) {
			System.out.print("\n" + outcome[i]);
			if (condition[i]) {
				clockface_score++;
				System.out.print("	[SATISFIED]");
			} else {
				System.out.print("	[NOT SATISFIED]");
			}
		}

		System.out.println("\nScore of clock face: " + clockface_score + " out of 2");
		return clockface_score;
	}

	// Checking all numbers if they are presented 
	// Looks for their accurate locations on clock face
	// Returns scoring of numbers (out of 4)
	public static int evaluateNumbers(Mat frame, ImageView imageViewer) throws IOException {
		System.out.println("NUMBERS-------------------------------------");

		// TODO Evaluation of spatial position of numbers

		int numbers_score = 0;
		int numbersPresent_score = 0;
		int numbersSpatial_score = 0;

		// Find all components inside the clock face
		Rect[] clock_components = Find.AllBoundaryBoxes(frame);

		/* Display components
		Imgproc.cvtColor(frame, frame, Imgproc.COLOR_GRAY2BGR);
		for(int i=0;i<clock_components.length;i++){
			Imgproc.rectangle(frame, clock_components[i].tl(), clock_components[i].br(), new Scalar(250, 0, 0), 3);	
		}
		ImageRecognitionController.updateImageView(imageViewer, Utils.mat2Image(frame));
		Imgproc.cvtColor(frame, frame, Imgproc.COLOR_BGR2GRAY);
		*/
		
		// Load the saved network
		NeuralNetwork<?> neuralNetwork = NeuralNetwork.createFromFile(
				"Resources/NeuralNetwork/NeuralNetwork_Perceptron.nnet");

		ArrayList<Integer> results = new ArrayList<Integer>();
		// Crop every component we found from the clock face
		// Test each and every component with giving them into ANN
		for (int i = 0; i < clock_components.length; i++) {

			Mat component = new Mat(frame, clock_components[i]);
			Mat component_resized = new Mat();
			Size size = new Size(16, 16);

			// Resize the component
			// Convert it into 16x16 matrix
			Imgproc.resize(component, component_resized, size);

			// Check the matrix for the values
			// 0 pixel  =0 
			// pixel>0  =1
			// Create array to give network
			double[] input = new double[256];

			int idx = 0;
			for (int col = 0; col < 16; col++) {
				for (int row = 0; row < 16; row++) {
					if (component_resized.get(row, col)[0] == 255)
						input[idx] = 1;
					else
						input[idx] = 0;
					idx++;

				}
			}

			// Test network
			// Set network input
			neuralNetwork.setInput(input);

			// Calculate network
			neuralNetwork.calculate();

			// Get network output
			double[] result = neuralNetwork.getOutput();
			for (int j = 0; j < result.length; j++) {
				// Check the output
				if (result[j] == 1)
					results.add(j);
			}

		}

		// Find the number of occurance for all of the digits
		Collections.sort(results);
		double[] numberRep = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < results.size(); i++) {
			switch (results.get(i)) {
			case 0:
				numberRep[0]++;
				break;
			case 1:
				numberRep[1]++;
				break;
			case 2:
				numberRep[2]++;
				break;
			case 3:
				numberRep[3]++;
				break;
			case 4:
				numberRep[4]++;
				break;
			case 5:
				numberRep[5]++;
				break;
			case 6:
				numberRep[6]++;
				break;
			case 7:
				numberRep[7]++;
				break;
			case 8:
				numberRep[8]++;
				break;
			case 9:
				numberRep[9]++;
				break;
			}
		}

		// Check number of occurance for all numbers
		// 5 sample for 1 (1, 10, 11, 12)
		// 2 sample for 2 (2, 12)
		// 1 sample for others (3, 4, 5, 6, 7, 8, 9, 10)
		for (int i = 0; i < numberRep.length; i++) {
			if (i == 1) {
				if (numberRep[i] >= 5)
					numbersPresent_score++;
			} else if (i == 2) {
				if (numberRep[i] >= 2)
					numbersPresent_score++;
			} else if (numberRep[i] >= 1) {
				numbersPresent_score++;
			}
		}

		// Check the conditions
		// 1. Presentation of numbers
		// 2. Spatial arrangments of numbers

		Boolean[] condition = { numbersPresent_score >= 15, numbersSpatial_score >= 12 };
		String[] outcome = { "All numbers are presented", "Numbers are in correct spatial arrangements" };

		// Display the results
		for (int i = 0; i < 2; i++) {
			System.out.print("\n" + outcome[i]);
			if (condition[i]) {
				numbers_score += 2;
				System.out.print("	[SATISFIED]");
			} else {
				System.out.print("	[NOT SATISFIED]");
			}
		}

		System.out.println("\nScore of clock face: " + numbers_score + " out of 4");

		return numbers_score;

	}

	// Checking clock hands if they are presented
	// Comparing their lengths and their angles in between
	// Returns scoring of hands (out of 4)
	public static int evaluateHands(Mat frame, ImageView imageViewer) {
		System.out.println("CLOCK HANDS----------------------------------");
		
		// TODO Check for the errors
		
		int hands_score = 0;

		Mat lines = Recognition.houghlineTransform(frame);

		// Finding the lines which are closest to the circle's center
		// Hence, we can assume that captured lines can be the clock hands
		ArrayList<CLine> hands = new ArrayList<CLine>();
		for (int i = 0; i < lines.rows(); i++) {
			double distance = Math.hypot(clockface.center.x - lines.get(i, 0)[0], clockface.center.y - lines.get(i,
					0)[1]);
			if (distance <= clockface.radius * 40 / 100) {
				hands.add(new CLine(new Point(lines.get(i, 0)[0], lines.get(i, 0)[1]), new Point(lines.get(i, 0)[2],
						lines.get(i, 0)[3])));
			}
		}

		// Find and merge lines which are on the same direction
		CLine hour_hand = new CLine();
		CLine minute_hand = new CLine();

		// Temp variables for the comparison
		double[] temps = { 1000, 0, 0, 1000 };

		for (int i = 0; i < hands.size(); i++) {
			double line_angle = Math.atan2(hands.get(i).start.y - hands.get(i).end.y, hands.get(i).start.x - hands.get(
					i).end.x) * (180 / Math.PI);
			// For the hour hand
			// Looking for max(start.x) and min(end.x)
			if (line_angle < -90) {
				if (hands.get(i).start.x > temps[2]) {
					temps[2] = hands.get(i).start.x;
					hour_hand.start = hands.get(i).start;
				}
				if (hands.get(i).end.x < temps[3]) {
					temps[3] = hands.get(i).end.x;
					hour_hand.end = hands.get(i).end;
				}
			}
		}

		for (int i = 0; i < hands.size(); i++) {
			double line_angle = Math.atan2(hands.get(i).start.y - hands.get(i).end.y, hands.get(i).start.x - hands.get(
					i).end.x) * (180 / Math.PI);
			// For the minute hand
			// Looking for min(start.x) and max(end.x)
			if (line_angle > 90) {
				if (hands.get(i).start.x < temps[0] && hands.get(i).start.x > temps[2]) {
					temps[0] = hands.get(i).start.x;
					minute_hand.start = hands.get(i).start;
				}
				if (hands.get(i).end.x > temps[1]) {
					temps[1] = hands.get(i).end.x;
					minute_hand.end = hands.get(i).end;
				}
			}
		}

		// Display the hands
		if (imageViewer != null) {
			Imgproc.cvtColor(frame, frame, Imgproc.COLOR_GRAY2BGR);
			Recognition.display(frame, imageViewer, hour_hand, new Scalar(0, 0, 250));
			Recognition.display(frame, imageViewer, minute_hand, new Scalar(0, 250, 0));
			Imgproc.cvtColor(frame, frame, Imgproc.COLOR_BGR2GRAY);
		}

		// Calculate the angles of hands relative to the base of the image
		// And also calculation of angle between the hands
		double angle_hour = Math.atan2(hour_hand.start.y - hour_hand.end.y, hour_hand.start.x - hour_hand.end.x) * (180
				/ Math.PI);
		double angle_minute = Math.atan2(minute_hand.start.y - minute_hand.end.y, minute_hand.start.x
				- minute_hand.end.x) * (180 / Math.PI);
		double angle_between = 180 - (180 - angle_minute) - angle_hour;

		System.out.println("Hands features: ");
		System.out.println("Hour angle: " + angle_hour);
		System.out.println("Minute angle: " + angle_minute);
		System.out.println("Angle between: " + angle_between);

		// Compare the hands and score them
		// 1. Compare the lengths
		// 2. Check the hour hand's angle (it should point 2)
		// 3. Check the minute hand's angle (it should point 11)
		// 4. Check the angle(90) between them

		Boolean[] condition = {
				angle_hour < 70 && angle_hour > 40,
				angle_minute < 160 && angle_minute > 130,
				minute_hand.lengthOfLine() > hour_hand.lengthOfLine(),
				angle_between < 110 && angle_between > 70 };
		String[] outcome = {
				"Hour hand is in the correct place",
				"Minute hand is in the correct place",
				"Minute hand is longer than hour hand",
				"They are in correct form" };

		// Display the results
		for (int i = 0; i < 4; i++) {
			System.out.print("\n" + outcome[i]);
			if (condition[i]) {
				hands_score++;
				System.out.print("	[SATISFIED]");
			} else {
				System.out.print("	[NOT SATISFIED]");
			}
		}

		System.out.println("\nScore of hands: " + hands_score + " out of 4");
		return hands_score;
	}

	// Evaluate clock in 3 steps (clockface, numbers, and hands)
	public static int evaluateClock(Mat frame, ImageView imageViewer) throws IOException {
		int clock_score = 0;

		// Find the circle's features
		clockface = Find.LargestCircle(frame);

		clock_score += Clock.evaluateClockface(frame, imageViewer);
		//clock_score += Clock.evaluateNumbers(frame, imageViewer);
		clock_score += Clock.evaluateHands(frame, imageViewer);

		System.out.println("RESULT OF THE TEST--->>> " + clock_score + " out of 10");
		return clock_score;
	}
}