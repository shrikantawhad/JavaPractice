package Collection.list.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer,String>();
		
		hashMap.put(1,"Ram");
		hashMap.put(2,"Vishal");
		hashMap.put(3, "Akshay");
		
	    hashMap.entrySet()
	    	.stream()
	    	.sorted(Map.Entry.comparingByKey())
	    	.forEach(System.out::println);
	    
	    hashMap.entrySet()
	    	.stream()
	    	.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
	    	.forEach(n->System.out.println(n));
	    
	}

}
