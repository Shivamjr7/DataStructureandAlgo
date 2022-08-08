package strings;

public class ValidPalindrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome("ab2a"));
    }

    public static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;


        while (i <= j) {
            char a = s.charAt(i);
            char b = s.charAt(j);

            if (!(a>='a' && a<='z') &&  !(a>='A' && a<='Z') && !Character.isDigit(a)) {
                i++;
                continue;
            }

            if (!(b>='a' && b<='z') &&  !(b>='A' && b<='Z') && !Character.isDigit(b)) {
                j--;
                continue;
            }


            if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
                return false;
            }


            i++;
            j--;

        }

        return true;
    }
}
