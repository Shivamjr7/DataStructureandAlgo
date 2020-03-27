package arrays;

public class MaxConsecutiveOnes2 {

	/**
	 * Given a binary array, find the maximum number of consecutive 1s in this array
	 * if you can flip at most one 0.
	 * 
	 * Example 1: Input: [1,0,1,1,0] Output: 4 Explanation: Flip the first zero will
	 * get the the maximum number of consecutive 1s. After flipping, the maximum
	 * number of consecutive 1s is 4.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int nums[] = {1,0,1,1,0};
		System.out.println(findMaxConsecutiveOnes(nums));
	}

	
	/**
	 * Will be using sliding window to solve this problem
	 * @param nums
	 * @return
	 */
	public static  int findMaxConsecutiveOnes(int[] nums) {

		int maxconsecutiveOnes = 0;
		
		
		int i=0;
		int zeroCount =0;
		for(int j=0;j<nums.length;j++)
		{
			if(nums[j]==0)
				zeroCount++;
			
			//till we have removed one zero
			while(zeroCount>1)
			{
				if(nums[i]==0)
				{
					zeroCount--;
				}
				
				i++;
			}
			
			maxconsecutiveOnes= Math.max(maxconsecutiveOnes, j-i+1);
			
			
		}
		return maxconsecutiveOnes;
	}

}
