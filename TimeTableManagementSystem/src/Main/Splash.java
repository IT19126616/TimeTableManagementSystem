package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Splash {

	private JFrame frame;
	private static JProgressBar progressBar;
	private static JLabel label_3;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		
				int x;
				Login window2 = new Login();
				Splash window = new Splash();
				
				window.frame.setVisible(true);
				//window2.frmAddNotAvailbleTime.setVisible(true);
				try {
					for(x=0;x<=100;x++) {
						Splash.progressBar.setValue(x);
						Thread.sleep(100);
						Splash.label_3.setText(Integer.toString(x)+ " %");
						//window2.frmAddNotAvailbleTime.setVisible(true);
						//window.frame.setVisible(false);
					//Thread.sleep(50);
				}
				}catch (Exception e) {
					e.printStackTrace();
				}
				window2.frmAddNotAvailbleTime.setVisible(true);
				window.frame.setVisible(false);
				//window2.frmAddNotAvailbleTime.setVisible(false);
			
	}

	/**
	 * Create the application.
	 */
	public Splash() {
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
		///
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(21, 25, 28));
		panel.setBounds(0, 0, 1344, 861);
		frame.getContentPane().add(panel);
		
		JButton button = new JButton("");
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(24, 11, 49, 48);
		panel.add(button);
		button.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Twitter_32px_2.png")));
		button.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Twitter_32px.png")));
		
		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(94, 11, 49, 48);
		panel.add(button_1);
		button_1.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Facebook_32px_7.png")));
		button_1.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Facebook_32px_2.png")));
		
		JButton button_2 = new JButton("");
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBorder(null);
		button_2.setBounds(174, 11, 49, 48);
		panel.add(button_2);
		button_2.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Instagram_32px_3.png")));
		button_2.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Instagram_32px.png")));
		
		JButton button_3 = new JButton("");
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBorder(null);
		button_3.setBounds(252, 11, 49, 48);
		panel.add(button_3);
		button_3.setIcon(new ImageIcon(this.getClass().getResource("/icons8_Secured_Letter_32px_2.png")));
		button_3.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_Secured_Letter_32px.png")));
		
		JButton button_4 = new JButton("");
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setBorder(null);
		button_4.setBounds(328, 11, 49, 48);
		panel.add(button_4);
		button_4.setIcon(new ImageIcon(this.getClass().getResource("/icons8_YouTube_32px_1.png")));
		button_4.setRolloverIcon(new ImageIcon(this.getClass().getResource("/icons8_YouTube_32px.png")));
		
		JLabel label = new JLabel("Connect With Us On ");
		label.setForeground(new Color(169, 224, 49));
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		label.setBounds(34, 63, 192, 28);
		panel.add(label);
		
		JLabel label_1 = new JLabel("TimeTable Management System");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 45));
		label_1.setBounds(349, 553, 660, 88);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		
		label_2.setBounds(423, 147, 496, 397);
		panel.add(label_2);
		//ImageIcon image = new ImageIcon(this.getClass().getResource("/logo.png.png/"));
		label_2.setIcon(new ImageIcon(this.getClass().getResource("/logo.gif")));
		//label_2.setIcon(image);
		
		 progressBar = new JProgressBar();
		progressBar.setVerifyInputWhenFocusTarget(false);
		progressBar.setRequestFocusEnabled(false);
		progressBar.setFocusable(false);
		progressBar.setBorderPainted(false);
		progressBar.setBounds(0, 799, 1344, 51);
		panel.add(progressBar);
		
		 label_3 = new JLabel("");
		label_3.setForeground(new Color(169, 224, 49));
		label_3.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		label_3.setBounds(640, 728, 71, 48);
		panel.add(label_3);
		
		JLabel lblNewLabel = new JLabel("To have a better Experience, Please make sure your Computer Text size should be 100%(Recommended) & Resolution level 1920 x 1080");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel.setBounds(115, 668, 1195, 37);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 1344, 80);
		frame.getContentPane().add(panel_1);
		
		JLabel label_4 = new JLabel("Time Table Management System");
		label_4.setForeground(new Color(152, 201, 45));
		label_4.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		label_4.setBackground(new Color(0, 102, 102));
		label_4.setBounds(261, 5, 822, 61);
		panel_1.add(label_4);
		
		
		//Login();
	}
	
}
