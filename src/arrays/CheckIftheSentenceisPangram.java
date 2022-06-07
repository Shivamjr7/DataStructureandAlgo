package arrays;

public class CheckIftheSentenceisPangram {


    public static void main(String[] args) {

        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";


        System.out.println(checkIfPangramOptimal(sentence1));
        System.out.println(checkIfPangramOptimal(sentence2));
    }

    public static boolean checkIfPangram(String sentence) {


        if (sentence.length() == 0 || sentence.length() < 26)
            return false;
        int count[] = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            count[sentence.charAt(i) - 'a']++;
        }

        for (int j = 0; j < 26; j++) {
            if (count[j] == 0)
                return false;
        }
        return true;
    }


    public static  boolean checkIfPangramOptimal(String sentence) {

        if (sentence.length() == 0 || sentence.length() < 26)
            return false;

        for(char i='a';i<='z';i++){
            if(!sentence.contains(String.valueOf(i))){
                return false;
            }
        }
        return true;

    }


}
