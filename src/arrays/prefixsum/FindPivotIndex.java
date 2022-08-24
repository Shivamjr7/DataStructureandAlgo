package arrays.prefixsum;

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        System.out.println(pivotIndex(nums));
    }

    public static  int pivotIndex(int[] nums) {

        int res = -1;

        int [] pSum = new int[nums.length];

        pSum[0] = nums[0];
        for(int i =1;i<nums.length;i++)
        {
            pSum[i] = pSum[i-1]+ nums[i];
        }

        int right = 0;



        for(int j = nums.length-1;j>=0;j--)
        {
            right += nums[j];

            if(right== pSum[j])
                res = j;


        }


        return res;

    }
}
