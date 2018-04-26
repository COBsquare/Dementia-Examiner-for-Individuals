package UserInteractions.Examination;

import java.awt.Color;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.table.JTableHeader;
import com.itextpdf.text.DocumentException;

import App.User;
import UserInteractions.ExportToPDF;
import UserInteractions.Constants.Welcome;

public class Results_Clock {

	private JFrame frame;

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

	public Results_Clock() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1367, 796);
		frame.setContentPane(new JLabel(new ImageIcon("Resources/Images/background.png")));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		String[] columnNames = { "Clock Drawing Criteria", "Score" };
		String[][] rowdata = {
				{ "CLOCK FACE", "" },
				{ "", "" },
				{ "Clock face is presented", User.answers_clock.get(0) },
				{ "Numbers and hands are presented", User.answers_clock.get(1) },

				{ "NUMBERS", "" },
				{ "", "" },
				{ "All numbers are presented", User.answers_clock.get(2) },
				{ "Numbers are in correct spatial arrangements", User.answers_clock.get(3) },

				{ "CLOCK HANDS", "" },
				{ "", "" },
				{ "Hour hand is in the correct place", User.answers_clock.get(4) },
				{ "Minute hand is in the correct place", User.answers_clock.get(5) },
				{ "Minute hand is longer than hour hand", User.answers_clock.get(6) },
				{ "They are in correct form", User.answers_clock.get(7) },

				{ "", "" },
				{ "TOTAL POINT", User.getScore_clock() + " out of 10" } };

		JTable table_point = new JTable(rowdata, columnNames);
		table_point.setCellSelectionEnabled(true);
		table_point.setColumnSelectionAllowed(true);
		table_point.setFillsViewportHeight(true);
		table_point.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JScrollPane scrollPane = new JScrollPane(table_point);
		scrollPane.setBounds(710, 150, 573, 300);
		frame.getContentPane().add(scrollPane);

		JTableHeader Theader = table_point.getTableHeader();
		Theader.setBackground(Color.GRAY);
		Theader.setForeground(Color.BLACK);
		Theader.setFont(new Font("Tahoma", Font.BOLD, 20));
		table_point.setFont(new Font("Tahoma", Font.BOLD, 15));

		JButton btn_export = new JButton("Export the PDF File");
		btn_export.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_export.setBounds(1038, 595, 193, 60);
		frame.getContentPane().add(btn_export);
		btn_export.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ExportToPDF.main(null);
					JOptionPane.showMessageDialog(null, "Your report has been exported to your desktop", "Info",
							JOptionPane.INFORMATION_MESSAGE);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (DocumentException e) {
					e.printStackTrace();
				}
			}
		});

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Resources/Images/kucuklogo.png"));
		lblNewLabel.setBounds(59, 27, 307, 215);
		frame.getContentPane().add(lblNewLabel);

		JLabel lbl_clock = new JLabel("");
		lbl_clock.setFont(new Font("Tahoma", Font.BOLD, 20));

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(System.getProperty("user.home") + "/DEfI/user_clock.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(lbl_clock.getWidth(), lbl_clock.getHeight(), Image.SCALE_SMOOTH);

		ImageIcon imageIcon = new ImageIcon(dimg);
		lbl_clock.setIcon(imageIcon);
		lbl_clock.setBounds(327, 199, 328, 279);
		frame.getContentPane().add(lbl_clock);

		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(158, 598, 142, 54);
		frame.getContentPane().add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Results_MMSE.main(null);
			}
		});

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
