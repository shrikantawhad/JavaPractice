package logic.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	static int x;

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		String[] arr = list.toArray(new String[1]);

		String str1 = "Th234is i34s n324e45w P32ro234gr2am";
		char[] arr1 = str1.toCharArray();

		for (int i = 0; i < arr1.length; i++) {
			

			for (String str : arr) {
				System.out.println(Integer.parseInt(str));
				x += Integer.parseInt(str);
				String z = String.valueOf(x);
				System.out.println(z.getClass());

//			 if (x.getClass()==Integer.class) {
//				System.out.println(true);
//			}
			}
		}
	}
}
