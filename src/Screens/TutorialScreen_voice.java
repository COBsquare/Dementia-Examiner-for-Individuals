package Screens;

import java.awt.Color;
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
import javax.swing.JOptionPane;

import SpeechRecognition.SpeechRecorder;


import java.awt.Font;

public class TutorialScreen_voice {

	private JFrame frame;
	Clip clip;
	int click = 0;

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
		
		JLabel lblNewLabel_1 = new JLabel("Click the microphone button for recording");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(993, 350, 351, 48);
		lblNewLabel_1.setVisible(false);
		frame.getContentPane().add(lblNewLabel_1);
		

		JLabel lblNewLabel_2 = new JLabel("Click the play button for listening to voice.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(993, 130, 340, 54);
		lblNewLabel_2.setVisible(false);
		frame.getContentPane().add(lblNewLabel_2);
				
		JLabel lblNewLabel_3 = new JLabel("the voice and click again to finish.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(1030, 388, 327, 35);
		lblNewLabel_3.setVisible(false);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(1111, 130, 73, 73);
		lblNewLabel_4.setIcon(new ImageIcon("Resources/Images/greenticksmall.png"));
		lblNewLabel_4.setVisible(false);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(1111, 350, 73, 73);
		lblNewLabel_5.setIcon(new ImageIcon("Resources/Images/greenticksmall.png"));
		lblNewLabel_5.setVisible(false);
		frame.getContentPane().add(lblNewLabel_5);

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
				
				if(answer==0){
					
					lblNewLabel_1.setVisible(true);
					lblNewLabel_3.setVisible(true);
					lblNewLabel_4.setVisible(true);
					lblNewLabel_2.setVisible(false);
					
				}
			}
		});
		btnReadTheQuestion.setBounds(798, 93, 169, 168);
		frame.getContentPane().add(btnReadTheQuestion);

		JButton btnNewButton = new JButton("");
		SpeechRecorder sc = new SpeechRecorder();

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click++;
				if (click == 1) {
					sc.startMic();
					lblNewLabel_5.setVisible(true);
					lblNewLabel_1.setVisible(false);
					lblNewLabel_3.setVisible(false);

				} else if (click == 2) {
					click = 0;
					sc.stopMic("tutorial");
					
				}
			}
		});

		btnNewButton.setIcon(new ImageIcon("Resources/Images/microphone.png"));
		btnNewButton.setBounds(798, 327, 169, 168);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void keyPressed(KeyEvent e) {
			    if (e.getKeyCode()==KeyEvent.VK_ENTER){

			    }

			}
			public void actionPerformed(ActionEvent e) {
				TutorialScreen_cam.main(null);

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(817, 663, 128, 48);
		frame.getContentPane().add(btnNewButton_1);
		frame.getRootPane().setDefaultButton( btnNewButton_1 );
	

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
		
		JButton btnStartTheTutorial = new JButton("Start the Tutorial");
		btnStartTheTutorial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnStartTheTutorial.setBounds(119, 388, 228, 48);
		frame.getContentPane().add(btnStartTheTutorial);
		
	
		
		
		btnStartTheTutorial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				click++;
				if(click==1){
				lblNewLabel_2.setVisible(true);
				
				}
				
			    }

		});
  

		
		
	}
}
