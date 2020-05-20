package strings;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {

	public static void main(String[] args) {

		String str = "ADOBECODEBANC";
		String t = "ABC";

		System.out.println(minWindow(str, t));
	}

	public static String minWindow(String s, String t) {

	    if (s == null || s.length() == 0 || t == null || t.length() == 0) return "";
	    // Keep character frequency of the pattern (here, t)
	    Map<Character, Integer> map = new HashMap<>();
	    for (char ch : t.toCharArray())
	        map.merge(ch, 1, Integer::sum);

	    int minWindow = s.length() + 1; 
	    int minStart = 0;

	    int start = 0;
	    int matchCount = 0;

	  
	    for (int end = 0; end < s.length(); end++) {
	        char right = s.charAt(end);

	        if (map.containsKey(right)) {
	            map.put(right, map.get(right) - 1);
	            if (map.get(right) >= 0)
	                matchCount++;
	        }
	        while (matchCount == t.length()) { 
	            // Calculate window size
	            if (minWindow > end - start + 1) {
	                minStart = start;
	                minWindow = end - start + 1;
	            }
	            char left = s.charAt(start++); // Shrink the window
	            if (map.containsKey(left)) {
	                if (map.get(left) == 0)
	                    matchCount--;
	                map.put(left, map.get(left) + 1);
	            }
	        }
	    }
	    return minWindow > s.length() ? "" : s.substring(minStart, minStart + minWindow);
	}
}
