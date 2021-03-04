package MemberTwo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManageLectures {

	JFrame frmAddStudentGroups;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_2;
	private JTable table;
	private JComboBox facultyNames;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageLectures window = new ManageLectures();
					window.frmAddStudentGroups.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageLectures() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentGroups = new JFrame();
		frmAddStudentGroups.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmAddStudentGroups.setBackground(Color.YELLOW);
		//frmAddStudentGroups.setResizable(false);
		frmAddStudentGroups.setTitle("Manage Student Groups");
		//frmAddStudentGroups.setBounds(350, 90, 1350, 1500);
		frmAddStudentGroups.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentGroups.getContentPane().setLayout(null);
		
		frmAddStudentGroups.setSize(1386, 725);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frmAddStudentGroups.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setForeground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 615);
		panel_1.setBackground(Color.BLACK);
		frmAddStudentGroups.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Groups");
		btnNewButton.setBounds(12, 320, 238, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnManageGroups = new JButton("Manage Groups");
		btnManageGroups.setBounds(12, 383, 252, 50);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		
		/*JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setBounds(12, 724, 238, 50);
		btnViewGroups_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		*/
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Manage Lecturers");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frmAddStudentGroups.getContentPane().add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(272, 385, 1072, 308);
		panel_3.setBackground(Color.LIGHT_GRAY);
		frmAddStudentGroups.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Lecturer Name");
		lblNewLabel_2.setBounds(12, 35, 252, 25);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setBounds(276, 28, 262, 40);
		panel_3.add(textField);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Employee ID");
		lblNewLabel_2_1.setBounds(12, 99, 252, 25);
		panel_3.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField_1 = new JTextField();
		textField_1.setBounds(276, 92, 262, 40);
		panel_3.add(textField_1);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Faculty");
		lblNewLabel_2_1_1.setBounds(12, 156, 281, 25);
		panel_3.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Department");
		lblNewLabel_2_1_2.setBounds(12, 215, 281, 25);
		panel_3.add(lblNewLabel_2_1_2);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Center");
		lblNewLabel_2_1_3.setBounds(588, 43, 128, 25);
		panel_3.add(lblNewLabel_2_1_3);
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Building");
		lblNewLabel_2_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_3_1.setBounds(588, 99, 128, 25);
		panel_3.add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_3_2 = new JLabel("Level");
		lblNewLabel_2_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_3_2.setBounds(588, 156, 128, 25);
		panel_3.add(lblNewLabel_2_1_3_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(758, 209, 262, 40);
		panel_3.add(textField_5);
		
		 facultyNames = new JComboBox();
		facultyNames.setBounds(276, 156, 262, 32);
		facultyNames.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_3.add(facultyNames);
			facultyNames.addItem("Select Faculty");
			facultyNames.addItem("Faculty of Computing");
			facultyNames.addItem("Faculty of Business");
			facultyNames.addItem("Faculty of Engineering");
			facultyNames.addItem("Faculty of Humanities & Sciences ");
		
		JComboBox depname = new JComboBox();
		depname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		depname.setBounds(276, 215, 262, 32);
		
		panel_3.add(depname);
			depname.addItem("Select Department");
			depname.addItem("Department of Information Technology");
			depname.addItem("Department of Computer Systems Engineering");
			depname.addItem("Department of Computer Science & Software Engineering");
			depname.addItem("Department of Business IT ");
		
		JComboBox center = new JComboBox();
		center.setFont(new Font("Tahoma", Font.PLAIN, 16));
		center.setBounds(758, 41, 262, 32);
		
		panel_3.add(center);
			center.addItem("Select Center");
			center.addItem("Malabe");
			center.addItem("Kandy");
			center.addItem("Kurunegala");
			center.addItem("Mathara ");
		
		JComboBox building = new JComboBox();
		building.setFont(new Font("Tahoma", Font.PLAIN, 16));
		building.setBounds(758, 92, 262, 32);
		
		panel_3.add(building);
			building.addItem("Select A Building");
			building.addItem("New Building");
			building.addItem("Main Building");
		
		JComboBox Level = new JComboBox();
		Level.setBounds(758, 149, 262, 32);
		Level.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_3.add(Level);
			Level.addItem("Select Level");
			Level.addItem("1");
			Level.addItem("2");
			Level.addItem("3");
			Level.addItem("4");
			Level.addItem("5");
			Level.addItem("6");
		
		JButton btnGenerateRank = new JButton("Generate Rank");
		btnGenerateRank.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGenerateRank.setBounds(577, 209, 139, 40);
		panel_3.add(btnGenerateRank);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Active Hours");
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_2_1.setBounds(12, 265, 281, 25);
		panel_3.add(lblNewLabel_2_1_2_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(276, 258, 262, 40);
		panel_3.add(textField_2);
		
		JLabel lblNewLabel_2_1_3_2_1 = new JLabel("LID");
		lblNewLabel_2_1_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_3_2_1.setBounds(588, 265, 128, 25);
		panel_3.add(lblNewLabel_2_1_3_2_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(758, 258, 262, 40);
		panel_3.add(textField_3);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = DBConnect.connect();
					
					String query="Update lecturers set lectureName='"+textField.getText()+"',empID='"+textField_1.getText()+"',faculty='"+facultyNames.getSelectedItem()+"',department='"+depname.getSelectedItem()+"',centre='"+center.getSelectedItem()+"',building='"+building.getSelectedItem()+"',level='"+Level.getSelectedItem()+"',rank='"+textField_5.getText()+"' where lid='"+textField_3.getText()+"' ";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBounds(1183, 167, 139, 50);
		frmAddStudentGroups.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = DBConnect.connect();
					String query="Delete from lecturers where lid='"+textField_3.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted");
					pst.close();
					
					}
					catch(Exception ex) {
						ex.printStackTrace();
						
					}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(1183, 223, 139, 50);
		frmAddStudentGroups.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(1183, 277, 139, 50);
		frmAddStudentGroups.getContentPane().add(btnClear);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = DBConnect.connect();
					
					String query="select * from lecturers ";
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
		btnRefresh.setBounds(1183, 327, 139, 50);
		frmAddStudentGroups.getContentPane().add(btnRefresh);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(804, 177, -508, 150);
		frmAddStudentGroups.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(272, 164, 905, 210);
		frmAddStudentGroups.getContentPane().add(scrollPane_1);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int selectedRow=table.getSelectedRow();
				
				textField.setText(table.getValueAt(selectedRow, 1).toString());
				textField_1.setText(table.getValueAt(selectedRow, 2).toString());
				//textField_2.setText(table.getValueAt(selectedRow, 10).toString());
				textField_5.setText(table.getValueAt(selectedRow, 8).toString());
				textField_3.setText(table.getValueAt(selectedRow, 0).toString());
				
				
				String combofaculty = table.getValueAt(selectedRow, 3).toString();
				for(int i=0; i<facultyNames.getItemCount();i++) {
					if(facultyNames.getItemAt(i).toString().equalsIgnoreCase(combofaculty)) {
						facultyNames.setSelectedIndex(i);
					}
				}
				
				
				String comboDepartment = table.getValueAt(selectedRow, 4).toString();
				for(int i=0; i<depname.getItemCount();i++) {
					if(depname.getItemAt(i).toString().equalsIgnoreCase(comboDepartment)) {
						depname.setSelectedIndex(i);
					}
				}
				
				
				String comboCenter = table.getValueAt(selectedRow, 5).toString();
				for(int i=0; i<center.getItemCount();i++) {
					if(center.getItemAt(i).toString().equalsIgnoreCase(comboCenter)) {
						center.setSelectedIndex(i);
					}
				}
				
				
				String comboBuilding = table.getValueAt(selectedRow, 6).toString();
				for(int i=0; i<building.getItemCount();i++) {
					if(building.getItemAt(i).toString().equalsIgnoreCase(comboBuilding)) {
						building.setSelectedIndex(i);
					}
				}
				
				
				String comboLevel = table.getValueAt(selectedRow, 7).toString();
				for(int i=0; i<Level.getItemCount();i++) {
					if(Level.getItemAt(i).toString().equalsIgnoreCase(comboLevel)) {
						Level.setSelectedIndex(i);
					}
				}
				
				/*String checkdaymon=table.getValueAt(selectedRow, 2).toString();
				String checkdaytues=table.getValueAt(selectedRow, 3).toString();
				String checkdayWed=table.getValueAt(selectedRow, 4).toString();
				String checkdayThur=table.getValueAt(selectedRow, 5).toString();
				String checkdayFri=table.getValueAt(selectedRow, 6).toString();
				String checkdaySat=table.getValueAt(selectedRow, 7).toString();
				
				String checkdaySun=table.getValueAt(selectedRow, 8).toString();*/
				
				
			}
		});
		scrollPane_1.setViewportView(table);
	 
	    
	}
}
