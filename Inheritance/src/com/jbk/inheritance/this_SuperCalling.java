package com.jbk.inheritance;

class AA{
	AA() {
		
		System.out.println("default AA()");
	}
}
class BB extends AA{

	BB() {
		this(10);   //we cant use this and super calling simulteneously ** By dafault super() is present in the first line of constructor
		
		System.out.println("default BB()");
	}
	BB(int x) {
		//this();
		
		System.out.println("parametrized default BB(int )");
	}
}
public class this_SuperCalling {
	public static void main(String[] args) {
		
		BB b = new BB();
	}
}
