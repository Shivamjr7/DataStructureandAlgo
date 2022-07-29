package arrays.sorting;

import java.util.Arrays;

public class MergeSortedArray {


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        int[] res = new int[m + n];


        int i = 0;

        while (i < m) {
            if (nums1[i] <= nums2[0]) {
                i++;
            } else {
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;

                int k = 0;
                while (k < n - 1) {
                    if (nums2[k] > nums2[k + 1]) {
                        int temp1 = nums2[k];
                        nums2[k] = nums2[k + 1];
                        nums2[k + 1] = temp;
                    }
                    k++;
                }

            }
        }

        int j = 0;

        while (j < n) {
            nums1[m + j] = nums2[j];
            j++;
        }
    }

    public static void mergeNew(int[] nums1, int m, int[] nums2, int n) {

        int []res = new int[m+n];

        int i =0;
        int j= 0;
        int k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j]) {
                res[k] = nums1[i];
                i++;
                k++;
            }
            else{
                res[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i<m)
        {
            res[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            res[k] = nums2[j];
            j++;
            k++;
        }

        for(int h=0;h<nums1.length;h++)
        {
            nums1[h]=res[h];
        }
    }
}
