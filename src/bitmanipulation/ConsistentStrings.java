package bitmanipulation;

import java.util.HashSet;
import java.util.Set;

public class ConsistentStrings {


    public static void main(String[] args) {

        String allowed1 = "cad";
        String[] words1 = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};

        System.out.println(countConsistentStrings(allowed1, words1));


    }

    public static int countConsistentStrings(String allowed, String[] words) {


        int count = 0;

        Set<Character> set = new HashSet<>();

        for (char c : allowed.toCharArray()) {
            set.add(c);
        }


        for (int i = 0; i < words.length; i++) {
            boolean include = true;
            for (char c : words[i].toCharArray()) {
                if (!set.contains(c)) {
                    include = false;
                    break;
                }
            }

            if (include)
                count++;

        }


        return count;

    }

    /**
     * optimized solution
     * @param allowed
     * @param words
     * @return
     */
    public static int countConsistentStringsNew(String allowed, String[] words) {

        int res = 0;

        int[] count = new int[26];

        for (char c : allowed.toCharArray()) {
            count[c - 'a'] = 1;
        }


        for (String word : words) {
            if (isConsistent(word, count))
                res++;
        }

        return res;
    }

    static boolean isConsistent(String word, int[] count) {
        for (int i = 0; i < word.length(); i++) {
            if (count[word.charAt(i) - 'a'] != 1)
                return false;
        }
        return true;
    }
}
