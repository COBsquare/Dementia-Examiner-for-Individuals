package UserInteractions.Constants;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import UserInteractions.Information.TypeSelection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Welcome {

	public JFrame frame;
	static Welcome window;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Welcome();
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

		JLabel textSubhead = new JLabel("Did you know?");
		textSubhead.setFont(new Font("Tahoma", Font.BOLD, 18));
		textSubhead.setBounds(623, 540, 352, 30);
		frame.getContentPane().add(textSubhead);

		String[] facts_info = {
				"In 2015, there were estimated 50 million people with dementia worldwide.",
				"Dementia hits women the hardest.",
				"A German doctor named Alois Alzheimer first observed Alzheimer's disease in 1906.",
				"A person with alzheimer disease may lose their sense of smell.",
				"Nearly half of adults aged 85 and over have Alzheimer’s disease.",
				"After the age 65, the risk of Alzheimer's doubles every five years.",
				"In France over 2 billion dollars is being spent on Alzheimer's research.",
				"Green Tea in combination with moderate exercise has been shown to stave off Alzheimer's symptoms in labarotary mice.",
				"India has a low prevalance of Alzheimer's relative to the size of its population. Researchers suggest that a properties found in the CURRY SPICE TURMERIC may play a role.",
				"The cost of caring for a person with Alzheimer's and related dementia is about £28000 per year." };

		Random rn = new Random();
		int rand = rn.nextInt(10) + 0;

		JLabel textFacts = new JLabel("<html>" + facts_info[rand] + "</html>");
		textFacts.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFacts.setBounds(400, 592, 627, 67);
		frame.getContentPane().add(textFacts);

		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNext.setBounds(1080, 598, 142, 54);
		frame.getContentPane().add(btnNext);
		frame.getRootPane().setDefaultButton(btnNext);

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TypeSelection(frame);

			}
		});

		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(374, 28, 726, 493);
		lblLogo.setIcon(new ImageIcon("Resources/Images/logo.png"));
		frame.getContentPane().add(lblLogo);

	}
}
