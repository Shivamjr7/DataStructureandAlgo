package arrays;

public class SumOfSquareNumbers {


    public static void main(String[] args) {
        System.out.println(judgeSquareSum(9));
        System.out.println(judgeSquareSum(10));
        System.out.println(judgeSquareSum(3));
        System.out.println(judgeSquareSum(9));
        System.out.println(judgeSquareSum(9));
    }

    public static boolean judgeSquareSum(int c) {
    long start = 0;
        long end = c;

        while (start < end) {
            long mid =  start + (end - start) / 2;
            long square = (start * start) + (mid * mid);
            if (square == c)
                return true;
            else if (square > c)
                end = mid;
            else
                start = start + 1;

        }

        return false;
    }
}
