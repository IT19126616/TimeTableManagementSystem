package Member3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

import dbConnect.DBConnect;

public class ManageWorkingDays {

	private JFrame frmManageWork;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageWorkingDays window = new ManageWorkingDays();
					window.frmManageWork.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageWorkingDays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmManageWork = new JFrame();
		frmManageWork.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmManageWork.setBackground(Color.YELLOW);
		frmManageWork.setResizable(false);
		frmManageWork.setTitle("Manage Working Days And Hours");
		frmManageWork.setBounds(350, 90, 1350, 900);
		frmManageWork.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmManageWork.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frmManageWork.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setForeground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 787);
		panel_1.setBackground(Color.BLACK);
		frmManageWork.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Working Days");
		btnNewButton.setBounds(12, 320, 240, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnManageGroups = new JButton("Manage Working Days");
		btnManageGroups.setBounds(12, 383, 252, 50);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setBounds(12, 724, 238, 50);
		btnViewGroups_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Manage Working Days And Hours");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frmManageWork.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frmManageWork.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("No. of Working Days");
		lblNewLabel_2.setBounds(273, 330, 252, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmManageWork.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Working Days");
		lblNewLabel_2_1.setBounds(277, 402, 252, 25);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmManageWork.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Working Time Per Day");
		lblNewLabel_2_1_2.setBounds(274, 554, 281, 25);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmManageWork.getContentPane().add(lblNewLabel_2_1_2);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(535, 324, 262, 38);
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmManageWork.getContentPane().add(spinner_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(Color.LIGHT_GRAY);
		frmManageWork.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnClear = new JButton("Update");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClear.setBounds(268, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnSave = new JButton("Delete");
		btnSave.setBounds(518, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = DBConnect.connect();
					
					String query="select * from main ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRefresh.setBounds(10, 42, 238, 50);
		panel_3.add(btnRefresh);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Monday");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(539, 402, 125, 25);
		frmManageWork.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxTuesday = new JCheckBox("Tuesday");
		chckbxTuesday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxTuesday.setBounds(704, 402, 125, 25);
		frmManageWork.getContentPane().add(chckbxTuesday);
		
		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxWednesday.setBounds(855, 402, 135, 25);
		frmManageWork.getContentPane().add(chckbxWednesday);
		
		JCheckBox chckbxThursday = new JCheckBox("Thursday");
		chckbxThursday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxThursday.setBounds(1035, 402, 125, 25);
		frmManageWork.getContentPane().add(chckbxThursday);
		
		JCheckBox chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxFriday.setBounds(1186, 402, 125, 25);
		frmManageWork.getContentPane().add(chckbxFriday);
		
		JCheckBox chckbxSaturday = new JCheckBox("Saturday");
		chckbxSaturday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxSaturday.setBounds(539, 475, 125, 25);
		frmManageWork.getContentPane().add(chckbxSaturday);
		
		JCheckBox chckbxSunday = new JCheckBox("Sunday");
		chckbxSunday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxSunday.setBounds(704, 475, 125, 25);
		frmManageWork.getContentPane().add(chckbxSunday);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner.setBounds(536, 541, 135, 38);
		frmManageWork.getContentPane().add(spinner);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHours.setBounds(701, 554, 96, 25);
		frmManageWork.getContentPane().add(lblHours);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner_2.setBounds(849, 541, 135, 38);
		frmManageWork.getContentPane().add(spinner_2);
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMinutes.setBounds(1014, 554, 96, 25);
		frmManageWork.getContentPane().add(lblMinutes);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 166, 1039, 142);
		frmManageWork.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				
			}
		));
		scrollPane.setViewportView(table);
	 
	    
	}
}
