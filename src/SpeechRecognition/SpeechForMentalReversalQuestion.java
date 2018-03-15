
package SpeechRecognition;

//PROBLEMATIC


import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;


public class SpeechForMentalReversalQuestion {
	public void StopRecogniton(){

		recognizer.stopRecognition();
	}
	public static void main(String[] args) {
		new SpeechForMentalReversalQuestion();
	}

	private LiveSpeechRecognizer recognizer;



	public SpeechForMentalReversalQuestion() {

		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("mentalreversal");
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int year  = localDate.getYear();
		int month = localDate.getMonthValue();
		int day   = localDate.getDayOfMonth();
		String answer;
		System.out.println("" + year);
		System.out.println("" + month);
		System.out.println("" + day);

		String firstday = "one";
		String secondday = "two";
		String thirdday = "three";
		String fourtday = "four";
		String fifthday = "five";
		String sixthday = "six";
		String seventhday = "seven";
		String eightday = "eight";
		String ninthday = "nine";
		String tenthday = "ten";
		String eleventhday = "eleven";
		String twelvetday = "twelve";
		String thirtheentday = "thirteen";
		String fourteenthday = "fourteen";
		String fifteenthday = "fifeteen";
		String sixteenthday = "sixteen";
		String seventennthday = "seventeen";
		String eighteenthday = "eighteen";
		String nineteenthday = "nineteen";
		String twentynthday = "twenty";
		String twentyoneday = "twentyone";
		String twentysecondday = "twentytwo";
		String twentthirdday = "twentythree";
		String twentyfourthday = "twentyfour";
		String twentyfifthday = "twentyfive";
		String twentysixthday = "twentysix";
		String twentseventhday = "twentyseven";
		String twentyeightday = "twentyeight";
		String twentynineday = "twentynine";
		String thirthy = "thirthy";
		String thityone = "thirthyone";

		String[] countryCodes = Locale.getISOCountries();

		for (String countryCode : countryCodes) {

		    Locale obj = new Locale("", countryCode);

		    System.out.println("Country Code = " + obj.getCountry()
		        + ", Country Name = " + obj.getDisplayCountry());

		}

		configuration.setUseGrammar(true);
		try {
			recognizer = new LiveSpeechRecognizer(configuration);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		recognizer.startRecognition(true);
		SpeechResult Result = recognizer.getResult();

		while((Result = recognizer.getResult()) != null){
			String speechWords = Result.getHypothesis();
			System.out.println(" The result from the speech is " + speechWords);
				answer = "ninetythree eightysix seventynine seventytwo";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}



	}

}
