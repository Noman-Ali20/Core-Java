package test;
import java.util.Scanner;
public class ReverseOrder {
	public static void main(String[] args) {
		int n, i;
		System.out.print("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Size of array : " + arr.length);
		System.out.print("Enter the elements of an array : ");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The reverse order of an array as Follows : ");
		for (i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
