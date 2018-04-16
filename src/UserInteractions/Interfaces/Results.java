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
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import App.User;

public class Results {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Results window = new Results();
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
	public Results() {
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

		String[] columnNames = { "MMSE Point", "Cognitive Impairment" };
		String[][] rowdata = {
				{ "27-30", "Normal" },
				{ "21-26", "Mild Cognitive Impairment" },
				{ "11-20", "Moderate Cognitive Impairment" },
				{ "0-10", "Severe Cognitive Impairment" } };
		frame.getContentPane().setLayout(null);

		JTable table = new JTable(rowdata, columnNames);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setFillsViewportHeight(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));

		table.getColumnModel().getColumn(0).setPreferredWidth(250);
		table.getColumnModel().getColumn(0).setMinWidth(250);
		table.getColumnModel().getColumn(0).setMaxWidth(250);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(59, 324, 526, 99);
		frame.getContentPane().add(scrollPane);

		JTableHeader Theader = table.getTableHeader();

		Theader.setBackground(Color.GRAY); // change the Background color
		Theader.setForeground(Color.BLACK); // change the Foreground

		Theader.setFont(new Font("Tahome", Font.BOLD, 20)); // font name style size
		table.setFont(new Font("Tahome", Font.BOLD, 15));

		String[] MainHeaders = { "Question", "Answer"};

		// Set MainTable----------------------------------------------------------------------------
		int size = 0;

		String[] questions;
		String[] answers = new String[User.answers.size()];
		User.answers.toArray(answers);

		App.User.setEducation("Literate");
		if (App.User.getEducation().equals("Literate")) {
			questions = User.questions_literate.clone();
			size = User.questions_literate.length;
		} else {
			questions = User.questions_illiterate.clone();
			size = User.questions_illiterate.length;
		}

		String[][] MainRows = new String[size][size];
		for (int i = 0; i < size; i++) {
			MainRows[i][0] = questions[i];
		}

		for (int i = 0; i < size; i++) {
			MainRows[i][1] = "deneme";
		}
		
		table = new JTable(MainRows, MainHeaders);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setBounds(10, 124, 195, 173);
		frame.getContentPane().add(table);
		
		JScrollPane scrollPane_1 = new JScrollPane(table);
		scrollPane_1.setToolTipText("");
		scrollPane_1.setBounds(871, 268, 420, 183);
		frame.getContentPane().add(scrollPane_1);
		
		// Set Evaluation Table-------------------------------------------------------------------
		String[] EvalHeaders = { "Evaluation"};
		String[][] EvalRows = new String[size][];

		JTableHeader Theader2 = table.getTableHeader();

		Theader2.setBackground(Color.GRAY); // change the Background color
		Theader2.setForeground(Color.BLACK); // change the Foreground

		Theader2.setFont(new Font("Tahome", Font.BOLD, 20)); // font name style size
		table.setFont(new Font("Tahome", Font.BOLD, 15));

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

		JButton btnNewButton = new JButton("Export the PDF File");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(633, 588, 193, 60);
		frame.getContentPane().add(btnNewButton);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Export pdf class should be export

			}
		});
	}

}
