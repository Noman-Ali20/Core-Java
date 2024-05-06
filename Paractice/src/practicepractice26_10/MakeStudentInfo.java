 package practicepractice26_10;

public class MakeStudentInfo {
	public static StudentInfo[] getStudentInfo() {
		StudentInfo jay = new StudentInfo("jay",11,78);
		StudentInfo pavan = new StudentInfo("pavan",22,80);
		StudentInfo nayan = new StudentInfo("nayan",33,90);
	
		StudentInfo [] arr = new StudentInfo[3];
		arr[0] = jay;
		arr[1] = jay;
		arr[2] = jay;
		return arr;
	}
	
}
