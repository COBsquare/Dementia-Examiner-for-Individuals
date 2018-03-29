
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


public class Question5 {
	public static void main(String[] args) throws IOException {
		new Question5();
	}




	public Question5() throws IOException {
		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("Question5");
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
		recognizer.startRecognition(new FileInputStream("Resources/Answers/Question5.wav"));
		SpeechResult Result = recognizer.getResult();
		System.out.println(Result.getHypothesis());
			String speechWords = Result.getHypothesis();
			System.out.println(" The result from the speech is " + speechWords);
			if(month==1){
				answer = "january";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month==2){
				answer = "february";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month==3){
				answer = "march";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month==4){
				answer = "april";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month==5){
				answer = "may";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month==6){
				answer = "june";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month==7){
				answer = "july";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month==8){
				answer = "august";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month==9){
				answer = "september";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month==10){
				answer = "october";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month==11){
				answer = "november";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}
		}
			else if(month==12){
				answer = "december";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");

				}

			}
}
	}

