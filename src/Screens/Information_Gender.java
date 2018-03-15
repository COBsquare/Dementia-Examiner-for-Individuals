package Screens;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import java.awt.Font;

public class Information_Gender {

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



		JLabel lblNewLabel_1 = new JLabel("Gender");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(404, 434, 302, 44);
		frame.getContentPane().add(lblNewLabel_1);

		
		String[] Gender = {"Female", "Male", "Not Specified" };
		JComboBox comboBox = new JComboBox(Gender);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(692, 439, 262, 44);
		frame.getContentPane().add(comboBox);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
							
				frame.dispose();
				TutorialScreen_voice tutorial = new TutorialScreen_voice();
				tutorial.main(null);
			}
		});
		btnNext.setBounds(610, 638, 142, 54);
		frame.getContentPane().add(btnNext);
		
		JLabel lblNewLabel_2 = new JLabel("This information is only for personalizing the document which is given at the end of the test.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(382, 250, 631, 46);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("If you do not want to personalize the document, you can pass without filling it.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(409, 307, 594, 19);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
