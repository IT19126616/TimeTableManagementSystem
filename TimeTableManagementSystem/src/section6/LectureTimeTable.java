package section6;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import Member4.AddLocation;
import Member4.AddSessionRooms;
import Member4.Main4;
import Member4.ViewRooms;
import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;
import javax.swing.JComboBox;

public class LectureTimeTable {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LectureTimeTable window = new LectureTimeTable();
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
	public LectureTimeTable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
//		frameAddLocation.getContentPane().setBackground(new Color(21,25,28));
			frame.getContentPane().setBackground(new Color(21,25,28));
			frame.setBackground(Color.YELLOW);

			

			//frameAddLocation.setBackground(Color.YELLOW);
			frame.setResizable(false);
			//frameAddLocation.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
			//frameAddLocation.setBackground(new Color(102, 51, 102));
			frame.setTitle(" Time Table ");		

			frame.setBounds(100, 40, 1350, 900);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(152, 201, 45));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 787);
		panel_1.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnRefresh = new JButton("Lecturer");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ex) {
				AddLocation al = new AddLocation();
				try {
					AddLocation.main(null);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setVisible(false);

			}
		});
		btnRefresh.setBounds(12, 320, 240, 50);
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRefresh.setForeground(new Color(21, 25, 28));
		btnRefresh.setBackground(new Color(152, 201, 45));
		panel_1.add(btnRefresh);
		
		JButton btnAddSessionRooms = new JButton("Location");
		btnAddSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSessionRooms ar = new AddSessionRooms();
				try {
					AddSessionRooms.main(null);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setVisible(false);	
			}
		});
		btnAddSessionRooms.setBounds(12, 446, 252, 50);
		btnAddSessionRooms.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddSessionRooms.setForeground(new Color(21, 25, 28));
		btnAddSessionRooms.setBackground(new Color(152, 201, 45));
		panel_1.add(btnAddSessionRooms);
		
		JButton btnManageGroups = new JButton("Student");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnManageGroups.setBounds(12, 383, 240, 50);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnManageGroups.setForeground(new Color(21, 25, 28));	
		btnManageGroups.setBackground(new Color(152, 201, 45));
		panel_1.add(btnManageGroups);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main4 back = new Main4();
				Main4.main(null);
				frame.setVisible(false);
			}
		});
		btnViewGroups_1.setBounds(12, 616, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("TIme Table");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(Color.WHITE);
		frame.getContentPane().add(separator);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(284, 275, 1022, 444);
		frame.getContentPane().add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnNewButton = new JButton("Generate");
		btnNewButton.setBounds(1021, 212, 128, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Print");
		btnNewButton_1.setBounds(1180, 212, 126, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(562, 222, 410, 32);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Location");
		lblNewLabel_2.setBounds(389, 212, 135, 50);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(152, 201, 45));
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		
	 
	    
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}