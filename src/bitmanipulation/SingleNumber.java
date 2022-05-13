package bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {


    public static void main(String[] args) {
        System.out.println(singleNumber(new ArrayList<>(Arrays.asList(1,2,1,2,3))));
    }
    public static int singleNumber(final List<Integer> A) {


        if(A.isEmpty())
            return 0;
        int res =0;
        for(int i =0;i<A.size(); i++ )
        {
            res = res ^ A.get(i);
        }
        return res;
    }
}
