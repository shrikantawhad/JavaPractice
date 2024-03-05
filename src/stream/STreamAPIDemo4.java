package stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

public class STreamAPIDemo4 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("","ABC","","Ram","Vishal","","Sujit","Akshay",""); 
	
	long count = str.stream()
				   .filter(x ->x.isEmpty())
				   .count();
	
		System.out.println("Total EMpty String : " + count);
		
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
		IntSummaryStatistics stats = primes.stream() 
										   .mapToInt((x) -> x)
										   .summaryStatistics();
		
		System.out.println(stats);
		System.out.println(stats.getMax());

	}

}
