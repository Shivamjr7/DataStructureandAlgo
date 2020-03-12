package strings;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

	public static void main(String[] args) {
		
		
		String str ="Bob. hIt, baLl";
		
		String []banned = {"bob","hit"};
		System.out.println(mostCommonWord(str,banned));	
	}
	
	
	 public static  String mostCommonWord(String paragraph, String[] banned) {
	        
		 String res="";
		 Map<String, Integer> map = new HashMap<String, Integer>();
		 int max =0;
		 char[]arr =paragraph.toCharArray();
		 for(int i =0;i<arr.length;i++)
		 {
			 StringBuilder sb = new StringBuilder();
			 while(i<arr.length && Character.isAlphabetic(arr[i]))
			 {
				 sb.append(arr[i++]);
			 }
			 
			 String key = sb.toString().toLowerCase();
			 if(map.containsKey(key) )
			 {
				 map.put(key,map.get(key)+1);
			 }
			 else
			 {
				 if(!key.equals(""))
				 map.put(sb.toString().toLowerCase(), 1);
			 }
		 }
		 
		 boolean flag = false;
		 for(Map.Entry<String, Integer> entry : map.entrySet())
		 {
			 String key = entry.getKey();
			 
			 for(int i=0;i<banned.length;i++)
			 {
				 if(key.equals(banned[i]))
				 {
					 flag = true;
				 }
			 }
			 
			 if(!flag && max <entry.getValue())
			 {
				 res = key;
				 max = entry.getValue();
			 }
			 flag = false;
		 }
		 
		 return res;
	    }

}
