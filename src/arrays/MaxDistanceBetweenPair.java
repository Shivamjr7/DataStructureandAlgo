package arrays;

public class MaxDistanceBetweenPair {

    public static void main(String[] args) {

        int[] nums1 = {30,29,19,5};
        int[] nums2 = {25,25,25,25,25};


//        System.out.println(maxDistance(nums1, nums2));
        System.out.println(maxDistanceBS(nums1, nums2));
    }

    //Two pointers
    public static int maxDistance(int[] nums1, int[] nums2) {

        int dist = 0;
        int i = 0;
        int j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        while(i < len1 && j < len2){
            if(nums1[i] <= nums2[j]){
                dist=Math.max(dist, j-i);
                j++;
            }else{
                i++;
            }
        }
        return dist;
    }


    // Binary Search
    public static  int maxDistanceBS(int[] nums1, int[] nums2) {

        int res = 0;


        for (int i = 0; i < nums1.length; i++) {

            int ans = binarySearch(nums2, i, nums2.length-1, nums1[i]);
            if (nums2[ans] >= nums1[i])
                res = Math.max(res, ans - i);
        }

        return res;
    }


    static int binarySearch(int[] arr, int start, int end, int target) {
        int res = 0;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;

            } else {
                res = mid;
                start = mid + 1;
            }

        }

        if(end>res)
          res = end;
        return res;
    }
}
