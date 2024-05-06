package List;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest<E> {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList();
	al.add(1);
	al.add(2);
	al.add(3);  // In List duplicates values allowed
	al.add(3);
	System.out.println("Befor remove() "+al);
	al.remove(3);
	System.out.println("After remove() "+al);
	System.out.println("isEmpty() "+al.isEmpty());
	
	HashSet<Integer> hs = new HashSet();
	hs.add(10);
	hs.add(20);
	hs.add(30);  // In Set duplicates values not allowed
	hs.add(30);

	System.out.println("HashSet "+hs);
	al.addAll(hs);
	System.out.println("After addAll() "+al);
}
}
