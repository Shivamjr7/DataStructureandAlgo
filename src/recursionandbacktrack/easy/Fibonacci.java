package recursionandbacktrack.easy;

public class Fibonacci {


    public static void main(String[] args) {

        System.out.println(fibonaaci(3));
        System.out.println(fibonaaci(5));
        System.out.println(fibonaaci(100));
    }

    static int fibonaaci(int n )
    {
        if(n<2)
            return n;

        return fibonaaci(n-1)+ fibonaaci(n-2);
    }
}
