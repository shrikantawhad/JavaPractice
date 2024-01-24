package methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ram", "Vishal", "Sujit", "Akshay");

		Consumer<String> con = new Consumer<String>() {
			public void accept(String s) {
				System.out.println(s);
			}
		};

		System.out.println("Print List By Consumer Interface Object: ");
		list.forEach(con);
		System.out.println("\n");

		System.out.println("Print List By lambda Expression: ");
		list.forEach(str -> System.out.print(str + "\t"));
		System.out.println("\n");

		// Call By Method
		System.out.println("Print List By Method Reference: ");
		list.forEach(System.out::print); // here System.out is as class.object to println belongs
		System.out.println("\n");
		
		System.out.println("Print List By Methos Reference with user created print method: ");
		list.forEach(MethodReferenceDemo::print); // user created print method (down below)
	}

	// newly created print Method to print the list sequentially
	public static void print(String s) {
		System.out.print(String.valueOf(s + "\t"));
	}

}
