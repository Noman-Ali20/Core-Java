package test;

public class OddOrder {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 7, 8, 6, 22, 11, 33 };
		System.out.print("The elements at Odd position are : ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
