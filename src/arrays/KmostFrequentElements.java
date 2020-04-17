package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class KmostFrequentElements {

	public static void main(String[] args) {
		
		
		int []arr = {1,1,1,2,2,3};
		
		topKFrequent(arr,2);
	}

	
	public static List<Integer> topKFrequent(int[] nums, int k) {
        
		List<Integer> list = new ArrayList<Integer>();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int num:nums)

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
		
		
		PriorityQueue<Integer> heap =
	            new PriorityQueue<Integer>((n1, n2) -> map.get(n1) - map.get(n2));
		return list;
    }
}
