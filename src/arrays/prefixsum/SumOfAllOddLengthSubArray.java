package arrays.prefixsum;

public class SumOfAllOddLengthSubArray {


    public static void main(String[] args) {

        int [] nums = {10,11,12};
        System.out.println(sumOddLengthSubarrays(nums));
    }
    public static  int sumOddLengthSubarrays(int[] arr) {


        int[] sum = new int[arr.length];


        int sumOfArray = 0;

        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }


        sumOfArray = sum[arr.length - 1];


        int n = 2;
        while (n < arr.length) {
            sumOfArray += sum[n];
            for (int j = n + 1; j < arr.length; j++) {

                sumOfArray += sum[j] - sum[j - n-1];
            }
            n += 2;

        }


        return sumOfArray;
    }
}
