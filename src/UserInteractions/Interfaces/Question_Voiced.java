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

public class Question_Voiced {

	private JFrame frame;
	int click;
	private JTextField textField;
	static int orderLiterate[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
	static int orderIlliterate[] = { 1, 2, 3, 4, 5, 6, 7, 8, 13, 20, 11, 12, 21, 14, 15, 22, 19 };
	static int question = 1;
	static int order = 0;

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
		
		App.User.setEducation("Literate");
		if(App.User.getEducation().equals("Literate")){
			question=orderLiterate[order];
		}else if(App.User.getEducation().equals("Illiterate")){
			question=orderIlliterate[order];
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

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lblNewLabel.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(971, 94, 215, 215);
		lblNewLabel_1.setVisible(false);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(971, 367, 215, 215);
		lblNewLabel_2.setVisible(false);
		frame.getContentPane().add(lblNewLabel_2);

		JButton btnNewButton_2 = new JButton("Button");
		btnNewButton_2.setBackground(new Color(50, 205, 50));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(264, 274, 179, 48);
		btnNewButton_2.setVisible(false);
		frame.getContentPane().add(btnNewButton_2);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(480, 547, 494, 48);
		textField.setVisible(false);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(false);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(537, 54, 339, 29);
		progressBar.setMaximum(20);
		progressBar.setValue(question);
		frame.getContentPane().add(progressBar);

		JButton btnReadTheQuestion = new JButton();
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

		btnReadTheQuestion.setBounds(618, 94, 169, 168);
		frame.getContentPane().add(btnReadTheQuestion);

		JButton btnNewButton = new JButton();
		SpeechRecorder sc = new SpeechRecorder();
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				click++;
				if (click == 1) {
					sc.startMic();
					btnNewButton.setIcon(new ImageIcon("Resources/Images/record.png"));

				} else if ((click % 2) == 0) {
					btnNewButton.setIcon(new ImageIcon("Resources/Images/checkmark.png"));
					sc.stopMic("Question" + Integer.toString(question));
				} else {
					click = 0;

				}

			}
		});

		btnNewButton.setIcon(new ImageIcon("Resources/Images/microphone.png"));
		btnNewButton.setBounds(618, 324, 169, 168);
		frame.getContentPane().add(btnNewButton);
		frame.getRootPane().setDefaultButton(btnNewButton);

		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

				}

			}

			public void actionPerformed(ActionEvent e) {
				order++;
				Question_Voiced.main(null);
			}
		});

		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(637, 642, 128, 48);
		frame.getContentPane().add(btnNewButton_1);
		frame.getRootPane().setDefaultButton(btnNewButton_1);

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


		if (question == 8) {
			lblNewLabel_1.setVisible(true);
			lblNewLabel_1.setIcon(new ImageIcon("Resources/Images/map.png"));
		} else if (question == 12) {
			lblNewLabel_1.setIcon(new ImageIcon("Resources/Images/wristwatch.png"));
			lblNewLabel_2.setIcon(new ImageIcon("Resources/Images/pencil.png"));
			lblNewLabel_1.setVisible(true);
			lblNewLabel_2.setVisible(true);
		} else if (question == 15) {
			btnNewButton_2.setVisible(true);
		} else if (question == 18) {
			textField.setVisible(true);
		}

	}
}
