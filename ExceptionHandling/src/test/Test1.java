package test;

public class Test1 {

	
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4);
			try {
				System.out.println(10 / 0); // Arithmatic Exception
			} catch (Exception e) {
				System.out.println("Inner catch");
				System.out.println(10 / 0);
			}
		} catch (Exception e) { // it will not execute bcz exeption handel in inner try-catch block
			System.out.println("catch block");
			System.out.println(5);
			
		}
		System.out.println("----------------------------NullPointerException-------------------------");
		{
			try {
				System.out.println(6);
				int arr[] = null;        
				System.out.println(arr.length);     // NullPointerException
			} catch (NullPointerException e) {

				System.out.println(7);
				
				System.out.println(8);
			}

		}

	}

}
