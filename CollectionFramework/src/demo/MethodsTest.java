package demo;

import java.util.LinkedList;
import java.util.List;

public class MethodsTest {

	public static void main(String[] args) {
		List<Integer> nums = new LinkedList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		System.out.println("All Numbers "+nums);
		System.out.println("After remove one object "+nums.remove(4));
		nums.add(2, 5);
		System.out.println("After add object at index "+nums);
		//employee has name,id,salary,designation. Employee can perform coding operation.
		

	}

}
