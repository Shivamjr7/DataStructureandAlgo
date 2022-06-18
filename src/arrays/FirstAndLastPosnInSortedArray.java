package arrays;

import java.util.Arrays;

public class FirstAndLastPosnInSortedArray {


    public static void main(String[] args) {
        int[] arr = {1};
        int[] arr1 = {1, 3};
        int[] arr2 = {5, 7, 7, 8, 8};

        System.out.println(Arrays.toString(searchRange(arr, 2)));
        System.out.println(Arrays.toString(searchRange(arr1, 1)));
        System.out.println(Arrays.toString(searchRange(arr2, 7)));

    }

    public static int[] searchRange(int[] nums, int target) {


        int start = 0;
        int end = nums.length - 1;
        int startPosn = -1;
        int endPosn = -1;


        //search for start posn of element
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid == 0 && (target == nums[mid])) || (target == nums[mid] && target != nums[mid - 1])) {
                startPosn = mid;
                break;
            } else if (target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }


        start = startPosn;
        end = nums.length - 1;


        //search for last posn of element
        if (startPosn == -1)
            return new int[]{-1, -1};

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid == nums.length - 1 && (target == nums[mid])) || (target == nums[mid] && target != nums[mid + 1])) {
                endPosn = mid;
                break;
            } else if (target >= nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }


        return new int[]{startPosn, endPosn};


    }
}
