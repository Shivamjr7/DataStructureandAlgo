package arrays.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class ContiguousSubArray {


    public static void main(String[] args) {

        int [] nums = {0,1};
        System.out.println(findMaxLength(nums));
    }

    public static  int findMaxLength(int[] nums) {


        int len = 0;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        int max_len = 0;
        map.put(0,-1);
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==0)
                sum = sum-1;
            else{
                sum = sum+1;
            }


            if(map.containsKey(sum))
            {
                len  = (i- map.get(sum));
                max_len = Math.max(len, max_len);
            }else
            {
                map.put(sum,i);
            }
        }

        return max_len;

    }
}
