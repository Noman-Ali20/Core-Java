package List;

import java.util.ArrayList;

public class UserWantNum {

	public static void main(String[] args) {
		ArrayList<Integer> firstFiveNumbers = new ArrayList();
		firstFiveNumbers.add(1);
		firstFiveNumbers.add(2);
		firstFiveNumbers.add(3);
		firstFiveNumbers.add(4);
		firstFiveNumbers.add(5);
		System.out.println("First Five Numbers " + firstFiveNumbers);

		ArrayList<Integer> nextFiveNumbers = new ArrayList<>();
		nextFiveNumbers.add(6);
		nextFiveNumbers.add(7);
		nextFiveNumbers.add(8);
		nextFiveNumbers.add(9);
		nextFiveNumbers.add(10);
		System.out.println("Next Five Number " + nextFiveNumbers);

		ArrayList<Integer> tenNumbers = new ArrayList<>(firstFiveNumbers); // emptylist created
		tenNumbers.addAll(nextFiveNumbers);
//		tenNumbers.addAll(5, nextFiveNumbers);
		System.out.println("Ten Numbers " + tenNumbers);
	}

}
