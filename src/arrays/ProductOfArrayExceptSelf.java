package arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		
		
		int [] nums= {1,2,3,4};
		
		new ProductOfArrayExceptSelf().productExceptSelf(nums);

	}

	 public int[] productExceptSelf(int[] nums) {
	        
	        int[] output = new int[nums.length];

			output[0] = 1;
			//calculate product to the left
			for (int i = 1; i < nums.length; i++) {
				output[i] = output[i - 1] * nums[i-1];
			}

			
			int right =1;
			
			
			//calculate product to the right
			for(int i=nums.length-1;i>=0;i--)
			{
				output[i]=output[i] *right;
				right = right *nums[i];
				
			}
			return output;
	    }
}
