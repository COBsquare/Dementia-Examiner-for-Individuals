package SpeechRecognition.Questions;




import java.io.FileInputStream;
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
import edu.cmu.sphinx.api.StreamSpeechRecognizer;


public class Question4 {
	public static void main(String[] args) throws IOException {
		new Question4();
	}

	private LiveSpeechRecognizer recognizer;



	public Question4() throws IOException {

		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("Question4");
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int year  = localDate.getYear();
		int month = localDate.getMonthValue();
		int day   = localDate.getDayOfMonth();
		String answer;
		System.out.println("" + year);
		System.out.println("" + month);
		System.out.println("" + day);

		String dateString = String.format("%d-%d-%d", year, month, day);

		// Then get the day of week from the Date based on specific locale.
		String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

		System.out.println(dayOfWeek);



		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
		recognizer.startRecognition(new FileInputStream("Resources/Answers/Question4.wav"));
		SpeechResult Result = recognizer.getResult();
		System.out.println(Result.getHypothesis());
			String speechWords = Result.getHypothesis();
			System.out.println(" The result from the speech is " + speechWords);
			if(dayOfWeek=="Sunday"){
				answer = "Sunday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="Monday"){
				answer = "Monday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="Tuesday"){
				answer = "Tuesday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="Wednesday"){
				answer = "Wednesday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="Thursday"){
				answer = "Thursday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="Friday"){
				answer = "Friday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="Saturday"){
				answer = "Saturday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}

	}

}
