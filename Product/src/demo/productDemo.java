package demo;

public class productDemo {

	public static void main(String[] args) {
		//call by value
		product p1 = new product();
		p1.setData("Iphone13",65000.0,2);
		p1.showData();
		System.out.println("---------------------------");
		
		//call by reference
				product p2 = new product();
				p2.assignObject(p1);
				p2.showData();
				System.out.println("-------------------------");
				
				//assign data using variables
				product p3 = new product();
				p3.name = "samsaung J5";
				p3.price = 8000;
				p3.quantity = 5;
				p3.showData();
//				System.out.println("Bill amount: "+p3.bill(p3.quantity));

	}

}
