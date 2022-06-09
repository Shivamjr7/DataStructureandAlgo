package bitmanipulation;

import java.util.HashSet;
import java.util.Set;

public class PrimeSetBits {


    public int countPrimeSetBits(int left, int right) {


        System.out.println();
        Set<Integer> setofPrimes = new HashSet<>();
        setofPrimes.add(2);
        setofPrimes.add(3);
        setofPrimes.add(5);
        setofPrimes.add(7);
        setofPrimes.add(11);
        setofPrimes.add(13);
        setofPrimes.add(17);
        setofPrimes.add(19);
        setofPrimes.add(23);
        setofPrimes.add(27);
        setofPrimes.add(31);

        int count = 0;

        for (int i = left; i <= right; i++) {

            //check for prime set bits

            if (setofPrimes.contains(noOfSetbits(i)))
                count++;

        }

        return count;
    }


        int noOfSetbits(int n) {


            int count = 0;

            while (n != 0) {
                if (n < 0)
                    count++;

                n = n << 1;
            }

            return count;
        }


}
