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


		JLabel lbl_logo = new JLabel("");
		lbl_logo.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lbl_logo.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lbl_logo);


		JLabel lbl_complete = new JLabel("You have completed the test.");
		lbl_complete.setFont(new Font("Serif",Font.BOLD,30));
		lbl_complete.setBounds(523, 380, 376, 76);
		frame.getContentPane().add(lbl_complete);

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

		JLabel lbl_tick = new JLabel("");
		lbl_tick.setIcon(new ImageIcon("Resources/Images/tick.png"));
		lbl_tick.setBounds(566, 168, 284, 171);
		frame.getContentPane().add(lbl_tick);

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
