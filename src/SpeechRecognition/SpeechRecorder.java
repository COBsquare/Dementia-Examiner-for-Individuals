package SpeechRecognition;

import java.io.IOException;
import javax.sound.sampled.AudioFileFormat;
import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.frontend.util.Utterance;


public final class SpeechRecorder  {

	static Microphone mic = new Microphone(16000, 16, 1, true, true, false, 10, true,
			"average", 0, "default", 6400);
	public static void startMic(){
				mic.initialize();
				mic.startRecording();
				mic.getAudioFormat();
				mic.getUtterance();
				System.out.println("Audio Format is" + mic.getAudioFormat());

	}

	public static void stopMic(String questionName){
		mic.stopRecording();
		Utterance u = mic.getUtterance();

		try {
			u.save("Resources/Answers/"+ questionName + ".wav", AudioFileFormat.Type.WAVE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
