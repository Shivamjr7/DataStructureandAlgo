package strings;

public class ReverseWordsInStringII {


    public static void main(String[] args) {


       String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {


        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for(String str : arr)
        {
            for(int i = str.length()-1; i>=0;i--)
            {
                sb.append(str.charAt(i));
            }
            sb.append(" ");
        }

        return  sb.substring(0, sb.length()-1);
    }
}
