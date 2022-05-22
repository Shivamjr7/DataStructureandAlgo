package bitmanipulation;

public class FindFirstSetBit {

    public static int getFirstSetBit(int n){

        // Your code here

        if(n==0)
            return 0;
        int count =0;

        while(n>0)
        {
            if((n & 1)==1)
                break;
            count++;
            n = n>>1;
        }
        return count+1;
    }
    public static void main(String[] args) {


        System.out.println(getFirstSetBit(18));
    }
}
