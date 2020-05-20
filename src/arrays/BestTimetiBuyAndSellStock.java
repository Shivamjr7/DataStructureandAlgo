package arrays;

public class BestTimetiBuyAndSellStock {

	public static void main(String[] args) {
		
		
		int []arr = {7,1,3,5,6,4};
		
		maxProfit(arr);

	}

	
	   public static int maxProfit(int[] prices) {
	        int result = 0;
	        int slow = 0;  // keep tracking the min price
	        for (int fast = 0; fast < prices.length; fast++) {
	            if (prices[fast] < prices[slow]) {
	                slow = fast;
	            } 
	            result = Math.max(result, prices[fast] - prices[slow]);  // keep tracking the max profit
	        }
	        return result;
	    }
}
