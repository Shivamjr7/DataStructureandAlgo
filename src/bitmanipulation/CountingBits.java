package bitmanipulation;

import java.util.Arrays;

public class CountingBits {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(countBits(16)));
        System.out.println(count(3));
    }

    public static int[] countBits(int n) {


        int[] res = new int[n + 1];
        int base = 1;

        for (int i = 1; i <= n; i++) {

            if (i != 1 && (i & (i - 1)) == 0) {
                base = base << 1;
                res[i] = 1;
            } else {
                res[i] = res[i - base] + 1;
            }

        }

        return res;
    }

    public static int count(int A) {
        int[] res = new int[A + 1];
        int count = 0;
        int base = 1;

        for (int i = 1; i <= A; i++) {

            if (i != 1 && (i & (i - 1)) == 0) {
                base = base << 1;
                res[i] = 1;
            } else {
                res[i] = res[i - base] + 1;
            }

        }


        for (int i = 0; i <= A; i++) {
            count += res[i];
        }
        return count;
    }


}
