package test;

public class Test {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(10/0);
			
		} catch (Exception e) {
			System.out.println("catch block");
			System.out.println(4);
		}
		System.out.println(5);

	}

}
