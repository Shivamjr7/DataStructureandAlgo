package arrays;

public class KthMissingPositiveInteger {


    public static void main(String[] args) {


        int [] arr1 = {2,3,4,7,11};

        System.out.println(findKthPositive(arr1,5));
    }

    public static  int findKthPositive(int[] arr, int k) {


        int start = 0;
        int end = arr.length-1;

        int ans  =-1;




        while(start<=end)
        {
            int mid = start + (end - start)/2;


            int diff = arr[mid]-mid-1;
            if(diff>=k)
            {
                end = mid-1;
            }
            else {
                start = mid+1;
            }


        }
        return start+k;
    }



}
