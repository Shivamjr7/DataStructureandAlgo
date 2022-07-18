package matrx;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };


        int[][] mat1 = {
                {2, 5},
                {8, 4},
                {0, -1}

        };

        System.out.println(spiralOrderNew(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<Integer>();

        int r1 = 0;
        int r2 = matrix.length - 1;

        int c1 = 0;
        int c2 = matrix[0].length - 1;


        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) {
                list.add(matrix[r1][c]);
            }

            for (int r = r1 + 1; r <= r2; r++) {
                list.add(matrix[r][c2]);
            }


            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) list.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) list.add(matrix[r][c1]);
            }

            r1++;
            r2--;
            c1++;
            c2--;
        }

        return list;
    }


    /**
     * { 1,  2,  3, 4 },
     * { 5,  6,  7, 8 },
     * { 9,  10, 11,12 }
     * };
     */


    public static List<Integer> spiralOrderNew(int[][] matrix) {

        List<Integer> res = new ArrayList<>();


        int r1 = 0;
        int r2 = matrix.length - 1;

        int c1 = 0;
        int c2 = matrix[0].length - 1;


        while (r1 <= r2 && c1 <= c2) {

            // traverse from c1 to c2

            for (int i = c1; i <= c2; i++) {
                res.add(matrix[r1][i]);

            }
            r1++;

            // traverse from r1 to r2

            for (int j = r1; j <= r2; j++) {
                res.add(matrix[j][c2]);

            }
            c2--;

            //traverse from c2 to c1

            if (r1 > r2 || c1 > c2)
                break;

            for (int k = c2; k >= c1; k--) {
                res.add(matrix[r2][k]);

            }
            r2--;
            for (int w = r2; w >= r1; w--) {
                res.add(matrix[w][c1]);

            }
            c1++;

        }

        return res;
    }


}
