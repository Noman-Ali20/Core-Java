package test2;

public class FactorialofElements {

	public static void main(String[] args) {
		int fact=1;
		int arr[]= {1,2,3,4,5 };
		for(int i=0;i<=arr.length-1;i++) {
			fact=fact*arr[i];
		}
		System.out.println(fact);

	}

}
