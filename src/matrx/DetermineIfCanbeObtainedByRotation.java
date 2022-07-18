package matrx;

import java.util.Arrays;

public class DetermineIfCanbeObtainedByRotation {


    public static void main(String[] args) {
        int [][] mat = {{0,1},{1,0}};
        int [][] target = {{1,0},{0,1}};


        System.out.println(findRotation(mat,target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {


        int i = 0;

        while (i < 4) {
            int[][] mat1 = rotateMatrix(mat);
            if (Arrays.deepEquals(mat1, target))
                return true;
            else
                i++;
        }

        return false;

    }


    static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;


        //transpose the matrix

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


        //swap the front and last ele
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        return matrix;
    }
}
