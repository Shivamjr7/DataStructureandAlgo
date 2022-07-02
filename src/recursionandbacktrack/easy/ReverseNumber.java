package recursionandbacktrack.easy;

public class ReverseNumber {


    static int tens = 10;


    static int sum  = 0;
    public static void main(String[] args) {

        reverse(123);
        System.out.println(sum);

        System.out.println(reverse2(123));
    }

    //123 -> 321
    static  void reverse(int n)
    {
        if(n==0)
            return ;

        int single_di = n % 10;

        sum =   sum * 10 + single_di;
        reverse(n/10);
    }


    static int reverse2(int n)
    {
        int digits = (int) Math.log10(n) +1;

        return helper(n , digits);
    }

    private static int helper(int n, int digits) {


        if(n<10)
            return n;

        int rem = n %10;
        return (int) Math.pow(10,digits-1)* rem + helper(n/10,digits-1);

    }
}
