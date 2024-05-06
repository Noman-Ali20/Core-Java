package practice;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
