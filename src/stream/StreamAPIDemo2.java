package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamAPIDemo2 {
	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(9, 2, 5, 3, 8, 4, 7);

		// *********** Details Implementation *****************
//		Predicate<Integer> predi = new Predicate<Integer>() { // Anonymous Class
//			
//			@Override
//			public boolean test(Integer t) {
//				if(t%2==1)
//					return true;
//				else
//					return false;
//				}
//		};

		// *********** Simplified Implementation ********************

		Predicate<Integer> predi = n -> n % 2 == 1;

		// *********** Details Implementation *****************
//		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
//
//			@Override
//			public Integer apply(Integer t) {
//				
//				return t;
//			}
//			
//		};

		// *********** Simplified Implementation ********************
		Function<Integer, Integer> fun = n -> n * 2;

		// Total 4 Streams will be created
		int result = values.stream() // Stream 1
				.filter(n -> n % 2 == 1) // predi // Stream 2
				.sorted() // Stream 3
				.map(n -> n * 2) // fun Stream 4
				.reduce(0, (c, e) -> c + e);
		// .forEach(n->System.out.println(n));

		System.out.println("result: " + result);

		// .map(i -> i * 2)
		// .filter(i -> i % 2 == 0);
		// data.forEach(t -> System.out.println(t));

		// data.forEach(t -> System.out.println(t)); // Once a Stream is used we cannot
		// reuse it.
	}

}
