package Collection.list.linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		l1.stream().forEach(n-> System.out.println(n));
		
		System.out.println(l1.getFirst());
		System.out.println(l1.contains(5));
		l1.pop();
		System.out.println(l1);
		l1.push(45);
		System.out.println(l1);
		
	 Iterator<Integer> itr = l1.iterator();
	 
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	}
}
