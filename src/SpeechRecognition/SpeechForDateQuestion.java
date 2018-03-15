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


public class SpeechForDateQuestion {
	public void StopRecogniton(){

		recognizer.stopRecognition();
	}
	public static void main(String[] args) {
		new SpeechForDateQuestion();
	}

	private LiveSpeechRecognizer recognizer;



	public SpeechForDateQuestion() {

		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("date");
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
			if(day==1 && month==1){
				answer = "january first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==1){
				answer = "january second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==1){
				answer = "january third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==1){
				answer = "january fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==1){
				answer = "january fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==1){
				answer = "january sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==1){
				answer = "january seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==1){
				answer = "january eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==1){
				answer = "january fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==1){
				answer = "january fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==1){
				answer = "january eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==1){
				answer = "january twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==1){
				answer = "january thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==1){
				answer = "january fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==1){
				answer = "january fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==1){
				answer = "january sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==1){
				answer = "january seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==1){
				answer = "january eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==1){
				answer = "january nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==1){
				answer = "january twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==1){
				answer = "january twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==1){
				answer = "january twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==1){
				answer = "january twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==1){
				answer = "january twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==1){
				answer = "january twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==1){
				answer = "january twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==1){
				answer = "january twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==1){
				answer = "january twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==1){
				answer = "january twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30 && month==1){
				answer = "january thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==31 && month==1){
				answer = "january thirty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==1 && month==2){
				answer = "february first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==2){
				answer = "february second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==2){
				answer = "february third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==2){
				answer = "february fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==2){
				answer = "february fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==2){
				answer = "february sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==2){
				answer = "february seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==2){
				answer = "february eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==2){
				answer = "february fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==2){
				answer = "february fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==2){
				answer = "february eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==2){
				answer = "february twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==2){
				answer = "february thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==2){
				answer = "february fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==2){
				answer = "february fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==2){
				answer = "february sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==2){
				answer = "february seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==2){
				answer = "february eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==2){
				answer = "february nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==2){
				answer = "february twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==2){
				answer = "february twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==2){
				answer = "february twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==2){
				answer = "febraury twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==2){
				answer = "february twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==2){
				answer = "february twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==2){
				answer = "february twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==2){
				answer = "february twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==2){
				answer = "february twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==2){
				answer = "february twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==1 && month==3){
				answer = "march first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==3){
				answer = "march second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==3){
				answer = "march third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==3){
				answer = "march fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==3){
				answer = "march fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==3){
				answer = "march sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==3){
				answer = "march seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==3){
				answer = "march eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==3){
				answer = "march fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==3){
				answer = "march tenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==3){
				answer = "march eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==3){
				answer = "march twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==3){
				answer = "march thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==3){
				answer = "march fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==3){
				answer = "march fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==3){
				answer = "march sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==3){
				answer = "march seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==3){
				answer = "march eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==3){
				answer = "march nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==3){
				answer = "march twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==3){
				answer = "march twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==3){
				answer = "march twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==3){
				answer = "march twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==3){
				answer = "march twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==3){
				answer = "march twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==3){
				answer = "march twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==3){
				answer = "march twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==3){
				answer = "march twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==3){
				answer = "march twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30 && month==3){
				answer = "march thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==31 && month==3){
				answer = "march thirty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==1 && month==4){
				answer = "april first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==4){
				answer = "april second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==4){
				answer = "april third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==4){
				answer = "april fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==4){
				answer = "april fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==4){
				answer = "april sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==4){
				answer = "april seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==4){
				answer = "april eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==4){
				answer = "april fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==4){
				answer = "april tenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==4){
				answer = "april eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==4){
				answer = "april twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==4){
				answer = "april thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==4){
				answer = "april fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==4){
				answer = "april fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==4){
				answer = "april sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==4){
				answer = "april seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==4){
				answer = "april eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==4){
				answer = "april nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==4){
				answer = "april twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==4){
				answer = "april twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==4){
				answer = "april twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==4){
				answer = "april twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==4){
				answer = "april twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==4){
				answer = "april twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==4){
				answer = "april twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==4){
				answer = "april twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==4){
				answer = "april twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==4){
				answer = "april twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30 && month==4){
				answer = "april thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==1 && month==5){
				answer = "may first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==5){
				answer = "may second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==5){
				answer = "may third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==5){
				answer = "may fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==5){
				answer = "mayy fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==5){
				answer = "may sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==5){
				answer = "may seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==5){
				answer = "may eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==5){
				answer = "may fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==5){
				answer = "may tenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==5){
				answer = "may eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==5){
				answer = "may twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==5){
				answer = "may thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==5){
				answer = "may fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==5){
				answer = "may fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==5){
				answer = "may sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==5){
				answer = "may seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==5){
				answer = "may eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==5){
				answer = "may nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==5){
				answer = "may twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==5){
				answer = "may twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==5){
				answer = "may twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==5){
				answer = "may twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==5){
				answer = "may twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==5){
				answer = "may twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==5){
				answer = "may twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==5){
				answer = "may twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==5){
				answer = "may twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==5){
				answer = "may twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30 && month==5){
				answer = "may thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==31 && month==5){
				answer = "may thirty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==1 && month==6){
				answer = "june first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==6){
				answer = "june second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==6){
				answer = "june third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==6){
				answer = "june fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==6){
				answer = "june fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==6){
				answer = "june sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==6){
				answer = "june seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==6){
				answer = "june eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==6){
				answer = "june ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==6){
				answer = "june tenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==6){
				answer = "june eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==6){
				answer = "june twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==6){
				answer = "june thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==6){
				answer = "june fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==6){
				answer = "june fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==6){
				answer = "june sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==6){
				answer = "june seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==6){
				answer = "june eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==6){
				answer = "june nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==6){
				answer = "june twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==6){
				answer = "june twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==6){
				answer = "june twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==6){
				answer = "june twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==6){
				answer = "june twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==6){
				answer = "june twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==6){
				answer = "june twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==6){
				answer = "june twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==6){
				answer = "june twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==6){
				answer = "june twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30 && month==6){
				answer = "june thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}

			if(day==1 && month==7){
				answer = "july first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==7){
				answer = "july second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==7){
				answer = "july third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==7){
				answer = "july fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==7){
				answer = "july fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==7){
				answer = "july sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==7){
				answer = "july seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==7){
				answer = "july eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==7){
				answer = "july ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==7){
				answer = "july tenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==7){
				answer = "july eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==7){
				answer = "july twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==7){
				answer = "july thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==7){
				answer = "july fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==7){
				answer = "july fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==7){
				answer = "july sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==7){
				answer = "july seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==7){
				answer = "july eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==7){
				answer = "july nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==7){
				answer = "july twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==7){
				answer = "july twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==7){
				answer = "july twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==7){
				answer = "july twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==7){
				answer = "july twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==7){
				answer = "july twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==7){
				answer = "july twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==7){
				answer = "july twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==7){
				answer = "july twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==7){
				answer = "july twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30 && month==7){
				answer = "july thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==31 && month==7){
				answer = "july thirty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}

			if(day==1 && month==8){
				answer = "august first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==8){
				answer = "august second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==8){
				answer = "august third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==8){
				answer = "august fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==8){
				answer = "august fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==8){
				answer = "august sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==8){
				answer = "august seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==8){
				answer = "august eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==8){
				answer = "august ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==8){
				answer = "august tenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==8){
				answer = "august eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==8){
				answer = "august twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==8){
				answer = "august thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==8){
				answer = "august fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==8){
				answer = "august fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==8){
				answer = "august sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==8){
				answer = "august seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==8){
				answer = "august eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==8){
				answer = "august nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==8){
				answer = "august twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==8){
				answer = "august twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==8){
				answer = "august twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==8){
				answer = "august twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==8){
				answer = "august twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==8){
				answer = "august twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==8){
				answer = "august twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==8){
				answer = "august twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==8){
				answer = "august twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==8){
				answer = "august twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30 && month==8){
				answer = "august thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}

			if(day==1 && month==9){
				answer = "september first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==9){
				answer = "september second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==9){
				answer = "september third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==9){
				answer = "september fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==9){
				answer = "september fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==9){
				answer = "september sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==9){
				answer = "september seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==9){
				answer = "september eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==9){
				answer = "september ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==9){
				answer = "september tenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==9){
				answer = "september eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==9){
				answer = "september twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==9){
				answer = "september thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==9){
				answer = "september fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==9){
				answer = "september fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==9){
				answer = "september sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==9){
				answer = "september seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==9){
				answer = "september eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==9){
				answer = "september nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==9){
				answer = "september twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==9){
				answer = "september twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==9){
				answer = "september twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==9){
				answer = "september twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==9){
				answer = "september twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==9){
				answer = "september twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==9){
				answer = "september twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==9){
				answer = "september twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==9){
				answer = "september twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==9){
				answer = "september twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30 && month==9){
				answer = "september thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==1 && month==10){
				answer = "october first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==10){
				answer = "october second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==10){
				answer = "october third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==10){
				answer = "october fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==10){
				answer = "october fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==10){
				answer = "october sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==10){
				answer = "october seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==10){
				answer = "october eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==10){
				answer = "october ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==10){
				answer = "october tenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==10){
				answer = "october eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==10){
				answer = "october twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==10){
				answer = "october thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==10){
				answer = "october fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==10){
				answer = "october fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==10){
				answer = "october sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==10){
				answer = "october seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==10){
				answer = "october eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==10){
				answer = "october nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==10){
				answer = "october twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==10){
				answer = "october twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==10){
				answer = "october twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==10){
				answer = "october twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==10){
				answer = "october twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==10){
				answer = "october twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==10){
				answer = "october twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==10){
				answer = "october twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==10){
				answer = "october twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==10){
				answer = "october twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30 && month==10){
				answer = "october thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==31 && month==10){
				answer = "october thirty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==1 && month==11){
				answer = "november first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==11){
				answer = "november second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==11){
				answer = "november third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==11){
				answer = "november fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==11){
				answer = "november fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==11){
				answer = "november sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==11){
				answer = "november seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==11){
				answer = "november eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==11){
				answer = "november ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==11){
				answer = "november tenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==11){
				answer = "november eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==11){
				answer = "november twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==11){
				answer = "november thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==11){
				answer = "november fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==11){
				answer = "november fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==11){
				answer = "november sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==11){
				answer = "november seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==11){
				answer = "november eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==11){
				answer = "november nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==11){
				answer = "november twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==11){
				answer = "november twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==11){
				answer = "november twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==11){
				answer = "november twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==11){
				answer = "november twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==11){
				answer = "november twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==11){
				answer = "november twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==11){
				answer = "november twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==11){
				answer = "november twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==11){
				answer = "november twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30 && month==11){
				answer = "november thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}

			if(day==1 && month==12){
				answer = "december first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==2 && month==12){
				answer = "december second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==3 && month==12){
				answer = "december third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==4 && month==12){
				answer = "december fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==5 && month==12){
				answer = "december fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==6 && month==12){
				answer = "december sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==7 && month==12){
				answer = "december seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==8 && month==12){
				answer = "december eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==9 && month==12){
				answer = "december ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==10 && month==12){
				answer = "december tenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==11 && month==12){
				answer = "december eleventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==12 && month==12){
				answer = "december twelfth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==13 && month==12){
				answer = "december thirteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==14 && month==12){
				answer = "december fourteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==15 && month==12){
				answer = "december fifteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==16 && month==12){
				answer = "december sixteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==17 && month==12){
				answer = "december seventeenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==18 && month==12){
				answer = "december eighteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==19 && month==12){
				answer = "december nineteenth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==20 && month==12){
				answer = "december twenty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==21 && month==12){
				answer = "december twenty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==22 && month==12){
				answer = "december twenty second";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==23 && month==12){
				answer = "december twenty third";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==24 && month==12){
				answer = "december twenty fourth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==25 && month==12){
				answer = "december twenty fifth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==26 && month==12){
				answer = "december twenty sixth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==27 && month==12){
				answer = "december twenty seventh";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==28 && month==12){
				answer = "december twenty eighth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==29 && month==12){
				answer = "december twenty ninth";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==30 && month==12){
				answer = "december thirty";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}
			if(day==31 && month==12){
				answer = "december thirty first";
				if(speechWords.equals(answer)){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}

	}
	}


}
