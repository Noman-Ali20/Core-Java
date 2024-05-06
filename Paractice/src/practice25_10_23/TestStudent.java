package practice25_10_23;

public class TestStudent {

	public static void main(String[] args) {
		AdharCard ac = new AdharCard("Jay","Rajpal","20 May 2001","India",111101111);
		PanCard pc = new PanCard("Jay","India","IJF1111");
		Student jay = new Student("Jay",78,11,ac,pc);
		jay.introduce();
		

		
	}

}
