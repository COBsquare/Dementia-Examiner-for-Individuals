package UserInteractions.Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Welcome {

	public JFrame frame;

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


	public Welcome() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setContentPane(new JLabel(new ImageIcon("Resources/Images/background.png")));
		frame.setBounds(100, 100, 1367, 769);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

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

		JButton btnWelcome = new JButton("Next");
		btnWelcome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnWelcome.setBounds(1080, 598, 142, 54);
		frame.getContentPane().add(btnWelcome);
		frame.getRootPane().setDefaultButton( btnWelcome );

		btnWelcome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TypeSelection.main(null);
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(374, 28, 726, 493);
		lblNewLabel.setIcon(new ImageIcon("Resources/Images/logo.png"));
		frame.getContentPane().add(lblNewLabel);

	}
}
