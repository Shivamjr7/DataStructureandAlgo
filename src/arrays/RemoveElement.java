package arrays;

public class RemoveElement {

	/**
	 * Given an array nums and a value val, 
	 * remove all instances of that value in-place and return the new length.
	 * 
	 */
	public static void main(String[] args) {
	
		
		int []nums = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(nums,2));

	}

	 public static int removeElement(int[] nums, int val) {
	        
		 int i =0;
		 
		 
		 for(int j =0;j<nums.length;j++)
		 {
			 if(nums[j]!=val)
			 {
				 nums[i] =nums[j]; 
				 i++;
			 }
		 }
		 
		 return i;
	    }
}
