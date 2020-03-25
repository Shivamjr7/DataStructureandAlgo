package arrays;

public class MaximumSumSubArrayOfsizek {

	public static void main(String[] args) {
		
		
		int []arr = {2, 3, 4, 1, 5};
		System.out.println(findMaxSumSubArray(2,arr));

	}

	
	public static int findMaxSumSubArray(int k, int[] arr) {
	    
		
		int i =0;
		
		int j =0;
		
		int sum =0;
		int max = 0;
		
		for(j=0;j<k;j++)
		{
			sum+=arr[j];
		}
		
		max = Math.max(sum, max);
	
		while(j<arr.length)
		{
			sum = sum+arr[j++]- arr[i++];
			max = Math.max(sum, max);
		}
		
	    return max;
	}
}
