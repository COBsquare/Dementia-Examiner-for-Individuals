
package SpeechRecognition;

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


public class SpeechForSeasonQuestion {
	public void StopRecogniton(){

		recognizer.stopRecognition();
	}
	public static void main(String[] args) {
		new SpeechForSeasonQuestion();
	}

	private LiveSpeechRecognizer recognizer;



	public SpeechForSeasonQuestion() {
		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("Seasons");
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int year  = localDate.getYear();
		int month = localDate.getMonthValue();
		int day   = localDate.getDayOfMonth();
		String answer;
		System.out.println("" + year);
		System.out.println("" + month);
		System.out.println("" + day);


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
			if((month==12) && (month >=1 && month <=2)){
				answer = "winter";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			else if(month >=3 && month <6){
				answer = "spring";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			else if(month >=6   && month <= 8){
				answer = "summer";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			else if(month >8   && month <= 11){
				answer = "autumn";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}


	}

}
}