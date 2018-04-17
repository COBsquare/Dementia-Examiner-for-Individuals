package SpeechRecognition;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

import App.User;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;

public class Evaluation {
	public int scoreFromSpeech = 0;
	Configuration configuration = new Configuration();
	Date date = new Date();
	LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	int year = localDate.getYear();
	int month = localDate.getMonthValue();
	int day = localDate.getDayOfMonth();
	String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
	String[] days = { "", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
			"eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth",
			"nineteenth", "twentieth", "twentieth first", "twentieth second", "twentieth third", "twentieth fourth",
			"twentieth fifth", "twentieth sixth", "twentieth seventh", "twentieth eighth", "twentieth ninth", "thirty",
			"thirthy first" };
	String[] months = { "", "january", "february", "march", "april", "may", "june", "july", "august", "september",
			"october", "november", "december" };
	String[] daysOfWeek = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
	String[] unrelatedObjects = { "ball", "car", "man" };
	
	public Evaluation(){
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
	}

	public void evaluationLiterate() throws IOException {
		for(int i=1;i<15;i++){
			evaluate("Question"+Integer.toString(i));
		}
		User.addScore(getScoreFromSpeech());
	}

	public void evaluationIlliterate() throws IOException {
		int[] order={1,2,3,4,5,6,7,8,13,20,11,12,21,14};
		for(int i=0;i<14;i++){
			evaluate("Question"+Integer.toString(order[i]));
		}
		User.addScore(getScoreFromSpeech());
	}

	public void evaluate(String question) throws IOException {
		disableLogMessages();
		configuration.setGrammarName(question);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
		recognizer.startRecognition(new FileInputStream("Resources/Answers/" + question + ".wav"));
		SpeechResult Result = recognizer.getResult();
		String speechWords = Result.getHypothesis();
		User.addAnswer(speechWords);

		if (question.equals("Question1")) {
			if (speechWords.equals("two thousand eighteen")) {
				System.out.println("You gained one point from question 1");
				scoreFromSpeech++;
			}
			System.out.println(" The answer to question 1 is " + speechWords);
		}
		else if (question.equals("Question2")) {

			if (month == 12 && month == 1 && month == 2) {
				if (speechWords.equals("winter")) {
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
			} else if (month >= 3 && month < 6) {
				if (speechWords.equals("spring")) {
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
			} else if (month >= 6 && month <= 8) {
				if (speechWords.equals("summer")) {
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
			} else if (month > 8 && month <= 11) {
				if (speechWords.equals("autumn")) {
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
			}

			System.out.println(" The answer to question 2 is " + speechWords);
		}

		else if (question.equals("Question3")) {
			for (int i = 1; i < 13; i++) {
				for (int j = 1; j < 32; j++) {
					String check = months[i] + " " + days[j];
					if (speechWords.equals(check)) {
						if (day == j && month == i) {
							System.out.println("You gained one point");
							scoreFromSpeech++;
						} else {
							System.out.println("You wrong kiddo");
						}
					}

				}
			}

			System.out.println(" The result to question 3 is " + speechWords);
		}

		else if (question.equals("Question4")) {
			for (int i = 0; i < 7; i++) {
				if (dayOfWeek == daysOfWeek[i]) {
					if (speechWords.equals(daysOfWeek[i])) {
						System.out.println("You gained one point from question 4");
						scoreFromSpeech++;
					}
				}
			}

			System.out.println(" The result to question 4 is " + speechWords);
		}
		else if (question.equals("Question5")) {
			for (int i = 1; i < 13; i++) {
				if (month == i) {
					if (speechWords.equals(months[i])) {
						System.out.println("You gained one point from question 5");
						scoreFromSpeech++;
					}
				}
			}

			System.out.println(" The result to question 5 is " + speechWords);
		}

		else if (question.equals("Question8")) {
			if (speechWords.equals("")) {
				System.out.println("You gained one point from question 8 ");
				scoreFromSpeech++;
			}
			System.out.println(" The result to question 8 is " + speechWords);
		}

		else if (question.equals("Question9")) {
			for (int i = 0; i < 4; i++) {
				if (i == 3) {
					if (speechWords.equals("ball car man")) {
						System.out.println(" You gained three points from question 9  ");
						scoreFromSpeech = scoreFromSpeech + 3;
					}
				} else {
					if (speechWords.equals(unrelatedObjects[i])) {
						System.out.println(" You gained one point from question 9  ");
						scoreFromSpeech = scoreFromSpeech++;
					}
				}

			}
			System.out.println(" The result to question 9 is " + speechWords);

		}

		else if (question.equals("Question10")) {
			if (speechWords.equals("ninety three eighty six seventy nine seventy two sixty five")) {
				System.out.println("You gained five points from question 10");
				scoreFromSpeech = scoreFromSpeech + 5;
			}
			System.out.println(" The result to question 10 is " + speechWords);
		}

		else if (question.equals("Question11")) {
			for (int i = 0; i < 4; i++) {
				if (i == 3) {
					if (speechWords.equals("ball car man")) {
						System.out.println(" You gained three points from question 11  ");
						scoreFromSpeech = scoreFromSpeech + 3;
					}
				} else {
					if (speechWords.equals(unrelatedObjects[i])) {
						System.out.println(" You gained one point from question 11  ");
						scoreFromSpeech = scoreFromSpeech++;
					}
				}

			}
			System.out.println(" The result to question 11 is " + speechWords);

		}

		else if (question.equals("Question12")) {
			if (speechWords.equals("wristwatch pencil")) {
				System.out.println("You gained one point from question 12");
				scoreFromSpeech++;
			} else if (speechWords.equals("pencil wristwatch")) {
				System.out.println(" You gained one point from question 12");
				scoreFromSpeech++;
			} else if (speechWords.equals("pencil and wristwatch")) {
				System.out.println(" You gained one point from question 12");
				scoreFromSpeech++;
			} else if (speechWords.equals("wristwatch and wristwatch")) {
				System.out.println(" You gained one point from question 12 ");
				scoreFromSpeech++;
			}
			System.out.println(" The result to question 12 is " + speechWords);
		}
		else if (question.equals("Question13")) {
			if (speechWords.equals("no ifs ands or buts")) {
				System.out.println("You gained one point from question 13");
				scoreFromSpeech++;
			}
			System.out.println(" The result to question 13 is " + speechWords);
		}
		else if (question.equals("Question14")) {
			if (speechWords.equals("paper")) {
				System.out.println("You gained one point from question 14");
				scoreFromSpeech++;
			}
			System.out.println(" The result to question 14 is " + speechWords);
		}
		else if (question.equals("Question20")) {
			if (speechWords.equals("sunday saturday friday thursday wednesday tuesday monday")
					|| speechWords.equals("sunday saturday friday thursday wednesday tuesday monday sunday")) {
				System.out.println("You gained five points from question 20");
				scoreFromSpeech = scoreFromSpeech + 5;
			}
			System.out.println(" The result to question 20 is " + speechWords);
		}
		else if (question.equals("Question21")) {
			if (speechWords.equals("i would have gone if he had gone")) {
				System.out.println("You gained one point from question 21");
				scoreFromSpeech++;
			}
			System.out.println(" The result to question 21 is " + speechWords);
		}
		else{
			System.out.println("FUCK");
		}
	}

	public static void disableLogMessages() {
		Logger cmRootLogger = Logger.getLogger("default.config");
		cmRootLogger.setLevel(java.util.logging.Level.OFF);
		String conFile = System.getProperty("java.util.logging.config.file");
		if (conFile == null) {
			System.setProperty("java.util.logging.config.file", "ignoreAllSphinx4LoggingOutput");
		}
	}

	public int getScoreFromSpeech() {
		return scoreFromSpeech;
	}



	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String[] getDays() {
		return days;
	}

	public void setDays(String[] days) {
		this.days = days;
	}

	public String[] getMonths() {
		return months;
	}

	public void setMonths(String[] months) {
		this.months = months;
	}

	public String[] getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(String[] daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public String[] getUnrelatedObjects() {
		return unrelatedObjects;
	}

	public void setUnrelatedObjects(String[] unrelatedObjects) {
		this.unrelatedObjects = unrelatedObjects;
	}

	public void setScoreFromSpeech(int scoreFromSpeech) {
		this.scoreFromSpeech = scoreFromSpeech;
	}


}
