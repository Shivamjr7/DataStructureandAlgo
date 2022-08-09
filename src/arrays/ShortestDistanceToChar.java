package arrays;

import java.util.Arrays;

public class ShortestDistanceToChar {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(shortestToChar("abaa",'b')));
    }

    public static  int[] shortestToChar(String s, char c) {


        int i = 0;
        int j = 0;

        int firstOcc = Integer.MAX_VALUE;


        int[] res = new int[s.length()];
        while (j < s.length()) {
            if (s.charAt(j) == c) {


                while (i <= j) {

                    //check which char is near

                    int min = Math.min(Math.abs(j - i), Math.abs(i - firstOcc));

                    res[i] = min;
                    i++;
                }
                res[j] = 0;
                firstOcc = i-1;
            }
            //keep on looking for char
            j++;
        }


        while (i < j) {

            //check which char is near

            int min =  Math.abs(i - firstOcc);

            res[i] = min;
            i++;
        }

        return res;

    }
}
