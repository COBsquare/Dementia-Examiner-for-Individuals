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


public class StartTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartTest window = new StartTest();
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
	public StartTest() {
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

		JLabel lblNewLabel = new JLabel("If you are ready, please click the start the test button.");
		lblNewLabel.setFont(new Font("Tahoma",Font.BOLD,30));
		lblNewLabel.setBounds(306, 330, 902, 74);
		frame.getContentPane().add(lblNewLabel);

		JButton viewResultsButton = new JButton("START THE TEST");
		viewResultsButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		viewResultsButton.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void keyPressed(KeyEvent e) {
			    if (e.getKeyCode()==KeyEvent.VK_ENTER){

			    }

			}
			public void actionPerformed(ActionEvent arg0) {
				 Question_Voiced.main(null);
			}
		});
		viewResultsButton.setBackground(Color.GREEN);
		viewResultsButton.setBounds(570, 534, 237, 60);
		frame.getContentPane().add(viewResultsButton);
		frame.getRootPane().setDefaultButton( viewResultsButton );

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
