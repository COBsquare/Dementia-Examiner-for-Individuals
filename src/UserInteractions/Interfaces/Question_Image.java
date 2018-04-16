package UserInteractions.Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import ImageProcessing.application.Main;
import ImageProcessing.application.WebcamTestMain;



public class Question_Image {

	private JFrame frame;
	int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question_Image window = new Question_Image();
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
	public Question_Image() {
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
					File file = new File(
							"C:/Users/BegumOzceylan/eclipse-workspace/DEfI-GUI/Resorces/Audios/Question4.wav");
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

		btnReadTheQuestion.setBounds(967, 94, 169, 168);
		frame.getContentPane().add(btnReadTheQuestion);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("Resources/Images/camera.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(490, 187, 420, 309);
		lblNewLabel_1.setVisible(false);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(471, 187, 439, 243);
		lblNewLabel_2.setVisible(false);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		btnNewButton.setBounds(967, 324, 169, 168);
		frame.getContentPane().add(btnNewButton);
		frame.getRootPane().setDefaultButton( btnNewButton );
		
		JLabel lblNewLabel_4 = new JLabel("<html> Please click the play button for listening <br/> the question and please click the camera &nbsp;&nbsp;&nbsp;&nbsp; button to upload the image </html>");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_4.setBounds(59, 397, 334, 95);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void keyPressed(KeyEvent e) {
			    if (e.getKeyCode()==KeyEvent.VK_ENTER){

			    }

			}
			public void actionPerformed(ActionEvent e) {
			
					Finalized.main(null);
				

			}
		});

		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(638, 642, 128, 48);
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
		
		JLabel lblNewLabel_7 = new JLabel("  Polygon Drawing");
		lblNewLabel_7.setForeground(SystemColor.activeCaptionText);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 2);
		lblNewLabel_7.setBorder(new LineBorder(SystemColor.activeCaption, 2));
		lblNewLabel_7.setBounds(59, 338, 307, 48);
		frame.getContentPane().add(lblNewLabel_7);
		lblNewLabel_7.setVisible(false);
		
	
		btnClose.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});
		
		
		
		if (i==0 ) {
			App.User.setEducation("Literate");
			if(App.User.getEducation()=="Literate") {
				lblNewLabel_2.setVisible(true);
				lblNewLabel_7.setVisible(true);
				lblNewLabel_2.setIcon(new ImageIcon("Resources/Images/polygon_literate.png"));
				
								
			} else if(App.User.getEducation()=="Illiterate") {
				lblNewLabel_7.setVisible(true);
				lblNewLabel_1.setVisible(true);
				lblNewLabel_1.setIcon(new ImageIcon("Resources/Images/polygon_illiterate.png"));
				
			}
			
		} else if (i==1) {
			lblNewLabel_2.setText("The clock-drawing test is used for screening for cognitive impairment.");
			lblNewLabel_7.setText(" Clock Drawing");
		}
	}
}
