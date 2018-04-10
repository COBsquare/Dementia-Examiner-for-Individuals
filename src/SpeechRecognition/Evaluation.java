package SpeechRecognition;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;

public class Evaluation {
	public String answerToQuestion1 = "two thousand and eighteen";
	public String answerToQuestion2;
	public String answerToQuestion3;
	public String answerToQuestion4;
	public String answerToQuestion5;
	public String answerToQuestion8 = "north";
	public String answerToQuestion9;
	public String answerToQuestion10 = "ninety three eighty six seventy nine seventy two sixty five";
	public String answerToQuestion11;
	public String answerToQuestion12;
	public String answerToQuestion13 = "no ifs ands or buts";
	public String answerToQuestion14 = "paper";
	public String answerToQuestion20 = "sunday is preceded by saturday saturday is preceded by friday";
	public String answerToQuestion21 = "i would have gone if he had gone";
	public int scoreFromSpeech = 0;
	Configuration configuration = new Configuration();
	Date date = new Date();
	LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	int year = localDate.getYear();
	int month = localDate.getMonthValue();
	int day = localDate.getDayOfMonth();
	String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

	public void evaluationLiterate() {

	}

	public void evaluationIlliterate() {

	}

	public void evaluate(String question) throws IOException {
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(question);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
		recognizer.startRecognition(new FileInputStream("Resources/Answers/" + question + ".wav"));
		SpeechResult Result = recognizer.getResult();
		String speechWords = Result.getHypothesis();

		if (question == "Question1") {
			if (speechWords.equals(answerToQuestion1)) {
				System.out.println("You gained one point from question 1");
				scoreFromSpeech++;
			}
			System.out.println(" The answer to question 1 is " + speechWords);
		}
		if (question == "Question2") {
			if ((month == 12) && (month >= 1 && month <= 2)) {
				answerToQuestion2 = "winter";
				if (speechWords.equals(answerToQuestion2)) {
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
			}
			if (month >= 3 && month < 6) {
				answerToQuestion2 = "spring";
				if (speechWords.equals(answerToQuestion2)) {
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
			}
			if (month >= 6 && month <= 8) {
				answerToQuestion2 = "summer";
				if (speechWords.equals(answerToQuestion2)) {
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
			}
			if (month > 8 && month <= 11) {
				answerToQuestion2 = "autumn";
				if (speechWords.equals(answerToQuestion2)) {
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
			}
			System.out.println(" The answer to question 2 is " + speechWords);
		}
		if (question == "Question3") {
			if (day == 1 && month == 1) {
				answerToQuestion3 = "january first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 1) {
				answerToQuestion3 = "january second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 1) {
				answerToQuestion3 = "january third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 1) {
				answerToQuestion3 = "january fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 1) {
				answerToQuestion3 = "january fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 1) {
				answerToQuestion3 = "january sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 1) {
				answerToQuestion3 = "january seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 1) {
				answerToQuestion3 = "january eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 1) {
				answerToQuestion3 = "january ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 1) {
				answerToQuestion3 = "january tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 1) {
				answerToQuestion3 = "january eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 1) {
				answerToQuestion3 = "january twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 1) {
				answerToQuestion3 = "january thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 1) {
				answerToQuestion3 = "january fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 1) {
				answerToQuestion3 = "january fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 1) {
				answerToQuestion3 = "january sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 1) {
				answerToQuestion3 = "january seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 1) {
				answerToQuestion3 = "january eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 1) {
				answerToQuestion3 = "january nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 1) {
				answerToQuestion3 = "january twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 1) {
				answerToQuestion3 = "january twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 1) {
				answerToQuestion3 = "january twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 1) {
				answerToQuestion3 = "january twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 1) {
				answerToQuestion3 = "january twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 1) {
				answerToQuestion3 = "january twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 1) {
				answerToQuestion3 = "january twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 1) {
				answerToQuestion3 = "january twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 1) {
				answerToQuestion3 = "january twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 1) {
				answerToQuestion3 = "january twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 30 && month == 1) {
				answerToQuestion3 = "january thirty";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 31 && month == 1) {
				answerToQuestion3 = "january thirty first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 1 && month == 2) {
				answerToQuestion3 = "february first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 2) {
				answerToQuestion3 = "february second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 2) {
				answerToQuestion3 = "february third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 2) {
				answerToQuestion3 = "february fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 2) {
				answerToQuestion3 = "february fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 2) {
				answerToQuestion3 = "february sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 2) {
				answerToQuestion3 = "february seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 2) {
				answerToQuestion3 = "february eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 2) {
				answerToQuestion3 = "february ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 2) {
				answerToQuestion3 = "february tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 2) {
				answerToQuestion3 = "february eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 2) {
				answerToQuestion3 = "february twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 2) {
				answerToQuestion3 = "february thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 2) {
				answerToQuestion3 = "february fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 2) {
				answerToQuestion3 = "february fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 2) {
				answerToQuestion3 = "february sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 2) {
				answerToQuestion3 = "february seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 2) {
				answerToQuestion3 = "february eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 2) {
				answerToQuestion3 = "february nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 2) {
				answerToQuestion3 = "february twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 2) {
				answerToQuestion3 = "february twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 2) {
				answerToQuestion3 = "february twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 2) {
				answerToQuestion3 = "febraury twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 2) {
				answerToQuestion3 = "february twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 2) {
				answerToQuestion3 = "february twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 2) {
				answerToQuestion3 = "february twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 2) {
				answerToQuestion3 = "february twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 2) {
				answerToQuestion3 = "february twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 2) {
				answerToQuestion3 = "february twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 1 && month == 3) {
				answerToQuestion3 = "march first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 3) {
				answerToQuestion3 = "march second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 3) {
				answerToQuestion3 = "march third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 3) {
				answerToQuestion3 = "march fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 3) {
				answerToQuestion3 = "march fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 3) {
				answerToQuestion3 = "march sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 3) {
				answerToQuestion3 = "march seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 3) {
				answerToQuestion3 = "march eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 3) {
				answerToQuestion3 = "march fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 3) {
				answerToQuestion3 = "march tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 3) {
				answerToQuestion3 = "march eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 3) {
				answerToQuestion3 = "march twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 3) {
				answerToQuestion3 = "march thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 3) {
				answerToQuestion3 = "march fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 3) {
				answerToQuestion3 = "march fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 3) {
				answerToQuestion3 = "march sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 3) {
				answerToQuestion3 = "march seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 3) {
				answerToQuestion3 = "march eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 3) {
				answerToQuestion3 = "march nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 3) {
				answerToQuestion3 = "march twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 3) {
				answerToQuestion3 = "march twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 3) {
				answerToQuestion3 = "march twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 3) {
				answerToQuestion3 = "march twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 3) {
				answerToQuestion3 = "march twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 3) {
				answerToQuestion3 = "march twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 3) {
				answerToQuestion3 = "march twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 3) {
				answerToQuestion3 = "march twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 3) {
				answerToQuestion3 = "march twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 3) {
				answerToQuestion3 = "march twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 30 && month == 3) {
				answerToQuestion3 = "march thirty";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 31 && month == 3) {
				answerToQuestion3 = "march thirty first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 1 && month == 4) {
				answerToQuestion3 = "april first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 4) {
				answerToQuestion3 = "april second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 4) {
				answerToQuestion3 = "april third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 4) {
				answerToQuestion3 = "april fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 4) {
				answerToQuestion3 = "april fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 4) {
				answerToQuestion3 = "april sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 4) {
				answerToQuestion3 = "april seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 4) {
				answerToQuestion3 = "april eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 4) {
				answerToQuestion3 = "april fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 4) {
				answerToQuestion3 = "april tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 4) {
				answerToQuestion3 = "april eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 4) {
				answerToQuestion3 = "april twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 4) {
				answerToQuestion3 = "april thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 4) {
				answerToQuestion3 = "april fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 4) {
				answerToQuestion3 = "april fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 4) {
				answerToQuestion3 = "april sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 4) {
				answerToQuestion3 = "april seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 4) {
				answerToQuestion3 = "april eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 4) {
				answerToQuestion3 = "april nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 4) {
				answerToQuestion3 = "april twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 4) {
				answerToQuestion3 = "april twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 4) {
				answerToQuestion3 = "april twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 4) {
				answerToQuestion3 = "april twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 4) {
				answerToQuestion3 = "april twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 4) {
				answerToQuestion3 = "april twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 4) {
				answerToQuestion3 = "april twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 4) {
				answerToQuestion3 = "april twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 4) {
				answerToQuestion3 = "april twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 4) {
				answerToQuestion3 = "april twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 30 && month == 4) {
				answerToQuestion3 = "april thirty";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 1 && month == 5) {
				answerToQuestion3 = "may first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 5) {
				answerToQuestion3 = "may second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 5) {
				answerToQuestion3 = "may third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 5) {
				answerToQuestion3 = "may fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 5) {
				answerToQuestion3 = "may fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 5) {
				answerToQuestion3 = "may sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 5) {
				answerToQuestion3 = "may seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 5) {
				answerToQuestion3 = "may eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 5) {
				answerToQuestion3 = "may fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 5) {
				answerToQuestion3 = "may tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 5) {
				answerToQuestion3 = "may eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 5) {
				answerToQuestion3 = "may twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 5) {
				answerToQuestion3 = "may thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 5) {
				answerToQuestion3 = "may fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 5) {
				answerToQuestion3 = "may fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 5) {
				answerToQuestion3 = "may sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 5) {
				answerToQuestion3 = "may seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 5) {
				answerToQuestion3 = "may eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 5) {
				answerToQuestion3 = "may nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 5) {
				answerToQuestion3 = "may twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 5) {
				answerToQuestion3 = "may twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 5) {
				answerToQuestion3 = "may twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 5) {
				answerToQuestion3 = "may twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 5) {
				answerToQuestion3 = "may twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 5) {
				answerToQuestion3 = "may twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 5) {
				answerToQuestion3 = "may twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 5) {
				answerToQuestion3 = "may twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 5) {
				answerToQuestion3 = "may twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 5) {
				answerToQuestion3 = "may twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 30 && month == 5) {
				answerToQuestion3 = "may thirty";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 31 && month == 5) {
				answerToQuestion3 = "may thirty first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 1 && month == 6) {
				answerToQuestion3 = "june first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 6) {
				answerToQuestion3 = "june second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 6) {
				answerToQuestion3 = "june third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 6) {
				answerToQuestion3 = "june fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 6) {
				answerToQuestion3 = "june fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 6) {
				answerToQuestion3 = "june sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 6) {
				answerToQuestion3 = "june seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 6) {
				answerToQuestion3 = "june eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 6) {
				answerToQuestion3 = "june ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 6) {
				answerToQuestion3 = "june tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 6) {
				answerToQuestion3 = "june eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 6) {
				answerToQuestion3 = "june twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 6) {
				answerToQuestion3 = "june thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 6) {
				answerToQuestion3 = "june fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 6) {
				answerToQuestion3 = "june fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 6) {
				answerToQuestion3 = "june sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 6) {
				answerToQuestion3 = "june seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 6) {
				answerToQuestion3 = "june eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 6) {
				answerToQuestion3 = "june nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 6) {
				answerToQuestion3 = "june twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 6) {
				answerToQuestion3 = "june twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 6) {
				answerToQuestion3 = "june twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 6) {
				answerToQuestion3 = "june twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 6) {
				answerToQuestion3 = "june twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 6) {
				answerToQuestion3 = "june twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 6) {
				answerToQuestion3 = "june twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 6) {
				answerToQuestion3 = "june twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 6) {
				answerToQuestion3 = "june twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 6) {
				answerToQuestion3 = "june twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 30 && month == 6) {
				answerToQuestion3 = "june thirty";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}

			if (day == 1 && month == 7) {
				answerToQuestion3 = "july first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 7) {
				answerToQuestion3 = "july second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 7) {
				answerToQuestion3 = "july third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 7) {
				answerToQuestion3 = "july fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 7) {
				answerToQuestion3 = "july fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 7) {
				answerToQuestion3 = "july sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 7) {
				answerToQuestion3 = "july seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 7) {
				answerToQuestion3 = "july eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 7) {
				answerToQuestion3 = "july ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 7) {
				answerToQuestion3 = "july tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 7) {
				answerToQuestion3 = "july eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 7) {
				answerToQuestion3 = "july twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 7) {
				answerToQuestion3 = "july thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 7) {
				answerToQuestion3 = "july fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 7) {
				answerToQuestion3 = "july fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 7) {
				answerToQuestion3 = "july sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 7) {
				answerToQuestion3 = "july seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 7) {
				answerToQuestion3 = "july eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 7) {
				answerToQuestion3 = "july nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 7) {
				answerToQuestion3 = "july twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 7) {
				answerToQuestion3 = "july twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 7) {
				answerToQuestion3 = "july twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 7) {
				answerToQuestion3 = "july twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 7) {
				answerToQuestion3 = "july twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 7) {
				answerToQuestion3 = "july twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 7) {
				answerToQuestion3 = "july twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 7) {
				answerToQuestion3 = "july twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 7) {
				answerToQuestion3 = "july twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 7) {
				answerToQuestion3 = "july twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 30 && month == 7) {
				answerToQuestion3 = "july thirty";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 31 && month == 7) {
				answerToQuestion3 = "july thirty first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}

			if (day == 1 && month == 8) {
				answerToQuestion3 = "august first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 8) {
				answerToQuestion3 = "august second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 8) {
				answerToQuestion3 = "august third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 8) {
				answerToQuestion3 = "august fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 8) {
				answerToQuestion3 = "august fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 8) {
				answerToQuestion3 = "august sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 8) {
				answerToQuestion3 = "august seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 8) {
				answerToQuestion3 = "august eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 8) {
				answerToQuestion3 = "august ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 8) {
				answerToQuestion3 = "august tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 8) {
				answerToQuestion3 = "august eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 8) {
				answerToQuestion3 = "august twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 8) {
				answerToQuestion3 = "august thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 8) {
				answerToQuestion3 = "august fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 8) {
				answerToQuestion3 = "august fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 8) {
				answerToQuestion3 = "august sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 8) {
				answerToQuestion3 = "august seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 8) {
				answerToQuestion3 = "august eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 8) {
				answerToQuestion3 = "august nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 8) {
				answerToQuestion3 = "august twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 8) {
				answerToQuestion3 = "august twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 8) {
				answerToQuestion3 = "august twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 8) {
				answerToQuestion3 = "august twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 8) {
				answerToQuestion3 = "august twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 8) {
				answerToQuestion3 = "august twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 8) {
				answerToQuestion3 = "august twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 8) {
				answerToQuestion3 = "august twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 8) {
				answerToQuestion3 = "august twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 8) {
				answerToQuestion3 = "august twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 30 && month == 8) {
				answerToQuestion3 = "august thirty";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}

			if (day == 1 && month == 9) {
				answerToQuestion3 = "september first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 9) {
				answerToQuestion3 = "september second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 9) {
				answerToQuestion3 = "september third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 9) {
				answerToQuestion3 = "september fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 9) {
				answerToQuestion3 = "september fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 9) {
				answerToQuestion3 = "september sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 9) {
				answerToQuestion3 = "september seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 9) {
				answerToQuestion3 = "september eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 9) {
				answerToQuestion3 = "september ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 9) {
				answerToQuestion3 = "september tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 9) {
				answerToQuestion3 = "september eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 9) {
				answerToQuestion3 = "september twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 9) {
				answerToQuestion3 = "september thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 9) {
				answerToQuestion3 = "september fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 9) {
				answerToQuestion3 = "september fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 9) {
				answerToQuestion3 = "september sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 9) {
				answerToQuestion3 = "september seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 9) {
				answerToQuestion3 = "september eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 9) {
				answerToQuestion3 = "september nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 9) {
				answerToQuestion3 = "september twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 9) {
				answerToQuestion3 = "september twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 9) {
				answerToQuestion3 = "september twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 9) {
				answerToQuestion3 = "september twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 9) {
				answerToQuestion3 = "september twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 9) {
				answerToQuestion3 = "september twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 9) {
				answerToQuestion3 = "september twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 9) {
				answerToQuestion3 = "september twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 9) {
				answerToQuestion3 = "september twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 9) {
				answerToQuestion3 = "september twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 30 && month == 9) {
				answerToQuestion3 = "september thirty";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 1 && month == 10) {
				answerToQuestion3 = "october first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 10) {
				answerToQuestion3 = "october second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 10) {
				answerToQuestion3 = "october third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 10) {
				answerToQuestion3 = "october fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 10) {
				answerToQuestion3 = "october fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 10) {
				answerToQuestion3 = "october sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 10) {
				answerToQuestion3 = "october seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 10) {
				answerToQuestion3 = "october eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 10) {
				answerToQuestion3 = "october ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 10) {
				answerToQuestion3 = "october tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 10) {
				answerToQuestion3 = "october eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 10) {
				answerToQuestion3 = "october twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 10) {
				answerToQuestion3 = "october thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 10) {
				answerToQuestion3 = "october fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 10) {
				answerToQuestion3 = "october fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 10) {
				answerToQuestion3 = "october sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 10) {
				answerToQuestion3 = "october seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 10) {
				answerToQuestion3 = "october eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 10) {
				answerToQuestion3 = "october nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 10) {
				answerToQuestion3 = "october twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 10) {
				answerToQuestion3 = "october twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 10) {
				answerToQuestion3 = "october twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 10) {
				answerToQuestion3 = "october twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 10) {
				answerToQuestion3 = "october twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 10) {
				answerToQuestion3 = "october twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 10) {
				answerToQuestion3 = "october twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 10) {
				answerToQuestion3 = "october twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 10) {
				answerToQuestion3 = "october twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 10) {
				answerToQuestion3 = "october twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 30 && month == 10) {
				answerToQuestion3 = "october thirty";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 31 && month == 10) {
				answerToQuestion3 = "october thirty first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 1 && month == 11) {
				answerToQuestion3 = "november first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 11) {
				answerToQuestion3 = "november second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 11) {
				answerToQuestion3 = "november third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 11) {
				answerToQuestion3 = "november fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 11) {
				answerToQuestion3 = "november fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 11) {
				answerToQuestion3 = "november sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 11) {
				answerToQuestion3 = "november seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 11) {
				answerToQuestion3 = "november eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 11) {
				answerToQuestion3 = "november ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 11) {
				answerToQuestion3 = "november tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 11) {
				answerToQuestion3 = "november eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 11) {
				answerToQuestion3 = "november twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 11) {
				answerToQuestion3 = "november thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 11) {
				answerToQuestion3 = "november fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 11) {
				answerToQuestion3 = "november fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 11) {
				answerToQuestion3 = "november sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 11) {
				answerToQuestion3 = "november seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 11) {
				answerToQuestion3 = "november eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 11) {
				answerToQuestion3 = "november nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 11) {
				answerToQuestion3 = "november twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 11) {
				answerToQuestion3 = "november twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 11) {
				answerToQuestion3 = "november twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 11) {
				answerToQuestion3 = "november twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 11) {
				answerToQuestion3 = "november twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 11) {
				answerToQuestion3 = "november twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 11) {
				answerToQuestion3 = "november twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 11) {
				answerToQuestion3 = "november twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 11) {
				answerToQuestion3 = "november twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 11) {
				answerToQuestion3 = "november twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 30 && month == 11) {
				answerToQuestion3 = "november thirty";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}

			if (day == 1 && month == 12) {
				answerToQuestion3 = "december first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 2 && month == 12) {
				answerToQuestion3 = "december second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 3 && month == 12) {
				answerToQuestion3 = "december third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 4 && month == 12) {
				answerToQuestion3 = "december fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 5 && month == 12) {
				answerToQuestion3 = "december fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 6 && month == 12) {
				answerToQuestion3 = "december sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 7 && month == 12) {
				answerToQuestion3 = "december seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 8 && month == 12) {
				answerToQuestion3 = "december eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 9 && month == 12) {
				answerToQuestion3 = "december ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 10 && month == 12) {
				answerToQuestion3 = "december tenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 11 && month == 12) {
				answerToQuestion3 = "december eleventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 12 && month == 12) {
				answerToQuestion3 = "december twelfth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 13 && month == 12) {
				answerToQuestion3 = "december thirteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 14 && month == 12) {
				answerToQuestion3 = "december fourteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 15 && month == 12) {
				answerToQuestion3 = "december fifteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 16 && month == 12) {
				answerToQuestion3 = "december sixteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 17 && month == 12) {
				answerToQuestion3 = "december seventeenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 18 && month == 12) {
				answerToQuestion3 = "december eighteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 19 && month == 12) {
				answerToQuestion3 = "december nineteenth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 20 && month == 12) {
				answerToQuestion3 = "december twentieth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 21 && month == 12) {
				answerToQuestion3 = "december twentieth first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 22 && month == 12) {
				answerToQuestion3 = "december twentieth second";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 23 && month == 12) {
				answerToQuestion3 = "december twentieth third";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 24 && month == 12) {
				answerToQuestion3 = "december twentieth fourth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 25 && month == 12) {
				answerToQuestion3 = "december twentieth fifth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 26 && month == 12) {
				answerToQuestion3 = "december twentieth sixth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 27 && month == 12) {
				answerToQuestion3 = "december twentieth seventh";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 28 && month == 12) {
				answerToQuestion3 = "december twentieth eighth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 29 && month == 12) {
				answerToQuestion3 = "december twentieth ninth";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 30 && month == 12) {
				answerToQuestion3 = "december thirty";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			if (day == 31 && month == 12) {
				answerToQuestion3 = "december thirty first";
				if (speechWords.equals(answerToQuestion3)) {
					System.out.println("You gained one point");
					scoreFromSpeech++;
				}
			}
			System.out.println(" The result to question 3 is " + speechWords);
		}
		if (question == "Question4") {
			if (dayOfWeek == "sunday") {
				answerToQuestion4 = "sunday";
				if (speechWords.equals(answerToQuestion4)) {
					System.out.println("You gained one point from question 4");
					scoreFromSpeech++;
				}
			}
			if (dayOfWeek == "monday") {
				answerToQuestion4 = "monday";
				if (speechWords.equals(answerToQuestion4)) {
					System.out.println("You gained one point from question 4");
					scoreFromSpeech++;
				}
			}
			if (dayOfWeek == "tuesday") {
				answerToQuestion4 = "tuesday";
				if (speechWords.equals(answerToQuestion4)) {
					System.out.println("You gained one point from question 4");
					scoreFromSpeech++;
				}
			}
			if (dayOfWeek == "wednesday") {
				answerToQuestion4 = "wednesday";
				if (speechWords.equals(answerToQuestion4)) {
					System.out.println("You gained one point from question 4");
					scoreFromSpeech++;
				}
			}
			if (dayOfWeek == "thursday") {
				answerToQuestion4 = "thursday";
				if (speechWords.equals(answerToQuestion4)) {
					System.out.println("You gained one point from question 4");
					scoreFromSpeech++;
				}
			}
			if (dayOfWeek == "friday") {
				answerToQuestion4 = "friday";
				if (speechWords.equals(answerToQuestion4)) {
					System.out.println("You gained one point from question 4");
					scoreFromSpeech++;
				}
			}
			if (dayOfWeek == "saturday") {
				answerToQuestion4 = "saturday";
				if (speechWords.equals(answerToQuestion4)) {
					System.out.println("You gained one point from question 4");
					scoreFromSpeech++;
				}
			}
			System.out.println(" The result to question 4 is " + speechWords);
		}
		if (question == "Question5") {
			if (month == 1) {
				answerToQuestion5 = "january";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}
			} else if (month == 2) {
				answerToQuestion5 = "february";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}
			} else if (month == 3) {
				answerToQuestion5 = "march";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}
			} else if (month == 4) {
				answerToQuestion5 = "april";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}
			} else if (month == 5) {
				answerToQuestion5 = "may";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}
			} else if (month == 6) {
				answerToQuestion5 = "june";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}
			} else if (month == 7) {
				answerToQuestion5 = "july";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}
			} else if (month == 8) {
				answerToQuestion5 = "august";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}
			} else if (month == 9) {
				answerToQuestion5 = "september";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}
			} else if (month == 10) {
				answerToQuestion5 = "october";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}
			} else if (month == 11) {
				answerToQuestion5 = "november";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}
			} else if (month == 12) {
				answerToQuestion5 = "december";
				if (speechWords.equals(answerToQuestion5)) {
					System.out.println("You gained one point from question 5");
					scoreFromSpeech++;
				}

			}
			System.out.println(" The result to question 5 is " + speechWords);
		}
		if (question == "Question8") {
			if (speechWords.equals(answerToQuestion8)) {
				System.out.println("You gained one point from question 8 ");
				scoreFromSpeech++;
			}
			System.out.println(" The result to question 8 is " + speechWords);
		}
		if (question == "Question9") {
			if (speechWords.equals("ball car man")) {
				System.out.println(" You gained three points from question 9  ");
				scoreFromSpeech = scoreFromSpeech + 3;
			} else if (speechWords.equals("ball man car")) {
				System.out.println("You gained three points from question 9  ");
				scoreFromSpeech = scoreFromSpeech + 3;
			} else if (speechWords.equals("man ball car")) {
				System.out.println(" You gained three points from question 9  ");
				scoreFromSpeech = scoreFromSpeech + 3;
			} else if (speechWords.equals("man car ball")) {
				System.out.println(" You gained three points from question 9  ");
				scoreFromSpeech = scoreFromSpeech + 3;
			} else if (speechWords.equals("car man ball")) {
				System.out.println(" You gained three points from question 9  ");
				scoreFromSpeech = scoreFromSpeech + 3;
			} else if (speechWords.equals("car ball man")) {
				System.out.println(" You gained three points from question 9 ");
				scoreFromSpeech = scoreFromSpeech + 3;
			}
			System.out.println(" The result to question 9 is " + speechWords);
		}
		if (question == "Question10") {
			if (speechWords.equals(answerToQuestion10)) {
				System.out.println("You gained five points from question 10");
				scoreFromSpeech = scoreFromSpeech + 5;
			}
			System.out.println(" The result to question 10 is " + speechWords);
		}
		if (question == "Question11") {
			if (speechWords.equals("ball car man")) {
				System.out.println("You gained three points from question 11");
				scoreFromSpeech = scoreFromSpeech + 3;
			} else if (speechWords.equals("ball man car")) {
				System.out.println("You gained three points from question 11 ");
				scoreFromSpeech = scoreFromSpeech + 3;
			} else if (speechWords.equals("man ball car")) {
				System.out.println(" You gained three points from question 11");
				scoreFromSpeech = scoreFromSpeech + 3;
			} else if (speechWords.equals("man car ball")) {
				System.out.println(" You gained three points from question 11 ");
				scoreFromSpeech = scoreFromSpeech + 3;
			} else if (speechWords.equals("car man ball")) {
				System.out.println("You gained three points from question 11 ");
				scoreFromSpeech = scoreFromSpeech + 3;
			} else if (speechWords.equals("car ball man")) {
				System.out.println(" You gained three points from question 11");
				scoreFromSpeech = scoreFromSpeech + 3;
			}
			System.out.println(" The result to question 11 is " + speechWords);
		}
		if (question == "Question12") {
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
		if (question == "Question13") {
			if (speechWords.equals(answerToQuestion13)) {
				System.out.println("You gained one point from question 13");
				scoreFromSpeech++;
			}
			System.out.println(" The result to question 13 is " + speechWords);
		}
		if (question == "Question14") {
			if (speechWords.equals(answerToQuestion14)) {
				System.out.println("You gained one point from question 14");
				scoreFromSpeech++;
			}
			System.out.println(" The result to question 14 is " + speechWords);
		}
		if (question == "Question20") {
			if (speechWords.equals(answerToQuestion20)) {
				System.out.println("You gained five points from question 20");
				scoreFromSpeech = scoreFromSpeech + 5;
			}
			System.out.println(" The result to question 20 is " + speechWords);
		}
		if (question == "Question21") {
			if (speechWords.equals(answerToQuestion21)) {
				System.out.println("You gained one point from question 21");
				scoreFromSpeech++;
			}
			System.out.println(" The result to question 21 is " + speechWords);
		}
	}

	public void disableLogMessages() {
		Logger cmRootLogger = Logger.getLogger("default.config");
		cmRootLogger.setLevel(java.util.logging.Level.OFF);
		String conFile = System.getProperty("java.util.logging.config.file");
		if (conFile == null) {
			System.setProperty("java.util.logging.config.file", "ignoreAllSphinx4LoggingOutput");
		}
	}

	public void speechUsages() {
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
	}

	public int getScoreFromSpeech() {
		return scoreFromSpeech;
	}

	
	public String getAnswerToQuestion1() {
		return answerToQuestion1;
	}

	public String getAnswerToQuestion2() {
		return answerToQuestion2;
	}

	public String getAnswerToQuestion3() {
		return answerToQuestion3;
	}

	public String getAnswerToQuestion4() {
		return answerToQuestion4;
	}

	public String getAnswerToQuestion5() {
		return answerToQuestion5;
	}

	public String getAnswerToQuestion8() {
		return answerToQuestion8;
	}

	public String getAnswerToQuestion9() {
		return answerToQuestion9;
	}

	public String getAnswerToQuestion10() {
		return answerToQuestion10;
	}

	public String getAnswerToQuestion11() {
		return answerToQuestion11;
	}

	public String getAnswerToQuestion12() {
		return answerToQuestion12;
	}

	public String getAnswerToQuestion13() {
		return answerToQuestion13;
	}
	public String getAnswerToQuestion14() {
		return answerToQuestion14;
	}

	public String getAnswerToQuestion20() {
		return answerToQuestion20;
	}

	public String getAnswerToQuestion21() {
		return answerToQuestion21;
	}

	public void setAnswerToQuestion1(String answerToQuestion1) {
		this.answerToQuestion1 = answerToQuestion1;
	}

	public void setAnswerToQuestion2(String answerToQuestion2) {
		this.answerToQuestion2 = answerToQuestion2;
	}

	public void setAnswerToQuestion3(String answerToQuestion3) {
		this.answerToQuestion3 = answerToQuestion3;
	}

	public void setAnswerToQuestion4(String answerToQuestion4) {
		this.answerToQuestion4 = answerToQuestion4;
	}

	public void setAnswerToQuestion5(String answerToQuestion5) {
		this.answerToQuestion5 = answerToQuestion5;
	}
	public void setAnswerToQuestion8(String answerToQuestion8) {
		this.answerToQuestion8 = answerToQuestion8;
	}
	public void setAnswerToQuestion9(String answerToQuestion9) {
		this.answerToQuestion9 = answerToQuestion9;
	}
	public void setAnswerToQuestion10(String answerToQuestion10) {
		this.answerToQuestion10 = answerToQuestion10;
	}
	public void setAnswerToQuestion11(String answerToQuestion11) {
		this.answerToQuestion11 = answerToQuestion11;
	}
	public void setAnswerToQuestion12(String answerToQuestion12) {
		this.answerToQuestion12 = answerToQuestion12;
	}

	public void setAnswerToQuestion13(String answerToQuestion13) {
		this.answerToQuestion13 = answerToQuestion13;
	}

	public void setAnswerToQuestion14(String answerToQuestion14) {
		this.answerToQuestion14 = answerToQuestion14;
	}
	public void setAnswerToQuestion20(String answerToQuestion20) {
		this.answerToQuestion20 = answerToQuestion20;
	}
	public void setAnswerToQuestion21(String answerToQuestion21) {
		this.answerToQuestion21 = answerToQuestion21;
	}

}
