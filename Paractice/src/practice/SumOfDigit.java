package practice;

public class SumOfDigit {

	public static void main(String[] args) {
		int n=1234;
		int sum=0;
		int dig;
		while(n>0) {
			dig=n%10;
			sum=sum+dig;
			n=n/10;
		}
		System.out.println(sum);

	}

}
//for(int i=0;i<=n;i++) {
//	dig=n%10;
//	sum=sum+dig;
//	n=n/10;
//}