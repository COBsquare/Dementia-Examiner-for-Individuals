
package SpeechRecognition.Questions;

import java.io.FileInputStream;
import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;


public class Question9 {
	public static void main(String[] args) throws IOException {
		new Question9();
	}


	public Question9() throws IOException {
		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName("Question9");

		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
		recognizer.startRecognition(new FileInputStream("Resources/Answers/Question9.wav"));
		SpeechResult Result = recognizer.getResult();
		System.out.println(Result.getHypothesis());
			String speechWords = Result.getHypothesis();
			System.out.println(" The result from the speech is " + speechWords);
				if(speechWords.equals("ball car man")){
					System.out.println(" You gained three points ");

				}
				else if(speechWords.equals("ball man car")){
					System.out.println(" You gained three points ");

				}
				else if(speechWords.equals("man ball car")){
					System.out.println(" You gained three points ");

				}
				else if(speechWords.equals("man car ball")){
					System.out.println(" You gained three points ");

				}
				else if(speechWords.equals("car man ball")){
					System.out.println(" You gained three points ");

				}
				else if(speechWords.equals("car ball man")){
					System.out.println(" You gained three points ");

				}
				else if(speechWords.equals("ball car")){
					System.out.println(" You gained two points ");

				}
				else if(speechWords.equals("ball")){
					System.out.println(" You gained one point ");

				}
				else if(speechWords.equals("car")){
					System.out.println(" You gained one point ");

				}
				else if(speechWords.equals("ball")){
					System.out.println(" You gained one point ");

				}
				else if(speechWords.equals("man")){
					System.out.println(" You gained one point ");

				}
				else if(speechWords.equals("ball")){
					System.out.println(" You gained one point ");

				}
				else if(speechWords.equals("car man")){
					System.out.println(" You gained two points ");

				}
				else if(speechWords.equals("man car")){
					System.out.println(" You gained two points ");

				}
				else if(speechWords.equals("car ball")){
					System.out.println(" You gained two points ");

				}
				else if(speechWords.equals("ball man")){
					System.out.println(" You gained two points ");

				}
				else if(speechWords.equals("man ball")){
					System.out.println(" You gained two points ");

				}
		}

	}

