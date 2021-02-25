package Member4;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class ManageLocations {

	private JFrame frameManageLocation;
	private JTextField txtMLBuildingName;
	private JTextField txtMLRoomName;
	private JTextField txtMLCapacity;

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
			}
		});
		btnNewButton.setBounds(12, 320, 238, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnAddSessionRooms = new JButton("Add Session Rooms");
		btnAddSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddSessionRooms.setBounds(12, 446, 238, 50);
		btnAddSessionRooms.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnAddSessionRooms);
		
		JButton btnManageSessionRooms = new JButton("Manage Session Rooms");
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
		panel_3.add(txtMLRoomName);
		txtMLRoomName.setColumns(10);
		
		txtMLCapacity = new JTextField();
		txtMLCapacity.setBounds(662, 99, 197, 36);
		panel_3.add(txtMLCapacity);
		txtMLCapacity.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaption);
		panel_4.setBounds(274, 167, 899, 417);
		frameManageLocation.getContentPane().add(panel_4);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBounds(1185, 245, 139, 50);
		frameManageLocation.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(1185, 304, 139, 50);
		frameManageLocation.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(1185, 367, 139, 50);
		frameManageLocation.getContentPane().add(btnClear);
	 
	    
	}
}