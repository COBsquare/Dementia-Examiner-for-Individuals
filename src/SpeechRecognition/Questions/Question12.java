
package SpeechRecognition.Questions;

import java.io.FileInputStream;
import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;


public class Question12 {
	public static void main(String[] args) throws IOException {
		new Question12();
	}

	private LiveSpeechRecognizer recognizer;

public void StopRecogniton(){

		recognizer.stopRecognition();
	}

	public Question12() throws IOException {
		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("Question12");

		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
		recognizer.startRecognition(new FileInputStream("Resources/Answers/Question12.wav"));
		SpeechResult Result = recognizer.getResult();
		System.out.println(Result.getHypothesis());
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

