
package SpeechRecognition;

import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;


public class SpeechForNamingQuestion {
	public static void main(String[] args) {
		new SpeechForNamingQuestion();
	}

	private LiveSpeechRecognizer recognizer;

public void StopRecogniton(){

		recognizer.stopRecognition();
	}

	public SpeechForNamingQuestion() {
		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("Naming");

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
				if(speechWords.equals("wristwatch pencil")){
					System.out.println(" You gained two points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("pencil wristwatch")){
					System.out.println(" You gained two points ");
					StopRecogniton();
					System.exit(0);
				}
		}

	}

}