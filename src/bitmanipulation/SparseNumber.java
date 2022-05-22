package bitmanipulation;

public class SparseNumber {


    public static boolean isSparseOptimized(int n)
    {

        return  ((n & (n>>1))>=1) ?  false : true ;

    }
    public static boolean isSparse(int n)
    {
        int count =0;
        while(n>0)
        {
            if((n & 1)==1)
            {
                count++;
            }
            else{
                count=0;
            }
            if(count==2)
                return false;


            n = n>>1;
        }

        return true;
    }




}
