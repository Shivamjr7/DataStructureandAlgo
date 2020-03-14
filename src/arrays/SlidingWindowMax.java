package arrays;

public class SlidingWindowMax {

	public static void main(String[] args) {
	
		
		int []arr ={1,3,-1,-3,5,3,6,7};

		maxSlidingWindow(arr,3);
	}

	
	public static  int[] maxSlidingWindow(int[] nums, int k) {
        
		int []res = new int[nums.length-k+1];
		for(int i=0;i<=nums.length-k;i++)
		{
			int max =nums[i];
			
			for(int j =1;j<k;j++)
			{
				if(nums[i+j]>max)
					max = nums[i+j];
			}
			res[i]=max;
		}
		
		return res;
    }
}
