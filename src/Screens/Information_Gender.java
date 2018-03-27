package Screens;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

public class Information_Gender {

	private JFrame frame;

<<<<<<< HEAD
=======

>>>>>>> origin/master
	public class User {
		String name;
		String gender;
		int age;
		String profession;

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information_Gender window = new Information_Gender();
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
	public Information_Gender() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1367, 769);
		frame.setContentPane(new JLabel(new ImageIcon("Resources/Images/background.png")));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

<<<<<<< HEAD
=======


>>>>>>> origin/master
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lblNewLabel.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Gender");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(375, 434, 302, 44);
		frame.getContentPane().add(lblNewLabel_1);

<<<<<<< HEAD
		String[] Gender = { "Female", "Male", "Not Specified" };
=======

		String[] Gender = {"Female", "Male", "Not Specified" };
>>>>>>> origin/master
		JComboBox comboBox = new JComboBox(Gender);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(652, 438, 262, 46);
		frame.getContentPane().add(comboBox);

		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
<<<<<<< HEAD
				App.User.setGender(comboBox.getSelectedItem().toString());
				Information_Warnings.main(null);
=======
				// TODO Set user gender -> comboBox.getSelectedItem().toString();
				TutorialScreen_voice.main(null);
>>>>>>> origin/master
			}
		});
		btnNext.setBounds(1080, 598, 142, 54);
		frame.getContentPane().add(btnNext);

<<<<<<< HEAD
		JLabel lblNewLabel_2 = new JLabel(
				"This information is only for personalizing the document which is given at the end of the test.");
=======
		JLabel lblNewLabel_2 = new JLabel("This information is only for personalizing the document which is given at the end of the test.");
>>>>>>> origin/master
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_2.setBounds(343, 253, 813, 46);
		frame.getContentPane().add(lblNewLabel_2);

<<<<<<< HEAD
		JLabel lblNewLabel_3 = new JLabel(
				"If you do not want to personalize the document, you can pass without filling it.");
=======
		JLabel lblNewLabel_3 = new JLabel("If you do not want to personalize the document, you can pass without filling it.");
>>>>>>> origin/master
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_3.setBounds(375, 303, 707, 33);
		frame.getContentPane().add(lblNewLabel_3);

		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Information_Profession.main(null);
			}
		});

		btnBack.setBounds(158, 598, 142, 54);
		frame.getContentPane().add(btnBack);

		JButton btnHome = new JButton("");
		btnHome.setBounds(1210, 27, 61, 60);
		btnHome.setIcon(new ImageIcon("Resources/Images/home.png"));
		frame.getContentPane().add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
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
	}
}
