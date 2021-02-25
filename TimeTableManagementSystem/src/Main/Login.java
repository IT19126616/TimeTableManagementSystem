package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dbConnect.DBConnect;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(350, 90, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(515, 295, 587, 85);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(165, 299, 208, 70);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(165, 470, 208, 72);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username=textField.getText();
				String password=passwordField.getText();
				
				if(textField.getText().equals("")||passwordField.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill the form");
				}
				else {
				try {
					Connection con = DBConnect.connect();
					
					String query="select username,password from login where username=? and password=?";
					PreparedStatement pst=con.prepareStatement(query);
					pst.setString(1, username);
					pst.setString(2, password);
					ResultSet rs=pst.executeQuery();
					
					int count=0;
					while(rs.next()) {
						count=count+1;
					}
					if(count==1) {
						JOptionPane.showMessageDialog(null, "UserName and Password is correct");
						
						
					}
					else if(count>1) {
						JOptionPane.showMessageDialog(null, "Duplicate UserName and Password");
					}
					else {
						JOptionPane.showMessageDialog(null, "UserName and Password is incorrect Try Again!!!");
					}
					rs.close();
					pst.close();
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
}
				
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(866, 692, 236, 70);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(515, 456, 581, 85);
		frame.getContentPane().add(passwordField);
	}

}
