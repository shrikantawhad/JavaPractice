import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
public static void main(String[] args) {
	
	List list1 = Arrays.asList(9,1,8,4,6,7);
	
	//ArrayList list = new ArrayList();
	
	int list[] = new int[5];
	
//	list.add(1);
//	list.add(9);
//	list.add(5);
//	list.add(2);
//	list.add(8);
//	list.add(3);
	
	list[0]=9;
	list[1]=2;
	list[2]=1;
	list[3]=6;
	list[4]=3;
	
	
	
	
	int temp;
	System.out.println("Sorted List Operation");
	
	for(int i=0;i<list.length-1;i++) {
		for(int j=0;j<list.length-i-1;j++) {
			if(list[j]>list[j+1]) {
				System.out.println(i);
				temp = list[j];
				list[j] = list[j+1];
				list[j+1]=temp;
				
			}
		}
	}
	System.out.println("Sorted List");
	for(int k=0;k<list.length;k++) {
	
		//System.out.println(list[k]);
	}
	
	
	//System.out.println("List Before Sort:"+list1);
	

	//System.out.println("List Before Sort:"+list1.so);
}
}
