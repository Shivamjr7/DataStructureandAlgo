package matrx;

import java.util.Arrays;

public class ReShapeTheMatrix {

    public static void main(String[] args) {

        int[][] mat = {
                {1,2},
                {3,4}

        };


        System.out.println(Arrays.deepToString(matrixReshape(mat,1,4)));

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {


        int m = mat.length;
        int n = mat[0].length;


        if((r*c)!= (m*n))
            return mat;


        int [][] matnew = new int[r][c];

        int colCount = 0;
        int rowCount = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {


                if(colCount ==c)
                {
                    rowCount++;
                    colCount =0;
                }
                matnew[rowCount][colCount] = mat[i][j];
                colCount++;

            }
        }

        return  matnew;

    }

}
