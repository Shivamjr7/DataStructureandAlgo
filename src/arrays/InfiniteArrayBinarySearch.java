package arrays;

public class InfiniteArrayBinarySearch {


    public static void main(String[] args) {


        int [] nums  = {1,2,3,4,5,6,7,8,9,11,12,12,13};
        int target = 5;
        System.out.println(findans(nums,target));
    }


    static int findans(int[] nums, int target) {
        int start = 0;
        int end = 1;


        while (target > nums[end]) {
            int temp = end + 1;

            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(nums, target, start, end);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }


        }
        return -1;
    }
}
