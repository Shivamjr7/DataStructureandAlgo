package arrays.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class BinarySubArrayWithSum {

    public static void main(String[] args) {
        int [] nums = {1,0,1,0,1};
        int []nums1 = {0,0,0,0,0};

        String test = null;

        test = test == null? null : "";

        System.out.println(numSubarraysWithSum(nums,2));
        System.out.println(numSubarraysWithSum(nums1,0));
    }
    public static  int numSubarraysWithSum(int[] nums, int k) {


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
