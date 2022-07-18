package matrx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LuckNumber {


    public static void main(String[] args) {
        int[][] matrix = {
                {1,10,4,2},
                {9,3,8,7},
                {15,16,17,12}

        };


        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> res = new ArrayList<>();



        int max = Integer.MIN_VALUE;

        int [] rowsMin = new int[matrix.length];
        int [] colsMax = new int[matrix[0].length];




        int j = 0;
       for(int [] arr : matrix)
       {

           int min = Integer.MAX_VALUE;

           for(int i =0;i<arr.length;i++)
           {
               if(arr[i]<min)
               {
                   min = arr[i];
               }

               colsMax[i] = Math.max(colsMax[i], arr[i]);

           }

           rowsMin[j] = min;
           j++;


       }


       for(int i=0;i<rowsMin.length;i++)
       {
           for(int k = 0;k< colsMax.length;k++)
           {
               if(rowsMin[i]==colsMax[k])
                   res.add(rowsMin[i]);
           }
       }


        return res;
    }

}
