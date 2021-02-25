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
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
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
		btnManageLocation.setBounds(12, 383, 238, 50);
		btnManageLocation.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnManageLocation);
		
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
		
		JButton btnViewGroups_1 = new JButton("<<Back");
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
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(268, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(518, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		
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
		
		
	}	
}