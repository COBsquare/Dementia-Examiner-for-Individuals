
package SpeechRecognition;

import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;


public class SpeechForYearQuestion {
	public void StopRecogniton(){

		recognizer.stopRecognition();
	}
	public static void main(String[] args) {
		new SpeechForYearQuestion();
	}

	private LiveSpeechRecognizer recognizer;

	public SpeechForYearQuestion() {
		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("MentalReversal");

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
				if(speechWords.equals("two thousand and eighteen")){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}

	}

}