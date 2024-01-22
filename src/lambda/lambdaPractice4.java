package lambda;

import java.util.Arrays;
import java.util.List;

public class lambdaPractice4 {
	
public static void main(String[] args) {
	List<Integer> values = Arrays.asList(4,5,6,7,8);
	
	System.out.println("Lambda Expression:");
	values.forEach(i -> System.out.println(i)); // implementation of consumer interface

	
	System.out.println("Method Reference:");
	values.forEach(System.out::println);
}

}
