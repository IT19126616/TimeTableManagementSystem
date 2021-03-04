package MemberTwo;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import dbConnect.DBConnect;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddLecture {

	JFrame frmAddStudentGroups;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox facultyNames;
	private JComboBox depname;
	private JComboBox center;
	private JComboBox building;
	private JComboBox Level;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddLecture window = new AddLecture();
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
	public AddLecture() {
		initialize();
		
	
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentGroups = new JFrame();
		frmAddStudentGroups.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmAddStudentGroups.setBackground(Color.YELLOW);
		frmAddStudentGroups.setResizable(false);
		frmAddStudentGroups.setTitle("Add Lecturer");
		//frmAddStudentGroups.setBounds(350, 90, 1350, 900);
		
		frmAddStudentGroups.setSize(1500, 2000);
		 
		
		
		frmAddStudentGroups.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentGroups.getContentPane().setLayout(null);
		
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
		panel_1.setBounds(0, 78, 262, 787);
		panel_1.setBackground(Color.BLACK);
		frmAddStudentGroups.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Lecturer");
		btnNewButton.setBounds(12, 320, 252, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnManageGroups = new JButton("Manage Lecturer\r\n");
		btnManageGroups.setBounds(12, 383, 238, 50);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setBounds(12, 724, 238, 50);
		btnViewGroups_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Add Lecturer");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frmAddStudentGroups.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Lecturer Name");
		lblNewLabel_2.setBounds(274, 268, 252, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(538, 261, 262, 40);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Employee ID");
		lblNewLabel_2_1.setBounds(274, 354, 252, 25);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(538, 347, 262, 40);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		frmAddStudentGroups.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Faculty");
		lblNewLabel_2_1_1.setBounds(274, 455, 281, 25);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Department");
		lblNewLabel_2_1_2.setBounds(274, 554, 281, 25);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Center");
		lblNewLabel_2_1_3.setBounds(845, 268, 128, 25);
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 688, 1082, 94);
		panel_3.setBackground(Color.LIGHT_GRAY);
		frmAddStudentGroups.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(264, 11, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String lectureName=textField.getText();
				String EmpID=textField_1.getText();
				String ActiveHours=textField_3.getText();
				String Rank=textField_2.getText();
				
				String Faculty=(String) facultyNames.getSelectedItem();
				String Department=(String) depname.getSelectedItem();
				String Center=(String) center.getSelectedItem();
				String Building=(String) building.getSelectedItem();
				String level=(String) Level.getSelectedItem();
				
				
				
				
				try {

			
					
					
					 Connection con = DBConnect.connect();

	                    String query = "INSERT INTO lecturers values(null, '" + lectureName + "','" + EmpID + "','" + Faculty + "','" +
	                    		Department + "','" + Center + "','" + Building + "','"+ level +"','"+ Rank +"')";

	                  Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                   if (x == 0) {
	                        JOptionPane.showMessageDialog(btnSave, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnSave,"Lecturer details successfully added!");
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                	
	                }
			}
		});
		btnSave.setBounds(512, 11, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnGenerateRank = new JButton("Generate Rank");
		btnGenerateRank.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGenerateRank.setBounds(760, 11, 238, 50);
		panel_3.add(btnGenerateRank);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Building");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_4.setBounds(845, 354, 252, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Level");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_5.setBounds(845, 455, 252, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("Rank\r\n");
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_6.setBounds(845, 554, 252, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_6);
		
		 facultyNames = new JComboBox();
		facultyNames.setFont(new Font("Tahoma", Font.PLAIN, 15));
		facultyNames.setBounds(538, 451, 260, 40);
		frmAddStudentGroups.getContentPane().add(facultyNames);
			facultyNames.addItem("Select Faculty");
			facultyNames.addItem("Faculty of Computing");
			facultyNames.addItem("Faculty of Business");
			facultyNames.addItem("Faculty of Engineering");
			facultyNames.addItem("Faculty of Humanities & Sciences ");
		
		 depname = new JComboBox();
		depname.setBounds(540, 550, 260, 40);
		depname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmAddStudentGroups.getContentPane().add(depname);
			depname.addItem("Select Department");
			depname.addItem("Department of Information Technology");
			depname.addItem("Department of Computer Systems Engineering");
			depname.addItem("Department of Computer Science & Software Engineering");
			depname.addItem("Department of Business IT ");
		
		 center = new JComboBox();
		center.setBounds(1007, 261, 260, 40);
		center.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmAddStudentGroups.getContentPane().add(center);
			center.addItem("Select Center");
			center.addItem("Malabe");
			center.addItem("Kandy");
			center.addItem("Kurunegala");
			center.addItem("Mathara ");
		
		 building = new JComboBox();
		building.setBounds(1007, 350, 260, 40);
		building.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmAddStudentGroups.getContentPane().add(building);
			building.addItem("Select A Building");
			building.addItem("New Building");
			building.addItem("Main Building");
		
		
		 Level = new JComboBox();
		Level.setBounds(1007, 451, 260, 40);
		building.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmAddStudentGroups.getContentPane().add(Level);
		Level.addItem("Select Level");
		Level.addItem("1");
		Level.addItem("2");
		Level.addItem("3");
		Level.addItem("4");
		Level.addItem("5");
		Level.addItem("6");
		
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(1007, 547, 262, 40);
		frmAddStudentGroups.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Active Hours");
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_2_1.setBounds(274, 637, 281, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_2_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(538, 622, 262, 40);
		frmAddStudentGroups.getContentPane().add(textField_3);
	 
	    
	}
}
