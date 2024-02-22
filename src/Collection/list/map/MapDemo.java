package Collection.list.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map  map= new HashMap();
		map.put(1, "Ram");
		map.put(2, "Vishal");
		map.put(3, "Akshay");
		
		System.out.println(map.entrySet());
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.remove(1));
		System.out.println(map.entrySet());
		System.out.println(map.replace(2, "Ram"));
		System.out.println(map.entrySet());
		
		//System.out.println(map.);
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {
			
			Map.Entry entry = (Map.Entry)itr.next();
						System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
	}

}
