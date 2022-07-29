package strings.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(""));
    }

    public static  int lengthOfLongestSubstring(String s) {


        Set<Character> set  = new HashSet<>();

        int i =0;
        int j = 0;
        int res = 0;

        for(i=0;i<s.length();i++)
        {

            while(j<s.length() && !set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                j++;
            }

            res = Math.max(res, j-i);
            set.remove(s.charAt(i));
        }


        return res;

    }
}
