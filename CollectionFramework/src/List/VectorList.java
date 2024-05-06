package List;

import java.util.Vector;
import java.util.ArrayList;
import java.util.List;

public class VectorList {

	public static void main(String[] args) {
		Vector<Character> v = new Vector<>();
//		List<Character> v = new ArrayList();
		v.add('H');
		v.add('E');
		v.add('L');
		v.add('L');
		v.add('O');
		System.out.println("Vector List "+v);
		System.out.println("Vector List Size "+v.size());
//		for(Character x : v) {
//			System.out.print(x);
//		}
		for(int i = 0;i<v.size();i++) {
			System.out.println(v.get(i));
		}

	}

}
