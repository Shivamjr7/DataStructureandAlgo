package arrays;

public class SingleElementInSortedArrays {


    public static void main(String[] args) {
        int[] arr = {1};

        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {


        int start = 0;
        int end = nums.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if both left and right ele are not equal , this is a single element
            if (mid != 0 && mid != nums.length - 1 && nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];


            // if left element is equal
            if (mid != 0 && nums[mid] == nums[mid - 1]) {
                if (mid % 2 != 0)  // example : 1,1,2,2,3
                    start = mid + 1;
                else
                    end = mid - 1;   // 1,1,2,3,3,4,4,8,8
            }// if right element is equal
            else {
                if (mid % 2 == 0)
                    start = mid + 1;
                else
                    end = mid - 1;
            }


        }
        return nums[start - 1];


    }
}
