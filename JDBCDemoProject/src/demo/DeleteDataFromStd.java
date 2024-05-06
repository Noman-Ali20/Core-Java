package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDataFromStd{

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/teststudent","root","root");
		System.out.println("Connection created");
		Statement stm = con.createStatement();
		String query = "delete from studentinfo where rollnum=22";
		int record  = stm.executeUpdate(query);
		System.out.println(record+" records is deleted");
		con.close();
		stm.close();

	}

}
