package MemberTwo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class AddSessions {

	private JFrame frmAddNotAvailbleTime;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSessions window = new AddSessions();
					window.frmAddNotAvailbleTime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddSessions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddNotAvailbleTime = new JFrame();
		frmAddNotAvailbleTime.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmAddNotAvailbleTime.setBackground(Color.YELLOW);
		frmAddNotAvailbleTime.setResizable(false);
		frmAddNotAvailbleTime.setTitle("Add Sessions");
		//frmAddNotAvailbleTime.setBounds(350, 90, 1350, 900);
		frmAddNotAvailbleTime.setSize(1500, 2000);
		
		frmAddNotAvailbleTime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddNotAvailbleTime.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frmAddNotAvailbleTime.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setForeground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 787);
		panel_1.setBackground(Color.BLACK);
		frmAddNotAvailbleTime.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Sessions");
		btnNewButton.setBounds(12, 320, 252, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnManageGroups = new JButton("Manage Sessions");
		btnManageGroups.setBounds(12, 383, 238, 50);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setBounds(12, 724, 238, 50);
		btnViewGroups_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Add Sessions");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 152, 1082, 16);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frmAddNotAvailbleTime.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Select Lecturer 1");
		lblNewLabel_2.setBounds(272, 181, 252, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(Color.LIGHT_GRAY);
		frmAddNotAvailbleTime.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(268, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnSave = new JButton("Submit");
		btnSave.setBounds(518, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(520, 179, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(520, 272, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_1);
		
		JLabel lblSelectGroup = new JLabel("Select Lecturer 2");
		lblSelectGroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectGroup.setBounds(849, 179, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectGroup);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(1072, 179, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_2);
		
		JLabel lblSelectSubGroup = new JLabel("Select  Subject Code");
		lblSelectSubGroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectSubGroup.setBounds(849, 275, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectSubGroup);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(1072, 272, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(520, 362, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_4);
		
		JLabel lblSelectDay = new JLabel("Select Sub Groups");
		lblSelectDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectDay.setBounds(849, 365, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectDay);
		
		JLabel lblStartTime = new JLabel("Duration");
		lblStartTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStartTime.setBounds(272, 541, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblStartTime);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner.setBounds(520, 535, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner_1.setBounds(1072, 460, 258, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner_1);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(1072, 362, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_5);
		
		JLabel lblhours = new JLabel("(Hours)");
		lblhours.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblhours.setBounds(381, 466, 96, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblhours);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Select Subject");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(272, 275, 241, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblSelectStudentGroup = new JLabel("Select Student Group");
		lblSelectStudentGroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectStudentGroup.setBounds(272, 365, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectStudentGroup);
		
		JLabel lblSelectRoom_1 = new JLabel("Select Tag");
		lblSelectRoom_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectRoom_1.setBounds(272, 466, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectRoom_1);
		
		JLabel lblSelectDay_1 = new JLabel("No Of Students");
		lblSelectDay_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectDay_1.setBounds(849, 466, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectDay_1);
		
		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setBounds(520, 463, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_4_1);
		
		JLabel lblGenerateSessionSignature = new JLabel("Generate Session Signature");
		lblGenerateSessionSignature.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGenerateSessionSignature.setBounds(272, 609, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblGenerateSessionSignature);
		
		textField = new JTextField();
		textField.setBounds(520, 599, 810, 48);
		frmAddNotAvailbleTime.getContentPane().add(textField);
		textField.setColumns(10);
	 
	    
	}
}
