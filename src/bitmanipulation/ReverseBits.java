package bitmanipulation;

public class ReverseBits {

    public static void main(String[] args) {

        System.out.println(reverse(1));
        System.out.println(reverse(2));
        System.out.println(reverse(3));

    }

    public static  long reverse(long a) {

        int[] count = new int[32];

        long res = 1;

        int counter = 0;
        while (a > 0) {
            if ((a & 1) == 1)
                count[counter] = 1;

            counter++;

            a = a >> 1;
        }


        for (int i = 0, j=32; i <count.length; i++) {
           if(count[i]==1)
               res = res+ (long) Math.pow(2,j);
           j--;
        }

        return res/2;

    }
}
