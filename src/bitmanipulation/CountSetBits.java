package bitmanipulation;

public class CountSetBits {

    public static int countSetBits(int n) {

        int res = 0;


        int[] dp = new int[n + 1];


        dp[0] = 1;
        dp[1]=1;
        int ref = 2;
        for (int i = 3; i <= n; i++) {
            if (i % ref == 0) {
                ref = ref << 1;
                dp[i-1] =1;

            }
            else {
                dp[i - 1] = 1 + dp[i-ref-1];
            }
        }





        return res;


    }

    public static void main(String[] args) {
        System.out.println(countSetBits(17));
    }
}
