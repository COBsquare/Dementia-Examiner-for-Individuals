package UserInteractions.Examination;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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

import App.User;
import ImageProcessing.application.ImageRecognitionController;
import ImageProcessing.application.ImageRecognitionMain;
import UserInteractions.Constants.EndTest;
import UserInteractions.Constants.Welcome;

public class Question_Polygon {

	private JFrame frame;
	private String image_path;
	private boolean literate = false;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question_Polygon window = new Question_Polygon();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Question_Polygon() {

		if (User.getEducation().equals("Literate")) {
			image_path = "Resources/Images/polygon_literate.png";
			ImageRecognitionController.setDrawingType("Literate Polygon");
			literate = true;

		} else if (User.getEducation().equals("Illiterate")) {
			image_path = "Resources/Images/polygon_illiterate.png";
			ImageRecognitionController.setDrawingType("Illiterate Polygon");

		}

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

		JButton btnPlay = new JButton("");
		btnPlay.setIcon(new ImageIcon("Resources/Images/play.png"));
		btnPlay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPlay.setBounds(269, 342, 169, 168);
		frame.getContentPane().add(btnPlay);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("Resources/Questions/" + Integer.toString(17) + ".wav");
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

		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNext.setBounds(1080, 598, 142, 54);
		btnNext.setVisible(false);
		frame.getContentPane().add(btnNext);
		frame.getRootPane().setDefaultButton(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (User.getEducation().equals("Literate")) {
					Question_Clock.main(null);
				} else {
					EndTest.main(null);
				}
			}
		});

		JButton btnCamera = new JButton("");
		btnCamera.setIcon(new ImageIcon("Resources/Images/camera.png"));
		btnCamera.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCamera.setBounds(595, 342, 169, 168);
		frame.getContentPane().add(btnCamera);
		frame.getRootPane().setDefaultButton(btnCamera);
		btnCamera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageRecognitionMain.main(null);
				btnNext.setVisible(true);
			}

		});

		JLabel imagelabel = new JLabel("");
		imagelabel.setBounds(854, 285, 439, 243);
		imagelabel.setVisible(true);
		frame.getContentPane().add(imagelabel);

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(image_path));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Image dimg = img.getScaledInstance(imagelabel.getWidth(), imagelabel.getHeight(), Image.SCALE_SMOOTH);

		ImageIcon imageIcon = new ImageIcon(dimg);

		imagelabel.setIcon(imageIcon);

		JLabel textPlay = new JLabel("<html> Please click the play button for listening the question</html>");
		textPlay.setForeground(new Color(204, 51, 0));
		textPlay.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		textPlay.setBounds(269, 223, 211, 95);
		frame.getContentPane().add(textPlay);

		JLabel textHead = new JLabel("  Polygon Drawing");
		textHead.setForeground(SystemColor.activeCaptionText);
		textHead.setFont(new Font("Tahoma", Font.BOLD, 24));
		textHead.setBorder(new LineBorder(SystemColor.activeCaption, 2));
		textHead.setBounds(364, 120, 251, 43);
		frame.getContentPane().add(textHead);

		JLabel textCamera = new JLabel("<html>Please click the camera button for uploading the drawing</html>");
		textCamera.setForeground(new Color(204, 51, 0));
		textCamera.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		textCamera.setBounds(594, 236, 203, 95);
		frame.getContentPane().add(textCamera);

		if (literate) {
			btnNext.setVisible(true);
			btnCamera.setVisible(false);
			textCamera.setVisible(false);

		}

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

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lblLogo.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lblLogo);

	}

}
