package arrays;

import java.util.*;

public class IntersectionOf2Arrays {

    public static void main(String[] args) {
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));


    }
    public static int[] intersection(int[] nums1, int[] nums2) {



        int [] temp = new int[1001];

        Arrays.fill(temp,-1);
        int m = nums1.length;
        int n = nums2.length;

        int count = 0;
        if (m > n) {
            Arrays.sort(nums1);
            //nums2 is smaller than nums1
            for (int i = 0; i < n; i++) {

                int r = binarySearch(nums1, 0, m - 1, nums2[i]);
                if (r!= -1 && temp[r]!=r)
                {
                    temp[r] = r;
                    count++;
                }
            }
        } else {

            Arrays.sort(nums2);
            //nums2 is smaller than nums1
            for (int i = 0; i < m; i++) {

                int r =   binarySearch(nums2, 0, n - 1, nums1[i]);
                if (r != -1 && temp[r]!=r)
                {
                    temp[r]=r;
                    count++;
                }
            }
        }


        int[] result = new int[count];
        int count1 =0;
        for(int j=0;j<temp.length;j++)
        {
           if(temp[j]!=-1) {
               result[count1] = temp[j];
               count1++;
           }
           if(count==count1)
               break;
        }

        return result;

    }

   static  int binarySearch(int[] nums, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return nums[mid];
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }
}
