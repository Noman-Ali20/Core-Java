package Set;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);  // In Set duplicates values not allowed
		hs.add(30);
		System.out.println("Integer HashSet "+hs);
		HashSet<String> str = new HashSet();
		str.add("Java");
		str.add("python");
		str.add("php");
		System.out.println("String HashSet "+str);
		System.out.println("java is present ?"+str.contains("Java"));
		
		
		
	}

	

	
}
