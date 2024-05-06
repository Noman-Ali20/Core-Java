package demo;

public class Student <T> {
	T name;
	T getDetails(T x) {
		this.name=x;
		return x;
	}

	public static void main(String[] args) {
		Student<String> st = new Student<>();
		
		
		String t= st.getDetails("joshi");
		System.out.println(t);
		
	}

	

}
