package recursionandbacktrack.easy;

public class CountZeros {


    public static void main(String[] args) {

        System.out.println(countZeros(30204));
    }


    static int countZeros(int n )
    {

        return helper(n,0);
    }


    // f(n,0) = f(n/10,c+1) or f(n/10,c)
    static int helper(int n , int count)
    {
        if(n==0)
            return count;

        int rem = n% 10;

        if(rem==0)
            return helper(n/10,count+1);
        else
            return helper(n/10,count);

    }
}
