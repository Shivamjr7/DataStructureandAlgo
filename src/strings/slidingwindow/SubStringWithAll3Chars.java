package strings.slidingwindow;

public class SubStringWithAll3Chars {


    public static void main(String[] args) {

        System.out.println(numberOfSubstrings("abcabc"));

    }

    public static  int numberOfSubstrings(String s) {


        int right = 0;
        int left = 0;

        int res = 0;
        int counter = 0;

        int[] count = new int[3];

        for (right = 0; right < s.length(); right++) {
            count[s.charAt(left) - 'a']++;

            while (left < s.length() && count[0] >= 1 && count[1] >= 1 && count[2] >= 1) {
                counter++;
                count[s.charAt(right) - 'a']--;

                left++;

            }

            res = res + counter;
        }

        return res;
    }
}
