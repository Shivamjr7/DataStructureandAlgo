package arrays;

public class SqrtX {


    public static void main(String[] args) {


        System.out.println(mySqrt(2));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(10));
        System.out.println(mySqrt(9));

    }
    public static  int mySqrt(int x) {

        if(x==0 || x==1)
            return x;


        long  start = 1;
        long end = x/2;


        while(start<=end)
        {
            long mid = start + (end - start)/2;

            long square = mid* mid;

            if(square <= x && ((mid+1) * (mid+1))> x)
                return (int) mid;
            else if(square > x)
                end = mid-1;
            else
                start = mid+1;
        }
        return (int) start+1;
    }


}
