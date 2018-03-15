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


public class SpeechForDayQuestion {
	public void StopRecogniton(){

		recognizer.stopRecognition();
	}
	public static void main(String[] args) {
		new SpeechForDayQuestion();
	}

	private LiveSpeechRecognizer recognizer;



	public SpeechForDayQuestion() {

		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("numbers");
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
			if(day==1){
				answer = "one";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2){
				answer = "two";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3){
				answer = "three";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4){
				answer = "four";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5){
				answer = "five";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6){
				answer = "six";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7){
				answer = "seven";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8){
				answer = "eight";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9){
				answer = "nine";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10){
				answer = "ten";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11){
				answer = "eleven";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12){
				answer = "twelve";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13){
				answer = "thirteen";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14){
				answer = "fourteen";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15){
				answer = "fifteen";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16){
				answer = "sixteen";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17){
				answer = "seventeen";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18){
				answer = "eighteen";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19){
				answer = "nineteen";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20){
				answer = "twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21){
				answer = "twentyone";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22){
				answer = "twentytwo";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23){
				answer = "twentythree";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24){
				answer = "twentyfour";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25){
				answer = "twentyfive";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26){
				answer = "twentysix";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27){
				answer = "twentyseven";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28){
				answer = "twentyeight";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29){
				answer = "twentynine";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30){
				answer = "thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23){
				answer = "twentythree";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==31){
				answer = "thirtyone";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}


	}

}
}