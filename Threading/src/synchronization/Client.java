package synchronization;

public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		Thread t1 = new Thread(car);
		t1.setName("SON-1");
		t1.start();
		
		Thread t2 = new Thread(car);
		t2.setName("SON-2");
		t2.start();
		
		Thread t3 = new Thread(car);
		t3.setName("SON-3");
		t3.start();
 
		

	}

}
