package arrays;

public class GuessNumber {


    int pick = 6;

    public int guessNumber(int n) {


        int start = 0;
        int end = n;


        while(start<=end)
        {
            int mid = start + (end- start)/2;

            if(guess(mid)==0)
                return mid;
            else if(guess(mid)==-1)
                end= mid-1;
            else
                start = mid+1;


        }

        return -1;
    }


    int guess(int n)
    {
        if(n==pick)
            return 0;
        if(n>pick)
            return -1;
        else
            return 1;
    }


}
