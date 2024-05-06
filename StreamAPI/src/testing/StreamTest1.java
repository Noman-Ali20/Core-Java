package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		List<Integer> nums =Arrays.asList(6,8,7,3,4,5);
		
		nums.stream()     //[6,8,7,3,4,5]
		    .filter((num)->num%2==0) //[6,8,4]
		        .map((num)->num*2)   //[12,16,8]
		            .forEach((num)->System.out.println(num));//12 16 8
		
//		Stream<Integer> stream = nums.stream(); //we can use stream only once
//		
//		Stream<Integer> filter=stream.filter((num)->num%2==0);
//		
//		Stream<Integer> map=filter.map((number)->number * 2);
//		
//		
//		map.forEach((num)->System.out.println(num));
		

	}

}
