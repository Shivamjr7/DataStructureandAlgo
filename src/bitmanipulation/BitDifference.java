package bitmanipulation;

public class BitDifference {

    public static void main(String[] args) {
        System.out.println(diff(10,20));
    }

    static int diff(int a , int b)
    {

        int res =0;

        int n = a ^ b;


        while(n>0)
        {
            n = (n & (n-1));
            res++;
        }

        return res;
    }
}
