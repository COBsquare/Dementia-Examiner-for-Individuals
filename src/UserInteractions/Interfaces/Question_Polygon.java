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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import App.User;
import ImageProcessing.application.Main;

public class Question_Polygon {

	private JFrame frame;
	int i = 0;
	int click = 0;
	private String image_path;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public Question_Polygon() {

		if (App.User.getEducation().equals("Literate")) {
			image_path = "Resources/Images/polygon_literate.png";
		} else if (App.User.getEducation().equals("Illiterate")) {
			image_path = "Resources/Images/polygon_illiterate.png";
		}

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

		btnReadTheQuestion.setBounds(269, 342, 169, 168);
		frame.getContentPane().add(btnReadTheQuestion);

		JButton btn_Next = new JButton("Next");
		btn_Next.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Next.setBounds(1080, 598, 142, 54);
		btn_Next.setVisible(false);
		frame.getContentPane().add(btn_Next);
		frame.getRootPane().setDefaultButton(btn_Next);
		btn_Next.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

				}

			}

			public void actionPerformed(ActionEvent e) {
				if (User.getEducation().equals("Literate")) {
					Question_Clock.main(null);
				} else {
					Finalized.main(null);
				}

			}
		});

		JButton btn_camera = new JButton("");
		btn_camera.setIcon(new ImageIcon("Resources/Images/camera.png"));
		btn_camera.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_camera.setBounds(595, 342, 169, 168);
		frame.getContentPane().add(btn_camera);
		frame.getRootPane().setDefaultButton(btn_camera);
		btn_camera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Main.main(null);
				btn_Next.setVisible(true);

			}

		});

		JLabel lbl_shapeliterate = new JLabel("");
		lbl_shapeliterate.setBounds(854, 285, 439, 243);
		lbl_shapeliterate.setVisible(false);
		frame.getContentPane().add(lbl_shapeliterate);

		JLabel lblNewLabel_4 = new JLabel("<html> Please click the play button for listening the question</html>");
		lblNewLabel_4.setForeground(new Color(204, 51, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(269, 223, 211, 95);
		frame.getContentPane().add(lblNewLabel_4);

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
		lblNewLabel_7.setBorder(new LineBorder(SystemColor.activeCaption, 2));
		lblNewLabel_7.setBounds(364, 120, 251, 43);
		frame.getContentPane().add(lblNewLabel_7);

		JLabel lbl_camerawarning = new JLabel("<html>Please click the camera button for uploading the drawing</html>");
		lbl_camerawarning.setForeground(new Color(204, 51, 0));
		lbl_camerawarning.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lbl_camerawarning.setBounds(594, 236, 203, 95);
		frame.getContentPane().add(lbl_camerawarning);
		lblNewLabel_7.setVisible(false);

		btnClose.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});

		lbl_shapeliterate.setVisible(true);
		lblNewLabel_7.setVisible(true);
		lbl_shapeliterate.setIcon(new ImageIcon(image_path));

	}
}
