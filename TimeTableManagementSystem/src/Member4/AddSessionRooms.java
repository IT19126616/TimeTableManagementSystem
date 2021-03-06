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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class AddSessionRooms {

	private JFrame frame;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
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
		frame.getContentPane().setBackground(new Color(21,25,28));
		frame.setBackground(Color.YELLOW);
		frame.setTitle("Add Session Rooms");		

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
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(152, 201, 45));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 757);
		panel_1.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAddLocation = new JButton("Add Session Rooms");
		btnAddLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddLocation al = new AddLocation();
				try {
					AddLocation.main(null);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setVisible(false);

			}
		});
		btnAddLocation.setBounds(12, 320, 238, 50);
		btnAddLocation.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnAddLocation);
		btnAddLocation.setForeground(new Color(21, 25, 28));
		btnAddLocation.setBackground(new Color(152, 201, 45));
		
		JButton btnManageLocation = new JButton("Manage Location");
		btnManageLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageLocations ml = new ManageLocations();
				try {
					ManageLocations.main(null);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setVisible(false);	
			}
		});
		btnManageLocation.setBounds(12, 383, 238, 50);
		btnManageLocation.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnManageLocation);
		btnManageLocation.setForeground(new Color(21, 25, 28));
		btnManageLocation.setBackground(new Color(152, 201, 45));
		
		JButton btnAddSessionRooms = new JButton("Add Session Rooms");
		btnAddSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddSessionRooms.setBounds(12, 446, 252, 50);
		btnAddSessionRooms.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnAddSessionRooms);
		btnAddSessionRooms.setForeground(new Color(21, 25, 28));
		btnAddSessionRooms.setBackground(new Color(152, 201, 45));
		
		JButton btnManageSessionRooms = new JButton("Manage Session Rooms");
		btnManageSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRooms msr = new ViewRooms();
				try {
					ViewRooms.main(null);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setVisible(false);
			}
		});
		btnManageSessionRooms.setBounds(10, 520, 240, 50);
		btnManageSessionRooms.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnManageSessionRooms);
		btnManageSessionRooms.setForeground(new Color(21, 25, 28));
		btnManageSessionRooms.setBackground(new Color(152, 201, 45));
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main4 back = new Main4();
				Main4.main(null);
				frame.setVisible(false);
			}
		});
		btnViewGroups_1.setBounds(12, 616, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
	
		JLabel lblNewLabel_1 = new JLabel("Add Session for Rooms");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(Color.WHITE);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Select Session");
		lblNewLabel_2.setBounds(274, 268, 163, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(152, 201, 45));
		
		JLabel lblNewLabel_2_1 = new JLabel("Select Room");
		lblNewLabel_2_1.setBounds(272, 501, 134, 25);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(152, 201, 45));

		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton rdbtnMSR = new JRadioButton("Consecutive Sessions");
		rdbtnMSR.setBackground(new Color(51, 51, 51));
		rdbtnMSR.setBounds(466, 274, 273, 33);
		rdbtnMSR.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(rdbtnMSR);
		rdbtnMSR.setForeground(new Color(152, 201, 45));
		rdbtnMSR.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JRadioButton rdbtnParallelSessions = new JRadioButton("Parrallel Sessions");
		rdbtnParallelSessions.setBackground(new Color(51, 51, 51));
		rdbtnParallelSessions.setBounds(758, 274, 255, 33);
		rdbtnParallelSessions.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(rdbtnParallelSessions);
		rdbtnParallelSessions.setForeground(new Color(152, 201, 45));
		rdbtnParallelSessions.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JRadioButton rdbtnNonOverlapping = new JRadioButton("Non Overlapping");
		rdbtnNonOverlapping.setBackground(new Color(51, 51, 51));
		rdbtnNonOverlapping.setBounds(1040, 272, 207, 37);
		rdbtnNonOverlapping.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(rdbtnNonOverlapping);
		rdbtnNonOverlapping.setForeground(new Color(152, 201, 45));
		rdbtnNonOverlapping.setBorder(new LineBorder(new Color(169, 224, 49), 3));

		//disabling radio buttons
		rdbtnParallelSessions.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				rdbtnMSR.setSelected(false);
				rdbtnNonOverlapping.setSelected(false);

		 //   	rdbtnMSR.setEnabled(false);
         //   	rdbtnNonOverlapping.setEnabled(false);

		    }
		});
		
		rdbtnNonOverlapping.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				rdbtnMSR.setSelected(false);
		    	rdbtnParallelSessions.setSelected(false);

		 //   	rdbtnParallelSessions.setEnabled(false);
		 //   	rdbtnMSR.setEnabled(false);

		    }
		});
		
		rdbtnMSR.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	rdbtnParallelSessions.setSelected(false);
		    	rdbtnNonOverlapping.setSelected(false);

		  //  	rdbtnParallelSessions.setEnabled(false);
		  //  	rdbtnNonOverlapping.setEnabled(false);

		    }
		});
		
		JLabel lblNewLabel_3 = new JLabel("Select Session");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_3.setBounds(275, 386, 156, 33);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(152, 201, 45));
		
		JComboBox session = new JComboBox();
		session.setBounds(467, 388, 404, 37);
		session.setBackground(new Color(51, 51, 51));
		session.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		frame.getContentPane().add(session);
			
		JComboBox rooms = new JComboBox();
		rooms.setBackground(new Color(51, 51, 51));
		rooms.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		rooms.setBounds(467, 501, 213, 33);
		frame.getContentPane().add(rooms);
		rooms.setBorder(new LineBorder(new Color(169, 224, 49), 3));
	
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1 select session type check
				 * 2 load data from relevant table to session
				 * 3 select all rooms from session table >>>>. foreign key should be there to select relevant room for a consec, or parallel or non overl.
				 * 4 insert to table room sessions
				 */
				
				String sessionType = null;
				String session = null;
				String room = null;
				
				
				
				 // If condition to check if jRadioButton2 is selected. 
                if (rdbtnMSR.isSelected()) { 
                	sessionType = "Consecutive";
 
                	//set the combo box values
                	
                	//set the combo box rooms
                	//check for the no of students in session with room capacity***************
                	
                } 
  
                else if (rdbtnParallelSessions.isSelected()) { 
                	sessionType = "Parallel"; 
                	//if one combo box selected disable other 2
            		rdbtnMSR.setEnabled(false);
            		rdbtnNonOverlapping.setEnabled(false);

                	//set the combo box values
                	//set the combo box rooms
                	//check for the no of students in session with room capacity***************
                	
                } 
                
                else if (rdbtnNonOverlapping.isSelected()) { 
                	sessionType = "Non overlapping"; 
                	//if one combo box selected disable other 2
            		rdbtnMSR.setEnabled(false);
            		rdbtnParallelSessions.setEnabled(false);
                	//set the combo box values
                	//set the combo box rooms
                	//check for the no of students in session with room capacity***************
                	
                	
                	
                } 
                
                else { 
                	JOptionPane.showMessageDialog(panel, "Please select a Type", "Warning Select a Session ",JOptionPane.WARNING_MESSAGE);
                } 
				
				//check for null combo boxes
                //insert into table use a flag
				
				
				
				
				
			}
		});
		btnSave.setBounds(268, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(518, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Select Tag");
		lblNewLabel_2_1_1.setForeground(new Color(152, 201, 45));
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(272, 579, 134, 25);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JComboBox rooms_1 = new JComboBox();
		rooms_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		rooms_1.setBackground(new Color(51, 51, 51));
		rooms_1.setBounds(467, 579, 213, 33);
		frame.getContentPane().add(rooms_1);
	}	
}