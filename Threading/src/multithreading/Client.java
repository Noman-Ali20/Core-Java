package multithreading;

public class Client {

	public static void main(String[] args) {
		
		long startTime=System.currentTimeMillis();
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		Square s = new Square();
		s.start();  //new thread create , which access goes to run()
		
//		s.calculateSquare();
		
		
		Cube c  = new Cube();
		
		c.start();   //new thread create , which access goes to run()
		
//		c.calculateCube();
		
		try {
			s.join();
			c.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		long stopTime=System.currentTimeMillis();
		long totalTime=stopTime-startTime;
		System.out.println("Total Time:"+totalTime);
		
		
		

	}

}
