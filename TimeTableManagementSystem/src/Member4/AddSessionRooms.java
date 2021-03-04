package Member4;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JComboBox;

public class AddSessionRooms {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSessionRooms window = new AddSessionRooms();
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
	public AddSessionRooms() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBackground(Color.YELLOW);
		frame.setTitle("Add Location");		

		// frame.setSize(1400, 2200);
		frame.setBounds(100, 40, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	//	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

	
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setForeground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 757);
		panel_1.setBackground(Color.BLACK);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAddLocation = new JButton("Add Location");
		btnAddLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddLocation al = new AddLocation();
				AddLocation.main(null);
				frame.setVisible(false);

			}
		});
		btnAddLocation.setBounds(12, 320, 238, 50);
		btnAddLocation.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnAddLocation);
		
		JButton btnManageLocation = new JButton("Manage Location");
		btnManageLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageLocations ml = new ManageLocations();
				ManageLocations.main(null);
				frame.setVisible(false);	
			}
		});
		btnManageLocation.setBounds(12, 383, 238, 50);
		btnManageLocation.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnManageLocation);
		
		JButton btnAddSessionRooms = new JButton("Add Session Rooms");
		btnAddSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddSessionRooms.setBounds(12, 446, 252, 50);
		btnAddSessionRooms.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnAddSessionRooms);
		
		JButton btnManageSessionRooms = new JButton("Manage Session Rooms");
		btnManageSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRooms msr = new ViewRooms();
				ViewRooms.main(null);
				frame.setVisible(false);
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
				frame.setVisible(false);
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
		
	
		JLabel lblNewLabel_1 = new JLabel("Add Session for Rooms");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Select Session");
		lblNewLabel_2.setBounds(274, 268, 163, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Select Room");
		lblNewLabel_2_1.setBounds(272, 470, 134, 25);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnClear = new JButton("Submit");
		btnClear.setBounds(268, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnSave = new JButton("Clear");
		btnSave.setBounds(518, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(499, 462, 262, 33);
		frame.getContentPane().add(comboBox);
		
		JRadioButton rdbtnMSR = new JRadioButton("Consecutive Sessions");
		rdbtnMSR.setBounds(467, 274, 273, 33);
		rdbtnMSR.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(rdbtnMSR);
		
		JRadioButton rdbtnParallelSessions = new JRadioButton("Parrallel Sessions");
		rdbtnParallelSessions.setBounds(786, 274, 255, 33);
		rdbtnParallelSessions.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(rdbtnParallelSessions);
		
		JRadioButton rdbtnNonOverlapping = new JRadioButton("Non Overlapping");
		rdbtnNonOverlapping.setBounds(1070, 268, 207, 37);
		rdbtnNonOverlapping.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(rdbtnNonOverlapping);
		
		
	}	
}