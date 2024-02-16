package logic.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Ram");
		list.add("Vishal");
		list.add("Akshay");
		list.add("Sujit");
		list.add("Prathmesh");
		
		list.forEach(str -> System.out.println("list: "+str));

		String[] str2 = new String[list.size()];
		
		String[] str3 = list.toArray(new String[0]);
		
		for(String s:str3) {
			System.out.println("str3: "+s);
		}
		
		int i=0;
		for (String string : list) {
			str2[i]=string;
			i++;
		}
		
		for (String string : str2) {
			System.out.println("str2: "+string);
		}
	}

}
