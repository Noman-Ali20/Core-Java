package demo;

public class Bank {
	void deposite() {
		System.out.println("Deposite");
	}
	void deposite(int a) {
		System.out.println("Deposite Cheque");
	}
	void deposite(double b,int a) {
		System.out.println("Deposite DD");
	}
	void deposite(int a, double b) {
		System.out.println("Deposite Cash");
	}
}

//polymorphism-> bcz same method having multiple behaviour
// It is method overloading, bcz multiple method having same name with different parameters