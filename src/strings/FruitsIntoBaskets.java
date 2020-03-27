package strings;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {

	public static void main(String[] args) {
		
		char arr[] = {'A', 'B', 'C', 'A', 'C'};
		System.out.println(findLength(arr));
	}
	
	 public static int findLength(char[] arr) {
		   
		 
		 int window_start=0;
		 
		 int len =0;
		 
		 
		 Map<Character, Integer> map = new HashMap<Character, Integer>();
		 for(int window_end =0;window_end<arr.length;window_end++)
		 {
			 char rightchar = arr[window_end];
			 
			 map.put(rightchar, map.getOrDefault(map.get(rightchar), 0)+1);
			 
			 while(map.size()>2)
			 {
				 char leftchar = arr[window_start];
				 map.put(leftchar,map.get(leftchar)-1);
				 if(map.get(leftchar)==0)
				 {
					 map.remove(leftchar);
				 }
				 window_start++;
			 }
			 
			 len = Math.max(len, window_end-window_start+1);
		 }
		 
		 
		 return len;
	 }

}
