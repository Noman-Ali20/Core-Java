package demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class UpdateStudentData{

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testStudent", "root", "root");
		System.out.println("Connection created");
		
		con.close();

	}

}
