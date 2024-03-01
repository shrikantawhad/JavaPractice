package Collection.list.map;

import java.awt.desktop.SystemEventListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Ram");
		hashMap.put(2, "Vishal");
		hashMap.put(3, "Akshay");
		hashMap.put(100,"Amit");  
		  hashMap.put(101,"Vijay");  
		  hashMap.put(102,"Rahul");  
		//hashMap.remove(3);
		
		Set set = hashMap.entrySet(); 
		Iterator itr = set.iterator();
		
		
		while(itr.hasNext()) {
			
			Map.Entry entry = (Map.Entry)itr.next();
			//System.out.println(entry.getClass());
			
			System.out.println(entry.getKey() +" : "+entry.getValue());
			
		
			
		}
		
		System.out.println("\n");
		for (Map.Entry object : hashMap.entrySet()) {
			System.out.println(object.getKey() +""+object.getValue());
		}
		
	
	}

}
