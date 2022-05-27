package bitmanipulation;

import java.util.Arrays;

/**
 * leetcode : https://leetcode.com/problems/set-mismatch/
 */
public class SetMisMatch {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
    }

    public static int[] findErrorNums(int[] nums) {

        int xor = 0;
        int duplicate = 0;
        int res = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i] ^ (i + 1);
            if ((i + 1) < nums.length && nums[i] == nums[i + 1])
                duplicate = nums[i];
        }

        res = xor ^ duplicate;

        return new int[]{duplicate, res};


    }

    public static int[] findErrorNumsOptimized(int[] nums) {


        int i = 0;

        while (i < nums.length) {
            int index = nums[i] - 1;

            if (nums[i] != nums[index]) {
                swap(nums, i, index);
            }

            i++;
        }


        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[]{nums[j], j + 1};
            }
        }

        return new int[]{-1, -1};

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

