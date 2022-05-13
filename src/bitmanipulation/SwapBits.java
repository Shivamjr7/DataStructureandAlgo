package bitmanipulation;

public class SwapBits {


    public static int solve(int A, int B, int C) {

        int firstBit = getNthBit(A, B);
        int secondBit = getNthBit(A, C);


        if (firstBit != 0) {
            A = setNthBit(A, C);
        } else {
            A = clearIthBit(A, C);
        }

        if (secondBit != 0) {
            A = setNthBit(A, B);
        } else {
            A = clearIthBit(A, B);
        }

        return A;

    }


    public static void main(String[] args) {

        System.out.println(solve(9, 1, 2));
    }

    public static int getNthBit(int A, int n) {
        int mask = 1 << n - 1;
        return A & mask;
    }

    public static int setNthBit(int A, int n) {
        int mask = 1 << n - 1;
        return A | mask;
    }

    public static int clearIthBit(int n, int i) {
        int mask = ~(1 << i - 1);
        return n & mask;

    }
}
