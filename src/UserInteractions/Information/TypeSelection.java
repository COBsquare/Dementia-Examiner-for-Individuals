package UserInteractions.Information;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import UserInteractions.Constants.Welcome;

import java.awt.Font;

public class TypeSelection {

	int click=0;
	public JFrame frame;

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


	public TypeSelection() {
		initialize();
	}

	
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

		JButton btnNext = new JButton("Next");
		btnNext.setBounds(1080, 598, 142, 54);
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNext.setVisible(false);
		frame.getContentPane().add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Information_Name.main(null);
			}
		});
		
		JButton btnLiterate = new JButton("Literate");		
		JButton btnIlliterate = new JButton("Illiterate");
		btnIlliterate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIlliterate.setBounds(1035, 396, 236, 140);
		frame.getContentPane().add(btnIlliterate);
		btnIlliterate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
	        {
	            	click++;
				if(click==1){
				App.User.setEducation("Illiterate");
				btnNext.setVisible(true);
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
					btnNext.setVisible(true);
					btnIlliterate.setBackground(Color.GREEN);
					label.setVisible(true);
					label.setText("The test will continue in illitarate, press 'NEXT' to confirm.");
					btnLiterate.setEnabled(false);
				}
	        }
	    });
	

		btnLiterate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLiterate.setBounds(1035, 177, 236, 140);
		frame.getContentPane().add(btnLiterate);
		btnLiterate.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent arg0)
	        {
	            	click++;
				if(click==1){
				App.User.setEducation("Literate");
				btnNext.setVisible(true);
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
					btnNext.setVisible(true);
					btnLiterate.setBackground(Color.GREEN);
					label.setVisible(true);
					label.setText("The test will continue in litarate, press 'NEXT' to confirm.");
					btnIlliterate.setEnabled(false);
				}
	        }
	    });


		JLabel lblNewLabel_1 = new JLabel("This selection will affect the test.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(393, 260, 401, 78);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(" Please select your educational status.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(365, 349, 542, 101);
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

		
		
	}


	
}
