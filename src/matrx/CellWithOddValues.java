package matrx;

public class CellWithOddValues {


    public static void main(String[] args) {
        int[][] indices = {
                {40, 5}

        };
        System.out.println(oddCells(48, 37, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {


        int count = 0;


        int[] row = new int[m];
        int[] col = new int[n];

        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 != 0)
                    count++;
            }
        }


        return count;

    }
}
