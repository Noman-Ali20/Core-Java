package jdbc_demo;

public class CheckConnection {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
	}

}
