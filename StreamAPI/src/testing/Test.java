package testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		Consumer<String> c = (name)->System.out.println(name.length());
		c.accept("Noman");
		
		List<String> languages = new ArrayList();
		languages.add("java");
		languages.add("python");
		languages.add("php");
		languages.add("ruby");
		languages.add("c");
		
		languages.forEach((name)->System.out.println(name));
		
//		for (String string : languages) {
//			System.out.println(string);
//		}

	}

}
