package arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		
		
		int []arr = {0,0,1,0,1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(arr));
	}

	
	 public static  int findMaxConsecutiveOnes(int[] nums) {
	     
		 
		 int count =0;
		 int res =0;
		 
		 for(int i=0;i<nums.length;i++)
		 {
			 if(nums[i]==0)
			 {
				 res = Math.max(res, count);
				 count =0;
			 }
			 else
			 {
				 count++;
			 }
		 }
		 
		 return Math.max(res, count);
		 
	    }
}
