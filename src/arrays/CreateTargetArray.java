package arrays;

import java.util.*;

public class CreateTargetArray {

    public static void main(String[] args) {
        int []nums = {4,2,4,3,2};
        int []index = {0,0,1,3,1};

        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {


        List<Integer> list = new ArrayList<>();

        int [] res = new int[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            list.add(index[i], nums[i]);
        }


        int j = 0;
        for(int num : list)
        {
            res[j++] = num;
        }

        return res;

    }
}
