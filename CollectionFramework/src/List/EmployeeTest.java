package List;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee jay =  new Employee("Jay","Id1001",35000,"Developer");
		Employee viru =  new Employee("Viru","Id1002",30000,"Developer");
		Employee sahil =  new Employee("Sahil","Id1003",40000,"Tester");
		Employee saif =  new Employee("Saif","Id1004",50000,"Tester");
		Employee sai =  new Employee("Sai","Id1005",55000,"Developer");
		Employee vani =  new Employee("Vani","Id1006",50000,"Tester"); 
		Employee kiran =  new Employee("Kiran","Id1007",60000,"Tester");
		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(jay);
		emp.add(viru);
		emp.add(sahil);
		emp.add(saif);
		emp.add(vani);
		emp.add(kiran);
		for(Employee x : emp) {
			System.out.println("Name: "+x.getName());
			System.out.println("Employee ID: "+x.getId());
			System.out.println("Salary: "+x.getSalary());
			System.out.println("Designation: "+x.getDesignation());
			System.out.println("---------------------------------------------");
			
		}
		System.out.println("    Employee whoes salary < 35000     ");
		for(Employee x : emp) {
			if(x.getSalary()<35000) {
			System.out.println("Name: "+x.getName());
			System.out.println("Employee ID: "+x.getId());
			System.out.println("Salary: "+x.getSalary());
			System.out.println("Designation: "+x.getDesignation());
			System.out.println("---------------------------------------------");
			}
			
		}
		
		System.out.println("    Employee whoes salary > 35000     ");
		for(Employee x : emp) {
			if(x.getSalary()>35000) {
			System.out.println("Name: "+x.getName());
			System.out.println("Employee ID: "+x.getId());
			System.out.println("Salary: "+x.getSalary());
			System.out.println("Designation: "+x.getDesignation());
			System.out.println("---------------------------------------------");
			}
			
		}
		
		System.out.println("    Employee whoes designation is Developer     ");
		for(Employee x : emp) {
			if(x.getDesignation() == "Developer") {
			System.out.println("Name: "+x.getName());
			System.out.println("Employee ID: "+x.getId());
			System.out.println("Salary: "+x.getSalary());
			System.out.println("Designation: "+x.getDesignation());
			System.out.println("---------------------------------------------");
			}
			
		}
		System.out.println("    Employee whoes designation is Tester     ");
		for(Employee x : emp) {
			if(x.getDesignation() == "Tester") {
			System.out.println("Name: "+x.getName());
			System.out.println("Employee ID: "+x.getId());
			System.out.println("Salary: "+x.getSalary());
			System.out.println("Designation: "+x.getDesignation());
			System.out.println("---------------------------------------------");
			}
			
		}
		
//		System.out.println("Name: "+jay.getName());
//		System.out.println("ID: "+jay.getId());
//		System.out.println("Salary: "+jay.getSalary());
//		System.out.println("Designation: "+jay.getDesignation());
//		System.out.println("---------------------------------------------");
//		
//		System.out.println("Name: "+viru.getName());
//		System.out.println("ID: "+viru.getId());
//		System.out.println("Salary: "+viru.getSalary());
//		System.out.println("Designation: "+viru.getDesignation());
//		System.out.println("---------------------------------------------");
//		
//		System.out.println("Name: "+sahil.getName());
//		System.out.println("ID: "+sahil.getId());
//		System.out.println("Salary: "+sahil.getSalary());
//		System.out.println("Designation: "+sahil.getDesignation());
//		System.out.println("---------------------------------------------");
//		
//		System.out.println("Name: "+saif.getName());
//		System.out.println("ID: "+saif.getId());
//		System.out.println("Salary: "+saif.getSalary());
//		System.out.println("Designation: "+saif.getDesignation());
//		System.out.println("---------------------------------------------");
//		
//		System.out.println("Name: "+sai.getName());
//		System.out.println("ID: "+sai.getId());
//		System.out.println("Salary: "+sai.getSalary());
//		System.out.println("Designation: "+sai.getDesignation());
//		System.out.println("---------------------------------------------");
//		
//		System.out.println("Name: "+vani.getName());
//		System.out.println("ID: "+vani.getId());
//		System.out.println("Salary: "+vani.getSalary());
//		System.out.println("Designation: "+vani.getDesignation());
//		System.out.println("---------------------------------------------");
//		
//		System.out.println("Name: "+kiran.getName());
//		System.out.println("ID: "+kiran.getId());
//		System.out.println("Salary: "+kiran.getSalary());
//		System.out.println("Designation: "+kiran.getDesignation());
		
		
		
		

	}

}
