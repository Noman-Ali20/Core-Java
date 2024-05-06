package demo;

public class CountEvenOdd {

	public static void main(String[] args) {
		int countEv=0,countOdd=0;
		for (int i=1;i<=20;i++) {
			if (i%2==0) {
				countEv++;
				
			}
			else
				countOdd++;
		}
		System.out.println("Count of even numbers is "+countEv);
		System.out.println("Count of even numbers is "+countOdd);

	}

}
