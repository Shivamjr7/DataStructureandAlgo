package strings;

public class ReversePrefixOfWord {

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }

    public static String reversePrefix(String word, char ch) {


        StringBuilder sb = new StringBuilder();
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return word;
        else {
            return sb.append(word.substring(0, index + 1)).reverse().append(word.substring(index + 1, word.length())).toString();
        }


    }
}
