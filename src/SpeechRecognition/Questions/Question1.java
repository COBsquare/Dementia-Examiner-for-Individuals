
package SpeechRecognition.Questions;

import java.io.FileInputStream;
import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;


public class Question1 {
	public void StopRecogniton(){

		recognizer.stopRecognition();
	}
	public static void main(String[] args) throws IOException {
		new Question1();
	}

	private LiveSpeechRecognizer recognizer;

	public Question1() throws IOException {
		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("Question1");
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
		recognizer.startRecognition(new FileInputStream("Resources/Answers/Question1.wav"));
		SpeechResult Result = recognizer.getResult();
		System.out.println(Result.getHypothesis());
			String speechWords = Result.getHypothesis();
			System.out.println(" The result from the speech is " + speechWords);
				if(speechWords.equals("two thousand and eighteen")){
					System.out.println("You gained one point");
					StopRecogniton();
					System.exit(0);
				}
		}

	}

