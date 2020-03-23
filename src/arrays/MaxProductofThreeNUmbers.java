package arrays;

import java.util.Arrays;

public class MaxProductofThreeNUmbers {

	public static void main(String[] args) {
		
		
		int []arr = {1,2,3};
		maximumProduct(arr);
	}
	
	
	  public static int maximumProduct(int[] nums) {
	        
	        Arrays.sort(nums);
	        
	        // max product will be either the last 3 
	        //or the first two negative combined with the last after sorting
	        int first = nums[0]*nums[1]*nums[nums.length-1];
	        int second = nums[nums.length-1]* nums[nums.length-2]*nums[nums.length-3];
	        
	        return Math.max(first, second);
	        
	    }

}
