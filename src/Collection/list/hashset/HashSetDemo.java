package Collection.list.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> hashset = new HashSet<String>();

		// Adding elements including null
		hashset.add("apple");
		hashset.add("banana");
		hashset.add(null);
		hashset.add("orange");
		hashset.add(null); // Adding null again
		hashset.add("Orange");
		
		
		Iterator<String> itr = hashset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Displaying the set
		System.out.println("HashSet: " + hashset);
	}
}
