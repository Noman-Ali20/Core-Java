package testing;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		Function<Integer, Integer> func = (number)->number *2;
		int res = func.apply(10);
		System.out.println(res);
		
		Predicate<Integer> p = (number)->number %2==0;
		System.out.println(p.test(10));

	}

}
