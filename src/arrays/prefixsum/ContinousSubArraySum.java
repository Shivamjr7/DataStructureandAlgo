package arrays.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class ContinousSubArraySum {


    public static void main(String[] args) {
        int [] nums = {5,0,0,0};

        System.out.println(checkSubarraySum(nums,3));
    }


    // similar to subarray sum equals K
    public static  boolean checkSubarraySum(int[] nums, int k) {


        Map<Integer,Integer> map  = new HashMap<>();

        int sum = 0;
        for(int i =0;i<nums.length;i++)
        {
            sum+=nums[i];

            // why we do mod for this
            // when we divide sum by k keep it in map ,
            // then if there are elements whose sum equals k or multiple of k
            // when we add them to sum and take mod , the mod will be same
            //example : 23, 2, 4 - k =6

            // 23 mod 6 is 5
            // so on adding 6 to 23 mod should once again come as 5 and we know that sum 6 is there
            int mod = sum % k;

            if(map.containsKey(mod) ) {

                if( i- map.get(mod)>1)
                return true;
            }
            else
                map.put(mod, i);

        }

        return false;

    }

    //TLE
    public static  boolean checkSubarraySumTLE(int[] nums, int k) {


        int [] prefixSum = new int[nums.length];

        prefixSum[0] = nums[0];
        for(int i=1;i<prefixSum.length;i++)
        {
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }


        if(prefixSum.length>=2 && prefixSum[1]%k==0)
        {
            return true;
        }


        int n = 2;
        while (n < prefixSum.length) {

            for (int j = n ; j < prefixSum.length; j++) {

                if(prefixSum[j]%k==0 ||(prefixSum[j]-prefixSum[j-n])%k==0)
                    return true;

            }
            n ++;

        }



//        for(int j=2;j<prefixSum.length;j++)
//        {
//            int l =0;
//            while(j-l>=2)
//            {
//                if(prefixSum[j]%k==0 || (prefixSum[j]-prefixSum[l])%k==0)
//                {
//                    return true;
//                }
//                l++;
//            }
//        }


        return false;

    }



}
