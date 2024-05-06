package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class StringFromRank {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the rank: ");
		int rank = scanner.nextInt();

		System.out.print("Enter the length: ");
		int length = scanner.nextInt();

		String result = getStringFromRank(rank, length);
		System.out.println("Result: " + result);
	}

	public static String getStringFromRank(int rank, int length) {
		StringBuilder result = new StringBuilder();
		ArrayList<Character> characters = new ArrayList<>();

		for (char c = 'a'; c <= 'z'; c++) {
			characters.add(c);
		}

		rank--;

		for (int i = 0; i < length; i++) {
			int factorial = factorial(length - 1 - i);

			int index = rank / factorial;
			result.append(characters.get(index));

			characters.remove(index);

			rank %= factorial;
		}

		return result.toString();
	}

	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}

