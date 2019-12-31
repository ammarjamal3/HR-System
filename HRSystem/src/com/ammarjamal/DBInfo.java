package com.ammarjamal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ammarjamal.Employee;
public class DBInfo {

	public static Connection getConnection(){
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/ammarjamal";
			con = DriverManager.getConnection(url, "ammar","jamal");
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return con;
	}

	public static int save(Employee emp) throws SQLException{

		int st = 0;
		
		try {
String sql = "INSERT INTO `employee`( `fname`, `name`, `salary`, `age`, `department`, `address`, `date_of_birth`, `gender`, `education`, `experience`, `contract_start`, `contract_end`, `nationality`, `mother_language`, `other_language`, `email`, `phone`,`admin`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
Connection con = DBInfo.getConnection();
PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
            preparedStatement.setString(1, emp.getFname());
			preparedStatement.setString(2, emp.getLname());
			preparedStatement.setFloat(3, emp.getSalary());
			preparedStatement.setInt(4, emp.getAge());
			preparedStatement.setString(5, emp.getDepartment());
			preparedStatement.setString(6, emp.getAddress());
			preparedStatement.setString(7, emp.getDate_of_birth());
			preparedStatement.setString(8, emp.getGender());
			preparedStatement.setString(9, emp.getEducation());
			preparedStatement.setString(10, emp.getExperience());
			preparedStatement.setString(11, emp.getContract_start());
			preparedStatement.setString(12, emp.getContract_end());
			preparedStatement.setString(13, emp.getNationality());
 			preparedStatement.setString(14, emp.getMother_language());
			preparedStatement.setString(15, emp.getOther_language());
			preparedStatement.setString(16, emp.getemail());
			preparedStatement.setDouble(17, emp.getphone());
			preparedStatement.setString(18, emp.getAdmin());
			st = preparedStatement.executeUpdate();
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return st;
}

public static int update(Employee emp){
		
		int st = 0;
		
		try {
String sql = "UPDATE `employee` SET `fname`=?,`name`=?,`salary`=?,`age`=?,`department`=?,`address`=?,`date_of_birth`=?,`gender`=?,`education`=?,`experience`=?,`contract_start`=?,`contract_end`=?,`nationality`=?,`mother_language`=?,`other_language`=?,`email`=?,`phone`=? WHERE id= ?";
		Connection con = DBInfo.getConnection();
PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
			preparedStatement.setString(1, emp.getFname());
			preparedStatement.setString(2, emp.getLname());
			preparedStatement.setFloat(3, emp.getSalary());
			preparedStatement.setInt(4, emp.getAge());
			preparedStatement.setString(5, emp.getDepartment());
			preparedStatement.setString(6, emp.getAddress());
			preparedStatement.setString(7, emp.getDate_of_birth());
			preparedStatement.setString(8, emp.getGender());
			preparedStatement.setString(9, emp.getEducation());
			preparedStatement.setString(10, emp.getExperience());
			preparedStatement.setString(11, emp.getContract_start());
			preparedStatement.setString(12, emp.getContract_end());
			preparedStatement.setString(13, emp.getNationality());
 			preparedStatement.setString(14, emp.getMother_language());
			preparedStatement.setString(15, emp.getOther_language());
			preparedStatement.setString(16, emp.getemail());
			preparedStatement.setDouble(17, emp.getphone());
			preparedStatement.setInt(18, emp.getId());
			
			st = preparedStatement.executeUpdate();
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return st;
		
	}
	
	
public static int delete(int id){
	
	int st = 0;
	
	try {
		String sql = "DELETE FROM `employee` WHERE id=?";
		Connection con = DBInfo.getConnection();
		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
		 
		preparedStatement.setInt(1, id);
		
		st = preparedStatement.executeUpdate();
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return st;
	
}
	
	
	
public static Employee  getEmployeeId(int id){
	
	Employee emp = new Employee();
	
	try {
		String sql = "SELECT * FROM `employee` WHERE id=?";
		Connection con = DBInfo.getConnection();
		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
		
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
  			
			emp.setId(resultSet.getInt(1));
			emp.setFname(resultSet.getString(2));
			emp.setLname(resultSet.getString(3));
			emp.setSalary(resultSet.getFloat(4));
			emp.setAge(resultSet.getInt(5));
			emp.setDepartment(resultSet.getString(6));
			emp.setAddress(resultSet.getString(7));
			emp.setDate_of_birth(resultSet.getString(8));
			emp.setGender(resultSet.getString(9));
			emp.setEducation(resultSet.getString(10));
			emp.setExperience(resultSet.getString(11));
			emp.setContract_start(resultSet.getString(12));
			emp.setContract_end(resultSet.getString(13));
			emp.setNationality(resultSet.getString(14));
			emp.setMother_language(resultSet.getString(15));
			emp.setOther_language(resultSet.getString(16));
			emp.setemail(resultSet.getString(17));
			emp.setphone(resultSet.getLong(18));
  		}

			con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return emp;
	
}

public static  List<Employee> getEmployee(){
	
	List<Employee> list = new ArrayList<Employee>();
 
	
	try {
		String sql = "SELECT * FROM `employee` WHERE 1";
		Connection con = DBInfo.getConnection();
PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
		
		ResultSet rs = preparedStatement.executeQuery();
				
		while (rs.next()) {
 			
list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), 
rs.getFloat(4), rs.getInt(5), rs.getString(6), rs.getString(7), 
rs.getString(8) , rs.getString(9),rs.getString(10) , 
rs.getString(11) , rs.getString(12),rs.getString(13) , 
rs.getString(14) , rs.getString(15),rs.getString(16),rs.getString(17),
rs.getLong(18),rs.getString(19) ));			
		}
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	return list;	
}	
}
