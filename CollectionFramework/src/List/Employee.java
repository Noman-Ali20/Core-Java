package List;

public class Employee {
	private String name;
	private String id;
	private double salary;
	private String designation;
	Employee(String name, String id, double salary, String designation){
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getId() {
		return id;
	}
//	public void setId(String id) {
//		this.id = id;
//	}
	public double getSalary() {
		return salary; 
	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
	public String getDesignation() {
		return designation;
	}
//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}
	
	
}
