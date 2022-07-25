package arrays.slidingwindow;

import java.util.*;

public class SlidingWindowMax {


    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }


    //TLE : learn about monotonic queue
    public static int[] maxSlidingWindow(int[] nums, int k) {


        int counter = 0;
        int[] res1 = new int[nums.length - k + 1];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            priorityQueue.add(nums[i]);

        }
        res1[counter] = priorityQueue.peek();
        counter++;

        for (int j = k; j < nums.length; j++) {
            priorityQueue.add(nums[j]);
            priorityQueue.remove(nums[j - k]); // this take O Log N time so TLE
            res1[counter] = priorityQueue.peek();
            counter++;
        }

        return res1;

    }

}
