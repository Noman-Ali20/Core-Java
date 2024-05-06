package demo;

public class Iphone {
	Iphone(){
		System.out.println("Iphone Price in India - 70k");
	}
	
	Iphone(int price){
		System.out.println("Iphone Price in USA - 40k");
	}
	
	void buy() {
		System.out.println("Succesfully Buy");
	}
	
	public static void main(String args[]) {
		Iphone ip = new Iphone ();
		ip.buy();
		
	}
}
