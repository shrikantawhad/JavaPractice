package logic;

import java.util.ArrayList;
import java.util.List;

public class RestructuredArray {
	public int[] getElements(int[] arr, int[][] queries) {
		int rowLength =arr[0];
		int[] result = new int[queries.length];
		for(int i =0; i<queries.length;i++) {
			int row = queries[i][0];
			int col = queries[i][1];
			result[i] = arr[(row-1)*rowLength+col];
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		//int[][] l = {[1,1],[1,2],[2,1],[2,2]};
	}

}
