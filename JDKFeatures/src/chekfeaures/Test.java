package chekfeaures;

interface Testable {
	void m1();
	default void m2() {
		//jdk 1.8 introduce default methods in interface
		//so we can give it body and we can override this
		System.out.println("m2 from testable");
		
	}
	
	static void m3() {
		//jdk 1.8 introduce static methods in interface aswell
		System.out.println("static m3 from testable");
		
	}
}
public class Test implements Testable{
	@Override
	public void m1() {
		System.out.println("m1() from testable");
		
	}
	public static void main(String[] args) {
		Test tt = new Test();
		tt.m1();
		tt.m2();
		Testable.m3();
	}
}