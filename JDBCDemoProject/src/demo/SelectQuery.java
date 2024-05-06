package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery{

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/teststudent", "root", "root");
		System.out.println("Connection created");
		Statement stm = con.createStatement();
		ResultSet result = stm.executeQuery("select * from student");
		while(result.next()) {
			System.out.println("Name: "+result.getString("name"));
			System.out.println("Marks: "+result.getDouble("marks"));
			System.out.println("RollNum: "+result.getInt("rolnum"));
			System.out.println("----------------------------------------");
		}
//		result.next();
//		System.out.println("Name: "+result.getString("name"));
//		System.out.println("Marks: "+result.getDouble("marks"));
//		System.out.println("RollNum: "+result.getInt("rolnum"));
//		result.next();
//		System.out.println("Name: "+result.getString("name"));
//		System.out.println("Marks: "+result.getDouble("marks"));
//		System.out.println("RollNum: "+result.getInt("rolnum"));
//		result.next();
//		System.out.println("Name: "+result.getString("name"));
//		System.out.println("Marks: "+result.getDouble("marks"));
//		System.out.println("RollNum: "+result.getInt("rolnum"));
//		result.next();
//		System.out.println("Name: "+result.getString("name"));
//		System.out.println("Marks: "+result.getDouble("marks"));
//		System.out.println("RollNum: "+result.getInt("rolnum"));
		
	}

}
