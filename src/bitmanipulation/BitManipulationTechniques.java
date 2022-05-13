package bitmanipulation;

public class BitManipulationTechniques {


    public static void main(String[] args) {
        System.out.println("Set bits in 7 are : " + findSetBits(7));

        int a = 7;
        int b = 3;
        System.out.println("get the " +b +"  bit in "+ a   +" :" + getIthBit(a,b));


        int c = 2;
        int d = 1;
        System.out.println("set the "+ d+ " bit in "+c +" gives : "+setIthBit(c,d));



        int e = 3;
        int f = 2;
        System.out.println("Clearing 2nd bit of 3 will give us : " + clearIthBit(e,f));



        char c1 = 'C';
        c1 = (char) ( c1 | ' ');
        System.out.println("Converting to lower case : "+ Character.toString(c1 ));

        char c2 = 'c';
        c2 = (char) (c2 & '_');
        System.out.println("Converting to upper case : "+ Character.toString(c2));
    }

    /**
     * To find the number of set bits  in a no
     *
     * @param n denotes the number
     * @return the count of set bits
     */
    public static int findSetBits(int n) {

        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }


    public static int getIthBit(int n, int i) {
        int mask = 1 << i-1;
        return mask & n;

    }

    public static int setIthBit(int n , int i)
    {
        int mask = 1<<i-1;
        return n | mask;
    }


    public static int clearIthBit(int n  , int i)
    {
        int mask = ~(1<< i-1);
        return n & mask;

    }

}
