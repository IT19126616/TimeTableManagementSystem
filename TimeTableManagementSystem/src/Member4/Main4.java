package Member4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main4 window = new Main4();
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
	public Main4() {
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
		
		JButton btnAddLocation = new JButton("Add Location");
		btnAddLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddLocation al = new AddLocation();
				AddLocation.main(null);
				frame.setVisible(false);
			}
		});
		btnAddLocation.setBounds(95, 31, 269, 33);
		frame.getContentPane().add(btnAddLocation);
		
		JButton btnManageLocation = new JButton("Manage Location");
		btnManageLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageLocations ml = new ManageLocations();
				ManageLocations.main(null);
				frame.setVisible(false);	
			}
		});
		btnManageLocation.setBounds(95, 113, 269, 33);
		frame.getContentPane().add(btnManageLocation);
		
		JButton btnAddSessionRooms = new JButton("Add Session Rooms");
		btnAddSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSessionRooms ar = new AddSessionRooms();
				AddSessionRooms.main(null);
				frame.setVisible(false);	
			}
		});
		btnAddSessionRooms.setBounds(95, 210, 269, 33);
		frame.getContentPane().add(btnAddSessionRooms);
		
		JButton btnManageSessionRooms = new JButton("Manage Session Rooms");
		btnManageSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRooms msr = new ViewRooms();
				ViewRooms.main(null);
				frame.setVisible(false);
			}
		});
		btnManageSessionRooms.setBounds(105, 309, 259, 33);
		frame.getContentPane().add(btnManageSessionRooms);
	}
}
