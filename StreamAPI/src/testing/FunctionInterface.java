package testing;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		Function<Integer, Integer> func = (number)->number *2;
		int res = func.apply(10);
		System.out.println(res);
	}

}
