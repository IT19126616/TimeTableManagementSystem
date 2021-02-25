package Member4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ManageSessionRooms {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageSessionRooms window = new ManageSessionRooms();
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
	public ManageSessionRooms() {
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
		
		JLabel lblNewLabel = new JLabel("MANAGE SESSION ROOMS");
		lblNewLabel.setBounds(122, 60, 408, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Session ");
		lblNewLabel_1.setBounds(52, 176, 156, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnMSRConsecutive = new JRadioButton("Consecutive Session");
		rdbtnMSRConsecutive.setBounds(52, 225, 156, 20);
		frame.getContentPane().add(rdbtnMSRConsecutive);
		
		JRadioButton rdbtnMSRParallel = new JRadioButton("Parallel Session");
		rdbtnMSRParallel.setBounds(52, 265, 103, 21);
		frame.getContentPane().add(rdbtnMSRParallel);
		
		JRadioButton rdbtnMSRNonOverlapping = new JRadioButton("Non Overlappin Sessions");
		rdbtnMSRNonOverlapping.setBounds(52, 310, 175, 20);
		frame.getContentPane().add(rdbtnMSRNonOverlapping);
		
		JLabel lblNewLabel_2 = new JLabel("Select Room");
		lblNewLabel_2.setBounds(376, 184, 103, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(476, 180, 115, 21);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Selected Session is Viewd Here : ");
		lblNewLabel_3.setBounds(701, 184, 156, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(701, 226, 156, 77);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnMSRSubmit = new JButton("Submit");
		btnMSRSubmit.setBounds(241, 508, 85, 21);
		frame.getContentPane().add(btnMSRSubmit);
		
		JButton btnMSRClear = new JButton("Clear");
		btnMSRClear.setBounds(394, 508, 85, 21);
		frame.getContentPane().add(btnMSRClear);
	}
}
