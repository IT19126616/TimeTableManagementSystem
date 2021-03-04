package MemberTwo;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ManageSubject {


	private JFrame frameManageLocation;
	private JTextField txtMLBuildingName;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageSubject window = new ManageSubject();
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
	public ManageSubject() {
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
		frameManageLocation.setTitle("Manage Subjects");
		//frameManageLocation.setBounds(100, 40, 1350, 900);
		frameManageLocation.setSize(1500, 2000);
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
				ManageSubject al = new ManageSubject();
				ManageSubject.main(null);
				frameManageLocation.setVisible(false);

			}
		});
		btnNewButton.setBounds(12, 320, 238, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnManageGroups = new JButton("Manage Location");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnManageGroups.setBounds(12, 383, 252, 50);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		
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
		panel_3.setBounds(272, 452, 1060, 307);
		panel_3.setBackground(Color.LIGHT_GRAY);
		frameManageLocation.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Offered Year");
		lblNewLabel_2.setBounds(12, 35, 164, 25);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
	
		
		JLabel lblNewLabel_2_1 = new JLabel("Offered Semester");
		lblNewLabel_2_1.setBounds(12, 93, 187, 25);
		panel_3.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
	
		
		JLabel lblNewLabel_2_1_1 = new JLabel("No Of Lecture Hours");
		lblNewLabel_2_1_1.setBounds(523, 35, 233, 25);
		panel_3.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		txtMLBuildingName = new JTextField();
		txtMLBuildingName.setBounds(205, 30, 218, 36);
		txtMLBuildingName.setFont(new Font("Tahoma", Font.BOLD, 20));		
		txtMLBuildingName.setColumns(10);
		panel_3.add(txtMLBuildingName);
		txtMLBuildingName.setColumns(10);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Subject Name");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_3.setBounds(12, 159, 149, 25);
		panel_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Subject Code");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_4.setBounds(12, 232, 149, 25);
		panel_3.add(lblNewLabel_2_1_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(205, 154, 218, 36);
		panel_3.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(205, 227, 218, 36);
		panel_3.add(textField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1st Semester");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(205, 91, 109, 36);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2nd Semester");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setBounds(314, 91, 109, 36);
		panel_3.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("No Of Tutorial Hours");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(523, 93, 233, 25);
		panel_3.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("No Of LabHours");
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1_2.setBounds(523, 159, 233, 25);
		panel_3.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("No Of Evaluation Hours");
		lblNewLabel_2_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1_3.setBounds(523, 232, 233, 25);
		panel_3.add(lblNewLabel_2_1_1_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(864, 31, 109, 35);
		panel_3.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(864, 92, 109, 35);
		panel_3.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(864, 158, 109, 35);
		panel_3.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(864, 231, 109, 35);
		panel_3.add(spinner_3);
		
	
		
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(1185, 304, 139, 50);
		frameManageLocation.getContentPane().add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBounds(1183, 243, 139, 50);
		frameManageLocation.getContentPane().add(btnUpdate);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRefresh.setBounds(1183, 181, 139, 50);
		frameManageLocation.getContentPane().add(btnRefresh);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(1185, 365, 139, 50);
		frameManageLocation.getContentPane().add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 164, 903, 274);
		frameManageLocation.getContentPane().add(scrollPane);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
	 
	    
	}
}
