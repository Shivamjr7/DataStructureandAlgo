package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TopKFrequentElements {

	public static void main(String[] args) {

		int[] arr = { 4,1,-1,2,-1,2,3};
			
		
		
		topKFrequent(arr,2);

	}

	public static List<Integer> topKFrequent(int[] nums, int k) {
	
			List<Integer> list = new ArrayList<Integer>();
	
			Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
	
			for (int num : nums)
	
			{
				if (map.containsKey(num)) {
					map.put(num, map.get(num) + 1);
				} else {
					map.put(num, 1);
				}
			}
			  map = map.entrySet().stream()
		                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
			
			for(Map.Entry<Integer, Integer> entry: map.entrySet())
			{
				
				if(k==0)
					break;
				list.add(entry.getKey());
				k--;
			}
			
			return list;
	}
}
