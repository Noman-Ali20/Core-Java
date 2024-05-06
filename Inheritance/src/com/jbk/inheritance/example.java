package com.jbk.inheritance;

class A{
	int x=20;
	void m1() {
		System.out.println("A");
	}
}

class B extends A{
	void m2() {
		System.out.println("B");
	}
}

class C extends A{
	int x=10;
	void m3() {
		System.out.println(x);
		System.out.println(super.x);
	}
}

public class example {

	public static void main(String[] args) {
		C c = new C();
		c.m1();
		
		c.m3();
	

	}

}
