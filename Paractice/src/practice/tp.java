package practice;

public class tp {

	public static void main(String[] args) {
		String s = "ali";
		s = s.toLowerCase();
		int count = 0;
		char c;

		for (int i = 0; i <= s.length() - 1; i++) {
			c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				count++;

			}

		}
		System.out.println("count of vovel: " + count);

	}

}