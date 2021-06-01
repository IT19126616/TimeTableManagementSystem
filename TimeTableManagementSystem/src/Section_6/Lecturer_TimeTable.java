package Section_6;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

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
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import Main.Dashboard;

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;

public class Lecturer_TimeTable {

	private JFrame frmAddNotAvailbleTime;
	private JComboBox comboBox;
	private JTable table;

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
					Lecturer_TimeTable window = new Lecturer_TimeTable();
					window.frmAddNotAvailbleTime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
				
				//comboBox1.addItem(group);
				//comboBox_2.addItem(subgroup);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fillComboBox() {
		try {
			Connection con = DBConnect.connect();
			
			String query="select DISTINCT lectureName from lecturers";
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
				//comboBox_1.addItem(room);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fillComboBox5() {
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from timeAlloLecture ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String lecturename=rs.getString("lecName");
				comboBox.addItem(lecturename);
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
	public Lecturer_TimeTable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddNotAvailbleTime = new JFrame();
		/*frmAddNotAvailbleTime.addWindowListener(new WindowAdapter() {
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
		});*/
		frmAddNotAvailbleTime.getContentPane().setBackground(new Color(21,25,28));
		frmAddNotAvailbleTime.setBackground(Color.YELLOW);
		frmAddNotAvailbleTime.setResizable(false);
		frmAddNotAvailbleTime.setTitle("Time Tables");
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
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(169, 224, 49));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 77, 262, 794);
		panel_1.setBackground(new Color(51, 51, 51));
		frmAddNotAvailbleTime.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Table for Lecturers");
		btnNewButton.setBounds(12, 319, 252, 50);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		
		JButton btnManageGroups = new JButton("Table for Rooms");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rooms_TimeTable abc =new Rooms_TimeTable();
				try {
					Rooms_TimeTable.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnManageGroups.setBounds(12, 383, 240, 50);
		btnManageGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		btnManageGroups.setForeground(new Color(21, 25, 28));
		btnManageGroups.setBackground(new Color(152, 201, 45));
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard itm = new Dashboard();
				try {
					Dashboard.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnViewGroups_1.setBounds(12, 681, 238, 50);
		btnViewGroups_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		lbli.setIcon(new ImageIcon(this.getClass().getResource("/tt.png")));
		panel_1.add(lbli);
		
		JButton btnTableForStudents = new JButton("Table for Students");
		btnTableForStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student_TimeTable abc =new Student_TimeTable();
				try {
					Student_TimeTable.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frmAddNotAvailbleTime.setVisible(false);
			}
		});
		btnTableForStudents.setForeground(new Color(21, 25, 28));
		btnTableForStudents.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnTableForStudents.setBackground(new Color(152, 201, 45));
		btnTableForStudents.setBounds(12, 447, 240, 50);
		panel_1.add(btnTableForStudents);
		
		JLabel lblNewLabel_1 = new JLabel("Time Table for Lecturers");
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
		panel_3.setBounds(261, 711, 1098, 124);
		panel_3.setBackground(new Color(0, 0, 0));
		frmAddNotAvailbleTime.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnPrintTimeTable = new JButton("Print Timetable");
		btnPrintTimeTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
	            	
	                
	                MessageFormat header = new MessageFormat("Time Table Management System");
	                MessageFormat footer = new MessageFormat("Page{0,number,integer}");
	                table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
	            }catch(java.awt.print.PrinterException er){
	                System.err.format("Cannot print %s%n", er.getMessage());
	            }
			}
		});
		btnPrintTimeTable.setForeground(new Color(21, 25, 28));
		btnPrintTimeTable.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		btnPrintTimeTable.setBackground(new Color(152, 201, 45));
		btnPrintTimeTable.setBounds(405, 42, 295, 50);
		panel_3.add(btnPrintTimeTable);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 242, 1062, 428);
		frmAddNotAvailbleTime.getContentPane().add(scrollPane);
		
		table = new JTable() {
			@Override
		       public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		           Component component = super.prepareRenderer(renderer, row, column);
		           int rendererWidth = component.getPreferredSize().width;
		           TableColumn tableColumn = getColumnModel().getColumn(column);
		           tableColumn.setPreferredWidth(Math.max(rendererWidth + getIntercellSpacing().width, tableColumn.getPreferredWidth()));
		           return component;
		        }
	
		};
		table.setRowHeight(100);
		table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		scrollPane.setViewportView(table);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		 comboBox = new JComboBox();
		 comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		comboBox.setBounds(704, 171, 321, 33);
		frmAddNotAvailbleTime.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Generate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection con = DBConnect.connect();
					
					String query="select day,startTime,endTime,sessionSign from timeAlloLecture where lecName='"+comboBox.getSelectedItem()+"' order by day,startTime,endTime";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					TableColumnModel columnModel = table.getColumnModel();
					columnModel.getColumn(0).setPreferredWidth(40);
					columnModel.getColumn(1).setPreferredWidth(5);
					columnModel.getColumn(2).setPreferredWidth(5);
					columnModel.getColumn(3).setPreferredWidth(800);
					
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(1114, 171, 115, 33);
		btnNewButton_1.setForeground(new Color(21, 25, 28));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		btnNewButton_1.setBackground(new Color(152, 201, 45));
		frmAddNotAvailbleTime.getContentPane().add(btnNewButton_1);
		
		
		
		fillComboBox();
	
	    
	}
}
