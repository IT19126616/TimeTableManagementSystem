package section6;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import java.awt.ScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Scrollbar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class LecTimetable {

	private JFrame frame;
	private JTable table;
	private JTable table_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LecTimetable window = new LecTimetable();
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
	public LecTimetable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(21,25,28));
		frame.setBackground(Color.YELLOW);
		frame.setResizable(false);
		frame.setTitle("Timetable For Lecturer");
		//frmAddStudentGroups.setBounds(350, 90, 1350, 900);
		
		frame.setSize(1500, 2000);
		/*
		 * frmAddStudentGroups.getContentPane().setBackground(new Color(21,25,28));
		frmAddStudentGroups.setBackground(Color.YELLOW);
		frmAddStudentGroups.setResizable(false);
		frmAddStudentGroups.setTitle("Add Lecturer");
		//frmAddStudentGroups.setBounds(350, 90, 1350, 900);
	
		frmAddStudentGroups.setSize(1500, 2000);*/
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(272, 164, 905, 210);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		
		table_1.setRowHeight(30);
		table_1.setRowHeight(2,70);
		
		
		scrollPane_1.setRowHeaderView(table_1);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
			
		});
		
		
	}

}
