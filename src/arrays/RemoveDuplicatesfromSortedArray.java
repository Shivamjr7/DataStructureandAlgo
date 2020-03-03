package arrays;

public class RemoveDuplicatesfromSortedArray {

	/**
	 * Given a sorted array nums, remove the duplicates in-place such that each
	 * element appear only once and return the new length. Given nums = [1,1,2]
	 * 
	 * o/p = 2
	 */
	public static void main(String[] args) {
		
		int [] nums = {1,2,3};
		removeDuplicates(nums);
	}

	public static int removeDuplicates(int[] nums) {

		//two pointers , one to keep moving and one to replace next ele posn
		int i =0;
	
		
		for(int j=1;j<nums.length;j++){
			if(nums[i]!=nums[j]){
				i++;
				nums[i] = nums[j];
			}
				
		}
		
		return i+1;
		
	}

}
