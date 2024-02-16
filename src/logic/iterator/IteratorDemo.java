package logic.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Ram");
		list.add("Vishal");
		list.add("Akshay");
		list.add("Sujit");
		list.add("Prathmesh");
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
