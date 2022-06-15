package arrays;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {


    public static void main(String[] args) {


        int[] num = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] num1 = {1,2,3,0};
        int[] num2 = {1};
//        System.out.println(addToArrayForm(num, 1));
//        System.out.println(addToArrayForm(num1, 24));
        System.out.println(addToArrayFormNew(num2, 29));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> res = new ArrayList<>();

        int carry = 0;


        int i = num.length - 1;
        while (i >= 0 && k > 0) {

            // last digit of k

            int no = 0;
            int dig = k % 10;
            int sum = num[i] + dig + carry;


            if (sum >= 10) {
                carry = 1;
                no = sum % 10;
                res.add(0, no);

            } else {
                carry = 0;
                res.add(0, sum);
            }

            k = k / 10;
            i--;

        }


        while (i >= 0) {

            int sum = num[i] + carry;

            if (sum >= 10) {
                carry = 1;
                int no = sum % 10;
                res.add(0, no);

            } else {
                carry = 0;
                res.add(0, sum);
            }
            i--;
        }

        while (k > 0) {

            int dig = k% 10;
            int sum  = carry + dig;
            if (sum >= 10) {
                carry = 1;
                int no = sum % 10;
                res.add(0, no);

            } else {
                carry = 0;
                res.add(0, sum);
            }
            k = k/10;
        }

        if(carry>0)
            res.add(0,carry);


        return res;

    }


    public static List<Integer> addToArrayFormNew(int[] num, int k) {

        List<Integer> res = new ArrayList<>();

        int n = num.length-1;


        while (n>=0 || k!=0)
        {

            if(n>=0) {
                k = k + num[n];
                n--;
            }


            res.add(k%10);
            k=k/10;

        }





        return  res;

    }
}
