package practice;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact+" ");

	}

}
