package arrays;

public class SingleElementInSortedArrays {


    public static void main(String[] args) {
        int [] arr  = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }

    public static  int singleNonDuplicate(int[] nums) {


        int start =0;
        int end = nums.length -1;


        while(start <=end)
        {
            int mid = start + (end -start)/2;


            if(mid!=0 && mid!= nums.length-1 && nums[mid]!= nums[mid-1] && nums[mid]!= nums[mid+1])
                return nums[mid];

        }
        return nums[start];


    }
}
