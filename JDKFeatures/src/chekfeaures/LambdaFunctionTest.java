package chekfeaures;

@FunctionalInterface
interface Lamb {
//	void add(int a,int b);   //we can write only one method in Functional Interface
	int add(int a, int b);

}

public class LambdaFunctionTest {

	public static void main(String[] args) {
//		Lamb l = (a,b)-> {
//			System.out.println(a+b);
//		};

		Lamb l = (a, b) -> {
			
			return a + b;
		};
		int a=l.add(20, 30);
		System.out.println(a);

	}

}
