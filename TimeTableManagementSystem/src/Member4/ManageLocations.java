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
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.table.DefaultTableModel;

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import javax.swing.border.CompoundBorder;

public class ManageLocations {

	private JFrame frameManageLocation;
	private JTextField txtMLBuildingName;
	private JTextField txtMLRoomName;
	private JTextField txtMLCapacity;
	private JTable table;
	private JTextField LocID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageLocations window = new ManageLocations();
					window.frameManageLocation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageLocations() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameManageLocation = new JFrame();
		frameManageLocation.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frameManageLocation.setBackground(Color.YELLOW);
		frameManageLocation.setResizable(false);
		frameManageLocation.setTitle("Manage Location");
		frameManageLocation.setBounds(100, 40, 1350, 900);
		frameManageLocation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameManageLocation.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frameManageLocation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setForeground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 787);
		panel_1.setBackground(Color.BLACK);
		frameManageLocation.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Location");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddLocation al = new AddLocation();
				AddLocation.main(null);
				frameManageLocation.setVisible(false);

			}
		});
		btnNewButton.setBounds(12, 320, 238, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnAddSessionRooms = new JButton("Add Session Rooms");
		btnAddSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSessionRooms ar = new AddSessionRooms();
				AddSessionRooms.main(null);
				frameManageLocation.setVisible(false);	
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
				frameManageLocation.setVisible(false);
			}
		});
		btnManageSessionRooms.setBounds(10, 520, 240, 50);
		btnManageSessionRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.add(btnManageSessionRooms);
		
		JButton btnManageGroups = new JButton("Manage Location");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnManageGroups.setBounds(12, 383, 252, 50);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main4 back = new Main4();
				Main4.main(null);
				frameManageLocation.setVisible(false);
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
		
		JLabel lblNewLabel_1 = new JLabel("Manage Location");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frameManageLocation.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frameManageLocation.getContentPane().add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(272, 592, 1060, 260);
		panel_3.setBackground(Color.LIGHT_GRAY);
		frameManageLocation.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Building Name");
		lblNewLabel_2.setBounds(12, 35, 164, 25);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
	
		
		JLabel lblNewLabel_2_1 = new JLabel("Room Name");
		lblNewLabel_2_1.setBounds(12, 109, 149, 25);
		panel_3.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
	
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Room Type");
		lblNewLabel_2_1_1.setBounds(523, 35, 122, 25);
		panel_3.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Capacity");
		lblNewLabel_2_1_2.setBounds(527, 109, 102, 25);
		panel_3.add(lblNewLabel_2_1_2);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JRadioButton rdbtnMLLectureHall = new JRadioButton("Lecture Hall");
		rdbtnMLLectureHall.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnMLLectureHall.setBounds(662, 29, 183, 36);
		panel_3.add(rdbtnMLLectureHall);
		
		JRadioButton rdbtnMLLab = new JRadioButton("Laboratory");
		rdbtnMLLab.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnMLLab.setBounds(856, 29, 183, 36);
		panel_3.add(rdbtnMLLab);
		
		txtMLBuildingName = new JTextField();
		txtMLBuildingName.setBounds(186, 29, 218, 36);
		txtMLBuildingName.setFont(new Font("Tahoma", Font.BOLD, 20));		
		txtMLBuildingName.setColumns(10);
		panel_3.add(txtMLBuildingName);
		txtMLBuildingName.setColumns(10);
		
		txtMLRoomName = new JTextField();
		txtMLRoomName.setBounds(186, 99, 218, 36);
		txtMLRoomName.setFont(new Font("Tahoma", Font.BOLD, 20));		
		panel_3.add(txtMLRoomName);
		txtMLRoomName.setColumns(10);
		
		txtMLCapacity = new JTextField();
		txtMLCapacity.setBounds(662, 99, 197, 36);
		txtMLCapacity.setFont(new Font("Tahoma", Font.BOLD, 20));		
		panel_3.add(txtMLCapacity);
		txtMLCapacity.setColumns(10);
		
		LocID = new JTextField();
		LocID.setEnabled(false);
		LocID.setEditable(false);
		LocID.setBackground(Color.WHITE);
		LocID.setBounds(186, 175, 96, 19);
		panel_3.add(LocID);
		LocID.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaption);
		panel_4.setBounds(274, 167, 899, 417);
		frameManageLocation.getContentPane().add(panel_4);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new CompoundBorder());
		scrollPane.setBounds(274, 167, 899, 417);
	//	frameManageLocation.getContentPane().add(scrollPane);
		table = new JTable();
	
		//Table Selection
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int selectedRow=table.getSelectedRow();		
				LocID.setText(table.getValueAt(selectedRow, 0).toString());
				txtMLBuildingName.setText(table.getValueAt(selectedRow, 1).toString());
				txtMLRoomName.setText(table.getValueAt(selectedRow, 2).toString());
				txtMLCapacity.setText(table.getValueAt(selectedRow, 4).toString());
			
			}
		});
		
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"LocationID", "Building Name", "Room Name", "Type", "Capacity"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, Object.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				 false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		panel_4.add(scrollPane);
		
		
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bName= txtMLBuildingName.getText();
				String rName= txtMLRoomName.getText();
				String cap = txtMLCapacity.getText();
				
				
				if(txtMLBuildingName.getText().equals("")||txtMLRoomName.getText().equals("") ||txtMLCapacity.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill the form");			
				}else {
					//Query to connect db
					int i=table.getSelectedRow();
					DefaultTableModel model=(DefaultTableModel)table.getModel();
					
					if(i>=1) {
						model.setValueAt( LocID.getText() , i, 1);
					}
					else {
						JOptionPane.showMessageDialog(null, "Error!!!");
					}
					
					//Query to connect db
					try {
						Connection con = DBConnect.connect();

/* PreparedStatement ps = null;
    try {
					Connection con = DBConnect.connect();
					
					String query="Update main set noOfWorkingDays='"+textField.getText()+"',monday='"+chckbxNewCheckBox.getText()+"',tuesday='"+chckbxTuesday.getText()+"',wednesday='"+chckbxWednesday.getText()+"',thursday='"+chckbxThursday.getText()+"',friday='"+chckbxFriday.getText()+"',saturday='"+chckbxSaturday.getText()+"',sunday='"+chckbxSunday.getText()+"',hours='"+textField_1.getText()+"',minutes='"+textField_2.getText()+"' where mid='"+textField_3.getText()+"' ";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
      }*/		

						String query="Update location set buildingName='"+txtMLBuildingName.getText()+"', roomName='"+txtMLRoomName.getText()+"',type='"+txtMLRoomName.getText()+"',capacity='"+txtMLCapacity.getText()+"' where locationID='"+LocID.getText()+"' ";
						PreparedStatement pst=con.prepareStatement(query);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Data Updated");
						pst.close();
						
					}
					catch(Exception updateTable) {
						updateTable.printStackTrace();
					}
						
						
						
					
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBounds(1185, 245, 139, 50);
		frameManageLocation.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = DBConnect.connect();
					String query="Delete from location where locationID='"+LocID.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
					pst.close();
					
					}
					catch(Exception deleteRecord) {
						deleteRecord.printStackTrace();
						
					}
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(1185, 304, 139, 50);
		frameManageLocation.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMLBuildingName.setText("");
				txtMLRoomName.setText("");
				txtMLCapacity.setText("");	
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(1185, 367, 139, 50);
		frameManageLocation.getContentPane().add(btnClear);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = DBConnect.connect();
					
					String query="select * from location ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception loadTable) {
					loadTable.printStackTrace();
				}
			}
		});
		btnRefresh.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnRefresh.setBounds(1191, 212, 85, 21);
		frameManageLocation.getContentPane().add(btnRefresh);
	 
	    
	}
}