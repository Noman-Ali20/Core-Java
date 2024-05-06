package practicepractice26_10;

public class ClientStudentInfo {

	public static void main(String[] args) {
//		StudentInfo si = new StudentInfo("jay",11,98);
//		si = MakeStudentInfo.getStudentInfo();
//		System.out.println("Name: "+si.name);
//		System.out.println("Marks: "+si.marks);
//		System.out.println("Roll Number: "+si.rollNum);
		
		StudentInfo [] obj = MakeStudentInfo.getStudentInfo();
		for(StudentInfo s : obj) {
			System.out.println("Name: "+
		s.name);
			System.out.println("Roll Number: "+s.rollNum);
			System.out.println("Marks: "+s.marks);
		}
	}

}
