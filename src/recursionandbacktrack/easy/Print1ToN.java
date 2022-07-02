package recursionandbacktrack.easy;

public class Print1ToN {


    public static void main(String[] args) {

        System.out.println("print n to 1 when n is given :" );
        printNto1(5);

        System.out.println("print 1 to n when n is given :" );
        print1toN(5);
    }


    static void printNto1(int n )
    {
        if(n<1)
            return ;

        System.out.println(n);
        printNto1(n-1);
    }

    static void print1toN(int n)
    {
        if(n<1)
            return;

        print1toN(n-1);
        System.out.println(n);
    }
}
