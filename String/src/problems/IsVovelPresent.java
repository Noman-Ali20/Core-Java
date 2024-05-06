package problems;

public class IsVovelPresent {

	public static void main(String[] args) {
		String s = "WelcomeToPune";
		String s1 = s.toLowerCase();
		int count = 0;
		char c;
		for (int i = 0; i <= s1.length() - 1; i++) {
			c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				count++;

		}
		if (count > 0)
			System.out.println("yes,Vovel is present");
		else
			System.out.println("Vovel not present");

	}

	

}
