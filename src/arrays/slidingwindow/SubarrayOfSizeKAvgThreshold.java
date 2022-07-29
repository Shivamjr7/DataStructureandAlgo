package arrays.slidingwindow;

public class SubarrayOfSizeKAvgThreshold {

    public static void main(String[] args) {
        int [] arr = {11,13,17,23,29,31,7,5,2,3};


        System.out.println(numOfSubarrays(arr,3,5));
    }

    public static  int numOfSubarrays(int[] arr, int k, int threshold) {


        int start = 0;
        int sum = 0;
        int res = 0;


        for (int end = 0; end < arr.length; end++) {

            sum = sum + arr[end];
            if (end - start + 1 == k) {
                int avg = sum / k;
                if (avg >= threshold)
                    res++;

                sum = sum - arr[start];
                start++;
            }
        }

        return res;
    }
}
