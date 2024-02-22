package abc;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseString {
	public static void main(String[] args) {
		String str ="Hello World";
		
		char[] str1 =str.toCharArray();
		
		for(int i = str1.length-1;i>=0;i--) {
			System.out.print(str1[i]);
		}
		
		System.out.println("\n");
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(str1[i]);
		}
		
		
	}

}
