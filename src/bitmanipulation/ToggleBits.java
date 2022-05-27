package bitmanipulation;

public class ToggleBits {


    public static void main(String[] args) {


        System.out.println(toggleBits(17,2,3));
    }


    static int toggleBits(int N , int L , int R) {
        // code here

        while(L<=R)
        {
            int mask = 1<< L-1;
            N = N ^ mask;
            L++;
        }

        return N;

    }

}
