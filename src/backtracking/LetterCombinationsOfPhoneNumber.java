package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {

	 static Map<String, String> map = new HashMap<String, String>();


	
	public static void main(String[] args) {

		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");
		letterCombinations("23");
	}

	public static List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<String>();
		backtrack(list,"",digits);
		
		return list;
	}
	
	
	static void backtrack(List<String> list , String combination , String next)
	{
		if(next.length()==0)
		{
			list.add(combination);
		}
		else {
			String digit = next.substring(0,1);
			String letters = map.get(digit);
			for(int i =0;i<letters.length();i++)
			{
				 String letter = map.get(digit).substring(i, i + 1);
			        // append the current letter to the combination
			        // and proceed to the next digits
			        backtrack(list,combination + letter, next.substring(1));
			}
		}
		
	}
}
