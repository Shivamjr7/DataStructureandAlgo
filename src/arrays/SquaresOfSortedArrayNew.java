package arrays;

public class SquaresOfSortedArrayNew {


    public int[] sortedSquares(int[] nums) {


        int i =0;
        int j = nums.length-1;


        int [] res = new int[nums.length];

        int count =nums.length-1;

        while(count>=0)
        {

            if(Math.abs(nums[i])> Math.abs(nums[j]))
            {
                res[count--] = nums[i] * nums[i];
                i++;
            }
            else{
                res[count--] = nums[j] * nums[j];
                j--;
            }


        }

        return res;


    }

}
