package demo;

public class product {
	String name;
	double price;
	int quantity;
	
	public void setData(String nm,double p,int q) {
		name=nm;
		price = p;
		quantity = q;
	}
	
	public void assignObject(product p) {
		name = p.name;
		price = p.price;
		quantity = p.quantity;
	}
	
	public void showData() {
		System.out.println("Product name: "+name);
		System.out.println("Product price: "+price);
		System.out.println("Product quantity: "+quantity);
//		double productBill = bill(quantity);
		System.out.println("Product bill: "+bill(quantity));
	}
	public double bill(int q) {
		return price * q;
	}
}
