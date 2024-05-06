package problems;

public class FindCons {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = s.toLowerCase();

		for (int i = 0; i <= s1.length() - 1; i++) {
			if (s1.charAt(i) != 'a' && s1.charAt(i) != 'e' && s1.charAt(i) != 'i' && s1.charAt(i) != 'o'
					&& s1.charAt(i) != 'u')
				System.out.println(s1.charAt(i));

		}

	}

}
