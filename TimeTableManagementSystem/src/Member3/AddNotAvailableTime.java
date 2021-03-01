package Member3;

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

public class AddNotAvailableTime {

	private JFrame frmAddNotAvailbleTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNotAvailableTime window = new AddNotAvailableTime();
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
	public AddNotAvailableTime() {
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
		frmAddNotAvailbleTime.setTitle("Add Not Available Time");
		frmAddNotAvailbleTime.setBounds(350, 90, 1350, 900);
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
		
		JButton btnNewButton = new JButton("Add Not Availble Time");
		btnNewButton.setBounds(12, 320, 252, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnManageGroups = new JButton("Manage Not Available Time");
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
		
		JLabel lblNewLabel_1 = new JLabel("Add Not Available Time");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 152, 1082, 16);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frmAddNotAvailbleTime.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Select Lecturer");
		lblNewLabel_2.setBounds(272, 181, 252, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Select Group Signature");
		lblNewLabel_2_1.setBounds(272, 296, 241, 25);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_2_1);
		
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
		comboBox.setBounds(520, 179, 262, 25);
		frmAddNotAvailbleTime.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(520, 235, 262, 25);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_1);
		
		JLabel lblSelectGroup = new JLabel("Select Group");
		lblSelectGroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectGroup.setBounds(849, 179, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectGroup);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(1072, 179, 262, 25);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_2);
		
		JLabel lblSelectSubGroup = new JLabel("Select Sub Group");
		lblSelectSubGroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectSubGroup.setBounds(849, 235, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectSubGroup);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(1072, 235, 262, 25);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_3);
		
		JLabel lblSelectRoom = new JLabel("Select Room");
		lblSelectRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectRoom.setBounds(272, 235, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectRoom);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(520, 296, 262, 80);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_4);
		
		JLabel lblSelectDay = new JLabel("Select Day");
		lblSelectDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectDay.setBounds(849, 296, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectDay);
		
		JLabel lblStartTime = new JLabel("Start Time");
		lblStartTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStartTime.setBounds(272, 444, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblStartTime);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner.setBounds(520, 438, 135, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner);
		
		JLabel label_1 = new JLabel("Hours");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(685, 451, 96, 25);
		frmAddNotAvailbleTime.getContentPane().add(label_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner_1.setBounds(833, 438, 135, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner_1);
		
		JLabel label_2 = new JLabel("Minutes");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(998, 451, 96, 25);
		frmAddNotAvailbleTime.getContentPane().add(label_2);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(1072, 296, 262, 25);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_5);
		
		JLabel lblEndTime = new JLabel("End Time");
		lblEndTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEndTime.setBounds(272, 543, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblEndTime);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner_2.setBounds(520, 537, 135, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner_2);
		
		JLabel label_3 = new JLabel("Hours");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(685, 550, 96, 25);
		frmAddNotAvailbleTime.getContentPane().add(label_3);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner_3.setBounds(833, 537, 135, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner_3);
		
		JLabel label_4 = new JLabel("Minutes");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(998, 550, 96, 25);
		frmAddNotAvailbleTime.getContentPane().add(label_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(819, 168, 20, 232);
		frmAddNotAvailbleTime.getContentPane().add(separator_1);
	 
	    
	}
}
