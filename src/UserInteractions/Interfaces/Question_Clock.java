package UserInteractions.Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
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
import javax.swing.border.LineBorder;

import ImageProcessing.application.ImageRecognitionController;
import ImageProcessing.application.Main;

public class Question_Clock {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question_Clock window = new Question_Clock();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Question_Clock() {
		ImageRecognitionController.setDrawingType("Clock Drawing");
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1367, 769);
		frame.setContentPane(new JLabel(new ImageIcon("Resources/Images/background.png")));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnReadTheQuestion = new JButton("");
		btnReadTheQuestion.setBounds(269, 342, 169, 168);
		frame.getContentPane().add(btnReadTheQuestion);
		btnReadTheQuestion.setIcon(new ImageIcon("Resources/Images/play.png"));
		btnReadTheQuestion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReadTheQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Resources/Questions/20.wav");
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

		JButton btn_Next = new JButton("Next");
		btn_Next.setBounds(1080, 598, 142, 54);
		btn_Next.setVisible(false);
		frame.getContentPane().add(btn_Next);
		frame.getRootPane().setDefaultButton(btn_Next);
		btn_Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finalized.main(null);
			}
		});

		JButton btn_camera = new JButton("");
		btn_camera.setIcon(new ImageIcon("Resources/Images/camera.png"));
		btn_camera.setBounds(595, 342, 169, 168);
		frame.getContentPane().add(btn_camera);
		frame.getRootPane().setDefaultButton(btn_camera);
		btn_camera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
				btn_Next.setVisible(true);
			}

		});

		JLabel lblNewLabel_7 = new JLabel("  Clock Drawing");
		lblNewLabel_7.setForeground(SystemColor.activeCaptionText);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_7.setBorder(new LineBorder(SystemColor.activeCaption, 2));
		lblNewLabel_7.setBounds(364, 120, 251, 43);
		lblNewLabel_7.setVisible(true);
		frame.getContentPane().add(lblNewLabel_7);

		JLabel lbl_image = new JLabel("");
		lbl_image.setBounds(854, 285, 439, 243);
		lbl_image.setVisible(true);
		lbl_image.setFont(new Font("Tahoma", Font.ITALIC, 18));
		frame.getContentPane().add(lbl_image);
		lbl_image.setText("<html>The clock-drawing test is used for screening for cognitive impairment.</html>");

		JLabel lblNewLabel_4 = new JLabel("<html>Listen to question here!</html>");
		lblNewLabel_4.setForeground(new Color(204, 51, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(269, 223, 211, 95);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lbl_camerawarning = new JLabel("<html>Click here to upload the drawing</html>");
		lbl_camerawarning.setForeground(new Color(204, 51, 0));
		lbl_camerawarning.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lbl_camerawarning.setBounds(594, 236, 203, 95);
		frame.getContentPane().add(lbl_camerawarning);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lblNewLabel.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lblNewLabel);

		JButton btnClose = new JButton("");
		btnClose.setBounds(1281, 27, 60, 60);
		btnClose.setIcon(new ImageIcon("Resources/Images/close.png"));
		frame.getContentPane().add(btnClose);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		JButton btnHome = new JButton("");
		btnHome.setBounds(1210, 27, 61, 60);
		btnHome.setIcon(new ImageIcon("Resources/Images/home.png"));
		frame.getContentPane().add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Welcome.main(null);
			}
		});

	}
}
