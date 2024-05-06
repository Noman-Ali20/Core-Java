package demo;

public class Employee<T> {

	T EmployeeSalary;

	public Employee(T EmployeeSalary) {
		this.EmployeeSalary = EmployeeSalary;
	}

	public void print() {
		System.out.println("The Employee Salary is: " + this.EmployeeSalary);
	}

	public static void main(String[] args) {
		int EmployeeSalary = 1000;
		Employee Demo = new Employee(EmployeeSalary);
		Demo.print();
	}

}
