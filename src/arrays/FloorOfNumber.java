package arrays;

public class FloorOfNumber {


    public static void main(String[] args) {
        int [] nums = {2,3,5,9,14,16};

        System.out.println(floor(nums ,12));
    }

    public static int floor(int [] nums, int target)
    {
        int start = 0;
        int end = nums.length;

        while(start<=end)
        {
            int mid = start +(end - start)/2;

            if(target == nums[mid])
                return nums[mid];

            else if(target >nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return nums[end];
    }
}
