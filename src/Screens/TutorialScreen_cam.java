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

public class TutorialScreen_cam {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TutorialScreen_cam window = new TutorialScreen_cam();
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
	public TutorialScreen_cam() {
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
		JLabel lblYouSaid = new JLabel("If you do not use your computer's camera, you can pass without doing it. ");
		lblYouSaid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYouSaid.setBounds(640, 615, 614, 58);
		frame.getContentPane().add(lblYouSaid);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("Resources/Images/camera.png"));
		btnNewButton.setBounds(835, 204, 169, 168);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblThisScreenTutorial = new JLabel("This screen tutorial for the test. ");
		lblThisScreenTutorial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblThisScreenTutorial.setBounds(75, 302, 405, 34);
		frame.getContentPane().add(lblThisScreenTutorial);
		
		JLabel lblNewLabel_1 = new JLabel("In the test you should use load a photo or taking photo with computer' camera.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(75, 347, 521, 48);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("For controlling camera please press the camera button.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(75, 406, 456, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question_Voiced question = new Question_Voiced();
				question.main(null);

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(860, 500, 128, 48);
		frame.getContentPane().add(btnNewButton_1);
	}
}
