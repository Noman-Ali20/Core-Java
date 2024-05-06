package practicepractice26_10;

public class EmployeeTest {

	public static void main(String[] args) {
//		String name= EmployeeName.getName();
//		System.out.println(name);
		
		//Employee whoes salary is Greater then 50000
		
		System.out.println("                     Employee Information                     ");
		EmployeeInformation [] obj = MakeEmployeeInfo.getEmployeeinfo();
		for( EmployeeInformation s: obj) {
			if(s.salary>50000) {
				System.out.println("Employee name: "+s.name);
				System.out.println("Employee ID: "+s.id);
				System.out.println("Employee department: "+s.department);
				System.out.println("Employee Salary: "+s.salary);
				System.out.println("***********************************");
			}
			
			
		}
		
		//Employee whoes salary is Less then 50000
		
		System.out.println("    EMPLOYEE WHOES SALARY LESS THEN 50000    ");
		for( EmployeeInformation s: obj) {
			if(s.salary<50000) {
				System.out.println("Employee name: "+s.name);
				System.out.println("Employee ID: "+s.id);
				System.out.println("Employee department: "+s.department);
				System.out.println("Employee Salary: "+s.salary);
				System.out.println("*******************************");
			}
			
			
		}
		
		System.out.println("    LIST OF EMPLOYEE WHOES BELONG To TESTING    ");
		for( EmployeeInformation s: obj) {
			if(s.department == "Testing") {
				System.out.println("Employee name: "+s.name);
				System.out.println("Employee ID: "+s.id);
				System.out.println("Employee department: "+s.department);
				System.out.println("Employee Salary: "+s.salary);
				System.out.println("*******************************");
			}
			
			
		}
		System.out.println("    LIST OF EMPLOYEE WHOES BELONG To Developer    ");
		for( EmployeeInformation s: obj) {
			if(s.department == "Developer") { 
				System.out.println("Employee name: "+s.name);
				System.out.println("Employee ID: "+s.id);
				System.out.println("Employee department: "+s.department);
				System.out.println("Employee Salary: "+s.salary);
				System.out.println("*******************************");
			}
			
			
		}
		
		System.out.println("    LIST OF EMPLOYEE WHOES NAME START WITH S    ");
		for( EmployeeInformation s: obj) {
			if(s.name.startsWith("S")) { 
				System.out.println("Employee name: "+s.name);
				System.out.println("Employee ID: "+s.id);
				System.out.println("Employee department: "+s.department);
				System.out.println("Employee Salary: "+s.salary);
				System.out.println("*******************************");
			}
			
			
		}

	}

}
