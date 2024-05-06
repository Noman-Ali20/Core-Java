package demo;

public class GenericsTest<T> {
	void print(T x) {
		System.out.println(x);
	}
	
	
	public static void main(String args[]) {
		GenericsTest<Double> gt = new GenericsTest<>();
		gt.print(10.1);
		
		//for string
		GenericsTest<String> tt = new GenericsTest<>();
		tt.print("Hello");
	}
}
