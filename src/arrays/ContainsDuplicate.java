package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {


    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n))
                return true;
            else
                set.add(n);
        }

        return false;

    }
}