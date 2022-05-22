package bitmanipulation;

public class CheckKthBitSet {

    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here


        return ((n>>k) & 1) ==1 ? true: false;
    }


    public static void main(String[] args) {
        System.out.println(checkKthBit(5,0));
        System.out.println(checkKthBit(5,2));
        System.out.println(checkKthBit(5,1));
    }

}
