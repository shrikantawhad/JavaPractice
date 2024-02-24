package java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIDemo3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8, 6, 3, 9, 1);

		Stream<Integer> stream = list.stream();
		
		Stream<Integer> st=stream.filter(n->n%2==0).map(n->n*2);
		st.forEach(s->System.out.println(s));
		
		
		List<List<Integer>> arr =(8, 6, 3, 9, 1),(234,124)
		
		Stream str=Arrays.stream(arr);
		
		//str.flatMap(i-> Stream.of(arr)).forEach(System.out::println);
		
		//str.flatMap(num -> num.stream());
		
		list =arr;
		
		str.stream() 
        .flatMap(list -> list.stream()) 
        .collect(Collectors.toList()); 
		
	}
}
