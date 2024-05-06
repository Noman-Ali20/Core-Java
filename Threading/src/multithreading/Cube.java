package multithreading;

public class Cube extends Thread {
	public void calculateCube() {
		System.out.println("Thread Name in cube:"+Thread.currentThread().getName());
		for (int i = 1; i < 10; i++) {
			System.out.println("Cube of " + i + " is " + i * i * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

	@Override
	public void run() {
		calculateCube();
	}

}
