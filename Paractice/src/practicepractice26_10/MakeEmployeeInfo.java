package practicepractice26_10;

public class MakeEmployeeInfo {
	public static EmployeeInformation[] getEmployeeinfo() {
		EmployeeInformation  jay = new EmployeeInformation("Jay","id01","Developer",35000);
		EmployeeInformation  joshi = new EmployeeInformation("Joshi","id02","Testing",40000);
		EmployeeInformation  kamal = new EmployeeInformation("Kamal","id03","Testing",70000);
		EmployeeInformation  sahil = new EmployeeInformation("Sahil","id04","Developer",55000);
		
		EmployeeInformation arr[] = new EmployeeInformation[4];
		arr[0]=jay;
		arr[1]=joshi;
		arr[2]=kamal;
		arr[3]=sahil;
		return arr;
		
	}
}
