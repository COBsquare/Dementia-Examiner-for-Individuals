package UserInteractions.Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.JTableHeader;
import App.User;

public class Results_Clock {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Results_Clock window = new Results_Clock();
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
	public Results_Clock() {
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

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lblNewLabel.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lblNewLabel);

		String[] columnNames = { "Clock Drawing Criteria", "Score" };
		int size=0;
		String[][] rowData = new String[size][size];
		frame.getContentPane().setLayout(null);

		JTable table_point = new JTable(rowData, columnNames);
		table_point.setCellSelectionEnabled(true);
		table_point.setColumnSelectionAllowed(true);
		table_point.setFillsViewportHeight(true);
		table_point.setFont(new Font("Tahoma", Font.PLAIN, 15));
	

		JScrollPane scrollPane = new JScrollPane(table_point);
		scrollPane.setBounds(710, 150, 573, 371);
		frame.getContentPane().add(scrollPane);

		JTableHeader Theader = table_point.getTableHeader();
		Theader.setBackground(Color.GRAY); // change the Background color
		Theader.setForeground(Color.BLACK); // change the Foreground

		Theader.setFont(new Font("Tahoma", Font.BOLD, 20)); // font name style size
		table_point.setFont(new Font("Tahoma", Font.BOLD, 15));


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

			
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(158, 598, 142, 54);
		frame.getContentPane().add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Results_MMSE.main(null);
			}
		});
		
		
		JLabel lbl_clock = new JLabel("");
		lbl_clock.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_clock.setIcon(new ImageIcon("Resources/Images/clock.jpg"));
		lbl_clock.setBounds(327, 199, 328, 279);
		frame.getContentPane().add(lbl_clock);
		
		JButton btn_export = new JButton("Export the PDF File");
		btn_export.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_export.setBounds(1038, 595, 193, 60);
		frame.getContentPane().add(btn_export);
		
		btn_export.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Export pdf class should be export

			}
		});
	}
}
