package problems;

public class ReverseOfString {

	public static void main(String[] args) {
		String s = "welcome in coding";
		System.out.println("--- Forward String ---");
		System.out.println(s);
		System.out.println("--- Revers String ---");
	
		for(int i=s.length()-1; i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
