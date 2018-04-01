package SpeechRecognition.Questions;




import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Locale;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;


public class Question4 {
	public static void main(String[] args) throws IOException {
		new Question4();
	}

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
		String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
		System.out.println(dayOfWeek);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
		recognizer.startRecognition(new FileInputStream("Resources/Answers/Question4.wav"));
		SpeechResult Result = recognizer.getResult();
		System.out.println(Result.getHypothesis());
			String speechWords = Result.getHypothesis();
			System.out.println(" The result from the speech is " + speechWords);
			if(dayOfWeek=="sunday"){
				answer = "sunday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="monday"){
				answer = "monday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="tuesday"){
				answer = "tuesday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="wednesday"){
				answer = "wednesday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="thursday"){
				answer = "thursday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="friday"){
				answer = "friday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}
			if(dayOfWeek=="saturday"){
				answer = "saturday";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
				}
		}

	}

}
