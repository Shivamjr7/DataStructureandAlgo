package recursionandbacktrack.easy;

import com.sun.tools.javac.util.StringUtils;

public class FirstUpperCaseLetter {


    public static void main(String[] args) {
        System.out.println(firstUpperCase("geeksforgeeKs"));
    }


    static String firstUpperCase(String str)
    {

        return helper(str,0);
    }

    static String helper(String str , int index)
    {
        if(index == str.length())
            return "";

        if(Character.isUpperCase(str.charAt(index)))
            return str.charAt(index)+"";

        return  helper(str,index+1);
    }
}
