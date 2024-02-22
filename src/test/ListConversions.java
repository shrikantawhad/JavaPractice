package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListConversions {
	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		
		
		List<Integer> l1 = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		
		l1.forEach(n->System.out.println(n));
		
		String[] strArray = {"Ram", "Vishal", "Akshay", "Sujit"};
		
		List<String> str = Arrays.asList(strArray);
		
		str.stream().forEach(System.out::println);

	Integer[] integerArray = l1.toArray(new Integer[0]);
	List<Integer> l2 = Arrays.stream(integerArray).toList();
	
	
	List<String> l3 =Arrays.asList("a","b");
	
	}

}
