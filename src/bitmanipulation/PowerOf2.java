package bitmanipulation;

public class PowerOf2 {


    public static void main(String[] args) {
        System.out.println(checkIfPowerOf2(1));
        System.out.println(checkIfPowerOf2(4));
        System.out.println(checkIfPowerOf2(6));
        System.out.println(checkIfPowerOf2(32));
    }

    static boolean checkIfPowerOf2(int n )
    {
        if(n==0)
            return false;

        return (n & (n-1))==0;
    }
}
