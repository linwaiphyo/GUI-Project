package lwp;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class MenuPage {

	private JFrame frmEmpManagementSystem;
	private JTextField empID;
	private JTextField empName;
	private JTextField mail;
	private JTextField empPos;
	private CardLayout card = new CardLayout();
	JTable table = new JTable();
	final DefaultTableModel model = new DefaultTableModel();
	
	static boolean isValid(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		   return email.matches(regex);
	}

	/**
	 * Launch the application.
	 */
	
			public void run() {
				try {
					MenuPage window = new MenuPage();
					window.frmEmpManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
	/**
	 * Create the application.
	 */
	public MenuPage() {
		frmEmpManagementSystem = new JFrame();	
		frmEmpManagementSystem.setTitle("EMP Management System");
		frmEmpManagementSystem.getContentPane().setBackground(new Color(255, 0, 0));
		frmEmpManagementSystem.setBounds(100, 100, 1257, 771);
		frmEmpManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmpManagementSystem.getContentPane().setLayout(null);
		
		final JPanel parentPanel = new JPanel();
		parentPanel.setBackground(new Color(123, 104, 238));
		parentPanel.setBounds(310, 0, 931, 732);
		frmEmpManagementSystem.getContentPane().add(parentPanel);
		parentPanel.setLayout(card);
		
		JPanel menuPage = new JPanel();
		menuPage.setBackground(Color.BLACK);
		parentPanel.add(menuPage, "menuPage");
		menuPage.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User-KMC\\Downloads\\wp2720202-wayne-rooney-hd-wallpa.png"));
		lblNewLabel.setBounds(0, 0, 931, 732);
		menuPage.add(lblNewLabel);
		
		final JPanel homePage = new JPanel();
		parentPanel.add(homePage, "homePage");
		homePage.setBackground(new Color(0, 0, 0));
		homePage.setLayout(null);
		
		JLabel lblEmpManagementSystem = new JLabel("Employee Management System");
		lblEmpManagementSystem.setForeground(new Color(255, 255, 255));
		lblEmpManagementSystem.setFont(new Font("Sitka Small", Font.BOLD, 29));
		lblEmpManagementSystem.setBounds(203, 104, 492, 35);
		homePage.add(lblEmpManagementSystem);
							
		final JPanel regPage = new JPanel();
		regPage.setBackground(new Color(0, 204, 204));
		parentPanel.add(regPage, "regPage");
		regPage.setLayout(null);
		
		JLabel lblEmpManagementSystem_1 = new JLabel("Employee Management System");
		lblEmpManagementSystem_1.setForeground(new Color(0, 0, 0));
		lblEmpManagementSystem_1.setFont(new Font("Sitka Small", Font.BOLD, 29));
		lblEmpManagementSystem_1.setBounds(226, 71, 492, 35);
		regPage.add(lblEmpManagementSystem_1);
	
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID :");
		lblNewLabel_1.setFont(new Font("Corbel", Font.BOLD, 20));
		lblNewLabel_1.setBounds(84, 170, 119, 35);
		regPage.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name :");
		lblNewLabel_1_1.setFont(new Font("Corbel", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(141, 259, 62, 35);
		regPage.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email :");
		lblNewLabel_1_2.setFont(new Font("Corbel", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(145, 356, 58, 35);
		regPage.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Posiotion :");
		lblNewLabel_1_3.setFont(new Font("Corbel", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(111, 447, 92, 35);
		regPage.add(lblNewLabel_1_3);
		
		empID = new JTextField();
		empID.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		empID.setBounds(312, 175, 234, 27);
		regPage.add(empID);
		empID.setColumns(10);
		
		empName = new JTextField();
		empName.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		empName.setColumns(10);
		empName.setBounds(312, 259, 234, 27);
		regPage.add(empName);
		
		mail = new JTextField();
		mail.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		mail.setColumns(10);
		mail.setBounds(312, 361, 234, 27);
		regPage.add(mail);
		
		empPos = new JTextField();
		empPos.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		empPos.setColumns(10);
		empPos.setBounds(312, 452, 234, 27);
		regPage.add(empPos);
		
		JPanel disPage = new JPanel();
		disPage.setBackground(new Color(204, 204, 255));
		parentPanel.add(disPage, "disPage");
		
		
		JLabel lblTotalNumberOf = new JLabel();
		lblTotalNumberOf.setForeground(Color.WHITE);
		lblTotalNumberOf.setFont(new Font("Sitka Small", Font.BOLD, 25));
		lblTotalNumberOf.setBounds(255, 306, 478, 35);
		homePage.add(lblTotalNumberOf);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  
			 card.show(parentPanel,"homePage");
			 lblTotalNumberOf.setText("Total Number Of Employee : " + table.getRowCount() );
				
												
			}
		});
		btnHome.setForeground(new Color(51, 204, 255));
		btnHome.setBackground(new Color(0, 0, 0));
		btnHome.setFocusPainted(false);
		btnHome.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		btnHome.setBounds(89, 160, 128, 35);
		frmEmpManagementSystem.getContentPane().add(btnHome);
		
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setForeground(new Color(51, 204, 255));
		btnRegister.setBackground(new Color(0, 0, 0));
		btnRegister.setFocusPainted(false);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(parentPanel,"regPage");
			}
		});
		btnRegister.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		btnRegister.setBounds(89, 313, 128, 35);
		frmEmpManagementSystem.getContentPane().add(btnRegister);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(parentPanel,"disPage");
			}
		});
		btnDisplay.setForeground(new Color(51, 204, 255));
		btnDisplay.setBackground(new Color(0, 0, 0));
		btnDisplay.setFocusPainted(false);
		btnDisplay.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		btnDisplay.setBounds(89, 470, 128, 35);
		frmEmpManagementSystem.getContentPane().add(btnDisplay);
		frmEmpManagementSystem.setLocationRelativeTo(null);
		
		Object[] columns = {"ID", "Name","Email", "Position"};
		table.setModel(model);
		model.setColumnIdentifiers(columns);	
		table.getColumnModel().getColumn(1).setPreferredWidth(116);
		table.getColumnModel().getColumn(2).setPreferredWidth(193);
		table.getColumnModel().getColumn(3).setPreferredWidth(139);
		model.setColumnIdentifiers(columns);
		disPage.setLayout(null);
		table.setAutoCreateRowSorter(true);
		table.setRowHeight(20);
		final Object[] rows = new Object[4];
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(233, 197, 452, 337);
		disPage.add(scrollPane);
		
		JLabel lblEmpManagementSystem_1_1 = new JLabel("Employee Management System");
		lblEmpManagementSystem_1_1.setForeground(Color.BLACK);
		lblEmpManagementSystem_1_1.setFont(new Font("Sitka Small", Font.BOLD, 29));
		lblEmpManagementSystem_1_1.setBounds(213, 78, 492, 35);
		disPage.add(lblEmpManagementSystem_1_1);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int getSelectedRowForDeletion = table.getSelectedRow();
		        
		        if (getSelectedRowForDeletion >= 0) {
		            model.removeRow(getSelectedRowForDeletion);
		            JOptionPane.showMessageDialog(disPage, "Removed Successfully");
		        } else {
		            JOptionPane.showMessageDialog(disPage, "Select a Row to Remove");
		        }
			}
		});
		btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRemove.setBounds(585, 584, 100, 35);
		btnRemove.setFocusPainted(false);
		disPage.add(btnRemove);
		
		JButton btnSave = new JButton("Save");
		btnSave.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSave.setFocusPainted(false);
		btnSave.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = empName.getText();
				String id = empID.getText();
				String email = mail.getText();				
				String position = empPos.getText();
				if (name.equals("") || id.equals("") || email.equals("") || position.equals("")){
					JOptionPane.showMessageDialog(regPage, "All input fields must be filled");
				}
				else { 
					if (!isValid(email) && Integer.parseInt(id)<=0) {
						JOptionPane.showMessageDialog(regPage, "ID cannot be negative and Email Invalid");
					}
					else if (!isValid(email)) {
						JOptionPane.showMessageDialog(regPage, "Enter a valid email address");
						}
					else if (Integer.parseInt(id)<=0) {
							JOptionPane.showMessageDialog(regPage, "ID number cannot be negative");
						}
					else {
						rows[0] = id;
						rows[1] = name;
						rows[2] = email;
						rows[3] = position;
						model.addRow(rows);
						JOptionPane.showMessageDialog(regPage, "Saved successfully");
					}
				}
				empName.setText("");
				empID.setText("");
				mail.setText("");
				empPos.setText("");
			}
			
		
		});
		btnSave.setBackground(new Color(0, 0, 0));
		btnSave.setForeground(Color.LIGHT_GRAY);
		btnSave.setBounds(447, 545, 99, 35);
		regPage.add(btnSave);
		
		
	}
}
