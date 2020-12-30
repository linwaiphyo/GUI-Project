package lwp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MenuPage extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPage window = new MenuPage();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPage() {
		getContentPane().setBackground(Color.CYAN);
		contentPane = new JPanel();
		setBounds(100, 100, 1257, 771);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JButton homeButton = new JButton("Home");
		homeButton.setForeground(Color.WHITE);
		homeButton.setBackground(Color.BLACK);
		homeButton.setVerticalAlignment(SwingConstants.BOTTOM);
		homeButton.setFont(new Font("Tekton Pro", Font.PLAIN, 18));
		homeButton.setBounds(96, 216, 102, 34);
		getContentPane().add(homeButton);
		
		JButton registerButton = new JButton("Register");
		registerButton.setForeground(Color.WHITE);
		registerButton.setBackground(Color.BLACK);
		registerButton.setVerticalAlignment(SwingConstants.BOTTOM);
		registerButton.setFont(new Font("Tekton Pro", Font.PLAIN, 18));
		registerButton.setBounds(96, 306, 102, 34);
		getContentPane().add(registerButton);
		
		JButton btnNewButton = new JButton("Display");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tekton Pro", Font.PLAIN, 18));
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setBounds(96, 392, 102, 34);
		getContentPane().add(btnNewButton);
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(null);
		
	}
}
