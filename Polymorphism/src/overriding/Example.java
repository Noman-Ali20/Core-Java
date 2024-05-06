package overriding;

class Car{
	void speed() {
		System.out.println("Car speed 60kmph");
	}
}
class BMW extends Car{
	@Override
	void speed() {
		System.out.println("BMW speed 120kmph");
	}
}
public class Example {

	public static void main(String[] args) {
		BMW bmw = new BMW ();
		bmw.speed();
	}

}
