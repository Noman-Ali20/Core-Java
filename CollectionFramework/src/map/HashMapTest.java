package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(11, "jai");
		hm.put(12, "kiran");
		hm.put(13, "rao");
		hm.put(14, "abhi");
		hm.put(15, "saim");

		System.out.println(hm);
		hm.remove(13); // remove
		System.out.println("After remove rao " + hm);

		System.out.println("get() " + hm.get(11)); // get()-- it will return value
		System.out.println("keySet() " + hm.keySet());

		Set<Integer> key = hm.keySet();
		for (Integer x : key) {

			System.out.println(x+" ---> "+hm.get(x));

		}

	}

}
