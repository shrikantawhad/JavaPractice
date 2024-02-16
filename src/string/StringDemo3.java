package string;

import java.util.ArrayList;
import java.util.List;
 
public class StringDemo3 {
	public static void main(String[] args) {
		String str = "javaqa";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
//		
			String temp = str.substring(i + 1, str.length());
			if (!temp.contains(ch + "")) {
				System.out.println(ch);
				break;
			}
		}
 
	}
}