package arrays;

public class SpecialArray {


    public static void main(String[] args) {
        int [] nums = {0,0};
        System.out.println(specialArray(nums));
    }

    public static  int specialArray(int[] nums) {


        int start =0;
        int end = nums.length;


        while(start<=end)
        {
            int mid = start + (end - start)/2;

            int x = getNoGreaterorEqual(mid, nums);
            if(x==mid)
                return mid;
            else if( x>mid)
                start = mid+1;
            else
                end = mid-1;
        }

        return -1;


    }

    static int getNoGreaterorEqual(int x, int[]nums)
    {
        int count = 0;
        for(int i =0;i<nums.length;i++)
        {
            if( nums[i] >=x)
                count++;
        }
        return count;
    }
}
