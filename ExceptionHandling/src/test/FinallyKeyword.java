package test;

public class FinallyKeyword {
	public void ServerDB() {
		System.out.println("Server Open..");
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		try {
			System.out.println(5/0);
			
		} catch (Exception e) {
			
			System.out.println(4/0);
		}finally {
			System.out.println("Close server..");
		}
		
		
	}

	public static void main(String[] args) {
		FinallyKeyword fn = new FinallyKeyword();
		fn.ServerDB();
	}

}
