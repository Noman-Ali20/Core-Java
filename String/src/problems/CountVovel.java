package problems;

public class CountVovel {

	public static void main(String[] args) {
		String s = "Hello World";
		String s1 = s.toLowerCase();
		int count = 0;
		char c;
		for (int i = 0; i <= s1.length() - 1; i++) {
			c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				count++;

		}
		
		System.out.println("Count of Vovels: " + count);
	}

}
