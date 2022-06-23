package arrays;

import java.util.Arrays;

public class MoveZeros {


    public static void main(String[] args) {

        int [] arr = {0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {


        int i = 0;
        int j = 0;


        while (j < nums.length) {
            if (nums[j] != 0) {
                swap(i, j, nums);
                i++;
            }

            j++;

        }

    }

    static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
