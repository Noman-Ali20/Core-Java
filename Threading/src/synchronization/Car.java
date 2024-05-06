package synchronization;

public class Car implements Runnable{
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" Has entered into parking");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		synchronized (this)
		{
			System.out.println(Thread.currentThread().getName()+" Has entered into car");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" Has started car and drive");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" Comback and park a car");
		}
	}
}
//we can make synchronized method as well block also