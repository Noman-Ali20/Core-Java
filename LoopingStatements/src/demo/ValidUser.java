package demo;

public class ValidUser {
	
	 ValidUser(int age) {
		if(age >= 18)
			System.out.println("The User is able for Vote");
		else
			System.out.println("User is Under 18 - (Not able)");
	}
	 public static void main(String args[]) {
		 ValidUser vu = new ValidUser(18);
	 }
}
