package Member4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Add_Locations {

	private JFrame frame;
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
					Add_Locations window = new Add_Locations();
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
	public Add_Locations() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(350, 90, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Rooms Building wise,");
		lblNewLabel.setBounds(30, 106, 156, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ADD LOCATION");
		lblNewLabel_1.setBounds(208, 10, 281, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Building Name : ");
		lblNewLabel_2.setBounds(30, 164, 156, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Room Name :");
		lblNewLabel_3.setBounds(30, 219, 139, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Room Type : ");
		lblNewLabel_4.setBounds(30, 277, 85, 19);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Capacity : ");
		lblNewLabel_5.setBounds(30, 331, 85, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnManageSessions = new JButton("Manage Sessions");
		btnManageSessions.setBounds(137, 606, 196, 26);
		frame.getContentPane().add(btnManageSessions);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(371, 609, 85, 21);
		frame.getContentPane().add(btnClear);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(502, 609, 85, 21);
		frame.getContentPane().add(btnSave);
		
		txtBuildingName = new JTextField();
		txtBuildingName.setBounds(137, 168, 96, 19);
		frame.getContentPane().add(txtBuildingName);
		txtBuildingName.setColumns(10);
		
		txtRoomName = new JTextField();
		txtRoomName.setBounds(137, 219, 96, 19);
		frame.getContentPane().add(txtRoomName);
		txtRoomName.setColumns(10);
		
		txtCapacity = new JTextField();
		txtCapacity.setBounds(137, 328, 96, 19);
		frame.getContentPane().add(txtCapacity);
		txtCapacity.setColumns(10);
		
		JRadioButton rdbtnLectureHall = new JRadioButton("Lecture Hall");
		rdbtnLectureHall.setBounds(141, 276, 103, 21);
		frame.getContentPane().add(rdbtnLectureHall);
		
		JRadioButton rdbtnLab = new JRadioButton("Laboratory");
		rdbtnLab.setBounds(257, 276, 103, 21);
		frame.getContentPane().add(rdbtnLab);
	}
}
