package practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153, sum = 0, dig, temp;
		temp = n;
		while (n > 0) {
			dig = n % 10;
			sum = sum + (dig * dig * dig);
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");

	}

}
