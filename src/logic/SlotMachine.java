package logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SlotMachine {
	public static int slotWins(List<String> history) {
		int slot = history.get(0).length();
		List<List<Integer>> list= new ArrayList<>();
		for(String spin:history) {
			List<Integer> l = new ArrayList<>();
				
			for(char c: spin.toCharArray()) {
				l.add(Character.getNumericValue(c));
			}
			
			Collections.sort(l);
			list.add(l);
		}
		
		int sum =0;
		for(int i= slot-1;i>=0;i--) {
			int max = 0;
			for(List<Integer> l: list) {
				max=Math.max(max, l.get(i));
			}
			sum+=max;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		 int n = 4;
	        List<String> spins = new ArrayList<String>();
	        spins.add("137");
	        spins.add("364");
	        spins.add("115");
	        spins.add("724");
	        	//{"137", "364", "115", "724"};
	        int result = slotWins(spins);
	        System.out.println(result);
	}

}
