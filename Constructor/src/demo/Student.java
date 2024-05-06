package demo;

public class Student {
	
	Student(){                            //It is default constructor
		System.out.println("Here, Constructor called");
	}
	
	void showData() {
		
		System.out.println("Here, Details of student will show");
	}
	void m1() {
		System.out.println("m1 called");
	}
	
	public static void main(String args[]) {
		Student st = new Student();
		st.showData();
		st.m1();
		
	}
}
