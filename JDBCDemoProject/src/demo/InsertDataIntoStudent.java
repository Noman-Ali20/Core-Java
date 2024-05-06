package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataIntoStudent {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testStudent", "root", "root");
		System.out.println("** Connection Created Succesfully **");
//		String query = "insert into student(name,marks,rolnum) values ('Cathin',70,33),('Danial',79,44)";
		String query = "insert into studentinfo(name,marks,rolnum) values ('Kaif',75,77),('Ali',99,88)";
		Statement stm = con.createStatement();
		int record = stm.executeUpdate(query);
		System.out.println(record+" record is inserted into DB");
		con.close();
		stm.close();
	}

}
