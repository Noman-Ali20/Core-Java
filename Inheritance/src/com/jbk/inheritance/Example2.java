package com.jbk.inheritance;

class Parant{
	void marutiCar() {
		System.out.println("parant has Maruti Car");
	}
}
class Child extends Parant{
	void BMW() {
		System.out.println("Child has BMW");
	}
}

public class Example2 {

	public static void main(String[] args) {
		Child c = new Child();      

		c.marutiCar();           // here child can access parant car also
	
	}

}
