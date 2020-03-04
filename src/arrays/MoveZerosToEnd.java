package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		
		int []arr = {0,1,0,3,12};
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}

	
	
	 public static void moveZeroes(int[] nums) {
	     
		 int k =0;
		 
		 for(int i =0;i<nums.length;i++)
		 {
			 if(nums[i]!=0)
				 nums[k++] = nums[i];
		 }
		 
		 for(int j = k;j<nums.length;j++)
		 {
			 nums[j]=0;
		 }
		 
	    }
	
	
}
