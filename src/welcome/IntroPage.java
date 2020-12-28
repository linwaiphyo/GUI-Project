package welcome;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.CardLayout;
import java.awt.Color;

public class IntroPage {

	private JFrame frmEmpManagementSystem;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroPage window = new IntroPage();
					window.frmEmpManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IntroPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmpManagementSystem = new JFrame();
		frmEmpManagementSystem.setTitle("EMP Management System");
		frmEmpManagementSystem.getContentPane().setBackground(Color.RED);
		frmEmpManagementSystem.setBounds(100, 100, 684, 490);
		frmEmpManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmpManagementSystem.getContentPane().setLayout(null);
		frmEmpManagementSystem.setLocationRelativeTo(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(124, 157, 109, 17);
		frmEmpManagementSystem.getContentPane().add(passwordField);
		
		JLabel JLabel = new JLabel("Password");
		JLabel.setBounds(19, 153, 74, 20);
		JLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		JLabel.setLabelFor(passwordField);
		frmEmpManagementSystem.getContentPane().add(JLabel);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(10, 104, 107, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmEmpManagementSystem.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(126, 107, 107, 20);
		frmEmpManagementSystem.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(147, 214, 86, 20);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmEmpManagementSystem.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String username = textField.getText();
				String password = passwordField.getText();
				JButton src = (JButton) e.getSource();
				
				
				if (src.equals(btnNewButton)) {
					
					if((username.equals("linwaiphyo")) && (password.equals("123456"))) {
						
						JLabel logedin = new JLabel("Log in successful");
						logedin.setBounds(25, 250, 200, 20);
						logedin.setFont(new Font("Tahoma", Font.BOLD, 12));
						frmEmpManagementSystem.getContentPane().add(logedin);
						logedin.setBackground(Color.black);
						
					}
					else {
						
						JLabel notLogedin = new JLabel("Incorrect Username or Password");
						notLogedin.setBounds(25, 250, 300, 20);
						notLogedin.setFont(new Font("Tahoma", Font.BOLD, 12));
						frmEmpManagementSystem.getContentPane().add(notLogedin);
						notLogedin.setBackground(Color.black);
						
					}
				} 
				
			}
			
		});
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(194, 0, 476, 453);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User-KMC\\Downloads\\download.jpg"));
		frmEmpManagementSystem.getContentPane().add(lblNewLabel_1);
		
		
		
		
	}
}
