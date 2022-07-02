package recursionandbacktrack.easy;

public class SumOfDigits {


    public static void main(String[] args) {


        System.out.println(sumOfDigits(912));
        System.out.println(sumOfDigits(123789));
    }

   static int sumOfDigits(int n){
        if(n <10)
            return n;

        return (n%10) + sumOfDigits(n/10);

    }
}
