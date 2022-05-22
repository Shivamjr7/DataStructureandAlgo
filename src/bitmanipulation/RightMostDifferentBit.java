package bitmanipulation;

public class RightMostDifferentBit {

    public static int posOfRightMostDiffBit(int m, int n)
    {

        // Your code here

        int res = m ^ n;

        if(res==0)
            return -1;


        int count = 0;

        while(res >0)
        {
            if((res & 1)==1)
                break;
            count ++;
        }
        return count +1;


    }
}
