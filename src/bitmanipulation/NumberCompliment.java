package bitmanipulation;

/**
 *  leetcode : https://leetcode.com/problems/number-complement/
 */
public class NumberCompliment {



    public int findComplement(int num) {

        int res = 0;
        int mask = 1;
        while (num != 0) {
            if ((num & 1) == 0) {
                res += mask;
            }
            num = num >> 1;
            mask = mask << 1;
        }

        return res;

    }
}
