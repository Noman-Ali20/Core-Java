package test;

public class AvgOfArray {

	public static void main(String[] args) {
		int arr[]= {2,4,3};
		int sum=0;
		int avg=0;
		for(int i = 0;i<arr.length;i++) {
			 
			sum=sum+arr[i];
			avg=sum/arr.length;
			
		}
		System.out.println(avg);

	}

}
