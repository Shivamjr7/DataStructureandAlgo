package arrays;

public class ReplaceElementsWithGreateronRight {	
	
	/**
	 * Given an array arr, 
	 * replace every element in that array with the greatest element among the elements to its right, 
	 * and replace the last element with -1.
	 * 
	 */
	public static void main(String[] args) {
		int []arr = {17,18,5,4,6,1};
		
		replaceElements(arr);
	}

	
	 public static int[] replaceElements(int[] arr) {
	        
		 int n = arr.length;
		 int max  = arr[n-1];
		 arr[n-1] =-1;
		 for(int i = arr.length-2;i>=0;i--)
		 {
			 int temp = arr[i];
			 arr[i] = max;
			 max = Math.max(max, temp);
		 }
		 
		 return arr;
	    }
}
