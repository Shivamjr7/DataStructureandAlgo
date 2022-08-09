package strings.slidingwindow;

public class MaxVowelsInSubstringOflengthK {

    public static void main(String[] args) {
        System.out.println(maxVowels("leetcode",3));
    }

    public static  int maxVowels(String s, int k) {


        int[] arr = new int[26];


        int start = 0;
        int res = 0;

        for (int end = 0; end < s.length(); end++) {

            arr[s.charAt(end) - 'a']++;

            if (end - start + 1 == k) {

                int count = arr['a' - 'a'] + arr['e' - 'a'] + arr['i' - 'a'] + arr['o' - 'a'] + arr['u' - 'a'];
                res = Math.max(res, count);
                arr[s.charAt(start) - 'a']--;

                start++;
            }


        }
        return res;
    }

}
