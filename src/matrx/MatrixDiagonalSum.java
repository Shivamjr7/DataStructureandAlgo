package matrx;

public class MatrixDiagonalSum {


    public static void main(String[] args) {


        int [][] mat4 = {
                {7,3,1,9},
                {3,4,6,9},
                {6,9,6,6},
                {9,5,8,5}
        };
       int[][] mat = {
               {1,2,3},
               {4,5,6},
               {7,8,9}
       };

       int [][] newmat = {
               {1,1,1,1},
               {1,1,1,1},
               {1,1,1,1},
               {1,1,1,1}
       };

       int [][] mat3= {{5}};

        System.out.println(diagonalSum(mat4));
        System.out.println(diagonalSum(newmat));
        System.out.println(diagonalSum(mat3));
    }





    public static  int diagonalSum(int[][] mat) {

        int r = mat.length;


        int rows = 0;
        int col1 = 0;
        int col2 = r-1;


        int sum = 0;
        while (rows < r && col1 < r ) {

            if (mat[rows][col1]!=-1) {
                sum = sum + mat[rows][col1];
                mat[rows][col1] = -1;
            }
            if(mat[rows][col2]!=-1)
            {
                sum = sum + mat[rows][col1];
                mat[rows][col2] = -1;
            }

            rows++;
            col1++;
            col2--;

        }


        return sum;
    }
}
