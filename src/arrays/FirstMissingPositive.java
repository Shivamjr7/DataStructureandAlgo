package arrays;

public class FirstMissingPositive {


    public static void main(String[] args) {

        int [] arr1 = new int[]{1,2,0};
        int [] arr2 = new int[]{3,4,-1,1};
        int [] arr3 = new int[]{7,8,9,10,11};
        System.out.println(firstMissingPositive(arr1));
        System.out.println(firstMissingPositive(arr2));
        System.out.println(firstMissingPositive(arr3));
    }

    public static int firstMissingPositive(int[] nums) {

        int i = 0;
        int res = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
                if (nums[i]>0 &&  nums[i]<=nums.length && nums[i] != nums[correct]) {
                    swap(nums,correct,i);
                }
                else{
                    i++;
                }
            }


        for(int j =0;j<nums.length;j++)
        {
            if (nums[j]!=j+1)
            {
                return j+1 ;
            }
        }

        return nums.length+1;
    }


    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
