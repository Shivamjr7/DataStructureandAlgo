package arrays;

public class MaxConsecutiveOneWithK {

	public static void main(String[] args) {
		
		
		int []arr ={0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1};	
		System.out.println(findMaxConsecutiveOnes(arr,2));
	}
	
	
	public static  int findMaxConsecutiveOnes(int[] nums,int k) {

		int maxconsecutiveOnes = 0;
		
		
		int i=0;
		int zeroCount =0;
		for(int j=0;j<nums.length;j++)
		{
			if(nums[j]==0)
				zeroCount++;
			
			//till we have removed one zero
			while(zeroCount>k)
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
