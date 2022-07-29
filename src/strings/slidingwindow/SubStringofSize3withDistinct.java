package strings.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubStringofSize3withDistinct {

    public static void main(String[] args) {

        String s = "x";

        System.out.println(countGoodSubstrings(s));
    }

    public static int countGoodSubstrings(String s) {


        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < 3 && i<s.length(); i++) {

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (map.size() == 3)
            count++;

        for (int i = 3; i < s.length(); i++) {

            char k = s.charAt(i);
            char w = s.charAt(i - 3);


            map.put(w, map.get(w) - 1);

            if (map.get(w) == 0) {
                map.remove(w);
            }
            map.put(k, map.getOrDefault(k, 0) + 1);
            if (map.size() == 3)
                count++;

        }

        return count;

    }
}
