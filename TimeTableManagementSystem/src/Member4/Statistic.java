package Member4;

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

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

public class Statistic {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statistic window = new Statistic();
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
	public Statistic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tempus Sans ITC", Font.PLAIN, 10));
		frame.getContentPane().setBackground(new Color(21,25,28));
		frame.setBackground(Color.YELLOW);
		frame.setResizable(false);
		frame.setTitle("Statistics");
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
		
		JButton btnManageSessionRooms = new JButton("Statistics");
		btnManageSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRooms msr = new ViewRooms();
				try {
					ViewRooms.main(null);
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
		btnManageSessionRooms.setBounds(10, 304, 240, 50);
		btnManageSessionRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnManageSessionRooms.setForeground(new Color(21, 25, 28));
		btnManageSessionRooms.setBackground(new Color(152, 201, 45));
		panel_1.add(btnManageSessionRooms);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("Statistics");
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
		
		JLabel lblNewLabel_2 = new JLabel("Registerd Lecturers");
		lblNewLabel_2.setBounds(272, 185, 200, 50);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));lblNewLabel_2.setForeground(new Color(152, 201, 45));
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(462, 190, 50, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Registerd Students");
		lblNewLabel_3.setBounds(544, 185, 200, 50);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));lblNewLabel_3.setForeground(new Color(152, 201, 45));
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(724, 189, 50, 50);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Registered Subjects");
		lblNewLabel_4.setBounds(806, 185, 200, 50);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));lblNewLabel_4.setForeground(new Color(152, 201, 45));
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(999, 188, 60, 52);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Registerd Rooms");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));lblNewLabel_5.setForeground(new Color(152, 201, 45));

		lblNewLabel_5.setBounds(1101, 185, 200, 50);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(1264, 185, 60, 53);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	
	 
	    
	}
}
