package com.accessmodifire.eg1;

import com.accessmodifire.eg.A;

public class C {
	public  void c1() {
		System.out.println("C called from C class");
	}
	void D() {
		System.out.println("D called from C class");
		
	}

	public static void main(String[] args) {
		 C c1 = new C();
		 c1.D();
		 
		 D d = new D();
		 d.d1();
	}

}
