package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagrams {

	public static void main(String[] args) {

		String s = "cbaebabacd";
		String t = "abc";
		findAnagrams(s, t);
	}

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<Integer>();

		int i = 0;
		int n = p.length();
		
		
		int count[] ;

		for (int j = 0; j < s.length(); j++) {
			
			
			if (j - i + 1 == n) {
				count = new int[26];
				if (checkAnagrams(s.substring(i, j + 1), p,count)) {
					list.add(i);
				}
				i++;
			}

		}

		return list;
	}

	static boolean checkAnagrams(String s, String t , int[]count) {
	
		for(int i =0;i<s.length();i++)
		{
			count[s.charAt(i)-'a']++;
			count[t.charAt(i)-'a']--;
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				return false;
		}
	
		return true;

	}
}
