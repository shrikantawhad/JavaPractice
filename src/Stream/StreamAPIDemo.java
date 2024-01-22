package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8, 6, 3, 9, 1);

		Stream<Integer> stream = list.stream();

		// System.out.println("Stream Data:" + list.stream());

//		list.forEach(k -> System.out.println("List Data: " + k));
//		stream.forEach(n -> System.out.println("Stream Data: " + n));

//		long count = stream.count();
//		System.out.println("Count: "+count);

		Stream<Integer> str = stream.sorted();

		System.out.println("str values: ");
		str.forEach(n -> System.out.print(n + " "));

		System.out.println("\n");

//		System.out.println("Doubles values of list: ");
//		for (Integer  i : list) {
//			System.out.print(i*2+" ");
//		}

//		System.out.println("Doubled values using map ");
//		Stream<Integer> data = list.stream();
//		Stream<Integer> mappedData = data.map(n->n*2);
//		
//		mappedData.forEach(n->System.out.print(n+" "));

		
		
		/* Simplified Way */
		
		Predicate<Integer> predi = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer n) {
	
				return n % 2 == 1;
//				if(n % 2 == 1)
//					return true;
//				else
//					return false;
			}
		};
		
	// lambda Expression
		
	Predicate<Integer> predi1 = n ->  n % 2 == 0;
//		
	//Scanner sc = new Scanner(System.in);
		
//		System.out.println("Simplified way doubled stream:");
//		list.stream()
//			//.filter(n -> n % 2 == 1)
//			.filter(predi1)
//			.sorted()
//			.map(n -> n * 2)
//			.forEach(n -> System.out.print(n + " "));
		
	
	/*  Using reduce()  */
	
		System.out.println("Simplified way doubled stream:");
		int result = list.stream()
			//.filter(n -> n % 2 == 1)
			.filter(predi1)
			.sorted()
			.map(n -> n * 2)
			.reduce(0, (c,e) -> c+e);
		
		System.out.println(result);
	}
}
