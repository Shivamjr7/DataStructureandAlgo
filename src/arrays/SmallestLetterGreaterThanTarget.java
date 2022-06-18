package arrays;

public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
       char[] letters = {'c','f','j'};

        System.out.println(nextGreatestLetter(letters,'a'));
        System.out.println(nextGreatestLetter(letters,'c'));
        System.out.println(nextGreatestLetter(letters,'d'));


        char[] letters1 = {'e','e','e','e','e','e','n','n'};
        System.out.println(nextGreatestLetter(letters1,'e'));
    }


    public static char nextGreatestLetter(char[] letters, char target) {


        int start =0;
        int end = letters.length-1;

        while(start<=end)
        {

            int mid = start + (end-start)/2;

            if((mid !=0 && target<letters[mid] && target>=letters[mid-1]) )
                return letters[mid];
            if(target >= letters[mid])
               start  = mid+1;
            else
                end = mid-1;
        }


        return letters[start];
    }


}
