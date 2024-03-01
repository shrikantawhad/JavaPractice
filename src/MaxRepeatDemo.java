import java.util.ArrayList;
import java.util.List;

public class MaxRepeatDemo {

	public void removeDuplicates(int[] nums) {

		int k = 1;
		int r = 1;
//	        for(int i=1;i<nums.length;i++){
//	            while(r<=2){
//	            if(nums[i] != nums[i-1]){
//	                nums[k]=nums[i];
//	                k++;
//	                r++;
//	            }
//	            }
//	            r=1;
//	        }
//	        return k;
//	    }
		// int[] result = new int[10];
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (result.contains(nums[i])) {
				continue;
			} else if (nums.length-1==i) {
				result.add(nums[i]);
			}else {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] == nums[i]) {
						result.add(nums[i]);
						result.add(nums[j]);
						break;
					}else {
						System.out.println("Inside elseP: "+j+" "+nums.length);
						if(j==nums.length-1) {//System.out.println("Inside else");
							result.add(nums[i]);
						}
						
					}
				}
			}

		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3};
		new MaxRepeatDemo().removeDuplicates(arr);
	}

}
