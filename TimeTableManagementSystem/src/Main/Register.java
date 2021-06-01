package Main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import dbConnect.DBConnect;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class Register {

	private JFrame frame;
	private JLabel lblNewLabel_1;
	private JLabel lbli;
	private JTextField textField;
	private JLabel lblNewLabel_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.frame.setVisible(true);
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
					
					lblNewLabel_5.setText("Time - "+hour+":"+minute+":"+second+"  Date - "+year+"/"+month+"/"+day);
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
	public Register() {
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBackground(Color.YELLOW);
		frame.setResizable(false);
		frame.setTitle("Login");
		frame.setBounds(350, 90, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//
		
		///
				
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1360, 80);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBackground(new Color(0, 102, 102));
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(152, 201, 45));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 693, 793);
		panel_1.setBackground(new Color(21,25,28));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(24, 11, 49, 48);
		panel_1.add(btnNewButton_1);
		
		btnNewButton_1.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Twitter_32px_2.png"))); // NOI18N
       // jButton2.setToolTipText("Twitter");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Twitter_32px.png"))); // NOI18N
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Facebook_32px_7.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(94, 11, 49, 48);
		panel_1.add(button);
		button.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Facebook_32px_2.png")));
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Instagram_32px_3.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(174, 11, 49, 48);
		panel_1.add(button_1);
		button_1.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Instagram_32px.png")));
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Secured_Letter_32px_2.png")));
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBorder(null);
		button_2.setBounds(252, 11, 49, 48);
		panel_1.add(button_2);
		button_2.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Secured_Letter_32px.png")));
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(this.getClass().getResource("/icons8_YouTube_32px_1.png")));
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBorder(null);
		button_3.setBounds(328, 11, 49, 48);
		panel_1.add(button_3);
		button_3.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_YouTube_32px.png")));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(269, 109, 118, 131);
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/user.png")));
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		textField.setForeground(Color.WHITE);
		textField.setBackground(new Color(51, 51, 51));
		textField.setBounds(174, 289, 312, 48);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username=textField.getText();
				String password=passwordField.getText();
				Dashboard itm = new Dashboard();
				
				String msg = "" + username;
                msg += " \n";
                
              /*  Dashboard itm = new Dashboard();
				try {
					Dashboard.main(null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmAddStudentGroups.setVisible(false);
			}*/
				
                try {
					if(textField.getText().equals("")||passwordField.getText().equals("")||passwordField_1.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Please fill the form");
					}
					
					else if(passwordField.getText().equals(passwordField_1.getText())) {
						
						
						
						Connection con = DBConnect.connect();
						
						String query="insert into login (username,password) values(?,?)";
						
						PreparedStatement pst=con.prepareStatement(query);
						
						   pst.setString(1, textField.getText());
			                pst.setString(2, passwordField.getText());
			                ;
			                pst.execute();
			                
			                JOptionPane.showMessageDialog(null, "Account Created Successfully");
			                
			                textField.setText(null);
			                passwordField.setText(null);
			                Dashboard.main(null);
			                
			                frame.setVisible(false);
						
					}
					

						
					else {
						
                	
						JOptionPane.showMessageDialog(null, "Missmatch in Your Second Password!..");
			                
						
					}
                }
					
					
				catch(Exception w) {
					
					JOptionPane.showMessageDialog(null, w );
				}
			}
		});
		btnNewButton_2.setBackground(new Color(152, 201, 45));
		btnNewButton_2.setForeground(new Color(51, 51, 51));
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton_2.setBounds(174, 645, 312, 48);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Connect With Us On ");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new java.awt.Color(169, 224, 49));
		lblNewLabel_4.setBounds(34, 63, 192, 28);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(new Color(169, 224, 49));
		lblUserName.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblUserName.setBounds(269, 250, 155, 28);
		panel_1.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(169, 224, 49));
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblPassword.setBounds(269, 379, 147, 28);
		panel_1.add(lblPassword);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Male_User_35px.png"))); 
		lblNewLabel_3.setBounds(121, 299, 43, 35);
		panel_1.add(lblNewLabel_3);
		
		JLabel label = new JLabel("New label");
		label.setBounds(121, 428, 43, 35);
		label.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Lock_35px.png")));
		panel_1.add(label);
		
		JLabel lblReenterPassword = new JLabel("Re-Enter Password");
		lblReenterPassword.setForeground(new Color(169, 224, 49));
		lblReenterPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblReenterPassword.setBounds(235, 508, 207, 28);
		panel_1.add(lblReenterPassword);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(121, 557, 43, 35);
		label_1.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Lock_35px.png")));
		panel_1.add(label_1);
		
		JLabel lblAlreadyHaveA = new JLabel("Already Have a Account ? ");
		lblAlreadyHaveA.setForeground(new Color(169, 224, 49));
		lblAlreadyHaveA.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblAlreadyHaveA.setBounds(156, 724, 251, 28);
		panel_1.add(lblAlreadyHaveA);
		
		JLabel lblSignInHere = new JLabel("Login....");
		lblSignInHere.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Login abc =new Login();
				try {
					Login.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frame.setVisible(false);
			}
		});
		lblSignInHere.setForeground(Color.CYAN);
		lblSignInHere.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSignInHere.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblSignInHere.setBounds(401, 724, 161, 28);
		panel_1.add(lblSignInHere);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		passwordField.setBackground(new Color(51, 51, 51));
		passwordField.setBounds(174, 418, 312, 48);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setForeground(Color.WHITE);
		passwordField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		passwordField_1.setBackground(new Color(51, 51, 51));
		passwordField_1.setBounds(174, 547, 312, 48);
		panel_1.add(passwordField_1);
        
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(694, 78, 666, 793);
		panel_3.setBackground(new Color(31,36,42));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		
		 lbli = new JLabel("");
		lbli.setBounds(79, 41, 500, 438);
		panel_3.add(lbli);
		lbli.setIcon(new ImageIcon(this.getClass().getResource("/ttt.gif")));
		//lbli.setIcon(image);
		
		lblNewLabel_5 = new JLabel("Clock");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_5.setBounds(101, 490, 490, 157);
		panel_3.add(lblNewLabel_5);
	}
}
