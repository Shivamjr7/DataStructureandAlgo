package arrays.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class MinConsecutiveCards {

    public static void main(String[] args) {

        int [] cards = {95,11,8,65,5,86,30,27,30,73,15,91,30,7,37,26,55,76,60,43,36,85,47,96,6};
        System.out.println(minimumCardPickup(cards));
    }

    public static int minimumCardPickup(int[] cards) {


        int start = 0;

        int end = 0;

        int len = Integer.MAX_VALUE;


        int [] count  = new int[100001];
        for (end = 0; end < cards.length; end++) {

            count[cards[end]]++;

            while (count[cards[end]]==2) {
                len = Math.min(len, end - start + 1);


                count[cards[start]]--;
                start++;
            }



        }

        return len==Integer.MAX_VALUE? -1: len;

    }
}
