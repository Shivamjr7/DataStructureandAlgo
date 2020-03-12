package strings;

public class ValidAnagram {

	public static void main(String[] args) {
		
		
		String s ="anagram";
		String t ="nagarbm";
		
		System.out.println(isAnagram(s,t));

	}

	
	  public static boolean isAnagram(String s, String t) {
	     
		  if(s.length()!=t.length())
			  return false;
		  int []count = new int[26];
		  
		  
		  for(int i=0;i<s.length();i++)
		  {
			  count[s.charAt(i)-'a']++;
			  count[t.charAt(i)-'a']--;
		  }
		  
		  
		  for(int j =0;j<count.length;j++)
		  {
			  if(count[j]!=0)
				  return false;
		  }
		  
		  return true;
	    }
}
