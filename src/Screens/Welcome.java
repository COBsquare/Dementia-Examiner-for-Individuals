package Screens;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
=======
>>>>>>> 8a7c25ea1f020a80998b781cd1c8d40ccb59382e

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
<<<<<<< HEAD



=======
		
>>>>>>> 8a7c25ea1f020a80998b781cd1c8d40ccb59382e
		JLabel lblDidYouKnow = new JLabel("Did you know?");
		lblDidYouKnow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDidYouKnow.setBounds(623, 540, 352, 30);
		frame.getContentPane().add(lblDidYouKnow);

		String[] Facts= {"In 2015, there were estimated 50 million people with dementia worldwide.",
				"Dementia hits women the hardest.",
				"A German doctor named Alois Alzheimer first observed Alzheimer's disease in 1906.",
				"A person with alzheimer disease may lose their sense of smell.",
				"Nearly half of adults aged 85 and over have Alzheimer’s disease.",
				"After the age 65, the risk of Alzheimer's doubles every five years.",
				"In France over 2 billion dollars is being spent on Alzheimer's research.",
				"Green Tea in combination with moderate exercise has been shown to stave off Alzheimer's symptoms in labarotary mice.",
				"India has a low prevalance of Alzheimer's relative to the size of its population. Researchers suggest that a properties found in the CURRY SPICE TURMERIC may play a role.",
				"The cost of caring for a person with Alzheimer's and related dementia is about £28000 per year."};

		Random rn= new Random();
		int rand= rn.nextInt(10)+0;

		JLabel lblInThere = new JLabel("<html>"+Facts[rand]+"</html>");
		lblInThere.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInThere.setBounds(400, 592, 627, 67);
		frame.getContentPane().add(lblInThere);
<<<<<<< HEAD


=======
		
>>>>>>> 8a7c25ea1f020a80998b781cd1c8d40ccb59382e
		JButton btnWelcome = new JButton("");
		btnWelcome.setBounds(1120, 621, 159, 73);
		btnWelcome.setIcon(new ImageIcon("Resources/Images/arrowRight.png"));
		frame.getContentPane().add(btnWelcome);
		btnWelcome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TypeSelection.main(null);
			}
		});

	}
}
