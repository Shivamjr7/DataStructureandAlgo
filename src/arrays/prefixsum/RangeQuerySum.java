package arrays.prefixsum;

public class RangeQuerySum {


    int [] sums ;
    public RangeQuerySum(int[] nums) {

        sums = new int[nums.length];

        sums[0] = nums[0];
        for(int i =1;i<nums.length;i++)
        {
            sums[i] = sums[i-1]+nums[i];
        }
    }

    public int sumRange(int left, int right) {

        if(left==0) {
            return sums[right];
        }
        else {
            return sums[right] - sums[left - 1];
        }
    }


    public static void main(String[] args) {

        int [] nums = {-2, 0, 3, -5, 2, -1};

        RangeQuerySum rangeQuerySum = new RangeQuerySum(nums);

        System.out.println(rangeQuerySum.sumRange(0,2));
        System.out.println(rangeQuerySum.sumRange(2,5));
        System.out.println(rangeQuerySum.sumRange(0,5));
    }
}
