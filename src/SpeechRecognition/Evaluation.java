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
	public String answerToQuestion1="two thousand and eighteen";
	public String answerToQuestion2;
	public String answerToQuestion3;
	public String answerToQuestion4;
	public String answerToQuestion5;
	public String answerToQuestion8="north";
	public String answerToQuestion9;
	public String answerToQuestion10="ninety three eighty six seventy nine seventy two sixty five";
	public String answerToQuestion11;
	public String answerToQuestion12;
	public String answerToQuestion13="no ifs ands or buts";
	public String answerToQuestion14="paper";
	public String answerToQuestion20="sunday is preceded by saturday saturday is preceded by friday";
	public String answerToQuestion21 = "i would have gone if he had gone";
	public int scoreFromSpeech=0;
	Configuration configuration = new Configuration();
	Date date = new Date();
	LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	int year  = localDate.getYear();
	int month = localDate.getMonthValue();
	int day   = localDate.getDayOfMonth();
	String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

	public void disableLogMessages(){
		Logger cmRootLogger = Logger.getLogger("default.config");
		  cmRootLogger.setLevel(java.util.logging.Level.OFF);
		  String conFile = System.getProperty("java.util.logging.config.file");
		  if (conFile == null) {
		        System.setProperty("java.util.logging.config.file", "ignoreAllSphinx4LoggingOutput");
		  }
	}


	public void speechUsages(){
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
	}
	public void EvaluationofQuestion1(String grammerNumber) throws IOException{
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer1 = new StreamSpeechRecognizer(configuration);
		recognizer1.startRecognition(new FileInputStream("Resources/Answers/Question1.wav"));
		SpeechResult Result1 = recognizer1.getResult();
		String speechWords1 = Result1.getHypothesis();
		answerToQuestion1= "two thousand and eighteen";
		if(speechWords1.equals(answerToQuestion1)){
			System.out.println("You gained one point from question 1");
			scoreFromSpeech++;
		}
		System.out.println(" The answer to question 1 is " + speechWords1);
	}


	public void EvaluationofQuestion2(String grammerNumber) throws IOException{
		    disableLogMessages();
		    speechUsages();
			configuration.setGrammarName(grammerNumber);
			configuration.setUseGrammar(true);
			StreamSpeechRecognizer recognizer2 = new StreamSpeechRecognizer(configuration);
			recognizer2.startRecognition(new FileInputStream("Resources/Answers/Question2.wav"));
			SpeechResult Result2 = recognizer2.getResult();
			String speechWords2 = Result2.getHypothesis();
			if((month==12) && (month >=1 && month <=2)){
				answerToQuestion2 = "winter";
				if(speechWords2.equals(answerToQuestion2)){
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
		}
			if(month >=3 && month <6){
				answerToQuestion2 = "spring";
				if(speechWords2.equals(answerToQuestion2)){
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
		}
			if(month >=6   && month <= 8){
				answerToQuestion2 = "summer";
				if(speechWords2.equals(answerToQuestion2)){
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
		}
			if(month >8   && month <= 11){
				answerToQuestion2 = "autumn";
				if(speechWords2.equals(answerToQuestion2)){
					System.out.println("You gained one point from question 2");
					scoreFromSpeech++;
				}
		}
			System.out.println(" The answer to question 2 is " + speechWords2);
	}
	public void EvaluationofQuestion3(String grammerNumber) throws IOException{
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer3 = new StreamSpeechRecognizer(configuration);
		recognizer3.startRecognition(new FileInputStream("Resources/Answers/Question3.wav"));
		SpeechResult Result3 = recognizer3.getResult();
		String speechWords3 = Result3.getHypothesis();
		//Answer for Question 3
		if(day==1 && month==1){
			answerToQuestion3 = "january first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==1){
			answerToQuestion3 = "january second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==1){
			answerToQuestion3 = "january third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==1){
			answerToQuestion3 = "january fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==1){
			answerToQuestion3 = "january fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==1){
			answerToQuestion3 = "january sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==1){
			answerToQuestion3 = "january seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==1){
			answerToQuestion3 = "january eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==1){
			answerToQuestion3 = "january ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==1){
			answerToQuestion3 = "january tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==1){
			answerToQuestion3 = "january eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==1){
			answerToQuestion3 = "january twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==1){
			answerToQuestion3 = "january thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==1){
			answerToQuestion3 = "january fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==1){
			answerToQuestion3 = "january fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==1){
			answerToQuestion3 = "january sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==1){
			answerToQuestion3 = "january seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==1){
			answerToQuestion3 = "january eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==1){
			answerToQuestion3 = "january nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==1){
			answerToQuestion3 = "january twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==1){
			answerToQuestion3 = "january twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==1){
			answerToQuestion3 = "january twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==1){
			answerToQuestion3 = "january twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==1){
			answerToQuestion3 = "january twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==1){
			answerToQuestion3 = "january twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==1){
			answerToQuestion3 = "january twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==1){
			answerToQuestion3 = "january twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==1){
			answerToQuestion3 = "january twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==1){
			answerToQuestion3 = "january twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==30 && month==1){
			answerToQuestion3 = "january thirty";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==31 && month==1){
			answerToQuestion3 = "january thirty first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==1 && month==2){
			answerToQuestion3 = "february first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==2){
			answerToQuestion3 = "february second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==2){
			answerToQuestion3 = "february third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==2){
			answerToQuestion3 = "february fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==2){
			answerToQuestion3 = "february fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==2){
			answerToQuestion3 = "february sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==2){
			answerToQuestion3 = "february seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==2){
			answerToQuestion3 = "february eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==2){
			answerToQuestion3 = "february ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==2){
			answerToQuestion3 = "february tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==2){
			answerToQuestion3 = "february eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==2){
			answerToQuestion3 = "february twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==2){
			answerToQuestion3 = "february thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==2){
			answerToQuestion3 = "february fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==2){
			answerToQuestion3 = "february fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==2){
			answerToQuestion3 = "february sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==2){
			answerToQuestion3 = "february seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==2){
			answerToQuestion3 = "february eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==2){
			answerToQuestion3 = "february nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==2){
			answerToQuestion3 = "february twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==2){
			answerToQuestion3 = "february twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==2){
			answerToQuestion3 = "february twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==2){
			answerToQuestion3 = "febraury twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==2){
			answerToQuestion3 = "february twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==2){
			answerToQuestion3 = "february twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==2){
			answerToQuestion3 = "february twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==2){
			answerToQuestion3 = "february twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==2){
			answerToQuestion3 = "february twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==2){
			answerToQuestion3 = "february twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==1 && month==3){
			answerToQuestion3 = "march first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==3){
			answerToQuestion3 = "march second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==3){
			answerToQuestion3 = "march third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==3){
			answerToQuestion3 = "march fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==3){
			answerToQuestion3 = "march fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==3){
			answerToQuestion3 = "march sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==3){
			answerToQuestion3 = "march seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==3){
			answerToQuestion3 = "march eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==3){
			answerToQuestion3 = "march fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==3){
			answerToQuestion3 = "march tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==3){
			answerToQuestion3 = "march eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==3){
			answerToQuestion3 = "march twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==3){
			answerToQuestion3 = "march thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==3){
			answerToQuestion3 = "march fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==3){
			answerToQuestion3 = "march fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==3){
			answerToQuestion3 = "march sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==3){
			answerToQuestion3 = "march seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==3){
			answerToQuestion3 = "march eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==3){
			answerToQuestion3 = "march nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==3){
			answerToQuestion3 = "march twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==3){
			answerToQuestion3 = "march twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==3){
			answerToQuestion3 = "march twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==3){
			answerToQuestion3 = "march twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==3){
			answerToQuestion3 = "march twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==3){
			answerToQuestion3 = "march twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==3){
			answerToQuestion3 = "march twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==3){
			answerToQuestion3 = "march twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==3){
			answerToQuestion3 = "march twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==3){
			answerToQuestion3 = "march twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==30 && month==3){
			answerToQuestion3 = "march thirty";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==31 && month==3){
			answerToQuestion3 = "march thirty first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==1 && month==4){
			answerToQuestion3 = "april first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==4){
			answerToQuestion3 = "april second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==4){
			answerToQuestion3 = "april third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==4){
			answerToQuestion3 = "april fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==4){
			answerToQuestion3 = "april fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==4){
			answerToQuestion3 = "april sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==4){
			answerToQuestion3 = "april seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==4){
			answerToQuestion3 = "april eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==4){
			answerToQuestion3 = "april fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==4){
			answerToQuestion3 = "april tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==4){
			answerToQuestion3 = "april eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==4){
			answerToQuestion3 = "april twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==4){
			answerToQuestion3 = "april thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==4){
			answerToQuestion3 = "april fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==4){
			answerToQuestion3 = "april fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==4){
			answerToQuestion3 = "april sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==4){
			answerToQuestion3 = "april seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==4){
			answerToQuestion3 = "april eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==4){
			answerToQuestion3 = "april nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==4){
			answerToQuestion3 = "april twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==4){
			answerToQuestion3 = "april twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==4){
			answerToQuestion3 = "april twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==4){
			answerToQuestion3 = "april twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==4){
			answerToQuestion3 = "april twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==4){
			answerToQuestion3 = "april twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==4){
			answerToQuestion3 = "april twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==4){
			answerToQuestion3 = "april twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==4){
			answerToQuestion3 = "april twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==4){
			answerToQuestion3 = "april twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==30 && month==4){
			answerToQuestion3 = "april thirty";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==1 && month==5){
			answerToQuestion3 = "may first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==5){
			answerToQuestion3 = "may second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==5){
			answerToQuestion3 = "may third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==5){
			answerToQuestion3 = "may fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==5){
			answerToQuestion3 = "may fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==5){
			answerToQuestion3 = "may sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==5){
			answerToQuestion3 = "may seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==5){
			answerToQuestion3 = "may eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==5){
			answerToQuestion3 = "may fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==5){
			answerToQuestion3 = "may tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==5){
			answerToQuestion3 = "may eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==5){
			answerToQuestion3 = "may twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==5){
			answerToQuestion3 = "may thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==5){
			answerToQuestion3 = "may fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==5){
			answerToQuestion3 = "may fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==5){
			answerToQuestion3 = "may sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==5){
			answerToQuestion3 = "may seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==5){
			answerToQuestion3 = "may eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==5){
			answerToQuestion3 = "may nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==5){
			answerToQuestion3 = "may twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==5){
			answerToQuestion3 = "may twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==5){
			answerToQuestion3 = "may twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==5){
			answerToQuestion3 = "may twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==5){
			answerToQuestion3 = "may twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==5){
			answerToQuestion3 = "may twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==5){
			answerToQuestion3 = "may twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==5){
			answerToQuestion3 = "may twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==5){
			answerToQuestion3 = "may twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==5){
			answerToQuestion3 = "may twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==30 && month==5){
			answerToQuestion3 = "may thirty";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==31 && month==5){
			answerToQuestion3 = "may thirty first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==1 && month==6){
			answerToQuestion3 = "june first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==6){
			answerToQuestion3 = "june second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==6){
			answerToQuestion3 = "june third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==6){
			answerToQuestion3 = "june fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==6){
			answerToQuestion3 = "june fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==6){
			answerToQuestion3 = "june sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==6){
			answerToQuestion3 = "june seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==6){
			answerToQuestion3 = "june eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==6){
			answerToQuestion3 = "june ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==6){
			answerToQuestion3 = "june tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==6){
			answerToQuestion3 = "june eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==6){
			answerToQuestion3 = "june twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==6){
			answerToQuestion3 = "june thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==6){
			answerToQuestion3 = "june fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==6){
			answerToQuestion3 = "june fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==6){
			answerToQuestion3 = "june sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==6){
			answerToQuestion3 = "june seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==6){
			answerToQuestion3 = "june eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==6){
			answerToQuestion3 = "june nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==6){
			answerToQuestion3 = "june twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==6){
			answerToQuestion3 = "june twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==6){
			answerToQuestion3 = "june twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==6){
			answerToQuestion3 = "june twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==6){
			answerToQuestion3 = "june twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==6){
			answerToQuestion3 = "june twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==6){
			answerToQuestion3 = "june twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==6){
			answerToQuestion3 = "june twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==6){
			answerToQuestion3 = "june twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==6){
			answerToQuestion3 = "june twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==30 && month==6){
			answerToQuestion3 = "june thirty";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}

		if(day==1 && month==7){
			answerToQuestion3 = "july first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==7){
			answerToQuestion3 = "july second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==7){
			answerToQuestion3 = "july third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==7){
			answerToQuestion3 = "july fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==7){
			answerToQuestion3 = "july fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==7){
			answerToQuestion3 = "july sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==7){
			answerToQuestion3 = "july seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==7){
			answerToQuestion3 = "july eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==7){
			answerToQuestion3 = "july ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==7){
			answerToQuestion3 = "july tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==7){
			answerToQuestion3 = "july eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==7){
			answerToQuestion3 = "july twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==7){
			answerToQuestion3 = "july thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==7){
			answerToQuestion3 = "july fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==7){
			answerToQuestion3 = "july fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==7){
			answerToQuestion3 = "july sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==7){
			answerToQuestion3 = "july seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==7){
			answerToQuestion3 = "july eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==7){
			answerToQuestion3 = "july nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==7){
			answerToQuestion3 = "july twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==7){
			answerToQuestion3 = "july twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==7){
			answerToQuestion3 = "july twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==7){
			answerToQuestion3 = "july twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==7){
			answerToQuestion3 = "july twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==7){
			answerToQuestion3 = "july twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==7){
			answerToQuestion3 = "july twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==7){
			answerToQuestion3 = "july twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==7){
			answerToQuestion3 = "july twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==7){
			answerToQuestion3 = "july twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==30 && month==7){
			answerToQuestion3 = "july thirty";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==31 && month==7){
			answerToQuestion3 = "july thirty first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}

		if(day==1 && month==8){
			answerToQuestion3 = "august first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==8){
			answerToQuestion3 = "august second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==8){
			answerToQuestion3 = "august third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==8){
			answerToQuestion3 = "august fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==8){
			answerToQuestion3 = "august fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==8){
			answerToQuestion3 = "august sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==8){
			answerToQuestion3 = "august seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==8){
			answerToQuestion3 = "august eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==8){
			answerToQuestion3 = "august ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==8){
			answerToQuestion3 = "august tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==8){
			answerToQuestion3 = "august eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==8){
			answerToQuestion3 = "august twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==8){
			answerToQuestion3 = "august thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==8){
			answerToQuestion3 = "august fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==8){
			answerToQuestion3 = "august fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==8){
			answerToQuestion3 = "august sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==8){
			answerToQuestion3 = "august seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==8){
			answerToQuestion3 = "august eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==8){
			answerToQuestion3 = "august nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==8){
			answerToQuestion3 = "august twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==8){
			answerToQuestion3 = "august twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==8){
			answerToQuestion3 = "august twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==8){
			answerToQuestion3 = "august twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==8){
			answerToQuestion3 = "august twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==8){
			answerToQuestion3 = "august twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==8){
			answerToQuestion3 = "august twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==8){
			answerToQuestion3 = "august twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==8){
			answerToQuestion3 = "august twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==8){
			answerToQuestion3 = "august twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==30 && month==8){
			answerToQuestion3 = "august thirty";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}

		if(day==1 && month==9){
			answerToQuestion3 = "september first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==9){
			answerToQuestion3 = "september second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==9){
			answerToQuestion3 = "september third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==9){
			answerToQuestion3 = "september fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==9){
			answerToQuestion3 = "september fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==9){
			answerToQuestion3 = "september sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==9){
			answerToQuestion3 = "september seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==9){
			answerToQuestion3 = "september eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==9){
			answerToQuestion3 = "september ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==9){
			answerToQuestion3 = "september tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==9){
			answerToQuestion3 = "september eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==9){
			answerToQuestion3 = "september twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==9){
			answerToQuestion3 = "september thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==9){
			answerToQuestion3 = "september fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==9){
			answerToQuestion3 = "september fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==9){
			answerToQuestion3 = "september sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==9){
			answerToQuestion3 = "september seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==9){
			answerToQuestion3 = "september eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==9){
			answerToQuestion3 = "september nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==9){
			answerToQuestion3 = "september twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==9){
			answerToQuestion3 = "september twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==9){
			answerToQuestion3 = "september twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==9){
			answerToQuestion3 = "september twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==9){
			answerToQuestion3 = "september twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==9){
			answerToQuestion3 = "september twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==9){
			answerToQuestion3 = "september twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==9){
			answerToQuestion3 = "september twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==9){
			answerToQuestion3 = "september twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==9){
			answerToQuestion3 = "september twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==30 && month==9){
			answerToQuestion3 = "september thirty";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==1 && month==10){
			answerToQuestion3 = "october first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==10){
			answerToQuestion3 = "october second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==10){
			answerToQuestion3 = "october third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==10){
			answerToQuestion3 = "october fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==10){
			answerToQuestion3 = "october fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==10){
			answerToQuestion3 = "october sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==10){
			answerToQuestion3 = "october seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==10){
			answerToQuestion3 = "october eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==10){
			answerToQuestion3 = "october ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==10){
			answerToQuestion3 = "october tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==10){
			answerToQuestion3 = "october eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==10){
			answerToQuestion3 = "october twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==10){
			answerToQuestion3 = "october thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==10){
			answerToQuestion3 = "october fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==10){
			answerToQuestion3 = "october fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==10){
			answerToQuestion3 = "october sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==10){
			answerToQuestion3 = "october seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==10){
			answerToQuestion3 = "october eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==10){
			answerToQuestion3 = "october nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==10){
			answerToQuestion3 = "october twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==10){
			answerToQuestion3 = "october twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==10){
			answerToQuestion3 = "october twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==10){
			answerToQuestion3 = "october twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==10){
			answerToQuestion3 = "october twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==10){
			answerToQuestion3 = "october twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==10){
			answerToQuestion3 = "october twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==10){
			answerToQuestion3 = "october twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==10){
			answerToQuestion3 = "october twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==10){
			answerToQuestion3 = "october twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==30 && month==10){
			answerToQuestion3 = "october thirty";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==31 && month==10){
			answerToQuestion3 = "october thirty first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==1 && month==11){
			answerToQuestion3 = "november first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==11){
			answerToQuestion3 = "november second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==11){
			answerToQuestion3 = "november third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==11){
			answerToQuestion3 = "november fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==11){
			answerToQuestion3 = "november fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==11){
			answerToQuestion3 = "november sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==11){
			answerToQuestion3 = "november seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==11){
			answerToQuestion3 = "november eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==11){
			answerToQuestion3 = "november ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==11){
			answerToQuestion3 = "november tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==11){
			answerToQuestion3 = "november eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==11){
			answerToQuestion3 = "november twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==11){
			answerToQuestion3 = "november thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==11){
			answerToQuestion3 = "november fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==11){
			answerToQuestion3 = "november fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==11){
			answerToQuestion3 = "november sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==11){
			answerToQuestion3 = "november seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==11){
			answerToQuestion3 = "november eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==11){
			answerToQuestion3 = "november nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==11){
			answerToQuestion3 = "november twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==11){
			answerToQuestion3 = "november twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==11){
			answerToQuestion3 = "november twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==11){
			answerToQuestion3 = "november twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==11){
			answerToQuestion3 = "november twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==11){
			answerToQuestion3 = "november twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==11){
			answerToQuestion3 = "november twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==11){
			answerToQuestion3 = "november twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==11){
			answerToQuestion3 = "november twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==11){
			answerToQuestion3 = "november twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==30 && month==11){
			answerToQuestion3 = "november thirty";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}

		if(day==1 && month==12){
			answerToQuestion3 = "december first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==2 && month==12){
			answerToQuestion3 = "december second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==3 && month==12){
			answerToQuestion3 = "december third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==4 && month==12){
			answerToQuestion3 = "december fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==5 && month==12){
			answerToQuestion3 = "december fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==6 && month==12){
			answerToQuestion3 = "december sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==7 && month==12){
			answerToQuestion3 = "december seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==8 && month==12){
			answerToQuestion3 = "december eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==9 && month==12){
			answerToQuestion3 = "december ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==10 && month==12){
			answerToQuestion3 = "december tenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==11 && month==12){
			answerToQuestion3 = "december eleventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==12 && month==12){
			answerToQuestion3 = "december twelfth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==13 && month==12){
			answerToQuestion3 = "december thirteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==14 && month==12){
			answerToQuestion3 = "december fourteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==15 && month==12){
			answerToQuestion3 = "december fifteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==16 && month==12){
			answerToQuestion3 = "december sixteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==17 && month==12){
			answerToQuestion3 = "december seventeenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==18 && month==12){
			answerToQuestion3 = "december eighteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==19 && month==12){
			answerToQuestion3 = "december nineteenth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==20 && month==12){
			answerToQuestion3 = "december twentieth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==21 && month==12){
			answerToQuestion3 = "december twentieth first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==22 && month==12){
			answerToQuestion3 = "december twentieth second";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==23 && month==12){
			answerToQuestion3 = "december twentieth third";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==24 && month==12){
			answerToQuestion3 = "december twentieth fourth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==25 && month==12){
			answerToQuestion3 = "december twentieth fifth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==26 && month==12){
			answerToQuestion3 = "december twentieth sixth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==27 && month==12){
			answerToQuestion3 = "december twentieth seventh";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==28 && month==12){
			answerToQuestion3 = "december twentieth eighth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==29 && month==12){
			answerToQuestion3 = "december twentieth ninth";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==30 && month==12){
			answerToQuestion3 = "december thirty";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		if(day==31 && month==12){
			answerToQuestion3 = "december thirty first";
			if(speechWords3.equals(answerToQuestion3)){
				System.out.println("You gained one point");
				scoreFromSpeech++;
			}
	}
		System.out.println(" The result to question 3 is " + speechWords3);
	}
	public void EvaluationofQuestion4(String grammerNumber) throws IOException{
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer4 = new StreamSpeechRecognizer(configuration);
		recognizer4.startRecognition(new FileInputStream("Resources/Answers/Question4.wav"));
		SpeechResult Result4 = recognizer4.getResult();
		String speechWords4 = Result4.getHypothesis();
		if(dayOfWeek=="sunday"){
			answerToQuestion4 = "sunday";
			if(speechWords4.equals(answerToQuestion4)){
				System.out.println("You gained one point from question 4");
				scoreFromSpeech++;
			}
	}
		if(dayOfWeek=="monday"){
			answerToQuestion4 = "monday";
			if(speechWords4.equals(answerToQuestion4)){
				System.out.println("You gained one point from question 4");
				scoreFromSpeech++;
			}
	}
		if(dayOfWeek=="tuesday"){
			answerToQuestion4 = "tuesday";
			if(speechWords4.equals(answerToQuestion4)){
				System.out.println("You gained one point from question 4");
				scoreFromSpeech++;
			}
	}
		if(dayOfWeek=="wednesday"){
			answerToQuestion4 = "wednesday";
			if(speechWords4.equals(answerToQuestion4)){
				System.out.println("You gained one point from question 4");
				scoreFromSpeech++;
			}
	}
		if(dayOfWeek=="thursday"){
			answerToQuestion4 = "thursday";
			if(speechWords4.equals(answerToQuestion4)){
				System.out.println("You gained one point from question 4");
				scoreFromSpeech++;
			}
	}
		if(dayOfWeek=="friday"){
			answerToQuestion4 = "friday";
			if(speechWords4.equals(answerToQuestion4)){
				System.out.println("You gained one point from question 4");
				scoreFromSpeech++;
			}
	}
		if(dayOfWeek=="saturday"){
			answerToQuestion4 = "saturday";
			if(speechWords4.equals(answerToQuestion4)){
				System.out.println("You gained one point from question 4");
				scoreFromSpeech++;
			}
	}
		System.out.println(" The result to question 4 is " + speechWords4);
	}
	public void EvaluationofQuestion5(String grammerNumber) throws IOException{
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer5 = new StreamSpeechRecognizer(configuration);
		recognizer5.startRecognition(new FileInputStream("Resources/Answers/Question5.wav"));
		SpeechResult Result5 = recognizer5.getResult();
		String speechWords5 = Result5.getHypothesis();
		if(month==1){
			answerToQuestion5 = "january";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}
	}
		else if(month==2){
			answerToQuestion5 = "february";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}
	}
		else if(month==3){
			answerToQuestion5 = "march";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}
	}
		else if(month==4){
			answerToQuestion5 = "april";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}
	}
		else if(month==5){
			answerToQuestion5 = "may";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}
	}
		else if(month==6){
			answerToQuestion5 = "june";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}
	}
		else if(month==7){
			answerToQuestion5 = "july";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}
	}
		else if(month==8){
			answerToQuestion5 = "august";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}
	}
		else if(month==9){
			answerToQuestion5 = "september";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}
	}
		else if(month==10){
			answerToQuestion5 = "october";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}
	}
		else if(month==11){
			answerToQuestion5 = "november";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}
	}
		else if(month==12){
			answerToQuestion5 = "december";
			if(speechWords5.equals(answerToQuestion5)){
				System.out.println("You gained one point from question 5");
				scoreFromSpeech++;
			}

		}
		System.out.println(" The result to question 5 is " + speechWords5);
	}
	public void EvaluationofQuestion8(String grammerNumber) throws IOException{
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer8 = new StreamSpeechRecognizer(configuration);
		recognizer8.startRecognition(new FileInputStream("Resources/Answers/Question8.wav"));
		SpeechResult Result8 = recognizer8.getResult();
		String speechWords8 = Result8.getHypothesis();
		if(speechWords8.equals(answerToQuestion8)){
			System.out.println("You gained one point from question 8 ");
			scoreFromSpeech++;
		}
		System.out.println(" The result to question 8 is " + speechWords8);
	}
	public void EvaluationofQuestion9(String grammerNumber) throws IOException{
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer9 = new StreamSpeechRecognizer(configuration);
		recognizer9.startRecognition(new FileInputStream("Resources/Answers/Question9.wav"));
		SpeechResult Result9 = recognizer9.getResult();
		String speechWords9 = Result9.getHypothesis();
		if(speechWords9.equals("ball car man")){
			System.out.println(" You gained three points from question 9  ");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		else if(speechWords9.equals("ball man car")){
			System.out.println("You gained three points from question 9  ");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		else if(speechWords9.equals("man ball car")){
			System.out.println(" You gained three points from question 9  ");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		else if(speechWords9.equals("man car ball")){
			System.out.println(" You gained three points from question 9  ");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		else if(speechWords9.equals("car man ball")){
			System.out.println(" You gained three points from question 9  ");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		else if(speechWords9.equals("car ball man")){
			System.out.println(" You gained three points from question 9 ");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		System.out.println(" The result to question 9 is " + speechWords9);
	}
	public void EvaluationofQuestion10(String grammerNumber) throws IOException{
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer10 = new StreamSpeechRecognizer(configuration);
		recognizer10.startRecognition(new FileInputStream("Resources/Answers/Question10.wav"));
		SpeechResult Result10 = recognizer10.getResult();
		String speechWords10 = Result10.getHypothesis();
		if(speechWords10.equals(answerToQuestion10)){
			System.out.println("You gained five points from question 10");
			scoreFromSpeech = scoreFromSpeech + 5;
		}
		System.out.println(" The result to question 10 is " + speechWords10);
	}
	public void EvaluationofQuestion11(String grammerNumber) throws IOException{
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer11 = new StreamSpeechRecognizer(configuration);
		recognizer11.startRecognition(new FileInputStream("Resources/Answers/Question11.wav"));
		SpeechResult Result11 = recognizer11.getResult();
		String speechWords11 = Result11.getHypothesis();
		if(speechWords11.equals("ball car man")){
			System.out.println("You gained three points from question 11");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		else if(speechWords11.equals("ball man car")){
			System.out.println("You gained three points from question 11 ");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		else if(speechWords11.equals("man ball car")){
			System.out.println(" You gained three points from question 11");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		else if(speechWords11.equals("man car ball")){
			System.out.println(" You gained three points from question 11 ");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		else if(speechWords11.equals("car man ball")){
			System.out.println("You gained three points from question 11 ");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		else if(speechWords11.equals("car ball man")){
			System.out.println(" You gained three points from question 11");
			scoreFromSpeech = scoreFromSpeech + 3;
		}
		System.out.println(" The result to question 11 is " + speechWords11);
	}
	public void EvaluationofQuestion12(String grammerNumber) throws IOException{
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer12 = new StreamSpeechRecognizer(configuration);
		recognizer12.startRecognition(new FileInputStream("Resources/Answers/Question12.wav"));
		SpeechResult Result12 = recognizer12.getResult();
		String speechWords12 = Result12.getHypothesis();
		if(speechWords12.equals("wristwatch pencil")){
			System.out.println("You gained one point from question 12");
			scoreFromSpeech++;
		}
		else if(speechWords12.equals("pencil wristwatch")){
			System.out.println(" You gained one point from question 12");
			scoreFromSpeech++;
		}
		else if(speechWords12.equals("pencil and wristwatch")){
			System.out.println(" You gained one point from question 12");
			scoreFromSpeech++;
		}
		else if(speechWords12.equals("wristwatch and wristwatch")){
			System.out.println(" You gained one point from question 12 ");
			scoreFromSpeech++;
		}
		System.out.println(" The result to question 12 is " + speechWords12);
	}
	public void EvaluationofQuestion13(String grammerNumber) throws IOException{
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer13 = new StreamSpeechRecognizer(configuration);
		recognizer13.startRecognition(new FileInputStream("Resources/Answers/Question13.wav"));
		SpeechResult Result13 = recognizer13.getResult();
		String speechWords13 = Result13.getHypothesis();
		if(speechWords13.equals(answerToQuestion13)){
			System.out.println("You gained one point from question 13");
			scoreFromSpeech++;
		}
		System.out.println(" The result to question 13 is " + speechWords13);
	}
	public void EvaluationofQuestion14(String grammerNumber) throws IOException{
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer14 = new StreamSpeechRecognizer(configuration);
		recognizer14.startRecognition(new FileInputStream("Resources/Answers/Question14.wav"));
		SpeechResult Result14 = recognizer14.getResult();
		String speechWords14 = Result14.getHypothesis();
		if(speechWords14.equals(answerToQuestion14)){
			System.out.println("You gained one point from question 14");
			scoreFromSpeech++;
		}
		System.out.println(" The result to question 14 is " + speechWords14);
	}
	public void EvaluationofQuestion20(String grammerNumber) throws IOException {
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer20 = new StreamSpeechRecognizer(configuration);
		recognizer20.startRecognition(new FileInputStream("Resources/Answers/Question20.wav"));
		SpeechResult Result20 = recognizer20.getResult();
		String speechWords20 = Result20.getHypothesis();
		if (speechWords20.equals(answerToQuestion20)) {
			System.out.println("You gained five points from question 20");
			scoreFromSpeech = scoreFromSpeech + 5;
		}
		System.out.println(" The result to question 20 is " + speechWords20);
	}
	public void EvaluationofQuestion21(String grammerNumber) throws IOException {
		disableLogMessages();
		speechUsages();
		configuration.setGrammarName(grammerNumber);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer21 = new StreamSpeechRecognizer(configuration);
		recognizer21.startRecognition(new FileInputStream("Resources/Answers/Question21.wav"));
		SpeechResult Result21 = recognizer21.getResult();
		String speechWords21 = Result21.getHypothesis();
		if (speechWords21.equals(answerToQuestion21)) {
			System.out.println("You gained one point from question 21");
			scoreFromSpeech++;
		}
		System.out.println(" The result to question 21 is " + speechWords21);
	}
	public void EvaluationofLiterate() throws IOException{

		EvaluationofQuestion1("Question1");
		EvaluationofQuestion2("Question2");
		EvaluationofQuestion3("Question3");
		EvaluationofQuestion4("Question4");
		EvaluationofQuestion5("Question5");
		EvaluationofQuestion8("Question8");
		EvaluationofQuestion9("Question9");
		EvaluationofQuestion10("Question10");
		EvaluationofQuestion11("Question11");
		EvaluationofQuestion12("Question12");
		EvaluationofQuestion13("Question13");
		EvaluationofQuestion14("Question14");
		System.out.println("The score from speech is " + scoreFromSpeech);

	}
	public void EvaluationofIlliterate() throws IOException{
		EvaluationofQuestion1("Question1");
		EvaluationofQuestion2("Question2");
		EvaluationofQuestion3("Question3");
		EvaluationofQuestion4("Question4");
		EvaluationofQuestion5("Question5");
		EvaluationofQuestion8("Question8");
		EvaluationofQuestion9("Question9");
		EvaluationofQuestion11("Question11");
		EvaluationofQuestion12("Question12");
		EvaluationofQuestion14("Question14");
		EvaluationofQuestion20("Question20");
		EvaluationofQuestion21("Question21");
		System.out.println("The score from speech is " + scoreFromSpeech);
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
