package preparedstatementdemo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateIntoEmployee {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","root");
		String query = "update employeeinfo set department='developer' where id=4";
		PreparedStatement stm=con.prepareStatement(query);
		int record = stm.executeUpdate();
		System.out.println(record+" record updated");
		con.close();
		stm.close();

	}

}
