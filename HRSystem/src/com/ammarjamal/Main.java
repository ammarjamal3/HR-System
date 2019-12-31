package com.ammarjamal;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
public class Main {
	JFrame frame;
	private JTextField username;
	private JTextField password;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public Main() throws SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		frame = new JFrame();

		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 401, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(29, 22, 124, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1.setBounds(29, 75, 100, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		username = new JTextField();
		username.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
username.setBackground(Color.BLACK);
		username.setForeground(Color.WHITE);
		username.setBounds(151, 22, 187, 38);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		password.setForeground(Color.WHITE);
		password.setBackground(new Color(0, 0, 0));
		password.setBounds(151, 68, 187, 41);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_2.setBounds(121, 120, 171, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Database status: ");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(29, 229, 159, 34);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(168, 239, 187, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		 
		if(! AdminsDB.getConnection().isClosed()){
			
			lblNewLabel_4.setText("Connected");
		}else{
			lblNewLabel_4.setText("Not connected");
		}
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
				btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 List<Admins> list=AdminsDB.getAdmins();
				 
	 Map<String, String> map = new HashMap<String, String>();
		 
	 for(Admins a:list){
			
					 map.put(a.getUsername(), a.getPassword());
					
				 }
		 
			if (map.containsKey(username.getText())   ) {
				
		String val2=map.get(username.getText());  //value of key
				
				if( val2.equals(password.getText()) ){
					String admin=username.getText();	
					Edit cp = null;
					try {
						cp = new Edit();
						
					} catch (SQLException e1) {
			
						e1.printStackTrace();
					}
					cp.setAdmin(admin);
					cp.f.setVisible(true);
				frame.setVisible(false);
				 
			}else{
					lblNewLabel_2.setText("Failed try again");
				}
				
			}else{
				lblNewLabel_2.setText("Failed try again");
			}
				
			
			}
		});
		btnNewButton.setBounds(29, 156, 136, 62);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		btnNewButton_1.setBounds(189, 156, 149, 62);
		frame.getContentPane().add(btnNewButton_1);
		
	
	}
}
