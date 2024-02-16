package logic.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("Vishal");
		list.add("Akshay");
		list.add("Sujit");
		list.add("Prathmesh");

		String[] str = list.toArray(new String[0]);

		for(String s: str) {
			System.out.println();
		}
	}
}
