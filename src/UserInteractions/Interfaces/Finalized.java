package UserInteractions.Interfaces;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Finalized {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finalized window = new Finalized();
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
	public Finalized() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1367, 796);
		frame.setContentPane(new JLabel(new ImageIcon("Resources/Images/background.png")));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lblNewLabel1.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lblNewLabel1);


		JLabel lblNewLabel = new JLabel("You have completed the test.");
		lblNewLabel.setFont(new Font("Serif",Font.BOLD,30));
		lblNewLabel.setBounds(523, 380, 376, 76);
		frame.getContentPane().add(lblNewLabel);

		JButton viewResultsButton = new JButton("View Results");
		viewResultsButton.setForeground(Color.WHITE);
		viewResultsButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		viewResultsButton.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void keyPressed(KeyEvent e) {
			    if (e.getKeyCode()==KeyEvent.VK_ENTER){

			    }

			}
			public void actionPerformed(ActionEvent arg0) {
				 Results.main(null);

			}
		});
		viewResultsButton.setBackground(Color.RED);
		viewResultsButton.setBounds(612, 533, 173, 60);
		frame.getContentPane().add(viewResultsButton);
		frame.getRootPane().setDefaultButton( viewResultsButton );

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("Resources/Images/tick.png"));
		label.setBounds(566, 168, 284, 171);
		frame.getContentPane().add(label);

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
	}

}
