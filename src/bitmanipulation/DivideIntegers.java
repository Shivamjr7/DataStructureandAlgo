package bitmanipulation;

public class DivideIntegers {

    public static void main(String[] args) {


        System.out.println(divide(10,3));
    }


    public static  int divide(int A, int B) {


        int res = 0;


        while (A - B >= 0) {
            int x = 0;

            while (A - (B <<1<<x) >= 0) {
                x++;
            }

            res = res + 1 << x;

            A = (A - (B << x));
        }

        return res;
    }


}
