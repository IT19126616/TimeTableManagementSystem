package Member3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Main.Dashboard;
import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;

public class ManageNotAvailableTime {

	private JFrame frmAddNotAvailbleTime;
	private JTable table;
	private JTextField textField_10;
	private JTextField textField;
	private JTextField textField_2;
	private JButton btnClear;
	private JComboBox comboBox;
	private JTextField textField_1;
	private JTextField textField_3;
	private JComboBox comboBox_4;
	private JTextPane textField_4;

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
					ManageNotAvailableTime window = new ManageNotAvailableTime();
					window.frmAddNotAvailbleTime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/*public void fillComboBox2() {
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from studentGroups";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String group=rs.getString("groupID");
				String subgroup=rs.getString("subGroupID");
				
				//comboBox1.addItem(group);
				comboBox_2.addItem(subgroup);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	
	/*public void fillComboBox5() {
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from roomSession";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String sign=rs.getString("sessionSignature");
				
				
				//comboBox1.addItem(group);
				textField_4.addItem(sign);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	
	/*public void fillComboBox() {
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from lecturers";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String name=rs.getString("lectureName");
				comboBox_3.addItem(name);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	
	public void fillComboBox4() {
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from location";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String room=rs.getString("roomName");
				comboBox_4.addItem(room);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public ManageNotAvailableTime() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddNotAvailbleTime = new JFrame();
		frmAddNotAvailbleTime.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				try {
					Connection con = DBConnect.connect();
					
					String query="select * from timeAlloLecture ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		frmAddNotAvailbleTime.getContentPane().setBackground(new Color(21,25,28));
		frmAddNotAvailbleTime.setBackground(Color.YELLOW);
		frmAddNotAvailbleTime.setResizable(false);
		frmAddNotAvailbleTime.setTitle("Manage Available Time");
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
		panel_1.setBounds(0, 77, 262, 794);
		panel_1.setBackground(new Color(51, 51, 51));
		frmAddNotAvailbleTime.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Not Availble Time");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddNotAvailableTime itm = new AddNotAvailableTime();
				try {
					AddNotAvailableTime.main(null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 320, 240, 50);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		
		JButton btnManageGroups = new JButton("Manage Not Available Time");
		btnManageGroups.setBounds(12, 383, 252, 50);
		btnManageGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		panel_1.add(btnManageGroups);
		btnManageGroups.setForeground(new Color(21, 25, 28));
		btnManageGroups.setBackground(new Color(152, 201, 45));
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard itm = new Dashboard();
				try {
					Dashboard.main(null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
				
			}
		});
		btnViewGroups_1.setBounds(12, 724, 238, 50);
		btnViewGroups_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		lbli.setIcon(new ImageIcon(this.getClass().getResource("/tt.png")));
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Manage Not Available Time");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 152, 1082, 16);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frmAddNotAvailbleTime.getContentPane().add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 744, 1082, 102);
		panel_3.setBackground(new Color(0, 0, 0));
		frmAddNotAvailbleTime.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		 btnClear = new JButton("Update");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//String group= comboBox.getSelectedItem().toString();
				
				/*else if(comboBox_4.getSelectedItem().equals("Select Session Signature...")) {
					JOptionPane.showMessageDialog(null, "Please Select Session Signatue!!!");
				}*/
				 if(comboBox.getSelectedItem().equals("Select Day...")) {
					JOptionPane.showMessageDialog(null, "Please Select Day!!!");
				}
				else if(comboBox_4.getSelectedItem().equals("Select Room...")) {
					JOptionPane.showMessageDialog(null, "Please Select Room!!!");
				}
				
				
				else {
				
				
				try {
					Connection con = DBConnect.connect();
					
					String query="Update timeAlloLecture set day='"+comboBox.getSelectedItem()+"',startTime='"+textField.getText()+"',endTime='"+textField_2.getText()+"',room='"+comboBox_4.getSelectedItem()+"'where lectimeAllID='"+textField_10.getText()+"' ";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			}
		});
		btnClear.setBounds(91, 29, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		
		JButton btnSave = new JButton("Delete");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Connection con = DBConnect.connect();
					String query="Delete from timeAlloLecture where lectimeAllID='"+textField_10.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted");
					pst.close();
					
					textField_10.setText("");
					textField_3.setText("");
					textField.setText("");
					textField_2.setText("");
					textField_1.setText("");
					//comboBox_2.setSelectedIndex(0);
					//comboBox_3.setSelectedIndex(0);
					comboBox_4.setSelectedIndex(0);
					//comboBox1.setSelectedIndex(0);
					comboBox.setSelectedIndex(0);
					
					}
					catch(Exception e) {
						e.printStackTrace();
						
					}

			}
		});
		btnSave.setBounds(443, 29, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSave.setForeground(new Color(21, 25, 28));
		btnSave.setBackground(new Color(152, 201, 45));
		
		JButton btnClear_1 = new JButton("Clear");
		btnClear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_10.setText("");
				textField_3.setText("");
				textField.setText("");
				textField_2.setText("");
				textField_1.setText("");
				//comboBox_2.setSelectedIndex(0);
				//comboBox_3.setSelectedIndex(0);
				comboBox_4.setSelectedIndex(0);
				//comboBox1.setSelectedIndex(0);
				comboBox.setSelectedIndex(0);
			}
		});
		btnClear_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear_1.setBounds(789, 29, 238, 50);
		panel_3.add(btnClear_1);
		btnClear_1.setForeground(new Color(21, 25, 28));
		btnClear_1.setBackground(new Color(152, 201, 45));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 166, 1062, 271);
		frmAddNotAvailbleTime.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//String group= comboBox.getSelectedItem().toString();
                int selectedRow=table.getSelectedRow();
                DefaultTableModel model=(DefaultTableModel)table.getModel();
				
                textField_10.setText(table.getValueAt(selectedRow, 0).toString());
                //textField_5.setText(table.getValueAt(selectedRow, 1).toString());
                //comboBox.setName(model.getValueAt(selectedRow, 2).toString());
                
               /* String combolevel1 = table.getValueAt(selectedRow, 2).toString();
      		  for(int j=0;j<comboBox.getItemCount();j++) {
      		  
      		  if(comboBox.getItemAt(j).toString().equalsIgnoreCase(combolevel1)) {
      		  comboBox.setSelectedIndex(j); } }*/
                
               
      		  
                textField_1.setText(table.getValueAt(selectedRow, 1).toString());
                
                //textField_8.setText(table.getValueAt(selectedRow, 7).toString());
               textField_3.setText(table.getValueAt(selectedRow, 2).toString());
                textField_2.setText(table.getValueAt(selectedRow, 6).toString());
                textField.setText(table.getValueAt(selectedRow, 5).toString());
                textField_4.setText(table.getValueAt(selectedRow, 3).toString());
                
                
               /* String comboLevel1 = table.getValueAt(selectedRow, 2).toString();
				for(int i=0; i<comboBox1.getItemCount();i++) {
					if(comboBox1.getItemAt(i).toString().equalsIgnoreCase(comboLevel1)) {
						
						
						comboBox1.setSelectedIndex(i);
					}
				}*/
				
				String comboLevel2 = table.getValueAt(selectedRow, 4).toString();
				for(int i=0; i<comboBox.getItemCount();i++) {
					if(comboBox.getItemAt(i).toString().equalsIgnoreCase(comboLevel2)) {
						
						
						comboBox.setSelectedIndex(i);
					}
				}
				
				String comboLevel3 = table.getValueAt(selectedRow, 7).toString();
				for(int i=0; i<comboBox_4.getItemCount();i++) {
					if(comboBox_4.getItemAt(i).toString().equalsIgnoreCase(comboLevel3)) {
						
						
						comboBox_4.setSelectedIndex(i);
					}
				}
				
				
				
				
				
				/*try {
					Connection con = DBConnect.connect();
					
					String query="select * from studentGroups";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
					//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
					while(rs.next()) {
						String group=rs.getString("groupID");
						String subgroup=rs.getString("subGroupID");
						
						comboBox_2.addItem(group);
						comboBox_3.addItem(subgroup);
					}
					con.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}*/
                

			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		scrollPane.setViewportView(table);
		
		JLabel lblLectimealloid = new JLabel("LecTimeAlloID");
		lblLectimealloid.setForeground(new Color(169, 224, 49));
		lblLectimealloid.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLectimealloid.setBounds(274, 472, 167, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblLectimealloid);
		
		JLabel lblLectureName = new JLabel("Lecture Name");
		lblLectureName.setForeground(new Color(169, 224, 49));
		lblLectureName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLectureName.setBounds(272, 529, 252, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblLectureName);
		
		JLabel lblSubgroup = new JLabel("SubGroup");
		lblSubgroup.setForeground(new Color(169, 224, 49));
		lblSubgroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubgroup.setBounds(272, 583, 252, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSubgroup);
		
		JLabel lblSessionSignature = new JLabel("Session Signature");
		lblSessionSignature.setForeground(new Color(169, 224, 49));
		lblSessionSignature.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSessionSignature.setBounds(272, 663, 252, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSessionSignature);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setForeground(new Color(169, 224, 49));
		lblDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDay.setBounds(821, 473, 203, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblDay);
		
		JLabel lblSatrtTime = new JLabel("Start Time");
		lblSatrtTime.setForeground(new Color(169, 224, 49));
		lblSatrtTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSatrtTime.setBounds(821, 529, 203, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSatrtTime);
		
		JLabel lblEndtime = new JLabel("EndTime");
		lblEndtime.setForeground(new Color(169, 224, 49));
		lblEndtime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEndtime.setBounds(821, 583, 203, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblEndtime);
		
		JLabel lblRoom = new JLabel("Room");
		lblRoom.setForeground(new Color(169, 224, 49));
		lblRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRoom.setBounds(821, 636, 203, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblRoom);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setForeground(Color.WHITE);
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_10.setColumns(10);
		textField_10.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		textField_10.setBackground(new Color(51, 51, 51));
		textField_10.setBounds(525, 462, 274, 34);
		frmAddNotAvailbleTime.getContentPane().add(textField_10);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		textField.setBackground(new Color(51, 51, 51));
		textField.setBounds(1039, 517, 274, 34);
		frmAddNotAvailbleTime.getContentPane().add(textField);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		textField_2.setBackground(new Color(51, 51, 51));
		textField_2.setBounds(1039, 574, 274, 34);
		frmAddNotAvailbleTime.getContentPane().add(textField_2);
		
		 comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Day...", "1.Monday", "2.Tuesday", "3.Wednesday", "4.Thursday", "5.Friday", "6.Saturday", "7.Sunday"}));
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		comboBox.setBackground(new Color(51, 51, 51));
		comboBox.setBounds(1041, 463, 272, 34);
		frmAddNotAvailbleTime.getContentPane().add(comboBox);
		 
		  comboBox_4 = new JComboBox();
		  comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select Room..."}));
		 comboBox_4.setForeground(Color.WHITE);
		 comboBox_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		 comboBox_4.setEditable(true);
		 comboBox_4.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		 comboBox_4.setBackground(new Color(51, 51, 51));
		 comboBox_4.setBounds(1041, 627, 272, 34);
		 frmAddNotAvailbleTime.getContentPane().add(comboBox_4);
		 
		 textField_1 = new JTextField();
		 textField_1.setEditable(false);
		 textField_1.setForeground(Color.WHITE);
		 textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		 textField_1.setColumns(10);
		 textField_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		 textField_1.setBackground(new Color(51, 51, 51));
		 textField_1.setBounds(525, 520, 274, 34);
		 frmAddNotAvailbleTime.getContentPane().add(textField_1);
		 
		 textField_3 = new JTextField();
		 textField_3.setEditable(false);
		 textField_3.setForeground(Color.WHITE);
		 textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		 textField_3.setColumns(10);
		 textField_3.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		 textField_3.setBackground(new Color(51, 51, 51));
		 textField_3.setBounds(525, 574, 274, 34);
		 frmAddNotAvailbleTime.getContentPane().add(textField_3);
		 
		 JScrollPane scrollPane_1 = new JScrollPane();
		 scrollPane_1.setBounds(272, 691, 1040, 53);
		 frmAddNotAvailbleTime.getContentPane().add(scrollPane_1);
		 
		  textField_4 = new JTextPane();
		  textField_4.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		  textField_4.setBackground(new Color(51, 51, 51));
		  textField_4.setForeground(Color.WHITE);
		  textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		 scrollPane_1.setViewportView(textField_4);
		
		
		//fillComboBox2();
		//fillComboBox();
		fillComboBox4();
		//fillComboBox5();
	    
	}
}
