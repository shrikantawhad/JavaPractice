package java8features.optionaldemo;

import java.util.Optional;

public class OptionalClassDemo4 {
	public static void main(String[] args) {

		Optional<String> emptyOptional = Optional.empty();
		Optional<String> nonEmptyOptional = Optional.of("Hello");
		
		Optional<String> optional = Optional.empty();

		if (optional.isPresent()) {
			String value = optional.get();
			System.out.println("isPresent value : " + value);
		} else {
			// Handle absence of value
			System.out.println("isPresent value is Empty");
		}

		// Using orElse
		String value = optional.orElse("orElse value is empty");
		System.out.println(value);

	}
}
