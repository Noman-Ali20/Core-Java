package List;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> numbersList = new LinkedList<>();

		for (int i = 1; i <= 10; i++) {
			numbersList.add(i);
		}

		System.out.println("First Ten Numbers:");
		for (int number : numbersList) {
			System.out.println(number);

		}
	}
}