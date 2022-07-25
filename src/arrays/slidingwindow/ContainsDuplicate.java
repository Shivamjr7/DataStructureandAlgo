package arrays.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(containsNearbyDuplicate(nums, 3));
    }


    // sliding window
    public static boolean containsNearbyDuplicate(int[] nums, int k) {


        int n = nums.length;


        Set<Integer> set = new HashSet<>();


        //k can be greater than n so in that case iterate till n
        for (int i = 0; i < k && i < n; i++) {
            if (set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }


        for (int i = k; i < nums.length; i++) {

            if (set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
            set.remove(nums[i - k]);
        }
        return false;

    }


    //using hashmap : faster
    public boolean containsNearbyDuplicateHashMap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }

        }

        return false;
    }
}
