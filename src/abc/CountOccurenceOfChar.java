package abc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountOccurenceOfChar {
	public static void main(String[] args) {
		String str = "java";
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		Set set = hashMap.entrySet(); 
		Iterator itr = set.iterator();
		
		
		char[] ch = str.toCharArray();
		
		
		
		for(char c:ch) {
			System.out.println(c);
			
			hashMap.put(String.valueOf(c), 0);
			//System.out.println(c);
			
			//System.out.println(hashMap.get(c+" "));
			
			
			
			
		}
		//System.out.println(hashMap.containsKey("j"));
		
		for(char k: ch) {
			System.out.println(k);
			
				System.out.println(hashMap.containsKey(String.valueOf(k)));
			
		}
		
		System.out.println(hashMap.containsKey("j"));
		
	}
}
