package abc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReverseWordOfString {
	public static void main(String[] args) {
		String str = "Shrikant Sanjay Awhad";
//		String[] arr = str.split(" ");
		String finalString = "";
		for (String s : str.split(" ")) {
			for (int i = s.length() - 1; i >= 0; i--) {
				finalString += s.charAt(i);
			}
			finalString += " ";

		}
		System.out.println(finalString);

	}

}
