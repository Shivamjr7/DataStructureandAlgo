package bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinXorValue {

    public static  int findMinXor(ArrayList<Integer> A) {

        Collections.sort(A);

        int res = Integer.MAX_VALUE;


        for(int i =0;i<A.size()-1;i++)
        {
            res = Math.min(A.get(i) ^ A.get(i+1), res );
        }

        return res;

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(4);
        list.add(7);
        list.add(9);

        System.out.println("Min xor : "+ findMinXor(list));
    }

}
