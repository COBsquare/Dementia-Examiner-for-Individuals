package Screens;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JOptionPane;

import java.awt.Font;

public class TutorialScreen_voice {

	private JFrame frame;
	Clip clip;

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

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lblNewLabel.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lblNewLabel);

		JButton btnReadTheQuestion = new JButton("");
		btnReadTheQuestion.setIcon(new ImageIcon("Resources/Images/play.png"));
		btnReadTheQuestion.setFont(new Font("Tahoma", Font.PLAIN, 18));

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

				System.out.println(answer);
				clip.stop();
			}
		});
		btnReadTheQuestion.setBounds(798, 93, 169, 168);
		frame.getContentPane().add(btnReadTheQuestion);
		JLabel lblYouSaid = new JLabel("What you say will appear here ");
		lblYouSaid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYouSaid.setBounds(765, 549, 329, 69);
		frame.getContentPane().add(lblYouSaid);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SpeechRecognizer sc = new SpeechRecognizer();
				//sc.main(null);

			}
		});
		btnNewButton.setIcon(new ImageIcon("Resources/Images/microphone.png"));
		btnNewButton.setBounds(798, 327, 169, 168);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TutorialScreen_cam.main(null);

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(817, 663, 128, 48);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblThisScreenTutorial = new JLabel("This screen tutorial for the test. ");
		lblThisScreenTutorial.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblThisScreenTutorial.setBounds(75, 302, 405, 34);
		frame.getContentPane().add(lblThisScreenTutorial);

		JLabel lblNewLabel_1 = new JLabel("In the test you should use microphone and");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(75, 347, 659, 48);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("For controlling speaker and microphone, ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(75, 440, 659, 34);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("please press the play button and follow the directions.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(75, 473, 626, 34);
		frame.getContentPane().add(lblNewLabel_3);

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
				Information_Gender.main(null);
			}
		});
		btnBack.setBounds(158, 598, 142, 54);
		frame.getContentPane().add(btnBack);

		JLabel lblNewLabel_4 = new JLabel("speaker of the computer.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(74, 385, 526, 34);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
