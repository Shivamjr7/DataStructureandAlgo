package arrays.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {


    public static void main(String[] args) {
        int [] nums = {1,1,1};
        System.out.println(subarraySum(nums,2));
    }

    public static int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();


        int sum =0;
        int count =0;

        map.put(0,0);

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];

            if(sum==k)
            {
                count++;

            }

            if(map.containsKey(sum-k))
            {
                count = count + map.get(sum-k);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);

        }

        return count;

    }
}
