package arrays;

import java.util.Stack;

public class LargestRectangle {

	public static void main(String[] args) {
		
		
		int [] arr = {2,1,5,6,2,3};
		
		System.out.println(new LargestRectangle().largestRectangleArea(arr));

	}
	
	
	
	 public int largestRectangleArea(int[] heights) {
	       
	        if(heights.length==0)
	            return 0;
	        if(heights.length==1)
	            return heights[0];
	        
	        Stack<Integer> stack = new Stack<>();
	        
	        
	        int i =0;
	        
	        int max =0;
	        
	        while(i<heights.length)
	        {
	            if(stack.isEmpty() || heights[stack.peek()]<=heights[i])
	                stack.push(i++);
	            else
	            {
	                int n = stack.pop();
	                max = Math.max(max,heights[n]* (stack.isEmpty()?i:(i-stack.peek()-1)));
	                
	            }
	        }
	        
	        while(!stack.isEmpty()){
	            int t = stack.pop();
	            
	             max = Math.max(max,heights[t]* (stack.isEmpty()?i:(i-stack.peek()-1)));
	        }
	        
	        
	        return max;
	    }

}
