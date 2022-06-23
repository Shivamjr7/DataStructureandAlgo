package arrays;

public class ArrangingCoins {


    public static void main(String[] args) {


        System.out.println(arrangeCoins(4));
        System.out.println(arrangeCoins(9));
        System.out.println(arrangeCoins(2));
        System.out.println(arrangeCoins(8));

    }

    public static int arrangeCoins(int n) {


        long start = 1;
        long end = n;
        long res = 0;
        while (start <= end) {
            long level = start + (end - start) / 2;
            long coinsRequired = (level * (level + 1)) / 2;
            if (coinsRequired <= n) {
                res = level;
                start = level + 1;
            } else
                end = level - 1;


        }


        return (int) res;
    }
}
