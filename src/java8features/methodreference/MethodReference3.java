package java8features.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class MethodReference3 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Predicate<Integer> predi = t -> t%2==0;
			
	
		
		List<Integer> l1 = list.stream().filter(predi).collect(Collectors.toList());;
	System.out.println(l1);
	}
}
