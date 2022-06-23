package arrays;

public class CountNegativeInSortedMatrix {


    public static void main(String[] args) {
        int [][]grid ={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };

        int [][] grid1 = {
                {3,2},
                {1,0}
        };

        System.out.println(countNegatives(grid1));
    }

    public static  int countNegatives(int[][] grid) {


        int row = 0;
        int col = grid[0].length - 1;


        int rowEnd = grid.length - 1;

        int count = 0;


        while (row <= rowEnd && col >= 0) {


            if (grid[row][col] < 0) {
                count += rowEnd - row+1;
                col--;
            } else if (grid[row][col] >= 0) {
                row++;
            }


        }

        return count;


    }
}
