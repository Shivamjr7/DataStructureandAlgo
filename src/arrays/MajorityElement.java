package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {


    public static void main(String[] args) {

        int [] nums1 = {1,1,1,2,2};
        int [] nums2 = {3,2,3};
        int [] nums3 = {2,2,1,1,2,2};
        int [] nums4 = {1};


        System.out.println(majorityElement2(nums1));
        System.out.println(majorityElement2(nums2));
        System.out.println(majorityElement2(nums3));
        System.out.println(majorityElement2(nums4));

    }
    public int majorityElement(int[] nums) {


        Map<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();

            if (val > (n / 2))
                return val;
        }

        return -1;
    }


    public static int majorityElement2(int[] nums) {

        if(nums.length==0)
            return -1;
        Arrays.sort(nums);


        int i = 0;
        int startIndex = 0;
        int endIndex = 0;

        int prev = nums[0];
        int n = nums.length;
        int num = 0;
        while (i < n) {
            num = nums[i];

            if (prev == num) {
                endIndex = i;
            } else {

                if ((endIndex - startIndex+1) > n / 2) {
                    return prev;
                }
                startIndex = i;
                endIndex = i;
            }

            prev = num;
            i++;
        }


        if ((endIndex - startIndex +1)> n / 2)
            return num;
        else
            return -1;
    }


    public int majorityElementFastest(int [] nums)
    {
        int count = 0, ans = 0;
        for(int num: nums) {
            if(count == 0) {
                ans = num;
            }
            if(num == ans) {
                count++;
            } else {
                count--;
            }
        }

        return ans;
    }
}
