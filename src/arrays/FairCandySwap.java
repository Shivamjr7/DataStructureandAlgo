package arrays;

import java.util.Arrays;

public class FairCandySwap {


    public static void main(String[] args) {
        int [] alice = {20,35,22,6,13};
        int [] bob = {31,57};

        System.out.println(Arrays.toString(fairCandySwap(alice,bob)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {


        int[] result = new int[2];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < aliceSizes.length; i++) {
            sum1 += aliceSizes[i];
        }


        for (int i = 0; i < bobSizes.length; i++) {
            sum2 += bobSizes[i];
        }


        if (aliceSizes.length > bobSizes.length) {
            for (int n : bobSizes) {
                int res = doBinarySearch(aliceSizes, n, sum2, sum1);
                if (res != -1) {
                    result[0] = res;
                    result[1] = n;

                    break;
                }
            }
        } else {
            for (int n : aliceSizes) {
                int res = doBinarySearch(bobSizes, n, sum1, sum2);
                if (res != -1) {
                    result[0] = n;
                    result[1] = res;
                    break;
                }
            }
        }

        return result;

    }


    static int doBinarySearch(int[] arr, int n, int sum1, int sum2) {

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;


        int a = sum1;
        int b = sum2;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            a = a + arr[mid] - n;
            b = b + n - arr[mid];

            if (a == b)
                return arr[mid];
            else if (a > b) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            a = sum1;
            b = sum2;
        }

        return -1;
    }
}
