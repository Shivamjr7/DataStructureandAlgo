package recursionandbacktrack.easy;

public class CheckIfArrayIsSorted {


    public static void main(String[] args) {


        int [] arr = {1,2,13,4,5,6,8};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int [] arr)
    {

        return helper(arr,0);
    }


    static boolean helper(int []arr , int index)
    {
        if(index==arr.length-1)
            return true;


        if(arr[index]<arr[index+1]) {
            return helper(arr, index + 1);
        }

            return false;

    }
}
