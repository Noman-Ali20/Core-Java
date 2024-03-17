package com.accessmodifire.eg;

public class A {               //public members can be accessible from anywhere
	
	protected String m1() {      //protected members can be accessible only in same package and same class
		
		System.out.println("m1 called from A class");
		return "hi";
	}
	public static void main(String[] args) {
		A aa = new A();
		aa.m1();
		
	}
	}

