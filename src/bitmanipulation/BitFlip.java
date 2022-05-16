package bitmanipulation;

public class BitFlip {

    public static void main(String[] args) {

        System.out.println(solve(5));
        System.out.println(solve(7));


    }

    public static int solve(int A) {


        int n = A + 1;
        int res = 0;


        while ((n & 0) > 0) {
            n++;
        }
        res = n ^ A;

        return res;

    }

    public static int solveMyMethod(int A) {

        int res = 0;
        int count = 0;

        while (A > 0) {
            if ((A & 1) == 0) {
                res = res + (int) Math.pow(2, count);

            }

            count++;
            A = A >> 1;
        }

        return res;
    }
}
