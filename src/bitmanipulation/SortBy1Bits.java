package bitmanipulation;

import java.util.Arrays;
import java.util.Comparator;

public class SortBy1Bits {


    public static void main(String[] args) {


    }

    public int[] sortByBits(int[] arr) {

        Integer[] arr1 = new Integer[1];

        Arrays.sort(arr1, (i1, i2) -> {

            if (getNumOf1(i1) > getNumOf1(i2))
                return i1 - i2;

            return 0;
        });

        return arr;
    }


    int getNumOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        return count;

    }


}


