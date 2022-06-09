package bitmanipulation;

public class BinaryGap {


    public static void main(String[] args) {

        System.out.println(binaryGapNew(22));
        System.out.println(binaryGapNew(8));
        System.out.println(binaryGapNew(5));
        System.out.println(binaryGapNew(9));

    }

    public static int binaryGap(int n) {


        int count = 0;
        int max = 0;
        boolean startCount = false;


        while (n != 0) {
            if (startCount) {
                count++;
                max = Math.max(count, max);
            }


            if ((n & 1) == 1) {
                count = 0;
                startCount = true;
            }


            n = n >> 1;
        }
        return max;
    }


    public static int binaryGapNew(int n) {

        int posn = 0;
        int i = 0;
        int max = 0;
        boolean startCount = false;
        ;
        while (n != 0) {
            if ((n & 1) == 1) {
                max = Math.max(max, i - posn);
                posn = i;
                startCount = true;
            }

            if (startCount)
                i++;


            n = n >> 1;
        }

        return max;

    }


}
