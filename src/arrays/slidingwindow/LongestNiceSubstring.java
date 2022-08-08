package arrays.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestNiceSubstring {


    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("dDzeE"));
        System.out.println(longestNiceSubstring("ijIJwuUnW"));
        System.out.println(longestNiceSubstring("YazaAay"));
        System.out.println(longestNiceSubstring("bB"));
        System.out.println(longestNiceSubstring("c"));
        System.out.println(longestNiceSubstring("cChH"));
    }

    public static String longestNiceSubstring(String s) {

        if (s.length() == 1)
            return "";

        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        int start = 0;
        int end = 0;

        String res = "";


        for (end = 0; end < s.length(); end++) {

            char a = s.charAt(end);
            if (Character.isLowerCase(a) && !set.contains(Character.toUpperCase(a)) ||
                    Character.isUpperCase(a) && !set.contains(Character.toLowerCase(a))) {

                //check for both the substrings left and right recursively


                String res1 = longestNiceSubstring(s.substring(start, end));
                String res2 = longestNiceSubstring(s.substring(end + 1, s.length()));


                if (res1.length() >= res2.length())
                    res = res1;
                else
                    res = res2;

                return res;

            }


        }

        //check if start to end is valid window in the last
        if (checkValidWindow(s.substring(start, end))) {

                res = s.substring(start, end);

        }


        return res;
    }


    static boolean checkValidWindow(String str) {

        if (str.equals("") || str.length() == 1)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i)) && !str.contains("" + Character.toUpperCase(str.charAt(i)))) {
                return false;
            } else if (Character.isUpperCase(str.charAt(i)) && !str.contains("" + Character.toLowerCase(str.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
