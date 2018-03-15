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
import java.awt.Font;

public class TutorialScreen_voice {

	private JFrame frame;

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
					File file = new File("C:/Users/BegumOzceylan/eclipse-workspace/DEfI-GUI/Resorces/Audios/Question4.wav");
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
					Clip clip = AudioSystem.getClip();
			        clip.open(audioInputStream);
			        clip.start();
				} catch (UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

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
				TutorialScreen_cam tutorial2 = new TutorialScreen_cam();
				tutorial2.main(null);

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(817, 663, 128, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblThisScreenTutorial = new JLabel("This screen tutorial for the test. ");
		lblThisScreenTutorial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblThisScreenTutorial.setBounds(75, 302, 405, 34);
		frame.getContentPane().add(lblThisScreenTutorial);
		
		JLabel lblNewLabel_1 = new JLabel("In the test you should use microphone and speaker of the computer.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(75, 347, 485, 48);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("For controlling speaker and microphone, ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(75, 406, 456, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("please press the play button and follow the directions.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(75, 438, 405, 34);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
