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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
//import javax.swing.text.html.Option;
import javax.swing.text.html.Option;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import Main.Dashboard;
import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class AddNotAvailableTime {

	private JFrame frmAddNotAvailbleTime;
	private JComboBox comboBox;
	private JComboBox comboBox_3;
	private JComboBox<String> comboBox_4;
	private JSpinner spinner;
	private JSpinner spinner_1;
	private JSpinner spinner_2;
	private JSpinner spinner_3;
	private JComboBox comboBox_5;
	String temp ;
	String abc;
	List<Option> options;
	private String lecName;
	private JTextField comboBox_1;
	
	
	

   

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
		//AutoCompleteDecorator.decorate(comboBox_4);
	}
	
	
	
	
	public void fillComboBox4() {
		
		//AutoCompleteDecrator.decarate(comboBox_4);
		
		/*try {
			Connection con = DBConnect.connect();
			
			String query="select * from location";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String room=rs.getString("roomName");
				comboBox_1.addItem(room);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
	}
	
	public void fillComboBox3() {
			
            //String temp = String.valueOf(comboBox_4.getSelectedItem());
			//String temp2 = comboBox_4.getSelectedItem().toString();
		String selection=(String)comboBox.getSelectedItem();
		System.out.println(selection);
		
		

			try {
				String lecName=(String)comboBox.getSelectedItem();
				
				Connection con = DBConnect.connect();
			
			
			
				String query="select * from roomSession";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
				//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
				while(rs.next()) {
					String sessionSignature=rs.getString("sessionSignature");
					comboBox_4.addItem(sessionSignature);
				}
			//comboBox_4 = new JComboBox(options.toArray());

			
			//selection=null;
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		
		
	}
	/*public ArrayList<Sesssion_Sign> getAllCustomers() 
	{
	    ArrayList<Sesssion_Sign> customers = new ArrayList<Sesssion_Sign>();
	    Sesssion_Sign customer = null;
	    Connection c;
	    try {
	    	Connection con = DBConnect.connect();
	        Statement statement = con.createStatement();
	        String s = "SELECT * FROM session";

	        ResultSet rs = statement.executeQuery(s);
	        int g =0;

	        while (rs.next()) {

	            customer.setLectureName(rs.getString("lec1Name"));
	            customer.setSessionSign(rs.getString("sessionSignature"));

	            

	            customers.add(customer);
	        }

	        rs.close();
	    } catch (Exception e) {
	        System.out.println(e);
	    }

	    return customers;
	}*/
	
	/*public class TimeZoneSpinners {
		Date date = new Date();
		SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.MINUTE);

		JSpinner spinner = new JSpinner(sm);
		JSpinner.DateEditor de = new JSpinner.DateEditor(spinner, "hh:mm a");
		de.getTextField().setEditable( false );
		spinner.setEditor(de);

		System.out.println("Spinner:      "+de.getFormat().format(spinner.getValue()));
	}*/
	
	public void fillComboBox() {
		//lecName=comboBox.getSelectedItem();
		
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from lecturers";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				 lecName=rs.getString("lectureName");
				comboBox.addItem(lecName);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fillComboBox2() {
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
				
				//comboBox_2.addItem(group);
				comboBox_3.addItem(subgroup);
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
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManageNotAvailableTime itm = new ManageNotAvailableTime();
				try {
					ManageNotAvailableTime.main(null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnManageGroups.setBounds(12, 383, 238, 50);
		btnManageGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
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
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		lbli.setIcon(new ImageIcon(this.getClass().getResource("/tt.png")));
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
		lblNewLabel_2.setBounds(272, 279, 252, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		
		JLabel lblNewLabel_2_1 = new JLabel("Select Session Signature");
		lblNewLabel_2_1.setBounds(272, 165, 241, 25);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(new Color(0, 0, 0));
		frmAddNotAvailbleTime.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedIndex(0);
				comboBox_4.setSelectedIndex(0);
				//comboBox_2.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				comboBox_1.setText("");
				comboBox_5.setSelectedIndex(0);
				 spinner.setValue(0);
				 spinner_1.setValue(0);
				 spinner_2.setValue(0);
				 spinner_3.setValue(0);
				//spinner.setValue(((SpinnerNumberModel) spinner.getModel()));
			}
		});
		btnClear.setBounds(268, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		
		JButton btnSave = new JButton("Submit");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String lecname= comboBox.getSelectedItem().toString();
				//String group= comboBox_2.getSelectedItem().toString();
				String subgroup= comboBox_3.getSelectedItem().toString();
				String signature= comboBox_4.getSelectedItem().toString();
				System.out.println(signature);
				String day= comboBox_5.getSelectedItem().toString();
				String room= comboBox_1.getText().toString();
				String starttime= spinner.getValue().toString()+":"+spinner_1.getValue().toString();
				String endtime= spinner_2.getValue().toString()+":"+spinner_3.getValue().toString();
				
				if(comboBox.getSelectedItem().equals("Select Lecturer...")) {
					JOptionPane.showMessageDialog(null, "Please Select Lecturer!!!");
				}
				
				
				else if(comboBox_3.getSelectedItem().equals("Select Sub Group...")) {
					JOptionPane.showMessageDialog(null, "Please Select Sub Group!!!");
				}
				else if(comboBox_4.getSelectedItem().equals("Select Session Signature...")) {
					JOptionPane.showMessageDialog(null, "Please Select Session Signatue!!!");
				}
				else if(comboBox_5.getSelectedItem().equals("Select Day...")) {
					JOptionPane.showMessageDialog(null, "Please Select Day!!!");
				}
				else if(comboBox_1.getText().equals("Select Room...")) {
					JOptionPane.showMessageDialog(null, "Please Select Room!!!");
				}
				else if(spinner.getValue().equals(0)) {
					JOptionPane.showMessageDialog(null, "Please Select start Time !!!");
				}
                else if(spinner_2.getValue().equals(0)) {
					JOptionPane.showMessageDialog(null, "Please Select End Time!!!");
				}
				
				else {
				try {
					 Connection con = DBConnect.connect();

	                    String query = "INSERT INTO timeAlloLecture values(null, '" + lecname + "','" + subgroup + "','" +
	                    		signature + "','" + day + "','" + starttime + "','"+ endtime +"','"+ room +"')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(btnSave, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnSave,
	                            "Successfully added!!!");
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                	
	                }
			}
			}
		});
		btnSave.setBounds(518, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSave.setForeground(new Color(21, 25, 28));
		btnSave.setBackground(new Color(152, 201, 45));

		
		 comboBox = new JComboBox();
		 comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(new Color(51, 51, 51));
	    //comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}));
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox.setBounds(520, 273, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox);
		comboBox.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblSelectSubGroup = new JLabel("Select Sub Group");
		lblSelectSubGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectSubGroup.setBounds(833, 279, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectSubGroup);
		lblSelectSubGroup.setForeground(new Color(169, 224, 49));
		
		 comboBox_3 = new JComboBox();
		comboBox_3.setForeground(Color.WHITE);
		comboBox_3.setBackground(new Color(51, 51, 51));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select Sub Group..."}));
		comboBox_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_3.setBounds(1072, 273, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_3);
		comboBox_3.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblSelectRoom = new JLabel("Select Room");
		lblSelectRoom.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectRoom.setBounds(272, 389, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectRoom);
		lblSelectRoom.setForeground(new Color(169, 224, 49));
		
		 comboBox_4 = new JComboBox();
		 comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select Session Signature..."}));
		 comboBox_4.setEditable(true);
		 comboBox_4.setSelectedItem(" ");
		 
		 comboBox_4.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		
		 		
		 		try {
					String room = comboBox_4.getSelectedItem().toString();
					Connection con = DBConnect.connect();
					String query = "select * from roomSession where sessionSignature = '" + room + "'";
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					
					while (rs.next()) {

						String name = rs.getString("room");
						comboBox_1.setText(name);
						
					}
					con.close();
				} catch (Exception e) {
					
				}
		 		
		 		
		 		/*comboBox_4.removeAllItems();
		 		Sesssion_Sign customers = new Sesssion_Sign(lecName, null);
		        ArrayList<Sesssion_Sign> list = customers.getData((int)comboBox.getSelectedItem());
		        for(int i = 0; i < list.size(); i++){
		        	comboBox_4.addItem(list.get(i).getLectureName());
		 		
		 		
		 		
		 		
		 		
				/*try {
				
					
					Connection con = DBConnect.connect();
				
				
				
				String query="select * from session s, lecturers l where s.lecID = l.lid and s.lecID = (select lid from lecturers where lectureName = '"+comboBox_4+"' ) ";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
				//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
				while(rs.next()) {
					String signature=rs.getString("sessionSignature");
					comboBox_4.addItem(signature);
				}
				con.close();
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		        }*/
		 	}
		 });
		comboBox_4.setForeground(Color.WHITE);
		//AutoCompleteDecorator.decorate(comboBox_4);
		comboBox_4.setBackground(new Color(51, 51, 51));
		comboBox_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_4.setBounds(272, 199, 1062, 38);
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
		
		 spinner = new JSpinner();
		 spinner.setModel(new SpinnerNumberModel(0, 0, 23, 1));
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
		
		 spinner_1 = new JSpinner();
		 spinner_1.setModel(new SpinnerNumberModel(0, 0, 59, 5));
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
		
		 comboBox_5 = new JComboBox();
		comboBox_5.setForeground(Color.WHITE);
		comboBox_5.setBackground(new Color(51, 51, 51));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Select Day...", "1.Monday", "2.Tuesday", "3.Wednesday", "4.Thursday", "5.Friday", "6.Saturday", "7.Sunday"}));
		comboBox_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_5.setBounds(1072, 376, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_5);
		comboBox_5.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblEndTime = new JLabel("End Time");
		lblEndTime.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblEndTime.setBounds(272, 543, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblEndTime);
		lblEndTime.setForeground(new Color(169, 224, 49));
		
		 spinner_2 = new JSpinner();
		 spinner_2.setModel(new SpinnerNumberModel(0, 0, 23, 1));
		spinner_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner_2.setBounds(520, 537, 135, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner_2);
		spinner_2.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel label_3 = new JLabel("Hours");
		label_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		label_3.setBounds(685, 550, 96, 25);
		frmAddNotAvailbleTime.getContentPane().add(label_3);
		label_3.setForeground(new Color(169, 224, 49));
		
		 spinner_3 = new JSpinner();
		 spinner_3.setModel(new SpinnerNumberModel(0, 0, 59, 5));
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
		separator_1.setBounds(814, 280, 20, 134);
		frmAddNotAvailbleTime.getContentPane().add(separator_1);
		
		comboBox_1 = new JTextField();
		comboBox_1.setBounds(520, 376, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_1);
		comboBox_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		comboBox_1.setBackground(new Color(51, 51, 51));
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_1.setColumns(10);
		

		
		fillComboBox();
		fillComboBox2();
		fillComboBox3();
		fillComboBox4();
		 //getAllCustomers();
	}
}
