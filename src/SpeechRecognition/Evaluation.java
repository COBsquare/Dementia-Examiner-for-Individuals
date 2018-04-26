package SpeechRecognition;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;
import App.User;

public final class Evaluation {
	public static int scoreFromSpeech = 0;
	static Date date = new Date();
	static LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	static int year = localDate.getYear();
	static int month = localDate.getMonthValue();
	static int day = localDate.getDayOfMonth();
	static String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
	static String[] days = {
			"",
			"first",
			"second",
			"third",
			"fourth",
			"fifth",
			"sixth",
			"seventh",
			"eighth",
			"ninth",
			"tenth",
			"eleventh",
			"twelfth",
			"thirteenth",
			"fourteenth",
			"fifteenth",
			"sixteenth",
			"seventeenth",
			"eighteenth",
			"nineteenth",
			"twentieth",
			"twentieth first",
			"twentieth second",
			"twentieth third",
			"twentieth fourth",
			"twentieth fifth",
			"twentieth sixth",
			"twentieth seventh",
			"twentieth eighth",
			"twentieth ninth",
			"thirty",
			"thirthy first" };
	static String[] months = {
			"",
			"january",
			"february",
			"march",
			"april",
			"may",
			"june",
			"july",
			"august",
			"september",
			"october",
			"november",
			"december" };
	static String[] daysOfWeek = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
	static String[] unrelatedObjects = { "ball", "car", "man" };
	private static String speechWords;
	static int point = 0;

	public static void evaluationLiterate() throws IOException {

		for (int i = 0; i < User.orderLiterate.length; i++) {
			evaluate(User.orderLiterate[i], i);
		}

		User.setScore_mmse(getScoreFromSpeech());
	}

	public static void evaluationIlliterate() throws IOException {
		for (int i = 0; i < User.orderIlliterate.length; i++) {
			evaluate(User.orderIlliterate[i], i);
		}

		User.setScore_mmse(getScoreFromSpeech());
	}

	public static void evaluate(int question, int order) throws IOException {
		point = 0;

		if (order != 13 || order != 14 || order != 15 || order != 16) {
			speechWords = SpeechRecorder.getSavedAnswer(order);
		}

		if (question == 1) {
			if (speechWords.equals("two thousand eighteen")) {
				System.out.println("You gained one point from question 1");
				point = 1;
				scoreFromSpeech++;
			}
			User.addEval(point + " out of 1");

		} else if (question == 2) {

			if (month == 12 && month == 1 && month == 2) {
				if (speechWords.equals("winter")) {
					System.out.println("You gained one point from question 2");
					point = 1;
					scoreFromSpeech++;
				}
			} else if (month >= 3 && month < 6) {
				if (speechWords.equals("spring")) {
					System.out.println("You gained one point from question 2");
					point = 1;
					scoreFromSpeech++;
				}

			} else if (month >= 6 && month <= 8) {
				if (speechWords.equals("summer")) {
					System.out.println("You gained one point from question 2");
					point = 1;
					scoreFromSpeech++;
				}

			} else if (month > 8 && month <= 11) {
				if (speechWords.equals("autumn")) {
					System.out.println("You gained one point from question 2");
					point = 1;
					scoreFromSpeech++;
				}
			}
			User.addEval(point + " out of 1");
		}

		else if (question == 3) {
			for (int i = 1; i < 13; i++) {
				for (int j = 1; j < 32; j++) {
					String check = months[i] + " " + days[j];
					if (speechWords.equals(check)) {
						if (day == j && month == i) {
							System.out.println("You gained one point from question 3");
							point = 1;
							scoreFromSpeech++;
						}
					}

				}
			}
			User.addEval(point + " out of 1");
		}

		else if (question == 4) {
			for (int i = 0; i < 7; i++) {
				if (dayOfWeek == daysOfWeek[i]) {
					if (speechWords.equals(daysOfWeek[i])) {
						System.out.println("You gained one point from question 4");
						point = 1;
						scoreFromSpeech++;
					}
				}
			}
			User.addEval(point + " out of 1");
		} else if (question == 5) {
			for (int i = 1; i < 13; i++) {
				if (month == i) {
					if (speechWords.equals(months[i])) {
						System.out.println("You gained one point from question 5");
						point = 1;
						scoreFromSpeech++;
					}
				}
			}
			User.addEval(point + " out of 1");
		}

		else if (question == 6) {
			if (speechWords.equals("northeast") || speechWords.equals("east")) {
				System.out.println("You gained five points from question 6 ");
				point = 5;
				scoreFromSpeech = scoreFromSpeech + 5;
			}
			User.addEval(point + " out of 5");
		}

		else if (question == 7) {
			for (int i = 0; i < 4; i++) {
				if (i == 3) {
					if (speechWords.equals("ball car man")) {
						System.out.println(" You gained three points from question 7  ");
						point = 3;
						scoreFromSpeech = scoreFromSpeech + 3;
					}
				} else {
					if (speechWords.equals(unrelatedObjects[i])) {
						System.out.println(" You gained one point from question 7  ");
						point = 1;
						scoreFromSpeech++;
					}
				}
			}
			User.addEval(point + " out of 3");

		}

		else if (question == 8) {
			if (speechWords.equals("ninety three eighty six seventy nine seventy two sixty five") || speechWords.equals(
					"one hundred ninety three eighty six seventy nine seventy two sixty five")) {
				System.out.println("You gained five points from question 10");
				point = 5;
				scoreFromSpeech = scoreFromSpeech + 5;
			}
			User.addEval(point + " out of 5");
		}

		else if (question == 9) {
			for (int i = 0; i < 4; i++) {
				if (i == 3) {
					if (speechWords.equals("ball car man")) {
						System.out.println(" You gained three points from question 9  ");
						point = 3;
						scoreFromSpeech = scoreFromSpeech + 3;
					}
				} else {
					if (speechWords.equals(unrelatedObjects[i])) {
						System.out.println(" You gained one point from question 9  ");
						point = 1;
						scoreFromSpeech = scoreFromSpeech++;
					}
				}

			}
			User.addEval(point + " out of 3");

		}

		else if (question == 10) {
			if (speechWords.equals("chair pencil")) {
				System.out.println("You gained one point from question 10");
				point = 1;
				scoreFromSpeech++;
			} else if (speechWords.equals("pencil chair")) {
				System.out.println(" You gained one point from question 10");
				point = 1;
				scoreFromSpeech++;
			} else if (speechWords.equals("pencil and chair")) {
				System.out.println(" You gained one point from question 10");
				point = 1;
				scoreFromSpeech++;
			} else if (speechWords.equals("chair and pencil")) {
				System.out.println(" You gained one point from question 10 ");
				point = 1;
				scoreFromSpeech++;
			}
			User.addEval(point + " out of 1");
		} else if (question == 11) {
			if (speechWords.equals("no ifs ands or buts")) {
				System.out.println("You gained one point from question 11");
				point = 1;
				scoreFromSpeech++;
			}
			User.addEval(point + " out of 1");
		} else if (question == 12) {
			if (speechWords.equals("paper")) {
				System.out.println("You gained one point from question 12");
				point = 1;
				scoreFromSpeech++;
			}
			User.addEval(point + " out of 1");
		} else if (question == 13) {
			String temp = User.answers_mmse.get(order);
			if (temp.equals("Pressed")) {
				point = 1;
				scoreFromSpeech++;
			}
			User.addEval(point + " out of 1");
		} else if (question == 14) {
			String temp = User.answers_mmse.get(order);
			if (temp.equalsIgnoreCase("Hello World")) {
				point = 1;
				scoreFromSpeech++;
			}
			User.addEval(point + " out of 1");
		} else if (question == 15) {
			int temp = Integer.parseInt(User.answers_mmse.get(order));
			if (temp == 21) {
				point = 1;
				scoreFromSpeech++;
			}
			User.addEval(point + " out of 1");
		} else if (question == 16) {
			String temp = User.answers_mmse.get(order);
			if (!temp.equals("")) {
				point = 1;
				scoreFromSpeech++;
			}
			User.addEval(point + " out of 1");
		} else if (question == 18) {
			if (speechWords.equals("sunday saturday friday thursday wednesday tuesday monday") || speechWords.equals(
					"sunday saturday friday thursday wednesday tuesday monday sunday")) {
				point = 5;
				System.out.println("You gained five points from question 20");
				scoreFromSpeech = scoreFromSpeech + 5;
			}
			User.addEval(point + " out of 5");
		} else if (question == 19) {
			if (speechWords.equals("i would have gone if he had gone")) {
				System.out.println("You gained one point from question 21");
				point = 1;
				scoreFromSpeech++;
			}
			User.addEval(point + " out of 1");
		}

		System.out.println(" The result to question " + question + " is " + speechWords);

	}

	public static void disableLogMessages() {
		Logger cmRootLogger = Logger.getLogger("default.config");
		cmRootLogger.setLevel(java.util.logging.Level.OFF);
		String conFile = System.getProperty("java.util.logging.config.file");
		if (conFile == null) {
			System.setProperty("java.util.logging.config.file", "ignoreAllSphinx4LoggingOutput");
		}
	}

	public static int getScoreFromSpeech() {
		return scoreFromSpeech;
	}

	public Date getDate() {
		return date;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public String[] getDays() {
		return days;
	}

	public String[] getMonths() {
		return months;
	}

	public String[] getDaysOfWeek() {
		return daysOfWeek;
	}

	public String[] getUnrelatedObjects() {
		return unrelatedObjects;
	}

}
