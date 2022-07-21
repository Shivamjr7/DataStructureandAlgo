package arrays;

import java.util.Arrays;

public class TwoSumII {


    public static void main(String[] args) {

        int[] nums = {12,13,23,28,43,44,59,60,61,68,70,86
                     ,88,92,124,125,136,168,173,173,180,199,
                      212,221,227,230,277,282,306,314,316,321,
                      325,328,336,337,363,365,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737,740,751,755,764,778,783,785,789,794,803,809,815,847,858,863,863,874,887,896,916,920,926,927,930,933,957,981,997};


        System.out.println(Arrays.toString(twoSumNew(nums,  542)));
    }

    public static int[] twoSum(int[] numbers, int target) {


        for (int i = 0; i < numbers.length; i++) {

            // do binary search based on diff

            int diff = target - numbers[i];

            if (diff < numbers[i]) {
                //search for diff on left side
                int res = binarySearch(numbers, 0, i, diff);
                if (res != -1)
                    return new int[]{res + 1, i + 1};

            } else {
                //search on right side
                int res = binarySearch(numbers, i + 1, numbers.length - 1, diff);
                if (res != -1)
                    return new int[]{i + 1, res + 1};

            }

        }

        return new int[]{-1, -1};


    }


    static int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;
            else if (target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;

        }

        return -1;
    }


    public static int[] twoSumNew(int[] numbers, int target) {


        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (numbers[mid] > target) {
                end = mid - 1;
            } else {
                int diff = target - numbers[mid];

                int res = -1;
                if (diff <= numbers[mid]) {
                    res = binarySearch(numbers, 0, mid-1, diff);
                    if (res != -1)
                        return new int[]{res + 1, mid + 1};
                } else {
                    res = binarySearch(numbers, mid+1, numbers.length - 1, diff);

                    if (res != -1)
                        return new int[]{mid + 1, res + 1};
                }

                start = mid + 1;
            }


        }
        return new int[]{-1, -1};
    }
}
