package bitmanipulation;

public class FindTheDifference {


    public static void main(String[] args) {

        String s= "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
    public static  char findTheDifference(String s, String t) {
        char ch = '\u0000';

        for (int i = 0; i < s.length(); i++) {
            ch = (char) (ch ^ s.charAt(i));
        }
        for (int j = 0; j < t.length(); j++) {
            ch = (char) (ch ^ t.charAt(j));
        }

        return ch;


    }
}
