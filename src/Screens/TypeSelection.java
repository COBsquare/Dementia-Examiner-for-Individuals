package Screens;
<<<<<<< HEAD

=======
import java.awt.Color;
>>>>>>> origin/master
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

public class TypeSelection {

	private JFrame frame;

	public class User {
		String name;
		String surname;
		String gender;
		int age;
		String profession;
		String education;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TypeSelection window = new TypeSelection();
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
	public TypeSelection() {
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

		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setBounds(292, 529, 728, 35);
		frame.getContentPane().add(label);

<<<<<<< HEAD
		JButton btnLiterate = new JButton("Illiterate");
		btnLiterate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLiterate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				App.User.setEducation("Illiterate");
				label.setText("The test will continue in litarate, press 'ARROW' to confirm.");
=======


		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(1120, 621, 159, 73);
		btnNewButton.setIcon(new ImageIcon("Resources/Images/arrowRight.png"));
		JButton btnIlliterate = new JButton("Literate");

		JButton btnLiterate = new JButton("Illiterate");
		btnLiterate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLiterate.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	        	btnNewButton.setVisible(true);
	        	btnLiterate.setBackground(Color.GREEN);
	            label.setText("The test will continue in litarate, press 'ARROW' to confirm.");
>>>>>>> origin/master

			}
		});
		btnLiterate.setBounds(1035, 437, 236, 140);
		frame.getContentPane().add(btnLiterate);



<<<<<<< HEAD
		btnIlliterate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				App.User.setEducation("Literate");
				label.setText("The test will continue in illitarate, press 'ARROW' to confirm.");
			}
		});
=======
			btnIlliterate.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent arg0) {
		        	btnNewButton.setVisible(true);
		        	btnIlliterate.setBackground(Color.GREEN);
		            label.setText("The test will continue in illitarate, press 'ARROW' to confirm.");
		        }
		    });
>>>>>>> origin/master
		btnIlliterate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIlliterate.setBounds(1035, 177, 236, 140);
		frame.getContentPane().add(btnIlliterate);

		JLabel lblNewLabel_1 = new JLabel("This selection will affected the test.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(393, 260, 401, 78);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(" Please select your educational status.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(381, 349, 413, 78);
		frame.getContentPane().add(lblNewLabel_2);

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


		btnNewButton.setVisible(false);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
<<<<<<< HEAD
				frame.dispose();
				
=======

>>>>>>> origin/master
				Information_Name.main(null);
			}
		});

	}
}
