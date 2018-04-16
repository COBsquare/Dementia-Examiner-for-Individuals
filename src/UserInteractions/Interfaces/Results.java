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
	private JTable table_1;

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

		JTable table_point = new JTable(rowdata, columnNames);
		table_point.setCellSelectionEnabled(true);
		table_point.setColumnSelectionAllowed(true);
		table_point.setFillsViewportHeight(true);
		table_point.setFont(new Font("Tahoma", Font.PLAIN, 15));

		table_point.getColumnModel().getColumn(0).setPreferredWidth(250);
		table_point.getColumnModel().getColumn(0).setMinWidth(250);
		table_point.getColumnModel().getColumn(0).setMaxWidth(250);

		JScrollPane scrollPane = new JScrollPane(table_point);
		scrollPane.setBounds(443, 89, 526, 99);
		frame.getContentPane().add(scrollPane);

		JTableHeader Theader = table_point.getTableHeader();

		Theader.setBackground(Color.GRAY); // change the Background color
		Theader.setForeground(Color.BLACK); // change the Foreground

		Theader.setFont(new Font("Tahoma", Font.BOLD, 20)); // font name style size
		table_point.setFont(new Font("Tahoma", Font.BOLD, 15));

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
		
		JTable table_answer = new JTable(MainRows, MainHeaders);
		table_answer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table_answer.setBounds(10, 124, 195, 173);
		frame.getContentPane().add(table_answer);
		
		JScrollPane scrollPane_1 = new JScrollPane(table_answer);
		scrollPane_1.setToolTipText("");
		scrollPane_1.setBounds(77, 272, 971, 260);
		frame.getContentPane().add(scrollPane_1);
		
		JTableHeader Theader_2 = table_answer.getTableHeader();
		Theader_2.setBackground(Color.GRAY); // change the Background color
		Theader_2.setForeground(Color.BLACK); // change the Foreground

		Theader_2.setFont(new Font("Tahoma", Font.BOLD, 20)); // font name style size
		table_answer.setFont(new Font("Tahoma", Font.BOLD, 15));

		
		// Set Evaluation Table-------------------------------------------------------------------
		String[] EvalHeader = { "Evaluation"};
		String[][] EvalRows = new String[size][size];
		
		for(int i=0;i<size;i++){
			EvalRows[i][0]="Correct";
		}
		
		JTable table_evaluation = new JTable(EvalRows,EvalHeader);
		table_evaluation.setCellSelectionEnabled(true);
		table_evaluation.setColumnSelectionAllowed(true);
		table_evaluation.setFillsViewportHeight(true);
		table_evaluation.setFont(new Font("Tahoma", Font.PLAIN, 15));
	
		JTableHeader Theader_3 = table_evaluation.getTableHeader();

		Theader_3.setBackground(Color.GRAY); // change the Background color
		Theader_3.setForeground(Color.BLACK); // change the Foreground

		Theader_3.setFont(new Font("Tahome", Font.BOLD, 20)); // font name style size
		table_evaluation.setFont(new Font("Tahome", Font.BOLD, 15));

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
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(1058, 272, 166, 260);
		frame.getContentPane().add(scrollPane_2);
		
		
		
		
		scrollPane_2.setViewportView(table_1);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Export pdf class should be export

			}
		});
	}
}
