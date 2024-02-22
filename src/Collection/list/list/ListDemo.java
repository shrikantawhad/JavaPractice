package Collection.list.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(12);
		System.out.println(list);

		list.clear();
		list.add(12);
		list.add(13);
		list.add(17);
		list.add(15);
		list.add(16);
		list.add(17);

		System.out.println(list);
		System.out.println(list.lastIndexOf(17));
		System.out.println(list.indexOf(17));
		System.out.println(list.get(3));
		list.sort(null);
	
		
		list.stream().map(n->n*2).forEach(j->System.out.println(j));

		list.set(5, 87);
		list.remove(0);
		list.remove((Object) 15);
		System.out.println(list);
		
		//list.toArray(new String[list.size()]);
	
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Ram");
		list1.add("Vishal");
		list1.add("Sujit");
		
		System.out.println(list1);
		
		
		
	
	}

}
