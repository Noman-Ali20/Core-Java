package practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=12345678;
		
		int rev = 0;
		int dig;
//		while(n>0) {
//			dig=n%10;
//			rev=dig;
//			System.out.print(rev);
//			n=n/10;
//		}
		for(;n!=0;n=n/10) {
			dig=n%10;
			rev=dig;
			System.out.print(rev);
			
		}
		
	}

}
