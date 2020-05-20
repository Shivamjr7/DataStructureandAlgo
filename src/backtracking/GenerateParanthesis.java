package backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

	public static void main(String[] args) {
		generateParenthesis(3);

	}

	
	public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtracking(list,0,0,n,"");
        
        return list;
    }
	
	 public static void backtracking(List<String> list , int open , int close , int max,String str)
	 {
		 if(str.length()==max*2)
		 {
			 list.add(str);
			 return;
		 }
		 
		 if(open<max)
		 {
			 backtracking(list, open+1 , close , max , str+"(");
		 }
		 if(close<open)
		 {
			 backtracking(list, open , close+1 , max , str+")");
		 }
		 
	 }
}
