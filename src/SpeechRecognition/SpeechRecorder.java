package SpeechRecognition;
import java.io.FileInputStream;
import java.io.IOException;
import javax.sound.sampled.AudioFileFormat;

import App.User;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;
import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.frontend.util.Utterance;

public final class SpeechRecorder {
	static Configuration configuration = new Configuration();
	static Microphone mic = new Microphone(16000, 16, 1, true, true, false, 10, true, "average", 0, "default", 6400);

	public static void startMic() {
		mic.initialize();
		mic.startRecording();
		mic.getAudioFormat();
		mic.getUtterance();
		System.out.println("Audio Format is" + mic.getAudioFormat());

	}

	public static void stopMic(String questionName) {
		mic.stopRecording();
		Utterance u = mic.getUtterance();

		try {
			
			u.save(System.getProperty("user.home")+"/DEfI/"+ questionName + ".wav", AudioFileFormat.Type.WAVE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getAnswersOfSpeech(String question) throws IOException {
		Evaluation.disableLogMessages();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setGrammarPath("resource:/Grammer");
		configuration.setGrammarName(question);
		configuration.setUseGrammar(true);
		StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
		recognizer.startRecognition(new FileInputStream(System.getProperty("user.home")+"/DEfI/" + question + ".wav"));
		SpeechResult Result = recognizer.getResult();
		String speechWords = Result.getHypothesis();

		while ((Result = recognizer.getResult()) != null) {
			speechWords=speechWords+" "+Result.getHypothesis();
		}

		recognizer.stopRecognition();

		return speechWords;
	}

	public static String getSavedAnswer(int question) {

		return User.getAnswers(question);

	}

}
