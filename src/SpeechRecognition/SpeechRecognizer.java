
package SpeechRecognition;

import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;


public class SpeechRecognizer {
	public static void main(String[] args) {
		new SpeechRecognizer();
	}

	private LiveSpeechRecognizer recognizer;

public void StopRecogniton(){

		recognizer.stopRecognition();
	}

	public SpeechRecognizer() {
		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("question");

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
			System.out.println("You said " + Result.getHypothesis() + "\n");
			
			
		}

	}

}