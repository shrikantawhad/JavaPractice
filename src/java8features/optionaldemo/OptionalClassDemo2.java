package java8features.optionaldemo;

import java.util.Optional;

// Random Practice
public class OptionalClassDemo2 {
	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable("Shrikant");
		System.out.println(String.valueOf(optional));
		System.out.println(String.valueOf(optional).length());
		System.out.println(optional.map(n -> n.toUpperCase())
				.filter(n -> n.charAt((String.valueOf(optional)).substring(9, 16).length()) % 2 == 0)
				.filter(s -> s.indexOf(s) % 2 != 0));
	}
}
