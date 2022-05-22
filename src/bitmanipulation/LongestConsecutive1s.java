package bitmanipulation;

public class LongestConsecutive1s {

    public static void main(String[] args) {

        System.out.println("Longest consecutive 1's in 222 : " + maxConsecutiveOnes(222));
        System.out.println("Longest consecutive 1's in 14 : " + maxConsecutiveOnes(14));



        System.out.println("Longest consecutive 1's in 222 : " + maxConsecutiveOnesNew(222));
        System.out.println("Longest consecutive 1's in 14 : " + maxConsecutiveOnesNew(14));
    }

    public static int maxConsecutiveOnes(int N) {

        // Your code here


        int count = 0;
        int res = 0;

        while (N > 0) {

            if ((N & 1) == 1) {
                count++;
                res = Math.max(count, res);

            } else {
                count = 0;
            }
            N = N >> 1;
        }

        return  res;
    }


    private static int maxConsecutiveOnesNew(int x)
    {
        // Initialize result
        int count = 0;

        // Count the number of iterations to
        // reach x = 0.
        while (x!=0)
        {
            // This operation reduces length
            // of every sequence of 1s by one.
            x = (x & (x << 1));

            count++;
        }

        return count;
    }
}
