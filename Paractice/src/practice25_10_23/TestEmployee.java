package practice25_10_23;

public class TestEmployee {

	public static void main(String[] args) {
		Employee joshi = new Employee("Joshi",25,1500);
		joshi.calculateBonus();
		System.out.println("-----------------------------------");
		Employee jay = new Employee("Jay",27,1800);
		jay.calculateBonus();
	}

}
