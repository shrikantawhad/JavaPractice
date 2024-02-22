package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingDemo {
	public static void main(String[] args) {
		int[] arr = {23,78,2,54,89,45,66,2,1};
		
		for(int i=0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//List<String> l31 = Arrays.asList(str);
		
		List<Integer> str = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
	 Arrays.stream(arr).forEach(n->System.out.println(n)); //boxed().collect(Collectors.toList());
	
	List<Integer>l1=Arrays.stream(arr).boxed().toList();
	

	 
	 
		//List<int[]> list = Arrays.asList(arr);
		
		//list.forEach(n->System.out.println(n));
	}

}
