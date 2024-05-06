package practice25_10_23;

public class Student {
	String name;
	double marks;
	int rollNum;
	AdharCard adharCard;
	PanCard panCard;

	public Student(String name, double marks, int rollNum, AdharCard adharCard, PanCard panCard) {
		this.name = name;
		this.marks = marks;
		this.rollNum = rollNum;
		this.adharCard = adharCard;
		this.panCard = panCard;
	}

	public void introduce() {
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("Roll Number: " + rollNum);
		System.out.println("------------ Adhar Card Details ------------");
		adharCard.adharDetails();
//		System.out.println("My Name: "+adharCard.myName);
//		System.out.println("Father Name: "+adharCard.fatherName);
//		System.out.println("Date of Birth: "+adharCard.dob);
//		System.out.println("Address: "+adharCard.address);
//		System.out.println("Adhar Number: "+adharCard.adharNum);
		System.out.println("------------ Pan Card Details ------------");
		panCard.Pandetails();
//		System.out.println("Name: "+panCard.name);
//		System.out.println("Address: "+panCard.address);
//		System.out.println("PanNumber: "+panCard.panNum);
	}
}
