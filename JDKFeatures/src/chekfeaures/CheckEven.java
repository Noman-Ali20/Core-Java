package chekfeaures;
@FunctionalInterface
interface IsEven {
	boolean even(int n);
}


public class CheckEven {

	public static void main(String[] args) {
		IsEven is = (num) -> num % 2 == 0;
		System.out.println(is.even(22));

	}

}
