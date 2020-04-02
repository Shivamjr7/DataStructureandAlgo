package arrays;

public class SmallestSubArrayWithGivenSum {

	public static void main(String[] args) {
		
		
		int []arr = {2, 1, 5, 2, 3, 2};
		System.out.println(findMinSubArray(7,arr));

	}

	
	 public static int findMinSubArray(int S, int[] arr) {
		    
		 
		 int window_start=0;
		 int sum =0;
		 int min_length =Integer.MAX_VALUE;
		 
		 
		 for(int window_end=0;window_end<arr.length;window_end++)
		 {
			 sum += arr[window_end];
			 
			 while(sum>=S)
			 {
				 min_length = Math.min(min_length, window_end-window_start+1);
				 sum = sum - arr[window_start++];
			 }
			 
		 }
		 
		 
		    return min_length== Integer.MAX_VALUE?0:min_length;
	 }
}
