package bitmanipulation;

public class SwapOddEvenBits {


    public static void main(String[] args) {
        System.out.println(swapBits(23));
    }
    public static int swapBits(int n)
    {
        // Your code

        //get the even bits
        int even_bits= n & 0xAAAAAAAA;
        even_bits = even_bits >> 1;




        //get the odd bits
        int odd_bits = n & 0x55555555;
        odd_bits = odd_bits<<1;
        return even_bits | odd_bits;

    }




}
