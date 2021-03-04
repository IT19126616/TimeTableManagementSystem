package MemberTwo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import dbConnect.DBConnect;

import javax.swing.JSpinner;

public class AddSubjects {


	private JFrame frameAddLocation;
	
	private JTextField Offeredyear;
	private JTextField subcode;
	private JTextField subjectname;
	private JSpinner LecHrs;
	private JSpinner TuteHrs;
	private JSpinner LabHrs;
	private JSpinner EveHrs;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSubjects window = new AddSubjects();
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
	public AddSubjects() {
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
		frameAddLocation.setTitle("Add Subject");		

		//frameAddLocation.setBounds(100, 40, 1350, 900);
		frameAddLocation.setSize(1500, 2000);
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
		
		JButton btnAddLocation = new JButton("Add Subject");
		btnAddLocation.setBounds(12, 320, 252, 50);
		btnAddLocation.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnAddLocation);
		
		JButton btnManageSubject = new JButton("Manage Subject");
		btnManageSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnManageSubject.setBounds(12, 383, 238, 50);
		btnManageSubject.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnManageSubject);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
	
		JLabel lblNewLabel_1 = new JLabel("Add Subject");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frameAddLocation.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frameAddLocation.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Offered Year");
		lblNewLabel_2.setBounds(274, 268, 252, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2);
		
		Offeredyear = new JTextField();
		Offeredyear.setBounds(538, 261, 262, 40);
		Offeredyear.setFont(new Font("Tahoma", Font.BOLD, 20));		
		frameAddLocation.getContentPane().add(Offeredyear);
		Offeredyear.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Offered Semester");
		lblNewLabel_2_1.setBounds(274, 354, 252, 25);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Subject Name");
		lblNewLabel_2_1_1.setBounds(274, 455, 281, 25);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Subject Code");
		lblNewLabel_2_1_2.setBounds(274, 554, 281, 25);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(Color.LIGHT_GRAY);
		frameAddLocation.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton first = new JRadioButton("1st Semester");
		first.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  /**************************************/
							}
		});
		first.setFont(new Font("Tahoma", Font.BOLD, 14));
		first.setBounds(538, 350, 122, 33);
		frameAddLocation.getContentPane().add(first);
		
		JRadioButton second = new JRadioButton("2nd Semester");
		second.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {/****************************************/
			
			}
		});
		second.setBounds(662, 352, 138, 27);
		second.setFont(new Font("Tahoma", Font.BOLD, 14));
		frameAddLocation.getContentPane().add(second);
		
		JButton btnNewButton = new JButton("Save");//*********************************************************************************
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 String Semester=null;
				
				String Year=Offeredyear.getText();
				String SubName=subjectname.getText();
				String SubCode=subcode.getText();
				
				String LectureHours= LecHrs.getValue().toString();
				String TutorialHours= TuteHrs.getValue().toString();
				String LabHours= LabHrs.getValue().toString();
				String EvaluationHours= EveHrs.getValue().toString();
			
				// If condition to check if jRadioButton2 is selected. 
		                if (first.isSelected()) { 
		                	Semester = "1st semester";
		                } 
		  
		                else if (second.isSelected()) { 
		                	Semester = "2nd semester"; 
		                } 
		                else { 
		                	JOptionPane.showMessageDialog(panel, "Please select a Type", "Warning",JOptionPane.WARNING_MESSAGE);
		                } 
		             
				
				
			
				
				
				
				
				try {

			
					
					
					 Connection con = DBConnect.connect();

	                    String query = "INSERT INTO subjects values(null, '" + Year + "','" + Semester + "','" + SubName + "','" +
	                    		SubCode + "','" + LectureHours + "','" + TutorialHours + "','"+ LabHours +"','"+ EvaluationHours +"')";

	                  Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                   if (x == 0) {
	                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnNewButton,"Lecturer details successfully added!");
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                	
	                }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setBounds(216, 11, 250, 49);
		panel_3.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBackground(Color.RED);
		btnClear.setBounds(493, 11, 250, 49);
		panel_3.add(btnClear);
		
	
				
				
		
	
		
		subcode = new JTextField();
		subcode.setBounds(538, 540, 258, 40);
		frameAddLocation.getContentPane().add(subcode);
		subcode.setColumns(10);
		
		
		
		JLabel lblNewLabel_2_2 = new JLabel("Number Of Lecture Hours");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(875, 261, 281, 25);
		frameAddLocation.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Number Of Tutorial Hours");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(875, 354, 281, 25);
		frameAddLocation.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Number Of Lab Hours");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_4.setBounds(875, 455, 252, 25);
		frameAddLocation.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Number Of Evaluation Hours");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_5.setBounds(875, 554, 296, 25);
		frameAddLocation.getContentPane().add(lblNewLabel_2_5);
		
		LecHrs = new JSpinner();
		LecHrs.setBounds(1194, 261, 112, 37);
		frameAddLocation.getContentPane().add(LecHrs);
		
		TuteHrs = new JSpinner();
		TuteHrs.setBounds(1194, 352, 112, 37);
		frameAddLocation.getContentPane().add(TuteHrs);
		
		LabHrs = new JSpinner();
		LabHrs.setBounds(1194, 453, 112, 37);
		frameAddLocation.getContentPane().add(LabHrs);
		
		EveHrs = new JSpinner();
		EveHrs.setBounds(1194, 552, 112, 37);
		frameAddLocation.getContentPane().add(EveHrs);
		
		subjectname = new JTextField();
		subjectname.setColumns(10);
		subjectname.setBounds(538, 440, 258, 40);
		frameAddLocation.getContentPane().add(subjectname);
		
		
	}	
}
