package java8features.optionaldemo;

import java.util.Optional;

public class OptionalClassDemo3 {
	public static void main(String[] args) {
		Optional<String> emptyOptional = Optional.empty();
		Optional<String> nonEmptyOptional = Optional.of("Hello");
		
		//String s=emptyOptional.get();
		
		// emptyOptional=Optional.ofNullable(Optional.of("Shri").toString());
		String str=Optional.of("Shri").toString();
		String s2  = emptyOptional.orElse(null);
		System.out.println(s2);
	}

}
