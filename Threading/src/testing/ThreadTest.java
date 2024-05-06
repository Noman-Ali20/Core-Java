package testing;

class Test1 {
	static void m1() {
		System.out.println("m1 thread name: " + Thread.currentThread().getName());
	}

	static void m2() {
		System.out.println("m2 thread name: " + Thread.currentThread().getName());

	}
}

public class ThreadTest {

	public static void main(String[] args) {

		System.out.println("Main method thread name: " + Thread.currentThread().getName());
		Test1.m1();
		Test1.m2(); 

	}

}
