package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
	List<Integer> nums = new ArrayList<Integer>();
	nums.add(10);
	nums.add(7);
	nums.add(8);
	nums.add(13);
	nums.add(16);
	Stream<Integer> stream = nums.stream(); //we can use stream only once
	
	Stream<Integer> filter=stream.filter((num)->num%2==0);
	
	Stream<Integer> map=filter.map((number)->number * 2);
	
	
	map.forEach((num)->System.out.println(num));
	

	}

}
