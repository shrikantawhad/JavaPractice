package java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapStreamDemo {

	public static void main(String[] args) {
		List<List<Integer>> listOfList = Arrays.asList(
											Arrays.asList(1, 2, 3), 
											Arrays.asList(4, 5, 6, 6, 6, 6),
											Arrays.asList(7, 8, 9));

		Stream<Integer> flattenStream = listOfList.stream()
												  .flatMap(list -> list.stream()) // .flatMap(List::stream)
												  .sorted().distinct();
		flattenStream.forEach(System.out::println);
		
		
		List<Integer> flattenStream2 = listOfList.stream()
												 .flatMap(list -> list.stream()) // .flatMap(List::stream)
												 .map(n -> (int) Math.pow(n, 2))
												 .collect(Collectors.toList());
		flattenStream2.forEach(System.out::println);

		
	}
}
