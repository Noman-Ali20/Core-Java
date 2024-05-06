package Questions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int ft=0,st=1,nt;
		for(int i=1;i<=n;i++) {
			System.out.print(ft+" ");
			nt=ft+st;
			ft=st;
			st=nt;
		}

	}

}
