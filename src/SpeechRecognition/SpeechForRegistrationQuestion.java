
package SpeechRecognition;

import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;


public class SpeechForRegistrationQuestion {
	public static void main(String[] args) {
		new SpeechForRegistrationQuestion();
	}

	private LiveSpeechRecognizer recognizer;

public void StopRecogniton(){

		recognizer.stopRecognition();
	}

	public SpeechForRegistrationQuestion() {
		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("Registration");

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
				if(speechWords.equals("ball car man")){
					System.out.println(" You gained three points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("ball man car")){
					System.out.println(" You gained three points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("man ball car")){
					System.out.println(" You gained three points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("man car ball")){
					System.out.println(" You gained three points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("car man ball")){
					System.out.println(" You gained three points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("car ball man")){
					System.out.println(" You gained three points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("ball car")){
					System.out.println(" You gained two points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("ball")){
					System.out.println(" You gained one point ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("car")){
					System.out.println(" You gained one point ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("ball")){
					System.out.println(" You gained one point ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("man")){
					System.out.println(" You gained one point ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("ball")){
					System.out.println(" You gained one point ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("car man")){
					System.out.println(" You gained two points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("man car")){
					System.out.println(" You gained two points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("car ball")){
					System.out.println(" You gained two points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("ball man")){
					System.out.println(" You gained two points ");
					StopRecogniton();
					System.exit(0);
				}
				else if(speechWords.equals("man ball")){
					System.out.println(" You gained two points ");
					StopRecogniton();
					System.exit(0);
				}
		}

	}

}