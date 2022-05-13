package bitmanipulation;

public class TrailingZeros {

    public static void main(String[] args) {

        System.out.println(solve(18));
        System.out.println(solve(8));
    }
    public static  int solve(int A) {

        int res =0;
        while(A>0)
        {

            if((A & 1)==1)
            {
                return res;
            }
            res++;
            A = A>>1;
        }

        return res;
    }


}
