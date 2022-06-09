package bitmanipulation;

/**
 * leetcode : https://leetcode.com/problems/binary-number-with-alternating-bits/
 */
public class HasAlternatingBits {

    public static void main(String[] args) {

        System.out.println(hasAlternatingBits(5));
    }


    public static boolean hasAlternatingBits(int n) {


        while (n != 0) {
            if ((n & 1) == ((n >> 1) & 1))
                return false;
            n = n >> 1;
        }
        return true;

    }

}
