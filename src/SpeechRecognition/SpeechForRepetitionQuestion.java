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


public class SpeechForRepetitionQuestion {
	public void StopRecogniton(){

		recognizer.stopRecognition();
	}
	public static void main(String[] args) {
		new SpeechForRepetitionQuestion();
	}

	private LiveSpeechRecognizer recognizer;



	public SpeechForRepetitionQuestion() {

		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("repetition");
		String answer;

		configuration.setUseGrammar(true);
		try {
			recognizer = new LiveSpeechRecognizer(configuration);
		} catch (IOException e) {
			e.printStackTrace();
		}
		recognizer.startRecognition(true);
		SpeechResult Result = recognizer.getResult();

		while((Result = recognizer.getResult()) != null){
			String speechWords = Result.getHypothesis();
			System.out.println(" The result from the speech is " + speechWords);
				answer = "no ifs ands or buts";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
	}

}
