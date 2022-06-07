package arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {


    public static void main(String[] args) {


        int [] nums = {1,2,3,1,1,3};
        int [] nums1 = {1,1,1,1};
        int [] nums2 = {1,2,3};

        System.out.println(numIdenticalPairs(nums));
        System.out.println(numIdenticalPairs(nums1));
        System.out.println(numIdenticalPairs(nums2));
    }

    public static  int numIdenticalPairs(int[] nums) {


        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                count = count + value;
                map.put(nums[i], value + 1);
            } else {
                map.put(nums[i], 1);
            }
        }


        return count;

    }
}
