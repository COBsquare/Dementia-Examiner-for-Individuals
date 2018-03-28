
package SpeechRecognition.Questions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;


public class Question2 {

	public static void main(String[] args) throws IOException {
		new Question2();
	}





	public Question2() throws IOException {
		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("Question2");
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
		StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
		recognizer.startRecognition(new FileInputStream("Resources/Answers/Question2.wav"));
		SpeechResult Result = recognizer.getResult();
		System.out.println(Result.getHypothesis());
			String speechWords = Result.getHypothesis();
			System.out.println(" The result from the speech is " + speechWords);
			if((month==12) && (month >=1 && month <=2)){
				answer = "winter";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month >=3 && month <6){
				answer = "spring";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month >=6   && month <= 8){
				answer = "summer";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month >8   && month <= 11){
				answer = "autumn";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}


	}

}