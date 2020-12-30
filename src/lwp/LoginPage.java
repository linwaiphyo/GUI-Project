package lwp;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class LoginPage extends JFrame{

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setTitle("EMP Management System\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1257, 771);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		
		JLabel picture = new JLabel("");
		picture.setBackground(Color.RED);
		picture.setIcon(new ImageIcon("C:\\Users\\User-KMC\\Downloads\\Stg591C (2).jpg"));
		picture.setBounds(452, 0, 789, 732);
		contentPane.add(picture);
		
		JLabel welcome = new JLabel("Welcome Back !");
		welcome.setFont(new Font("Consolas", Font.BOLD, 30));
		welcome.setBounds(158, 100, 247, 56);
		contentPane.add(welcome);
		
		JLabel usernametext = new JLabel("Username :");
		usernametext.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		usernametext.setBounds(56, 265, 128, 28);
		contentPane.add(usernametext);
		
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		usernameField.setBounds(214, 269, 206, 28);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel passwordText = new JLabel("Password :");
		passwordText.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		passwordText.setBounds(56, 363, 128, 28);
		contentPane.add(passwordText);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordField.setBounds(214, 367, 206, 28);
		contentPane.add(passwordField);
		
		final JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = passwordField.getText();
				JButton src = (JButton) e.getSource();
				
					if(username.equals("linwaiphyo") && password.equals("123123")){
				
						JOptionPane.showMessageDialog(contentPane,"Login Successful!" );				
		             }
					else {
						JOptionPane.showMessageDialog(contentPane, "Invalid Username or Passowrd :)");
					}
				}
				
			
		});
		loginButton.setFont(new Font("SansSerif", Font.BOLD, 20));
		loginButton.setBounds(331, 459, 89, 38);
		contentPane.add(loginButton);
	}
}