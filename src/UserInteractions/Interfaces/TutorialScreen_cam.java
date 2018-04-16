package UserInteractions.Interfaces;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ImageProcessing.application.WebcamTestMain;

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

		JLabel lbl_logo = new JLabel("");
		lbl_logo.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lbl_logo.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lbl_logo);
		
		JLabel lblYouSaid = new JLabel("If you do not use your computer's camera, you can pass without doing it. ");
		lblYouSaid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYouSaid.setBounds(639, 108, 614, 58);
		frame.getContentPane().add(lblYouSaid);

		JButton btnCamera = new JButton("");
		btnCamera.setIcon(new ImageIcon("Resources/Images/camera.png"));
		btnCamera.setBounds(835, 264, 169, 168);
		frame.getContentPane().add(btnCamera);
		btnCamera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WebcamTestMain.main(null);
			}
		});



		JLabel lblThisScreenTutorial = new JLabel("This screen tutorial for the test. ");
		lblThisScreenTutorial.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblThisScreenTutorial.setBounds(75, 302, 405, 34);
		frame.getContentPane().add(lblThisScreenTutorial);

		JLabel lbl_loadphoto = new JLabel("In the test you should use load a photo or ");
		lbl_loadphoto.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_loadphoto.setBounds(75, 347, 750, 58);
		frame.getContentPane().add(lbl_loadphoto);
		
		JLabel lbl_takingphoto = new JLabel("taking photo with computer's camera.");
		lbl_takingphoto.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_takingphoto.setBounds(75, 385, 458, 47);
		frame.getContentPane().add(lbl_takingphoto);

		JLabel lbl_presscamera= new JLabel("For controlling camera please press the camera button.");
		lbl_presscamera.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_presscamera.setBounds(75, 454, 750, 48);
		frame.getContentPane().add(lbl_presscamera);

		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void keyPressed(KeyEvent e) {
			    if (e.getKeyCode()==KeyEvent.VK_ENTER){

			    }

			}
			public void actionPerformed(ActionEvent e) {
				StartTest.main(null);

			}
		});

		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNext.setBounds(1080, 598, 142, 54);
		frame.getContentPane().add(btnNext);
		frame.getRootPane().setDefaultButton( btnNext );


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
				TutorialScreen_voice.main(null);
			}
		});
		btnBack.setBounds(158, 598, 142, 54);
		frame.getContentPane().add(btnBack);

	
	}
}
