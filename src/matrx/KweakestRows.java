package matrx;

import java.util.*;

public class KweakestRows {

    public static void main(String[] args) {


        int [][] mat = {

                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };

        System.out.println(Arrays.toString(kWeakestRows(mat,3)));
    }

    public static  int[] kWeakestRows(int[][] mat, int k) {

        int [] res = new int[k];
        Map<Integer, List<Integer>> map = new TreeMap<>();

        int r = 0;
        int c =0;

        int rows = mat.length;
        int cols = mat[0].length;

        while(r< rows)
        {

            int count =0;
            while(c<cols && mat[r][c]!=0)
            {
                count++;
                c++;
            }
            if(map.containsKey(count))
            {
             map.get(count).add(r);
            }
            else{
                map.put(count, new ArrayList<>());
                map.get(count).add(r);
            }
            r++;
            c=0;
            count=0;
        }

        int count1 = 0;
            for(Map.Entry<Integer, List<Integer>> entry :map.entrySet())
            {

                int key = entry.getKey();
                List<Integer> values = entry.getValue();

                for(int j= 0;k>0 && j<values.size();j++,k--)
                {
                    res[count1] = values.get(j);
                    count1++;
                }
            }

        return res;
    }
}
