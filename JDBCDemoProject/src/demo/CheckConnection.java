package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckConnection {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teststudent", "root", "root");
		System.out.println("Connected Succesfully");

		
		

	}

}
