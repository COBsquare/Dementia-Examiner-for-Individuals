package UserInteractions.Interfaces;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

public class Information_Profession {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information_Profession window = new Information_Profession();
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
	public Information_Profession() {
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



		JLabel lbl_logo = new JLabel("");
		lbl_logo.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lbl_logo.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lbl_logo);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(652, 438, 262, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);



		JLabel lbl_profession = new JLabel("Profession");
		lbl_profession.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbl_profession.setBounds(375, 434, 302, 44);
		frame.getContentPane().add(lbl_profession);

		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNext.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void keyPressed(KeyEvent e) {
			    if (e.getKeyCode()==KeyEvent.VK_ENTER){

			    }

			}
			public void actionPerformed(ActionEvent arg0) {
				
				App.User.setProfession(textField.getText());

				Information_Gender.main(null);
			}
		});
		btnNext.setBounds(1080, 598, 142, 54);
		frame.getContentPane().add(btnNext);
		frame.getRootPane().setDefaultButton( btnNext );

		JLabel lbl_info = new JLabel("This information is only for personalizing the document which is given at the end of the test.");
		lbl_info.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lbl_info.setBounds(343, 253, 813, 46);
		frame.getContentPane().add(lbl_info);

		JLabel lbl_info2 = new JLabel("If you do not want to personalize the document, you can pass without filling it.");
		lbl_info2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lbl_info2.setBounds(375, 303, 707, 33);
		frame.getContentPane().add(lbl_info2);

		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Information_Age.main(null);
			}
		});
		btnBack.setBounds(158, 598, 142, 54);
		frame.getContentPane().add(btnBack);

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
