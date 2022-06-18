package arrays;

public class PerfectSquare {


    public static void main(String[] args) {
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(13));
        System.out.println(isPerfectSquare(808201));

    }
    public static  boolean isPerfectSquare(int num) {



        long  start = 1;
        long end = num/2;

        while(start<=end)
        {
            long mid = start + (end-start)/2;

            long square = mid* mid;
            if(square == num)
                return true;
            else if(square > num)
                end = mid-1;
            else
                start = mid+1;
        }

        return false;
    }
}
