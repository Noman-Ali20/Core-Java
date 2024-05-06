package demo;

public class Pubg {
	Pubg(){
		System.out.println("**** Welcome to PUBG Game ****");
		
	}
	
	Pubg(String usa){
		System.out.println("Pubg for USA");
	}
	
//	Pubg(int x){
//		System.out.println("Pubg Ban In India");
//	}
	
	void m1() {
		System.out.println("***** Enjoy Your Game *****");
	}
	
	public static void main(String args[]) {
		Pubg p = new Pubg();
		p.m1();
		
	}
}
