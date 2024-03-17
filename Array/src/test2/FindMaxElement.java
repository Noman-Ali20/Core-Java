package test2;

public class FindMaxElement {

	public static void main(String[] args) {
		double[] arr = {2.3, 1.5, 4.8, 3.2, 2.9};
		double max = arr[0];
		for (double num : arr) {
			
		    if (num > max) {
		        max = num;
		    }
		}
		System.out.println("Maximum: " + max);


	}

}
