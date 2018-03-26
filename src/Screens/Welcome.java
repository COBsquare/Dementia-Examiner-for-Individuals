package Screens;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Welcome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
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
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setContentPane(new JLabel(new ImageIcon("Resources/Images/background.png")));
		frame.setBounds(100, 100, 1367, 769);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(374, 28, 726, 493);
		lblNewLabel.setIcon(new ImageIcon("Resources/Images/logo.png"));
		frame.getContentPane().add(lblNewLabel);
		
			
		
		JLabel lblDidYouKnow = new JLabel("Did you know?");
		lblDidYouKnow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDidYouKnow.setBounds(623, 540, 352, 30);
		frame.getContentPane().add(lblDidYouKnow);
		
		JLabel lblInThere = new JLabel("In 2015, there were estimated 50 million people with dementia worldwide.");
		lblInThere.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInThere.setBounds(400, 592, 627, 57);
		frame.getContentPane().add(lblInThere);
		
		
		JButton btnWelcome = new JButton("");
		btnWelcome.setBounds(1120, 621, 159, 73);
		btnWelcome.setIcon(new ImageIcon("Resources/Images/arrowRight.png"));
		frame.getContentPane().add(btnWelcome);
		btnWelcome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TypeSelection option = new TypeSelection();
				option.main(null);
			}
		});
		
	}
}
