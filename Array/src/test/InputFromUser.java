package test;
import java.util.Scanner;
public class InputFromUser {

	public static void main(String[] args) {
		System.out.print("Enter Size of array : ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Size of array : "+arr.length);
		System.out.println("Enter the elements of an array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The elements of an array are as follows : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}


