package bitmanipulation;

/**
 * leetcode : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class ReduceNoToZero {


    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
    public static int numberOfSteps(int num) {


        int res = 0;
        while (num != 0) {
            if ((num & 1) == 0) {
                num = num >> 1;
            } else {
                num = num - 1;
            }
            res++;
        }
        return res;
    }
}
