package java8features.optionaldemo;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		String str = new String();
		str ="Hi";
		String s= str.getClass().getName();
		String s1="";
		for (char string : s.substring(10, 16).toCharArray()) {
			 s1 += String.valueOf(string);
		}
		
		System.out.println(s1.length());
		 System.out.println( Optional.ofNullable(str.charAt(0)).orElse(null));

//		if (checkNull.isPresent()) { // check for value is present or not
//			String lowercaseString = str[5].toLowerCase();
//			System.out.print(lowercaseString);
//		} else
//			System.out.println("string value is not present");
//	}
}
}