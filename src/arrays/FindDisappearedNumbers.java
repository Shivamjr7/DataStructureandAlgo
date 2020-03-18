package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

	public static void main(String[] args) {
		
		
		int []arr= {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(arr);
	}

	
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	        
		 List<Integer> list = new ArrayList<Integer>();
		 
		 
		 for (int i = 0; i < nums.length; i++) {
	            // nums[n - 1] = n;  //can not do this, since you will override the origin node.
	            int idx = Math.abs(nums[i]) - 1;
	            if (nums[idx] > 0) nums[idx] = - nums[idx];
	        }
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] > 0) list.add(i + 1);
	        }
	     
		 
		 
		 return list;
	   }
}
