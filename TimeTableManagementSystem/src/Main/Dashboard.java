package Main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Member3.AddNotAvailableTime;
import Member3.AddWorkDays;
import Member3.ManageNotAvailableTime;
import Member3.ManageWorkingDays;
import Member4.AddLocation;
import Member4.AddSessionRooms;
import Member4.ManageLocations;
import Member4.Statistic;
import Member4.ViewRooms;
import Section_6.Lecturer_TimeTable;
import Section_6.Rooms_TimeTable;
import Section_6.Student_TimeTable;
import member2.AddLecture;
import member2.AddSessions;
import member2.AddSubjects;
//import MemberTwo.AddLecture;
//import MemberTwo.ManageLectures;
//import MemberTwo.ManageSessions;
//import MemberTwo.ManageSubject;
import member2.ManageLectures;
import member2.ManageSessions;
import member2.ManageSubject;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import Member1.AddStudentGroups;
import Member1.AddTags;
import Member1.ConsecutiveSessions;
import Member1.ManageStudentGroups;
import Member1.ManageTags;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Dashboard {

	private JFrame frmAddNotAvailbleTime;
	private JButton btnSessionRooms;
	private JLabel lblNewLabel_1;
	private JLabel lbli;
	private JLabel label_10;
	private JButton btnSessions;
	private JButton btnStudentsGroups;
	private JButton btnSubjects;
	private JButton btnLecturer;
	private JButton btnLocations;
	private JButton btnTag;
	private JButton btnWorkigDetails;
	private JButton btnSessionCategories;
	private JButton btnNotAvailableTimes;
	private JButton btnNewButton;
	private JLabel lblNewLabel_3;
	private JButton btnLogOut;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
					window.frmAddNotAvailbleTime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

public void clock() {
		
		Thread clock=new Thread() {
			public void run() {
				try {
					for(;;) {
					Calendar cal=new GregorianCalendar();
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int month=cal.get(Calendar.MONTH);
					int year=cal.get(Calendar.YEAR);
					
					int second=cal.get(Calendar.SECOND);
					int minute=cal.get(Calendar.MINUTE);
					int hour=cal.get(Calendar.HOUR);
					
					label_10.setText("Time - "+hour+":"+minute+":"+second+"  Date - "+year+"/"+month+"/"+day);
					sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		clock.start();
	}
	/**
	 * Create the application.
	 */
	public Dashboard() {
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddNotAvailbleTime = new JFrame();
		frmAddNotAvailbleTime.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmAddNotAvailbleTime.setBackground(Color.YELLOW);
		frmAddNotAvailbleTime.setResizable(false);
		frmAddNotAvailbleTime.setTitle("Dashboard");
		frmAddNotAvailbleTime.setBounds(350, 90, 1350, 900);
		frmAddNotAvailbleTime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddNotAvailbleTime.getContentPane().setLayout(null);
		///
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frmAddNotAvailbleTime.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBackground(new Color(0, 102, 102));
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(152, 201, 45));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 693, 787);
		panel_1.setBackground(new Color(21,25,28));
		frmAddNotAvailbleTime.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_8 = new JLabel("");
		label_8.setForeground(new Color(169, 224, 49));
		label_8.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_8.setBounds(387, 672, 35, 53);
		panel_1.add(label_8);
		label_8.setIcon(new ImageIcon(this.getClass().getResource("/working (1).png")));
		
		JLabel label_7 = new JLabel("");
		label_7.setForeground(new Color(169, 224, 49));
		label_7.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_7.setBounds(47, 672, 35, 53);
		panel_1.add(label_7);
		label_7.setIcon(new ImageIcon(this.getClass().getResource("/backend (1).png")));
		
		JLabel label_6 = new JLabel("");
		label_6.setForeground(new Color(169, 224, 49));
		label_6.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_6.setBounds(387, 560, 35, 53);
		panel_1.add(label_6);
		label_6.setIcon(new ImageIcon(this.getClass().getResource("/employee (1).png")));
		
		JLabel label_5 = new JLabel("");
		label_5.setForeground(new Color(169, 224, 49));
		label_5.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_5.setBounds(47, 560, 35, 53);
		panel_1.add(label_5);
		label_5.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/tag (1).png")));
		
		JLabel label_4 = new JLabel("");
		label_4.setForeground(new Color(169, 224, 49));
		label_4.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_4.setBounds(387, 439, 35, 53);
		panel_1.add(label_4);
		label_4.setIcon(new ImageIcon(this.getClass().getResource("/book (1).png")));
		
		JLabel label_3 = new JLabel("");
		label_3.setForeground(new Color(169, 224, 49));
		label_3.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_3.setBounds(47, 439, 35, 53);
		panel_1.add(label_3);
		label_3.setIcon(new ImageIcon(this.getClass().getResource("/class (1).png")));
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(new Color(169, 224, 49));
		label_2.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_2.setBounds(387, 326, 35, 53);
		panel_1.add(label_2);
		//lblNewLabel_2.add(lblNewLabel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 45));
		label_2.setIcon(new ImageIcon(this.getClass().getResource("/conference (1).png")));
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(new Color(169, 224, 49));
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_1.setBounds(47, 326, 35, 53);
		panel_1.add(label_1);
		label_1.setIcon(new ImageIcon(this.getClass().getResource("/session (1).png")));
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(169, 224, 49));
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label.setBounds(387, 219, 35, 53);
		panel_1.add(label);
		label.setIcon(new ImageIcon(this.getClass().getResource("/map (1).png")));
		
		 btnLocations = new JButton("Locations");
		btnLocations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddLocation abc =new AddLocation();
				try {
					AddLocation.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnLocations.setForeground(new Color(21, 25, 28));
		btnLocations.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnLocations.setFocusPainted(false);
		btnLocations.setBackground(new Color(152, 201, 45));
		btnLocations.setBounds(371, 207, 288, 72);
		panel_1.add(btnLocations);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(47, 219, 35, 53);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
		lblNewLabel_2.setForeground(new java.awt.Color(169, 224, 49));
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/speech (2).png"))); // NOI18N
		
		 btnLecturer = new JButton("Lecturer");
		btnLecturer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddLecture abc =new AddLecture();
				try {
					AddLecture.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnLecturer.setForeground(new Color(21, 25, 28));
		btnLecturer.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnLecturer.setFocusPainted(false);
		btnLecturer.setBackground(new Color(152, 201, 45));
		btnLecturer.setBounds(27, 207, 288, 72);
		panel_1.add(btnLecturer);
		
		btnSessionRooms = new JButton("Session Rooms");
		btnSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSessionRooms abc =new AddSessionRooms();
				try {
					AddSessionRooms.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnSessionRooms.setForeground(new Color(21, 25, 28));
		btnSessionRooms.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSessionRooms.setFocusPainted(false);
		btnSessionRooms.setBackground(new Color(152, 201, 45));
		btnSessionRooms.setBounds(371, 319, 288, 72);
		panel_1.add(btnSessionRooms);
		
		btnSessionRooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setForeground(Color.WHITE);
		lblDashboard.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblDashboard.setBounds(240, 95, 212, 61);
		panel_1.add(lblDashboard);
		
		 btnSessions = new JButton("Sessions");
		btnSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
					AddSessions abc =new AddSessions();
					try {
						AddSessions.main(null);
					} catch (Exception ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
					frmAddNotAvailbleTime.setVisible(false);
				}
			
		});
		btnSessions.setForeground(new Color(21, 25, 28));
		btnSessions.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSessions.setFocusPainted(false);
		btnSessions.setBackground(new Color(152, 201, 45));
		btnSessions.setBounds(27, 319, 288, 72);
		panel_1.add(btnSessions);
		
		 btnStudentsGroups = new JButton("  Students Groups");
		btnStudentsGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudentGroups abc =new AddStudentGroups();
				try {
					AddStudentGroups.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnStudentsGroups.setForeground(new Color(21, 25, 28));
		btnStudentsGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnStudentsGroups.setFocusPainted(false);
		btnStudentsGroups.setBackground(new Color(152, 201, 45));
		btnStudentsGroups.setBounds(27, 432, 288, 72);
		panel_1.add(btnStudentsGroups);
		
		 btnSubjects = new JButton("Subjects");
		btnSubjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSubjects abc =new AddSubjects();
				try {
					AddSubjects.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnSubjects.setForeground(new Color(21, 25, 28));
		btnSubjects.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSubjects.setFocusPainted(false);
		btnSubjects.setBackground(new Color(152, 201, 45));
		btnSubjects.setBounds(371, 432, 288, 72);
		panel_1.add(btnSubjects);
		
		 btnTag = new JButton("Tag");
		btnTag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTags abc =new AddTags();
				try {
					AddTags.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnTag.setForeground(new Color(21, 25, 28));
		btnTag.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnTag.setFocusPainted(false);
		btnTag.setBackground(new Color(152, 201, 45));
		btnTag.setBounds(27, 548, 288, 72);
		panel_1.add(btnTag);
		
		 btnWorkigDetails = new JButton("Workig Details");
		btnWorkigDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddWorkDays abc =new AddWorkDays();
				try {
					AddWorkDays.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnWorkigDetails.setForeground(new Color(21, 25, 28));
		btnWorkigDetails.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnWorkigDetails.setFocusPainted(false);
		btnWorkigDetails.setBackground(new Color(152, 201, 45));
		btnWorkigDetails.setBounds(371, 548, 288, 72);
		panel_1.add(btnWorkigDetails);
		
		 btnSessionCategories = new JButton("   Session Categories");
		btnSessionCategories.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsecutiveSessions abc =new ConsecutiveSessions();
				try {
					ConsecutiveSessions.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnSessionCategories.setForeground(new Color(21, 25, 28));
		btnSessionCategories.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSessionCategories.setFocusPainted(false);
		btnSessionCategories.setBackground(new Color(152, 201, 45));
		btnSessionCategories.setBounds(27, 664, 288, 72);
		panel_1.add(btnSessionCategories);
		
		 btnNotAvailableTimes = new JButton("    Not Available Times");
		btnNotAvailableTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddNotAvailableTime abc =new AddNotAvailableTime();
				try {
					AddNotAvailableTime.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnNotAvailableTimes.setForeground(new Color(21, 25, 28));
		btnNotAvailableTimes.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNotAvailableTimes.setFocusPainted(false);
		btnNotAvailableTimes.setBackground(new Color(152, 201, 45));
		btnNotAvailableTimes.setBounds(371, 664, 288, 72);
		panel_1.add(btnNotAvailableTimes);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(this.getClass().getResource("/icons8_YouTube_32px_1.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(331, 11, 49, 48);
		button.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_YouTube_32px.png")));
		panel_1.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Secured_Letter_32px_2.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(255, 11, 49, 48);
		button_1.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Secured_Letter_32px.png")));
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Instagram_32px_3.png")));
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBorder(null);
		button_2.setBounds(177, 11, 49, 48);
		button_2.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Instagram_32px.png")));
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Facebook_32px_7.png")));
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBorder(null);
		button_3.setBounds(97, 11, 49, 48);
		button_3.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Facebook_32px_2.png")));
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Twitter_32px_2.png")));
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setBorder(null);
		button_4.setBounds(27, 11, 49, 48);
		button_4.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Twitter_32px.png")));
		panel_1.add(button_4);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(688, 78, 656, 787);
		panel_3.setBackground(new Color(31,36,42));
		frmAddNotAvailbleTime.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		 
		 JLabel label_9 = new JLabel("");
		 label_9.setForeground(new Color(169, 224, 49));
		 label_9.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		 label_9.setBounds(234, 675, 35, 53);
		 panel_3.add(label_9);
		 label_9.setIcon(new ImageIcon(this.getClass().getResource("/analytics (1).png")));
		
		
		 lbli = new JLabel("");
		lbli.setBounds(116, 76, 490, 336);
		panel_3.add(lbli);
		lbli.setIcon(new ImageIcon(this.getClass().getResource("/ttt.gif")));
		//lbli.setIcon(image);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a Timetable Type..", "Lecturer", "Student", "Location"}));
		comboBox.setBounds(75, 569, 347, 59);
		panel_3.add(comboBox);
		
		 btnNewButton = new JButton("GO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Lecturer")) {
					
					Lecturer_TimeTable abc =new Lecturer_TimeTable();
					try {
						Lecturer_TimeTable.main(null);
					} catch (Exception ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
					frmAddNotAvailbleTime.setVisible(false);
				}
				else if(comboBox.getSelectedItem().equals("Student")) {
					
					Student_TimeTable abc =new Student_TimeTable();
					try {
						Student_TimeTable.main(null);
					} catch (Exception ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
					frmAddNotAvailbleTime.setVisible(false);
				}
				
				else if(comboBox.getSelectedItem().equals("Location")) {
					
					Rooms_TimeTable abc =new Rooms_TimeTable();
					try {
						Rooms_TimeTable.main(null);
					} catch (Exception ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
					frmAddNotAvailbleTime.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Please Select a Timetable Type...");
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBounds(488, 570, 89, 57);
		panel_3.add(btnNewButton);
		
		 lblNewLabel_3 = new JLabel("Check Statictics...");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Statistic abc =new Statistic();
				try {
					Statistic.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.setForeground(new Color(152, 201, 45));
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_3.setBounds(279, 688, 184, 29);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblPleaseSelectA = new JLabel("Please Select A Timetable Type :");
		lblPleaseSelectA.setForeground(new Color(152, 201, 45));
		lblPleaseSelectA.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblPleaseSelectA.setBounds(75, 520, 347, 29);
		panel_3.add(lblPleaseSelectA);
		
		 label_10 = new JLabel("Clock");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		label_10.setBounds(87, 407, 490, 131);
		panel_3.add(label_10);
		
		 btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login abc =new Login();
				try {
					Login.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnLogOut.setBackground(Color.RED);
		btnLogOut.setBounds(522, 11, 124, 40);
		panel_3.add(btnLogOut);
		
		
		
		
		
	    
	}
}
