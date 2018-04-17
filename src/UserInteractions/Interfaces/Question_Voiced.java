package UserInteractions.Interfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
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
import SpeechRecognition.SpeechRecorder;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

import App.User;

public class Question_Voiced {

	private JFrame frame;
	private JTextField textField;

	static int question = 1;
	static int order = 0;
	static int max;
	int click;

	private String userAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question_Voiced window = new Question_Voiced();
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
	public Question_Voiced() {
		initialize();

		// As an example="Literate"
		App.User.setEducation("Literate");

		if (App.User.getEducation().equals("Literate")) {
			question = User.orderLiterate[order];
			max = User.orderLiterate.length;
		} else if (App.User.getEducation().equals("Illiterate")) {
			question = User.orderIlliterate[order];
			max = User.orderIlliterate.length;
		}

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

		JLabel lblNewLabel_3 = new JLabel("Your progress:");
		lblNewLabel_3.setForeground(new Color(204, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(626, 120, 203, 43);
		frame.getContentPane().add(lblNewLabel_3);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(new Color(255, 0, 0));
		progressBar.setBounds(764, 120, 339, 43);
		progressBar.setMaximum(max - 1);
		progressBar.setValue(order);
		frame.getContentPane().add(progressBar);

		JLabel lbl_numquestion = new JLabel(" Question " + (order + 1) + "/" + max);
		lbl_numquestion.setForeground(SystemColor.activeCaptionText);
		lbl_numquestion.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbl_numquestion.setBorder(new LineBorder(SystemColor.activeCaption, 2));
		lbl_numquestion.setBounds(364, 120, 203, 43);
		frame.getContentPane().add(lbl_numquestion);

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

		JButton btn_Next = new JButton("Next");
		btn_Next.setVisible(false);
		btn_Next.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Next.setBounds(614, 601, 128, 48);
		frame.getContentPane().add(btn_Next);
		frame.getRootPane().setDefaultButton(btn_Next);
		btn_Next.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

				}

			}

			public void actionPerformed(ActionEvent e) {
				order++;
				User.addAnswer(userAnswer);
				if (order < max) {
					Question_Voiced.main(null);
				} else {
					Question_Image.main(null);
				}
			}
		});

		JButton btnReadTheQuestion = new JButton();
		btnReadTheQuestion.setBounds(420, 342, 169, 168);
		frame.getContentPane().add(btnReadTheQuestion);
		btnReadTheQuestion.setIcon(new ImageIcon("Resources/Images/play.png"));
		btnReadTheQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Resources/Questions/" + Integer.toString(question) + ".wav");
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (UnsupportedAudioFileException | IOException e1) {
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					e1.printStackTrace();
				}

			}
		});

		JLabel lbl_speechAnswer = new JLabel("Your speech answer is");
		lbl_speechAnswer.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_speechAnswer.setBounds(780, 590, 250, 100);
		lbl_speechAnswer.setVisible(false);
		frame.getContentPane().add(lbl_speechAnswer);

		JButton btn_microphone = new JButton();
		btn_microphone.setIcon(new ImageIcon("Resources/Images/microphone.png"));
		btn_microphone.setBounds(757, 342, 169, 168);
		frame.getContentPane().add(btn_microphone);
		frame.getRootPane().setDefaultButton(btn_microphone);
		btn_microphone.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				click++;
				if (click % 2 == 1) {
					SpeechRecorder.startMic();
					btn_microphone.setIcon(new ImageIcon("Resources/Images/record.png"));
				} else {
					SpeechRecorder.stopMic("Question" + Integer.toString(question));

					btn_Next.setVisible(true);
					btn_microphone.setIcon(new ImageIcon("Resources/Images/microphone.png"));

					lbl_speechAnswer.setVisible(true);
					try {
						userAnswer = SpeechRecorder.getAnswersOfSpeech("Question" + Integer.toString(question));
					} catch (IOException e1) {
						e1.printStackTrace();
					}

					if (userAnswer.equals("")) {
						lbl_speechAnswer.setText(
								"<html>No answer was given, click on microphone button to record again</html>");
					} else {
						lbl_speechAnswer.setText("<html>Your answer is " + userAnswer
								+ ", click on microphone button to record again</html>");
					}
				}

			}

		});

		JLabel lblNewLabel_4 = new JLabel("<html> Please click the play button for listening the question</html>");
		lblNewLabel_4.setForeground(new Color(204, 51, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(421, 194, 203, 137);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblPleaseClickThe = new JLabel(
				"<html>Please click the microphone button for answering, and click again for recording answer</html>");
		lblPleaseClickThe.setForeground(new Color(204, 51, 0));
		lblPleaseClickThe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblPleaseClickThe.setBounds(757, 184, 215, 137);
		frame.getContentPane().add(lblPleaseClickThe);

		// Additional stuff for the questions----------------------------------------------------
		JLabel lbl_map = new JLabel("");
		lbl_map.setBounds(886, 94, 455, 307);
		frame.getContentPane().add(lbl_map);
		lbl_map.setVisible(false);

		JLabel lbl_compass = new JLabel("");
		lbl_compass.setBounds(956, 421, 230, 230);
		lbl_compass.setIcon(new ImageIcon("Resources/Images/compass.png"));
		lbl_compass.setVisible(false);
		frame.getContentPane().add(lbl_compass);

		JLabel lbl_watch = new JLabel("");
		lbl_watch.setBounds(971, 94, 215, 215);
		lbl_watch.setVisible(false);
		frame.getContentPane().add(lbl_watch);

		JLabel lbl_pencil = new JLabel("");
		lbl_pencil.setBounds(971, 307, 215, 215);
		lbl_pencil.setIcon(new ImageIcon("Resources/Images/pencil.png"));
		lbl_pencil.setVisible(false);
		frame.getContentPane().add(lbl_pencil);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(432, 542, 494, 48);
		textField.setVisible(false);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(false);

		JButton btn_clickbutton = new JButton("Button");
		btn_clickbutton.setForeground(new Color(255, 255, 255));
		btn_clickbutton.setBackground(new Color(199, 21, 133));
		btn_clickbutton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_clickbutton.setBounds(116, 440, 179, 48);
		btn_clickbutton.setVisible(false);
		frame.getContentPane().add(btn_clickbutton);

		// For the specific questions
		if (question == 6) {
			lbl_map.setVisible(true);
			lbl_map.setIcon(new ImageIcon("Resources/Images/map.png")); //map degisecek
			lbl_compass.setVisible(true);
		} else if (question == 10) {
			lbl_pencil.setVisible(true);
			lbl_watch.setIcon(new ImageIcon("Resources/Images/wristwatch.png"));

			lbl_watch.setVisible(true);

		} else if (question == 13) {
			lblNewLabel_4.setVisible(false);

			btn_clickbutton.setVisible(true);
		} else if (question == 16) {
			textField.setVisible(true);
			App.User.addAnswer(textField.getText());
		}

	}
}
