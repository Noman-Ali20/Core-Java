package preparedstatementdemo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectQuery{

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "root");
		PreparedStatement stm = con.prepareStatement("select*from employeeinfo");
		ResultSet result = stm.executeQuery();

//		result.next();
//		System.out.println("Name: "+result.getString("name"));
//		System.out.println("Department: "+result.getString("department"));
//		System.out.println("Location: "+result.getString("location"));

		while (result.next()) {
			if ("Developer".equals(result.getString("department"))) {
				System.out.println("ID: " + result.getString("id"));
				System.out.println("Name: " + result.getString("name"));
				System.out.println("Department: " + result.getString("department"));
				System.out.println("Location: " + result.getString("location"));
				System.out.println("------------------------------");
			}
		}
		con.close();
		stm.close();

	}

}
