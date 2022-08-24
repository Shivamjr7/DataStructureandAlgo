package arrays.prefixsum;

public class RangeQuerySumII {


    int []prefixSum ;
    int [] cloneNums;
    public RangeQuerySumII(int[] nums) {

        cloneNums = new int[nums.length];
        prefixSum = new int[nums.length];

        prefixSum[0] = cloneNums[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefixSum[i] = prefixSum[i-1]+nums[i];
            cloneNums[i] = nums[i];
        }


    }

    public void update(int index, int val) {

        cloneNums[index] = val;

        prefixSum[index] = val;

      for(int i = index+1;i<cloneNums.length;i++)
      {
          prefixSum[i] = prefixSum[i-1]+cloneNums[i];
      }


    }

    public int sumRange(int left, int right) {


        if(left==0) {
            return prefixSum[right];
        }
        else if(left==right)
        {
            return cloneNums[left];
        }
        else {
            return prefixSum[right] - prefixSum[left - 1];
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,3,5};

        RangeQuerySumII rangeQuerySum = new RangeQuerySumII(nums);

        System.out.println(rangeQuerySum.sumRange(0,2));
        rangeQuerySum.update(1,2);


        System.out.println(rangeQuerySum.sumRange(0,2));
    }
}
