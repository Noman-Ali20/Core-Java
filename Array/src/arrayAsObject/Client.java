package arrayAsObject;

public class Client {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		
		students[0]=new Student("Vijay",99,11);
		students[1]=new Student("Ajay",88,22);
		students[2]=new Student("Jay",77,33);
		
//		System.out.println("Student Name : "+students[1].getName());
//		System.out.println("Student Marks : "+students[1].getMarks());
//		System.out.println("Student RollNumber : "+students[1].getRollNum());
		
		for(Student temp : students) {
			System.out.println("Student Name : "+temp.getName());
			System.out.println("Student Marks : "+temp.getMarks());
			System.out.println("Student Roll num : "+temp.getRollNum());
			System.out.println("----------------------------------");
		}
	}

}
