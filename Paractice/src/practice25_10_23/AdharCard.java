package practice25_10_23;

public class AdharCard {
	String myName;
	String fatherName;
	String dob;
	String address;
	long adharNum;
	
	AdharCard(String myName, String fatherName, String dob, String address, long adharNum){
		this.myName=myName;
		this.fatherName = fatherName;
		this.dob = dob;
		this.address = address;
		this.adharNum = adharNum;
	}
	
	void adharDetails() {
		System.out.println("My Name: "+myName);
		System.out.println("Father Name: "+fatherName);
		System.out.println("Date of Birth: "+dob);
		System.out.println("Address: "+address);
		System.out.println("Adhar Number: "+adharNum);
		
	}
	
}
