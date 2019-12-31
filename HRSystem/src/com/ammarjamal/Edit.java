package com.ammarjamal;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SpringLayout;

public class Edit {

	private JPanel contentPane;
	private JTextField fname1;
	private JTextField lname1;
	private JTextField salary1;
	private JTextField age1;
	private JTextField department1;
	private JTextField address1;
	private JTextField gender1;
	private JTextField education1;
	private JTextField experience1;
	private JTextField mother_language1;
	private JTextField other_language1;
	private JTextField nationality1;
	private JTextField idEmployee1;
	private JTextField fname11;
	private JTextField lname11;
	private JTextField salary11;
	private JTextField age11;
	private JTextField department11;
	private JTextField address11;
	private JTextField gender11;
	private JTextField contract_end11;
	private JTextField contract_start11;
	private JTextField date_of_birth11;
	private JTextField other_language11;
	private JTextField mother_language11;
	private JTextField nationality11;
	private JTextField experience11;
	private JTextField education11;
JFrame f=new JFrame();
private JTextField email1;
private JTextField phone1;
private JTextField email11;
private JTextField phone11;
private String admin;	
private JPanel panel_3;


public Edit(String admin) {
	super();
	this.admin = admin;
}

public String getAdmin() {
	return admin;
}

public void setAdmin(String admin) {
	this.admin = admin;
}

/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit fr = new Edit();
					fr.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Edit() throws SQLException {
		f.setBackground(Color.WHITE);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 1500, 700);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 51));
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		f.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 39, 1200, 700);
		tabbedPane.setBackground(Color.WHITE);
		contentPane.add(tabbedPane);
		

		
		panel_3 = new JPanel();
		tabbedPane.addTab("View Employees", null, panel_3, null);
			
		
		   display(panel_3);
		
		
		
	UtilDateModel dModel = new UtilDateModel();
	JDatePanelImpl datePanel = new JDatePanelImpl(dModel);
		
		
		UtilDateModel dModel2 = new UtilDateModel();
		JDatePanelImpl datePanel2 = new JDatePanelImpl(dModel2);
		
		
		UtilDateModel dModel3 = new UtilDateModel();
		JDatePanelImpl datePanel3 = new JDatePanelImpl(dModel3);
		
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.WHITE);
				tabbedPane.addTab("Insert Employee", null, panel_1, null);
				panel_1.setLayout(null);
				
				JLabel lblNewLabel_2 = new JLabel("First Name");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_2.setBounds(36, 28, 92, 15);
				panel_1.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("Last Name");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_3.setBounds(36, 81, 92, 15);
				panel_1.add(lblNewLabel_3);
				
				JLabel lblNewLabel_4 = new JLabel("Salary");
				lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_4.setBounds(36, 130, 70, 15);
				panel_1.add(lblNewLabel_4);
				
				JLabel lblNewLabel_5 = new JLabel("Age");
				lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_5.setBounds(36, 182, 70, 15);
				panel_1.add(lblNewLabel_5);
				
				JLabel lblNewLabel_6 = new JLabel("Department");
				lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_6.setBounds(36, 227, 92, 15);
				panel_1.add(lblNewLabel_6);
				
				JLabel lblNewLabel_7 = new JLabel("Address");
				lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_7.setBounds(36, 279, 70, 15);
				panel_1.add(lblNewLabel_7);
				
				JLabel lblNewLabel_8 = new JLabel("Date of Birthday");
				lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_8.setBounds(36, 341, 107, 15);
				panel_1.add(lblNewLabel_8);
				
				JLabel lblNewLabel_9 = new JLabel("Gender");
				lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_9.setBounds(36, 397, 70, 15);
				panel_1.add(lblNewLabel_9);
				
				fname1 = new JTextField();
				fname1.setBounds(146, 26, 172, 19);
				panel_1.add(fname1);
				fname1.setColumns(10);
				
				lname1 = new JTextField();
				lname1.setBounds(146, 79, 172, 19);
				panel_1.add(lname1);
				lname1.setColumns(10);
				
				salary1 = new JTextField();
				salary1.setBounds(146, 128, 172, 19);
				panel_1.add(salary1);
				salary1.setColumns(10);
				
				age1 = new JTextField();
				age1.setBounds(146, 180, 172, 19);
				panel_1.add(age1);
				age1.setColumns(10);
				
				department1 = new JTextField();
				department1.setBounds(146, 225, 172, 19);
				panel_1.add(department1);
				department1.setColumns(10);
				
				address1 = new JTextField();
				address1.setBounds(146, 277, 172, 19);
				panel_1.add(address1);
				address1.setColumns(10);
				
				JLabel lblNewLabel_10 = new JLabel("Education");
				lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_10.setBounds(36, 443, 92, 15);
				panel_1.add(lblNewLabel_10);
				
				JLabel lblNewLabel_11 = new JLabel("Experience");
				lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_11.setBounds(36, 500, 119, 15);
				panel_1.add(lblNewLabel_11);
				
				JLabel lblNewLabel_12 = new JLabel("Contract_Start");
				lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_12.setBounds(36, 549, 119, 15);
				panel_1.add(lblNewLabel_12);
				
				JLabel lblNewLabel_13 = new JLabel("Contract_End");
				lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_13.setBounds(353, 26, 107, 15);
				panel_1.add(lblNewLabel_13);
				
				JLabel lblNewLabel_14 = new JLabel("Nationality");
				lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_14.setBounds(353, 78, 100, 15);
				panel_1.add(lblNewLabel_14);
				
				JLabel lblNewLabel_15 = new JLabel("Mother_Language");
				lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_15.setBounds(353, 128, 140, 15);
				panel_1.add(lblNewLabel_15);
				
				JLabel lblNewLabel_16 = new JLabel("Other_Language");
				lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblNewLabel_16.setBounds(353, 180, 124, 15);
				panel_1.add(lblNewLabel_16);
				
				gender1 = new JTextField();
				gender1.setBounds(146, 395, 172, 19);
				panel_1.add(gender1);
				gender1.setColumns(10);
				
				education1 = new JTextField();
				education1.setBounds(146, 441, 172, 19);
				panel_1.add(education1);
				education1.setColumns(10);
				
				experience1 = new JTextField();
				experience1.setBounds(146, 498, 172, 19);
				panel_1.add(experience1);
				experience1.setColumns(10);
				
				mother_language1 = new JTextField();
				mother_language1.setBounds(501, 126, 172, 19);
				panel_1.add(mother_language1);
				mother_language1.setColumns(10);
				
				other_language1 = new JTextField();
				other_language1.setBounds(501, 178, 172, 19);
				panel_1.add(other_language1);
				other_language1.setColumns(10);
				
				nationality1 = new JTextField();
				nationality1.setBounds(501, 74, 172, 19);
				panel_1.add(nationality1);
				nationality1.setColumns(10);
				
				JLabel lblEmail = new JLabel("E-Mail");
				lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblEmail.setBounds(353, 225, 107, 19);
				panel_1.add(lblEmail);
				
				email1 = new JTextField();
				email1.setBounds(501, 222, 172, 20);
				panel_1.add(email1);
				email1.setColumns(10);
				
				JLabel lblPhone = new JLabel("Phone");
				lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPhone.setBounds(353, 273, 100, 27);
				panel_1.add(lblPhone);
				
				phone1 = new JTextField();
				phone1.setBounds(501, 273, 172, 21);
				panel_1.add(phone1);
				phone1.setColumns(10);
				JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
				datePicker.setBounds(146, 331, 172, 26);
				
		panel_1.add(datePicker);
		JDatePickerImpl datePicker2 = new JDatePickerImpl(datePanel2);
		datePicker2.setForeground(Color.RED);
		datePicker2.setBackground(Color.YELLOW);
		datePicker2.setBounds(146, 538, 172, 26);
		
		panel_1.add(datePicker2);
		JDatePickerImpl datePicker3 = new JDatePickerImpl(datePanel3);
		SpringLayout springLayout = (SpringLayout) datePicker3.getLayout();
		springLayout.putConstraint(SpringLayout.WEST, datePicker3.getJFormattedTextField(), 0, SpringLayout.WEST, datePicker3);
		datePicker3.setBounds(501, 17, 172, 26);
		
		panel_1.add(datePicker3);
		
		
		
JLabel photo = new JLabel(new ImageIcon(Edit.class.getResource("/img/Add-Male-User.png")));
photo.setBounds(851, 11, 270, 317);
panel_1.add(photo);

		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
Date date_of_birth = (Date) datePicker.getModel().getValue();
Date contract_start = (Date) datePicker2.getModel().getValue();
Date contract_end = (Date) datePicker3.getModel().getValue();
			
			String firstName         = 	    fname1.getText();
			String lastName          = 		lname1.getText();
			String textSalary        = 		salary1.getText();
			String textAge           = 		age1.getText();
			String textDepatment     = 		department1.getText();
			String textAddress       = 		address1.getText();
		 	String textGender        = 		gender1.getText();
			String textEducation     = 		education1.getText();
			String textExperience    = 		experience1.getText(); 
			String textNationality   = 		nationality1.getText();
			String motherLanguage    = 		mother_language1.getText();
			String otherLanguage     = 		other_language1.getText();
			String dateOfBirth       =        date_of_birth.toString() ;
			String textContractstart =      contract_start.toString() ;
			String textContractend   =      contract_end.toString() ;
			String email             =       email1.getText();
			String sphone             =       phone1.getText(); 
			String admin2            =        getAdmin();
			
			
			float fSalary = Float.parseFloat(textSalary);
			int iAge = Integer.parseInt(textAge);
			Long phone=Long.parseLong(sphone);

			Employee emp = new Employee();  
			
			emp.setFname(firstName);
			emp.setLname(lastName);
			emp.setSalary(fSalary);
			emp.setAge(iAge);
			emp.setDepartment(textDepatment);
			emp.setAddress(textAddress);
			emp.setDate_of_birth(dateOfBirth);
			emp.setGender(textGender);
			emp.setEducation(textEducation);
			emp.setExperience(textExperience);
			emp.setContract_start(textContractstart);
			emp.setContract_end(textContractend);
			emp.setNationality(textNationality);
			emp.setMother_language(motherLanguage);
			emp.setOther_language(otherLanguage);
			emp.setemail(email);
			emp.setphone(phone);
			emp.setAdmin(admin2);
			 try {
				int status=  DBInfo.save(emp);

				  if(status>0){  	  
  JOptionPane.showMessageDialog(panel_1, " Record saved successfully! ");
					  
//	          System.out.println(" Record saved successfully! ");  
				       
				}else{  
JOptionPane.showMessageDialog(panel_1, "Sorry! unable to save record","warning",
							  JOptionPane.ERROR_MESSAGE);
					  
				//	  System.out.println("Sorry! unable to save record");  
				  }
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  	
panel_3.removeAll();
display(panel_3);

			 
			 
			 
			 
			 
			}

			
		});
		btnNewButton.setBounds(848, 370, 117, 42);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 0, 51));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fname1.setText("");
				lname1.setText("");
				salary1.setText("");
				age1.setText("");
				department1.setText("");
				address1.setText("");
		 		gender1.setText("");
				education1.setText("");
				experience1.setText("");
		 		nationality1.setText("");
				mother_language1.setText("");
				other_language1.setText("");
				email1.setText("");
				phone1.setText("");
				
				
				
			}
		});
		btnNewButton_1.setBounds(1056, 370, 117, 42);
		panel_1.add(btnNewButton_1);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("Update Employee / Delete", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("Enter ID");
		lblNewLabel_17.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_17.setBounds(12, 28, 81, 27);
		panel_2.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Firstname");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_18.setBounds(12, 92, 97, 15);
		panel_2.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Last name");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_19.setBounds(12, 142, 97, 15);
		panel_2.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Salary");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_20.setBounds(12, 190, 70, 15);
		panel_2.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Age");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_21.setBounds(12, 246, 70, 15);
		panel_2.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("department");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_22.setBounds(12, 297, 97, 15);
		panel_2.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Address");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_23.setBounds(12, 345, 70, 15);
		panel_2.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("gender");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_24.setBounds(12, 400, 70, 15);
		panel_2.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("education");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_25.setBounds(12, 449, 103, 15);
		panel_2.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("experience");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_26.setBounds(12, 498, 103, 15);
		panel_2.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("nationality");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_27.setBounds(321, 94, 103, 15);
		panel_2.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("mother language");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_28.setBounds(321, 140, 122, 15);
		panel_2.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("other language");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_29.setBounds(321, 192, 122, 15);
		panel_2.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("date_of_birth");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_30.setBounds(321, 247, 103, 15);
		panel_2.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("contract start");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_31.setBounds(321, 298, 103, 15);
		panel_2.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("contract end");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_32.setBounds(321, 347, 103, 15);
		panel_2.add(lblNewLabel_32);
		
		idEmployee1 = new JTextField();
		idEmployee1.setBounds(119, 28, 93, 27);
		panel_2.add(idEmployee1);
		idEmployee1.setColumns(10);
		
		fname11 = new JTextField();
		fname11.setBounds(119, 90, 170, 19);
		panel_2.add(fname11);
		fname11.setColumns(10);
		
		lname11 = new JTextField();
		lname11.setBounds(119, 140, 170, 19);
		panel_2.add(lname11);
		lname11.setColumns(10);
		
		salary11 = new JTextField();
		salary11.setBounds(119, 188, 170, 19);
		panel_2.add(salary11);
		salary11.setColumns(10);
		
		age11 = new JTextField();
		age11.setBounds(119, 244, 170, 19);
		panel_2.add(age11);
		age11.setColumns(10);
		
		department11 = new JTextField();
		department11.setBounds(119, 295, 170, 19);
		panel_2.add(department11);
		department11.setColumns(10);
		
		address11 = new JTextField();
		address11.setBounds(119, 345, 170, 19);
		panel_2.add(address11);
		address11.setColumns(10);
		
		gender11 = new JTextField();
		gender11.setBounds(119, 398, 170, 19);
		panel_2.add(gender11);
		gender11.setColumns(10);
		
		contract_end11 = new JTextField();
		contract_end11.setBounds(471, 345, 170, 19);
		panel_2.add(contract_end11);
		contract_end11.setColumns(10);
		
		contract_start11 = new JTextField();
		contract_start11.setBounds(471, 296, 170, 19);
		panel_2.add(contract_start11);
		contract_start11.setColumns(10);
		
		date_of_birth11 = new JTextField();
		date_of_birth11.setBounds(471, 245, 170, 19);
		panel_2.add(date_of_birth11);
		date_of_birth11.setColumns(10);
		
		other_language11 = new JTextField();
		other_language11.setBounds(471, 190, 170, 19);
		panel_2.add(other_language11);
		other_language11.setColumns(10);
		
		mother_language11 = new JTextField();
		mother_language11.setBounds(471, 138, 170, 19);
		panel_2.add(mother_language11);
		mother_language11.setColumns(10);
		
		nationality11 = new JTextField();
		nationality11.setBounds(471, 92, 170, 19);
		panel_2.add(nationality11);
		nationality11.setColumns(10);
		
		experience11 = new JTextField();
		experience11.setBounds(119, 496, 170, 19);
		panel_2.add(experience11);
		experience11.setColumns(10);
		
		education11 = new JTextField();
		education11.setBounds(119, 447, 170, 19);
		panel_2.add(education11);
		education11.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Find");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(0, 0, 128));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
				String sid=idEmployee1.getText();  
			    int id=Integer.parseInt(sid);   
				
			    Employee emp=DBInfo.getEmployeeId(id); 
		 
			    
			    fname11.setText(emp.getFname());
			    lname11.setText(emp.getLname());
			    salary11.setText(String.valueOf(emp.getSalary()));
			    age11.setText(String.valueOf(emp.getAge()));
			    department11.setText( emp.getDepartment());
			    address11.setText( emp.getAddress());
			    nationality11.setText( emp.getNationality());
			    gender11.setText(emp.getGender());
			    education11.setText( emp.getEducation());
			    experience11.setText( emp.getExperience());
			    mother_language11.setText( emp.getMother_language());
			    other_language11.setText(emp.getOther_language());
			    date_of_birth11.setText(emp.getDate_of_birth());
			    contract_start11.setText(emp.getContract_start());
			    contract_end11.setText(emp.getContract_end()); 
			    email11.setText(emp.getemail());
			    phone11.setText(String.valueOf(emp.getphone()));
			}
		});
		btnNewButton_2.setBounds(243, 21, 97, 41);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update Employee");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBackground(new Color(0, 0, 51));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String sid=idEmployee1.getText();  
			    int id=Integer.parseInt(sid);  
			    
		    String textfName        =     fname11.getText();
		    String textlName        =     lname11.getText();
	   float textsalary        =     Float.parseFloat(salary11.getText());
    int textage             =     Integer.parseInt(age11.getText());
		    String textdepart       =     department11.getText();
		    String textaddress      =     address11.getText();
	   String textnation       =     nationality11.getText();
		    String textgender       =     gender11.getText();
			   String texteducation    =     education11.getText();
			  String textexperience   =     experience11.getText();
			   String textmother      =     mother_language11.getText();
			   String textother      =     other_language11.getText();
			    String textbirth      =     date_of_birth11.getText();
			    String textstart      =     contract_start11.getText();
			    String textend      =     contract_end11.getText();
			    String email        =     email11.getText();
			    Long phone       =     Long.parseLong(phone11.getText());
			    
			    
			    Employee emp=new Employee();  
			    
		        emp.setId(id);
				emp.setFname(textfName);
				emp.setLname(textlName);
				emp.setSalary(textsalary);
				emp.setAge(textage);
				emp.setDepartment(textdepart);
				emp.setAddress(textaddress);
				emp.setDate_of_birth(textbirth);
				emp.setGender(textgender);
				emp.setEducation(texteducation);
				emp.setExperience(textexperience);
				emp.setContract_start(textstart);
				emp.setContract_end(textend);
				emp.setNationality(textnation);
				emp.setMother_language(textmother);
				emp.setOther_language(textother); 
			    emp.setemail(email);
			    emp.setphone(phone);
			    
			    int status=DBInfo.update(emp);  
		        if(status>0){  
	 
JOptionPane.showMessageDialog(panel_2, "Record update successfully!" );
		        	
		     //   	 System.out.println(" Record update successfully! ");
		        }else{ 
		        		
JOptionPane.showMessageDialog(panel_2, "Sorry! unable to update record","warning",
			    			  JOptionPane.ERROR_MESSAGE);
		        	
		      //  	System.out.println("Sorry! unable to update record");  
		        }  
	
		        panel_3.removeAll();
				
				   display(panel_3);
  
			}
		});
		btnNewButton_3.setBounds(950, 63, 181, 36);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Delete Employee");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(new Color(0, 0, 51));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				String sid=idEmployee1.getText();  
			    int id=Integer.parseInt(sid);   
			     
			     int status=  DBInfo.delete(id) ;
			     if(status>0){  
JOptionPane.showMessageDialog(panel_2, "Record delete successfully!" );
		        	
		     //   	 System.out.println(" Record update successfully! ");
		        }
 else{ 
		        	
	 	
JOptionPane.showMessageDialog(panel_2, "Sorry! unable to delete record","warning",
			    			  JOptionPane.ERROR_MESSAGE);
		     	
		      //  	System.out.println("Sorry! unable to update record");  
		        }  
	     
			     panel_3.removeAll();
				  display(panel_3);				
			}
		});
		btnNewButton_4.setBounds(950, 388, 181, 36);
		panel_2.add(btnNewButton_4);
		
		JLabel photo1 = new JLabel(new ImageIcon(Edit.class.getResource("/img/employees.png")));
		photo1.setBounds(950, 160, 213, 200);
		panel_2.add(photo1);
		
		JLabel label = new JLabel("E-Mail");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(321, 398, 107, 19);
		panel_2.add(label);
		
		email11 = new JTextField();
		email11.setColumns(10);
		email11.setBounds(471, 398, 170, 20);
		panel_2.add(email11);
		
		JLabel label_1 = new JLabel("Phone");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(321, 443, 100, 27);
		panel_2.add(label_1);
		
		phone11 = new JTextField();
		phone11.setColumns(10);
		phone11.setBounds(471, 447, 170, 21);
		panel_2.add(phone11);
		
		JLabel lblNewLabel = new JLabel("DataBase status");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(40, 12, 134, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(214, 12, 217, 15);
		lblNewLabel_1.setForeground(Color.RED);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_5 = new JButton("Log Out");
		btnNewButton_5.setForeground(new Color(0, 0, 102));
		btnNewButton_5.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		btnNewButton_5.setBackground(SystemColor.activeCaption);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			    Main p=null;
				try {
					p=new Main();
				} catch (Exception e) {
					e.printStackTrace();
				}
				p.frame.setVisible(true);
				f.setVisible(false);
			}
		});
		btnNewButton_5.setBounds(1222, 64, 130, 53);
		contentPane.add(btnNewButton_5);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(0, 0, 102));
		btnExit.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		btnExit.setBackground(SystemColor.activeCaption);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);	
			}
		});
		btnExit.setBounds(1222, 145, 130, 53);
		contentPane.add(btnExit);
		
if(! AdminsDB.getConnection().isClosed()){
			
	lblNewLabel_1.setText("Connected");
		}else{
			lblNewLabel_1.setText("Not connected");
		}
		
	}

	public void display(JPanel panel) {
		DefaultTableModel model = new DefaultTableModel();
	        model.addColumn("Id");
	        model.addColumn("First Name");
	        model.addColumn("Last name");
	        model.addColumn("Salary");
	        model.addColumn("Age");
	        model.addColumn("Department");
	        model.addColumn("Address");
	        model.addColumn("Date_of_birth");
	        model.addColumn("Gender");
	        model.addColumn("Education");
	        model.addColumn("Experience");
	        model.addColumn("Contract_Start");
	        model.addColumn("Contract_End");
	        model.addColumn("Nationality");
	        model.addColumn("Mother_Language");
	        model.addColumn("Other_Language");
	        model.addColumn("E-Mail");
	        model.addColumn("Phone");
	        model.addColumn("Admin");
	         	        
			  for(Employee list: DBInfo.getEmployee()){
				  model.addRow(new Object[]{
						  
						  list.getId(),
						  list.getFname(),
						  list.getLname(),
						  list.getSalary(),
						  list.getAge(),
						  list.getDepartment(),
						  list.getAddress(),
						  list.getDate_of_birth(),
						  list.getGender(),
						  list.getEducation(),
						  list.getExperience(),
						  list.getContract_start(),
						  list.getContract_end(),
						  list.getNationality(),
						  list.getMother_language(),
						  list.getOther_language(),	
						  list.getemail(),
						  list.getphone(),
						  list.getAdmin()
						  
						  
				  });

			  }
  		JTable table = new JTable();
  		table.setBounds(1, 1, 0, 668);
		
		table.setForeground(Color.RED);
  		table.setFillsViewportHeight(true);
  		table.setCellSelectionEnabled(true);
  		panel.add(table);
  		table.setBackground(UIManager.getColor("Button.highlight"));
  		table.setSurrendersFocusOnKeystroke(true);
  		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  		table.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
  		table.setColumnSelectionAllowed(true);
  		
  		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
  		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    	
 
  		table.setRowHeight(30);
  		table.setModel(model);

  		TableColumnModel columnModel = table.getColumnModel();
  		columnModel.getColumn(0).setPreferredWidth(100);
  		columnModel.getColumn(1).setPreferredWidth(120);
  		columnModel.getColumn(2).setPreferredWidth(120);
  		columnModel.getColumn(3).setPreferredWidth(100);
  		columnModel.getColumn(4).setPreferredWidth(50);
  		columnModel.getColumn(5).setPreferredWidth(120);
  		columnModel.getColumn(6).setPreferredWidth(150);
  		columnModel.getColumn(7).setPreferredWidth(310);
  		columnModel.getColumn(8).setPreferredWidth(50);
  		columnModel.getColumn(9).setPreferredWidth(200);
  		columnModel.getColumn(10).setPreferredWidth(100);
  		columnModel.getColumn(11).setPreferredWidth(310);
  		columnModel.getColumn(12).setPreferredWidth(310);
  		columnModel.getColumn(13).setPreferredWidth(100);
  		columnModel.getColumn(14).setPreferredWidth(110);
  		columnModel.getColumn(15).setPreferredWidth(100);
  		columnModel.getColumn(16).setPreferredWidth(250);
  		columnModel.getColumn(17).setPreferredWidth(230);
  		columnModel.getColumn(18).setPreferredWidth(150);
   		panel_3.setLayout(null);
  
   		JScrollPane scrollPane = new JScrollPane(table);
   		scrollPane.setBounds(0, 0, 1190, 670);
		panel.add(scrollPane);
	}
}