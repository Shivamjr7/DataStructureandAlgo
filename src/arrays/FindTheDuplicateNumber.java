package arrays;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		
		
		int [] nums = {1,3,4,2,2};
		
		System.out.println(findDuplicate(nums));

	}

	
	 public static int findDuplicate(int[] nums) {
	        
		 	int res = 0;
	        int n = nums.length;
	        int extra [] = new int[n];
	        
	        
	        for(int i=0;i<n;i++)
	        {
	            extra[i]=1;
	        }
	        
	        for(int i=0;i<n;i++)
	        {
	            int index = nums[i]-1;
	          
	            
	            if(extra[index]==1)
	            	extra[index]=-1;
	            else if(extra[index]==-1)
	            	res = nums[i];
	            	
	                
	        }
	        
	        return res;
	        
	        
	     
	    }
}
