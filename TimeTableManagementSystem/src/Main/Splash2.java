package Main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Section_6.Rooms_TimeTable;

import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Splash2 {

	private JFrame frame;

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
					Splash2 window = new Splash2();
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
	public Splash2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setResizable(false);
		frame.setBounds(550, 350, 856, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnPleaseMakeSure = new JTextPane();
		txtpnPleaseMakeSure.setBackground(Color.BLACK);
		txtpnPleaseMakeSure.setForeground(Color.YELLOW);
		txtpnPleaseMakeSure.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		txtpnPleaseMakeSure.setText("To have a better Experience, Please make sure your Computer Scale & Layout must change according to this.\r\n");
		txtpnPleaseMakeSure.setBounds(124, 49, 589, 60);
		frame.getContentPane().add(txtpnPleaseMakeSure);
		
		JButton btnStart = new JButton("Let's Get Started");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Splash abc =new Splash();
				try {
					Splash.main(null);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				frame.setVisible(false);
			}
		});
		btnStart.setForeground(new Color(21, 25, 28));
		btnStart.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnStart.setBackground(Color.GREEN);
		btnStart.setBounds(577, 219, 238, 50);
		frame.getContentPane().add(btnStart);
		
		JTextPane txtpntextSizeOf = new JTextPane();
		txtpntextSizeOf.setText("(Text size of the screen should be 100%(Recommended) & Resolution level 1920 x 1080)");
		txtpntextSizeOf.setForeground(Color.YELLOW);
		txtpntextSizeOf.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		txtpntextSizeOf.setBackground(Color.BLACK);
		txtpntextSizeOf.setBounds(124, 107, 589, 70);
		frame.getContentPane().add(txtpntextSizeOf);
		
		JLabel lblNewLabel = new JLabel(">>>>>");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(442, 220, 125, 39);
		frame.getContentPane().add(lblNewLabel);
	}
}
