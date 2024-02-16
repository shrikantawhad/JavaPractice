package randompractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SortDemo {
	
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
//		
//		list.add(1);
//		list.add(5);
//		list.add(2);
//		list.add(9);
//		list.add(4);
//		Integer temp;
		
		int[] list = {2,5,7,4,9,8,6,123,456,678,345,8,6,645,345};
		int temp;
		for(int i=0;i<list.length;i++) {
			for(int j =0;j<list.length-i-1;j++) {
				if(list[j]>list[j+1]) {
					list[j+1] = list[j+1]+list[j];
					 list[j]=list[j+1]-list[j];
					 list[j+1]=list[j+1]-list[j];
				}
			}
		}
		
		for (int i : list) {
			System.out.println(i);
		}
		
		
	}

}
