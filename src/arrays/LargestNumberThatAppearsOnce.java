package arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LargestNumberThatAppearsOnce {

	public static void main(String[] args) {
		
		
		int []arr = {5,7,3,9,4,9,8,3,1};
		System.out.println(largestUniqueNumber(arr));
	}

	
	 public static int largestUniqueNumber(int[] A) {
	       Map<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder()); 
	       
	       
	       int max = -1;
	       for(int num:A)
	       {
	    	   if(map.containsKey(num))
	    	   {
	    		   map.put(num, map.get(num)+1);
	    	   }
	    	   else
	    	   {
	    		   map.put(num, 1);
	    	   }
	       }
	       
	       
	       for(Map.Entry<Integer, Integer> entry: map.entrySet())
	       {
	    	   int val = entry.getValue();
	    	   
	    	   if(val==1)
	    	   {
	    		   max = entry.getKey();
	    		   break;
	    	   }
	    			   
	       }
	       
	       return max;
	    }
}
