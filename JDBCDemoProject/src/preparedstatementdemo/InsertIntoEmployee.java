package preparedstatementdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;


public class InsertIntoEmployee {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","root");
		System.out.println("Connection Created");
		
		// ** One method ** \\
//		String query = "insert into employeeinfo(name,department,location)values (?,?,?),(?,?,?)";
//		PreparedStatement pstm = con.prepareStatement(query);
//		pstm.setString(1, "Kaif");
//		pstm.setString(2, "Tester");
//		pstm.setString(3, "Mumbai");
//		pstm.setString(4, "Vaish");
//		pstm.setString(5, "Tester");
//		pstm.setString(6, "Chennai");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Department Name: ");
		String department = sc.nextLine();
		System.out.print("Enter Location: ");
		String location = sc.nextLine();
		
		String query = "insert into employeeinfo(name,department,location)values (?,?,?)";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, name);
		pstm.setString(2, department);
		pstm.setString(3, location);
		int record = pstm.executeUpdate();
		System.out.println(record+" record inserted into Table");
		con.close();
		pstm.close();
		
		
		
		

	}

}
