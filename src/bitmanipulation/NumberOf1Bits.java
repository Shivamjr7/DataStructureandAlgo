package bitmanipulation;

public class NumberOf1Bits {


    public static void main(String[] args) {

        System.out.println(numSetBits(11));
    }

    public static  int numSetBits(long a) {


         int res =0;

         while(a>0)
         {
             // sets the least significant set bit to 0
             a = (a & (a-1));
             res++;
         }
         return res;
    }
}
