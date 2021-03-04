package Member4;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddLocation {

	private JFrame frameAddLocation;
	
	private JTextField txtBuildingName;
	private JTextField txtRoomName;
	private JTextField txtCapacity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddLocation window = new AddLocation();
					window.frameAddLocation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddLocation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAddLocation = new JFrame();
		frameAddLocation.setResizable(false);
		frameAddLocation.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frameAddLocation.setBackground(Color.YELLOW);
		frameAddLocation.setTitle("Add Location");		

		frameAddLocation.setBounds(100, 40, 1350, 900);
		frameAddLocation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAddLocation.getContentPane().setLayout(null);
		
	
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frameAddLocation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setForeground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 757);
		panel_1.setBackground(Color.BLACK);
		frameAddLocation.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAddLocation = new JButton("Add Location");
		btnAddLocation.setBounds(12, 320, 252, 50);
		btnAddLocation.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnAddLocation);
		
		JButton btnManageLocation = new JButton("Manage Location");
		btnManageLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageLocations ml = new ManageLocations();
				ManageLocations.main(null);
				frameAddLocation.setVisible(false);	
			}
		});
		btnManageLocation.setBounds(12, 383, 238, 50);
		btnManageLocation.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnManageLocation);
		
		JButton btnAddSessionRooms = new JButton("Add Session Rooms");
		btnAddSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSessionRooms ar = new AddSessionRooms();
				AddSessionRooms.main(null);
				frameAddLocation.setVisible(false);	
			}
		});
		btnAddSessionRooms.setBounds(12, 446, 238, 50);
		btnAddSessionRooms.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnAddSessionRooms);
		
		JButton btnManageSessionRooms = new JButton("Manage Session Rooms");
		btnManageSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRooms msr = new ViewRooms();
				ViewRooms.main(null);
				frameAddLocation.setVisible(false);
			}
		});
		btnManageSessionRooms.setBounds(10, 520, 240, 50);
		btnManageSessionRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.add(btnManageSessionRooms);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main4 back = new Main4();
				Main4.main(null);
				frameAddLocation.setVisible(false);
			}
		});
		btnViewGroups_1.setBounds(12, 616, 238, 50);
		btnViewGroups_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
	
		JLabel lblNewLabel_1 = new JLabel("Add Location");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frameAddLocation.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frameAddLocation.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Building Name");
		lblNewLabel_2.setBounds(274, 268, 252, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2);
		
		txtBuildingName = new JTextField();
		txtBuildingName.setBounds(538, 261, 262, 40);
		txtBuildingName.setFont(new Font("Tahoma", Font.BOLD, 20));		
		frameAddLocation.getContentPane().add(txtBuildingName);
		txtBuildingName.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Room Name");
		lblNewLabel_2_1.setBounds(274, 354, 252, 25);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2_1);
		
		txtRoomName = new JTextField();
		txtRoomName.setBounds(538, 347, 262, 40);
		txtRoomName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtRoomName.setColumns(10);
		frameAddLocation.getContentPane().add(txtRoomName);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Room Type");
		lblNewLabel_2_1_1.setBounds(274, 455, 281, 25);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Capacity");
		lblNewLabel_2_1_2.setBounds(274, 554, 281, 25);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(Color.LIGHT_GRAY);
		frameAddLocation.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		txtCapacity = new JTextField();
		txtCapacity.setBounds(538, 547, 258, 40);
		frameAddLocation.getContentPane().add(txtCapacity);
		txtCapacity.setColumns(10);
		
		JRadioButton rdbtnLectureHall = new JRadioButton("Lecture Hall");
		rdbtnLectureHall.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnLectureHall.setBounds(538, 436, 290, 33);
		frameAddLocation.getContentPane().add(rdbtnLectureHall);
		
		JRadioButton rdbtnLab = new JRadioButton("Laboratory");
		rdbtnLab.setBounds(538, 482, 290, 40);
		rdbtnLab.setFont(new Font("Tahoma", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(rdbtnLab);
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBuildingName.setText("");
				txtRoomName.setText("");
				txtCapacity.setText("");		
			}
		});
		btnClear.setBounds(268, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//validations
	
				String bName= txtBuildingName.getText();
				String rName= txtRoomName.getText();
				String cap = txtCapacity.getText();
				
				if(txtBuildingName.getText().equals("")||txtRoomName.getText().equals("") ||txtCapacity.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill the form");			
				}else {
					//Values to variables
				
					String buildingName = txtBuildingName.getText();
					String roomName = txtRoomName.getText();
					String type = null;
					int capacity =  Integer.parseInt(txtCapacity.getText());

					if(capacity > 120 ) {
						capacity = 0;
						JOptionPane.showMessageDialog(null, "Maximum Capacity is 120");			
					}else if(capacity< 0) {
						capacity = 0;
						JOptionPane.showMessageDialog(null, "Capacity Should not be 0. Please enter a valid capacity");		
						
					}else {
						try {
							
							
						}catch(NumberFormatException nuEx) {
							JOptionPane.showMessageDialog(null, "Please enter a number to capacity");			
							System.out.println("Please enter a number to capacity");
						}
					
						 // If condition to check if jRadioButton2 is selected. 
		                if (rdbtnLectureHall.isSelected()) { 
		                	type = "LectureHall";
		                } 
		  
		                else if (rdbtnLab.isSelected()) { 
		                    type = "Laboratory"; 
		                } 
		                else { 
		                	JOptionPane.showMessageDialog(panel, "Please select a Type", "Warning",JOptionPane.WARNING_MESSAGE);
		                } 
						
						//Query to connect db
						try {
							Connection con = DBConnect.connect();


		                    String query = "INSERT INTO location values(null,'" +buildingName + "','" + roomName + "','" + type + "','"+ capacity +"')";
		                    Statement sta = con.createStatement();
		                    sta.executeUpdate(query);
							JOptionPane.showMessageDialog(null, "Data inserted Successfully");		
		                    con.close();
		                    
						}catch(Exception insertDB) {
							insertDB.printStackTrace();
						}
						
					}
					
					
					
					
				}
				
			}
		});
		btnSave.setBounds(518, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		
	}	
}