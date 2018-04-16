package UserInteractions.Interfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import SpeechRecognition.Evaluation;
import SpeechRecognition.SpeechRecorder;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;

import java.awt.Font;
import java.awt.Color;

public class TutorialScreen_voice {

	private JFrame frame;
	Clip clip;
	int click = 0;
	StreamSpeechRecognizer recognizer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TutorialScreen_voice window = new TutorialScreen_voice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TutorialScreen_voice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1367, 769);
		frame.setContentPane(new JLabel(new ImageIcon("Resources/Images/background.png")));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_logo = new JLabel("");
		lbl_logo.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lbl_logo.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lbl_logo);

		JLabel lblNewLabel_1 = new JLabel("<html>Click the microphone button for recording the voice and click again to finish.</html>");
		lblNewLabel_1.setForeground(new Color(204, 51, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(741, 221, 262, 104);
		lblNewLabel_1.setVisible(false);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("<html>Click the play button for listening to voice.</html>");
		lblNewLabel_2.setForeground(new Color(204, 51, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(414, 233, 204, 98);
		lblNewLabel_2.setVisible(false);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(new Color(204, 51, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(718, 251, 331, 67);
		lblNewLabel_3.setVisible(false);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(473, 237, 73, 73);
		lblNewLabel_4.setIcon(new ImageIcon("Resources/Images/greenticksmall.png"));
		lblNewLabel_4.setVisible(false);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(813, 237, 73, 73);
		lblNewLabel_5.setIcon(new ImageIcon("Resources/Images/greenticksmall.png"));
		lblNewLabel_5.setVisible(false);
		frame.getContentPane().add(lblNewLabel_5);

		JButton btnReadTheQuestion = new JButton("");
		btnReadTheQuestion.setIcon(new ImageIcon("Resources/Images/play.png"));
		btnReadTheQuestion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReadTheQuestion.setVisible(false);

		btnReadTheQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Resources/Questions/Sound_Check.wav");
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
					clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (UnsupportedAudioFileException | IOException e1) {
					e1.printStackTrace();
				
				} catch (LineUnavailableException e1) {
					e1.printStackTrace();
				}

				int answer = JOptionPane.showConfirmDialog(null, "Are you hearing the voice?", "Tutorial",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

				clip.stop();

				if (answer == 0) {

					lblNewLabel_1.setVisible(true);
					lblNewLabel_3.setVisible(true);
					lblNewLabel_4.setVisible(true);
					lblNewLabel_2.setVisible(false);

				}
			}
		});
		btnReadTheQuestion.setBounds(420, 342, 169, 168);
		frame.getContentPane().add(btnReadTheQuestion);

		JButton btn_Next = new JButton("Next");
		btn_Next.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Next.setBounds(614, 601, 128, 48);
		frame.getContentPane().add(btn_Next);
		frame.getRootPane().setDefaultButton(btn_Next);
		btn_Next.setVisible(false);
		
		btn_Next.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

				}

			}

			public void actionPerformed(ActionEvent e) {
				TutorialScreen_cam.main(null);

			}
		});

		JButton btn_microphone = new JButton("");
		btn_microphone.setVisible(false);
		btn_microphone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (click == 1) {
					click++;
					SpeechRecorder.startMic();
					lblNewLabel_3.setVisible(true);
					lblNewLabel_3.setText("<html>Please say 'pencil'<br/>Click again to save your answer.</html>");
					lblNewLabel_1.setVisible(false);
					btn_microphone.setIcon(new ImageIcon("Resources/Images/record.png"));

				} else if ((click % 2) == 0) {
					SpeechRecorder.stopMic("tutorial");
					lblNewLabel_3.setVisible(false);
					lblNewLabel_1.setVisible(false);

					Configuration configuration = new Configuration();
					configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
					configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");

					Evaluation.disableLogMessages();
					configuration.setGrammarPath("resource:/Grammer");
					configuration.setGrammarName("Tutorial");
					configuration.setUseGrammar(true);
					try {
						recognizer = new StreamSpeechRecognizer(configuration);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						recognizer.startRecognition(new FileInputStream("Resources/Answers/tutorial.wav"));
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					SpeechResult Result = recognizer.getResult();
					String speechWords = Result.getHypothesis();
					System.out.println(speechWords);

					if (speechWords.equals("pencil")) {
						lblNewLabel_5.setVisible(true);
						btn_microphone.setIcon(new ImageIcon("Resources/Images/checkmark.png"));
						btn_Next.setVisible(true);
					}else{
				        JOptionPane.showMessageDialog(null,"Please try again.","Microphone check", JOptionPane.INFORMATION_MESSAGE);
				        btn_microphone.setIcon(new ImageIcon("Resources/Images/microphone.png"));
						click=1;
					}

				} else {
					click++;
				}

			}
		});

		btn_microphone.setIcon(new ImageIcon("Resources/Images/microphone.png"));
		btn_microphone.setBounds(757, 342, 169, 168);
		frame.getContentPane().add(btn_microphone);


		JButton btnHome = new JButton("");
		btnHome.setBounds(1210, 27, 61, 60);
		btnHome.setIcon(new ImageIcon("Resources/Images/home.png"));
		frame.getContentPane().add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Welcome.main(null);
			}
		});

		JButton btnClose = new JButton("");
		btnClose.setBounds(1281, 27, 60, 60);
		btnClose.setIcon(new ImageIcon("Resources/Images/close.png"));
		frame.getContentPane().add(btnClose);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});

		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Information_Warnings.main(null);
			}
		});
		btnBack.setBounds(158, 598, 142, 54);
		frame.getContentPane().add(btnBack);
		
		JLabel lblThisPage = new JLabel("This tutorial is checking your speakers");
		lblThisPage.setForeground(new Color(204, 51, 0));
		lblThisPage.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThisPage.setBounds(516, 95, 582, 41);
		frame.getContentPane().add(lblThisPage);

		JLabel lblNewLabel_6 = new JLabel(" and microphone for the test.");
		lblNewLabel_6.setForeground(new Color(204, 51, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(545, 129, 312, 27);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnStartTheTutorial = new JButton("Start the Tutorial");
		btnStartTheTutorial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnStartTheTutorial.setBounds(569, 167, 228, 48);
		frame.getContentPane().add(btnStartTheTutorial);
		btnStartTheTutorial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				click++;
				if (click == 1) {
					lblNewLabel_2.setVisible(true);
					btnReadTheQuestion.setVisible(true);
					btn_microphone.setVisible(true);

				}

			}

		});

	}

}