package logic.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SeperateList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("cabca");
		list.add("abc");
		list.add("cabc");
		list.add("si");
		list.add("bco");
		
		
		
		list.forEach(str->System.out.println(str));
		
		System.out.println("Max Value: "+Collections.max(list));
		System.out.println(Collections.frequency(list, "abc"));
		
		//Object [] str = list.toArray();
		
		List<String> l1=list.stream().filter((str)->str.length()==4).collect(Collectors.toList());
		List<String> l2=list.stream().filter((str)->str.length()==3).collect(Collectors.toList());
		List<String> l3=list.stream().filter((str)->str.length()==2).collect(Collectors.toList());
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		List<String> length4 = new ArrayList<String>();
		List<String> length3 = new ArrayList<String>();
		List<String> length2= new ArrayList<String>();
		for(String str: list) {
			if(str.length()==4) {
				length4.add(str);
			}else if (str.length()==3) {
				length3.add(str);
				
			}else {
				length2.add(str);
			}
		}
		System.out.println("length 2:"+length2);
		System.out.println("length 3:"+length3);
		System.out.println("length 4:"+length4);
		
		
		List<List<Integer>> newList = new ArrayList<List<Integer>>();
		
		for(int i=0;i<list.size();i++){
			for(int j=2;j<6;j+=2) {
				if(list.get(i).length()==j) {
					System.out.println("j: "+j+" "+list.get(i));
				}
			}
			
		}
		
		
		Object[] str = list.toArray();
		
		
		List<Object> l31 = Arrays.asList(str);
		System.out.println(l31);
		
	
		
		
		//String[] str2= str;
		//List<String> list2 = ({1,2,3,4,5,6,7});
		//for(String str1: (String[])str) {}
		
		
		
		
		
	}

}
