package strings;

public class ReverseOnlyLetters {


    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static  String reverseOnlyLetters(String s) {


        char [] arr = s.toCharArray();

        int start = 0;
        int end =s.length()-1;

        while(start<end)
        {

            char a = s.charAt(start);
            char b = s.charAt(end);

            if(!(a>='a' && a<='z') &&  !(a>='A' && a<='Z'))
            {
                start++;
                continue;
            }
            if(!(b>='a' && b<='z') &&  !(b>='A' && b<='Z'))
            {
                end--;
                continue;
            }

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return String.valueOf(arr);
    }
}
