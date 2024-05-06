package practice25_10_23;

public class Employee {
	String name;
	int age;
	double salary;

	Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	void coding() {
		System.out.println("Perform some coding");
	}

	void calculateBonus() {
		System.out.println("My Salary is: "+salary);
		double bonus = salary * 0.1;
		System.out.println("Given bonus is :"+bonus);
	}
}
