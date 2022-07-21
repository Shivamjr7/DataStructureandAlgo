package arrays;

import java.util.Map;
import java.util.TreeMap;

public class MaximumPopulation {


    public static void main(String[] args) {

        int[][] logs = {{1993, 1999}, {2000, 2010}};
        int[][] logs1 = {{1982, 1998}, {2010, 2035}, {2022, 2050}, {2047, 2048}};

        System.out.println(maximumPopulation(logs));

    }

    public static int maximumPopulation(int[][] logs) {

        int[] arr = new int[101];
        for(int i=0;i<logs.length;i++){
            arr[logs[i][0]-1950]++;
            arr[logs[i][1]-1950]--;
        }
        for(int i=1;i<101;i++){
            arr[i]+=arr[i-1];
        }
        int maxval=0;
        int maxyear=1950;
        for(int i=0;i<101;i++){
            if(maxval<arr[i]){
                maxval=arr[i];
                maxyear=i+1950;
            }
        }
        return maxyear;

    }

}
