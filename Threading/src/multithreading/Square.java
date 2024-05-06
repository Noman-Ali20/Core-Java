package multithreading;

public class Square extends Thread{
	
	public void calculateSquare() {
		System.out.println("Thread Name in square:"+Thread.currentThread().getName());
		for (int i = 1; i < 10; i++) {
			System.out.println("Square of " + i + " is " + i * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	
	}
	@Override
	public void run() {
		calculateSquare();
	}

}
