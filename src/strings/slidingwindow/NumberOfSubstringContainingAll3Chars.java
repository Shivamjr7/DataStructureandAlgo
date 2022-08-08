package strings.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubstringContainingAll3Chars {


    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
        System.out.println(numberOfSubstrings("aaacb"));
        System.out.println(numberOfSubstrings("abc"));
    }


    public static int numberOfSubstrings(String s) {


        int start = 0;
        int end = 0;
        int count = 0;
        int res = 0;

        int [] mapnew = new int[3];
        for (end = 0; end < s.length(); end++) {
            char a = s.charAt(end);

            mapnew[a-'a']++;

            //find valid window
            while (mapnew[0]>=1 && mapnew[1]>=1 && mapnew[2]>=1) {
                count++;
                char b = s.charAt(start);
                mapnew[b-'a']--;
                start++;
            }

            res = res + count;

        }


        return res;
    }
}
