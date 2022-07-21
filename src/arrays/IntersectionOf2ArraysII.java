package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOf2ArraysII {


    public static void main(String[] args) {
        int [] nums1 = {3,1,2};
        int [] nums2 = {1,1};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;

        int i =0;
        int j =0;

        while(i<m && j<n)
        {
            if(nums1[i]==nums2[j])
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }

        int []res = new int[list.size()];

        int k =0;
        for(int x: list)
        {
            res[k++] = x;
        }


        return res;


    }
}
