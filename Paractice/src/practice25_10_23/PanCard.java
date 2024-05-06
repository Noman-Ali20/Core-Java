package practice25_10_23;

public class PanCard {
	String name;
	String address;
	String panNum;
	
	PanCard(String name, String address, String panNum){
		this.name = name;
		this.address = address;
		this.panNum = panNum;
	}
	
	void Pandetails() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("PanNumber: "+panNum);
	}
}
