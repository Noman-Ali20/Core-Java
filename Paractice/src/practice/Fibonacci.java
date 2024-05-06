package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		int ft=0,st=1,nt;
		for (int i=1;i<=n;++i) {
			System.out.print(ft+" ");
			nt=ft+st;
			ft=st;
			st=nt;
		}
	}

}
