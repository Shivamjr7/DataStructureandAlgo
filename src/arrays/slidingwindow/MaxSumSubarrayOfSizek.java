package arrays.slidingwindow;

public class MaxSumSubarrayOfSizek {


    public static void main(String[] args) {


        int [] arr = {100,200,300,400,500};
        System.out.println(maxSumSubarray(arr,2));
    }

    static int maxSumSubarray(int [] arr , int k)
    {


        // find the first k elements sum

        int sum = 0;

        for(int i=0;i<k;i++)
        {

            sum+= arr[i];
        }

        int max_sum =sum;

        for(int j =k;j<arr.length;j++)
        {
            sum+=  arr[j] - arr[j-k];
           max_sum = Math.max(max_sum, sum);
        }


        return max_sum;

    }

}
