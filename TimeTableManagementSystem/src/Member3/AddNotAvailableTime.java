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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddNotAvailableTime {

	private JFrame frmAddNotAvailbleTime;
	private JComboBox comboBox;

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
	
	public void fillComboBox() {
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from lecturers";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String name=rs.getString("lectureName");
				comboBox.addItem(name);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddNotAvailbleTime = new JFrame();
		frmAddNotAvailbleTime.getContentPane().setBackground(new Color(21,25,28));
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
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(169, 224, 49));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 80, 262, 798);
		panel_1.setBackground(new Color(51, 51, 51));
		frmAddNotAvailbleTime.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Not Availble Time");
		btnNewButton.setBounds(12, 320, 252, 50);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		
		JButton btnManageGroups = new JButton("Manage Not Available Time");
		btnManageGroups.setBounds(12, 383, 238, 50);
		btnManageGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		panel_1.add(btnManageGroups);
		btnManageGroups.setForeground(new Color(21, 25, 28));
		btnManageGroups.setBackground(new Color(152, 201, 45));
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setBounds(12, 724, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Add Not Available Time");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 152, 1082, 16);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frmAddNotAvailbleTime.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Select Lecturer");
		lblNewLabel_2.setBounds(272, 181, 252, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		
		JLabel lblNewLabel_2_1 = new JLabel("Select Group Signature");
		lblNewLabel_2_1.setBounds(272, 261, 241, 25);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(new Color(0, 0, 0));
		frmAddNotAvailbleTime.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(268, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		
		JButton btnSave = new JButton("Submit");
		btnSave.setBounds(518, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSave.setForeground(new Color(21, 25, 28));
		btnSave.setBackground(new Color(152, 201, 45));
		
		 comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(new Color(51, 51, 51));
	    //comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}));
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox.setBounds(520, 179, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox);
		comboBox.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setBackground(new Color(51, 51, 51));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Room..."}));
		comboBox_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_1.setBounds(520, 383, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_1);
		comboBox_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblSelectGroup = new JLabel("Select Group");
		lblSelectGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectGroup.setBounds(849, 179, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectGroup);
		lblSelectGroup.setForeground(new Color(169, 224, 49));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setForeground(Color.WHITE);
		comboBox_2.setBackground(new Color(51, 51, 51));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Group..."}));
		comboBox_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_2.setBounds(1072, 179, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_2);
		comboBox_2.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblSelectSubGroup = new JLabel("Select Sub Group");
		lblSelectSubGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectSubGroup.setBounds(849, 261, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectSubGroup);
		lblSelectSubGroup.setForeground(new Color(169, 224, 49));
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setForeground(Color.WHITE);
		comboBox_3.setBackground(new Color(51, 51, 51));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select Sub Group..."}));
		comboBox_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_3.setBounds(1072, 255, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_3);
		comboBox_3.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblSelectRoom = new JLabel("Select Room");
		lblSelectRoom.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectRoom.setBounds(272, 389, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectRoom);
		lblSelectRoom.setForeground(new Color(169, 224, 49));
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setForeground(Color.WHITE);
		comboBox_4.setBackground(new Color(51, 51, 51));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select Group Signature..."}));
		comboBox_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_4.setBounds(520, 245, 262, 58);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_4);
		comboBox_4.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblSelectDay = new JLabel("Select Day");
		lblSelectDay.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectDay.setBounds(849, 389, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectDay);
		lblSelectDay.setForeground(new Color(169, 224, 49));
		
		JLabel lblStartTime = new JLabel("Start Time");
		lblStartTime.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblStartTime.setBounds(272, 461, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblStartTime);
		lblStartTime.setForeground(new Color(169, 224, 49));
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner.setBounds(520, 454, 135, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner);
		spinner.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		spinner.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel label_1 = new JLabel("Hours");
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		label_1.setBounds(686, 461, 96, 25);
		frmAddNotAvailbleTime.getContentPane().add(label_1);
		label_1.setForeground(new Color(169, 224, 49));
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner_1.setBounds(833, 454, 135, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner_1);
		spinner_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		spinner_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel label_2 = new JLabel("Minutes");
		label_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		label_2.setBounds(998, 461, 96, 25);
		frmAddNotAvailbleTime.getContentPane().add(label_2);
		label_2.setForeground(new Color(169, 224, 49));
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setForeground(Color.WHITE);
		comboBox_5.setBackground(new Color(51, 51, 51));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));
		comboBox_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_5.setBounds(1082, 383, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_5);
		comboBox_5.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblEndTime = new JLabel("End Time");
		lblEndTime.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblEndTime.setBounds(272, 543, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblEndTime);
		lblEndTime.setForeground(new Color(169, 224, 49));
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner_2.setBounds(520, 537, 135, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner_2);
		spinner_2.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel label_3 = new JLabel("Hours");
		label_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		label_3.setBounds(685, 550, 96, 25);
		frmAddNotAvailbleTime.getContentPane().add(label_3);
		label_3.setForeground(new Color(169, 224, 49));
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner_3.setBounds(833, 537, 135, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner_3);
		spinner_3.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel label_4 = new JLabel("Minutes");
		label_4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		label_4.setBounds(998, 550, 96, 25);
		frmAddNotAvailbleTime.getContentPane().add(label_4);
		label_4.setForeground(new Color(169, 224, 49));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(819, 168, 20, 158);
		frmAddNotAvailbleTime.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Select Location");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(273, 333, 206, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_3);
	 
		fillComboBox();
	}
}
