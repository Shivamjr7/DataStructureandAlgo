package arrays;

/**
 * https://medium.com/@rsinghal757/kadanes-algorithm-dynamic-programming-how-and-why-does-it-work-3fd8849ed73d
 */
public class KadanesAlgorithm {


    public static void main(String[] args) {


        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("Max conitguous subarray sum : "+ findMaxSubArraySum(arr));
    }


    static int findMaxSubArraySum(int[] arr) {

        int global_max = Integer.MIN_VALUE;
        int local_max = 0;
        for (int i = 0; i < arr.length; i++) {

            local_max = Math.max(arr[i], arr[i] + local_max);
            if (local_max > global_max) {
                global_max = local_max;
            }

        }


        return global_max;


    }

}
