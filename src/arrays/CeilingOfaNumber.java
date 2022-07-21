package arrays;

public class CeilingOfaNumber {


    public static void main(String[] args) {


        int [] nums = {2,3,5,9,14,16};

        System.out.println(ceiling(nums,14));
        System.out.println(ceiling(nums,15));
        System.out.println(ceiling(nums,8));
    }

    public static int ceiling(int [] nums, int target)
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
        return nums[start];
    }
}
