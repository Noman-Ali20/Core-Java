package practicepractice26_10;

public class TestStudent {

	public static void main(String[] args) {
		String name=Student.getStudentName();
		System.out.println(name);
		System.out.println();
		
		String [] arr = Student.getStudentNames();
		for(String x : arr) {
			System.out.println("Name: "+x);
		}
		

	}

}
