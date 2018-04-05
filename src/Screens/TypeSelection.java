package Screens;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

public class TypeSelection {

	private JFrame frame;
	int click=0;

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

		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBounds(1080, 598, 142, 54);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		

		JButton btnIlliterate = new JButton("Illiterate");
		JButton btnLiterate = new JButton("Literate");
		btnIlliterate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIlliterate.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt)
	        {
	            	click++;
				if(click==1){
				App.User.setEducation("Illiterate");
				btnNewButton.setVisible(true);
				btnIlliterate.setBackground(Color.GREEN);
				label.setText("The test will continue in illitarate, press 'NEXT' to confirm.");
				btnLiterate.setEnabled(false);
				}
				else if((click%2)==0){
					btnIlliterate.setBackground(null);
					label.setVisible(false);
					btnLiterate.setEnabled(true);
					
				}else {
					App.User.setEducation("Illiterate");
					btnNewButton.setVisible(true);
					btnIlliterate.setBackground(Color.GREEN);
					label.setVisible(true);
					label.setText("The test will continue in illitarate, press 'NEXT' to confirm.");
					btnLiterate.setEnabled(false);
				}
	        }
	    });
	
		btnIlliterate.setBounds(1035, 396, 236, 140);
		frame.getContentPane().add(btnIlliterate);
		
		
		btnLiterate.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt)
	        {
	            	click++;
				if(click==1){
				App.User.setEducation("Literate");
				btnNewButton.setVisible(true);
				btnLiterate.setBackground(Color.GREEN);
				label.setText("The test will continue in litarate, press 'NEXT' to confirm.");
				btnIlliterate.setEnabled(false);
				}
				else if((click % 2)==0){
					btnLiterate.setBackground(null);
					label.setVisible(false);
					btnIlliterate.setEnabled(true);

				}
				else {
					App.User.setEducation("Illiterate");
					btnNewButton.setVisible(true);
					btnLiterate.setBackground(Color.GREEN);
					label.setVisible(true);
					label.setText("The test will continue in litarate, press 'NEXT' to confirm.");
					btnIlliterate.setEnabled(false);
				}
	        }
	    });



		btnLiterate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLiterate.setBounds(1035, 177, 236, 140);
		frame.getContentPane().add(btnLiterate);

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
			public void keyPressed(KeyEvent e) {
			    if (e.getKeyCode()==KeyEvent.VK_ENTER){
			    	
			    }

			}

			public void actionPerformed(ActionEvent arg0) {

				Information_Name.main(null);
			}
		});
		
	}
}
