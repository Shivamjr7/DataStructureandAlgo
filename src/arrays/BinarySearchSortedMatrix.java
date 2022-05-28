package arrays;

import java.util.Arrays;

public class BinarySearchSortedMatrix {


    public static void main(String[] args) {


        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,15,16,17}
        };


        System.out.println(Arrays.toString(binarySearch2d(matrix, 11)));
    }




    static int[] binarySearch2d(int [][] matrix , int target)
    {
        if(matrix.length==0)
            return new int[]{-1,-1};


        int rows = matrix.length;
        int cols = matrix[0].length;


        int low = 0;
        int high = (rows * cols) -1;


        while(low <=high)
        {
            int mid= low + (high - low )/2;

            int newRow = mid/cols;
            int newCol = mid%cols;
            if(matrix[newRow][newCol]==target)
                return new int[]{newRow,newCol};
            if(matrix[newRow][newCol]< target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }

        return new int[]{-1,-1};
    }



}
