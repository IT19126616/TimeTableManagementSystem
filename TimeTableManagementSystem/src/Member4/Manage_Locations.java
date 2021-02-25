package Member4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Manage_Locations {

	private JFrame frame;
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
					Manage_Locations window = new Manage_Locations();
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
	public Manage_Locations() {
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
		
		JButton btnMLUpdate = new JButton("Update");
		btnMLUpdate.setBounds(846, 81, 85, 21);
		frame.getContentPane().add(btnMLUpdate);
		
		JButton btnMLDelete = new JButton("Delete");
		btnMLDelete.setBounds(846, 158, 85, 21);
		frame.getContentPane().add(btnMLDelete);
		
		JButton btnMLClear = new JButton("Clear");
		btnMLClear.setBounds(846, 237, 85, 21);
		frame.getContentPane().add(btnMLClear);
		
		JLabel lblNewLabel = new JLabel("Building Name ");
		lblNewLabel.setBounds(66, 524, 222, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Room Name");
		lblNewLabel_1.setBounds(66, 588, 94, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Room Type");
		lblNewLabel_2.setBounds(66, 647, 112, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Capacity");
		lblNewLabel_3.setBounds(66, 718, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtMLBuildingName = new JTextField();
		txtMLBuildingName.setBounds(206, 521, 96, 19);
		frame.getContentPane().add(txtMLBuildingName);
		txtMLBuildingName.setColumns(10);
		
		txtMLRoomName = new JTextField();
		txtMLRoomName.setText("");
		txtMLRoomName.setBounds(206, 585, 96, 19);
		frame.getContentPane().add(txtMLRoomName);
		txtMLRoomName.setColumns(10);
		
		txtMLCapacity = new JTextField();
		txtMLCapacity.setBounds(206, 715, 96, 19);
		frame.getContentPane().add(txtMLCapacity);
		txtMLCapacity.setColumns(10);
		
		JRadioButton rdbtnMLLectureHall = new JRadioButton("LectureHall");
		rdbtnMLLectureHall.setBounds(199, 647, 103, 21);
		frame.getContentPane().add(rdbtnMLLectureHall);
		
		JRadioButton rdbtnMLLab = new JRadioButton("Laboratory");
		rdbtnMLLab.setBounds(366, 647, 103, 21);
		frame.getContentPane().add(rdbtnMLLab);
	}

}
