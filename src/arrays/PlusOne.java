package arrays;

import java.util.Arrays;

public class PlusOne {


    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {9, 9};
        int[] digits3 = {9, 9};

//        System.out.println(Arrays.toString(plusOne(digits1)));
//        System.out.println(Arrays.toString(plusOne(digits2)));
//        System.out.println(Arrays.toString(plusOne(digits3)));
//


        System.out.println(Arrays.toString(plusOneNew(digits1)));
        System.out.println(Arrays.toString(plusOneNew(digits2)));
        System.out.println(Arrays.toString(plusOneNew(digits3)));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum >= 10) {
                digits[i] = sum % 10;
                carry = 1;
                sum = sum / 10;

            } else {
                digits[i] = sum;
                carry = 0;
            }

        }

        if (carry == 1) {
            int[] resNew = new int[digits.length + 1];
            resNew[0] = 1;
            Arrays.copyOfRange(digits, 1, digits.length);
            return resNew;
        }


        return digits;
    }

    public static int[] plusOneNew(int[] digits) {


        StringBuilder sb = new StringBuilder();

        for (int n : digits) {
            sb.append(n);
        }
        int no = Integer.parseInt(sb.toString()) + 1;

        int[] res = new int[(int) Math.log10(no) + 1];

        int i = res.length - 1;

        while (i >= 0) {
            res[i--] = no % 10;
            no = no / 10;
        }
        return res;
    }

}
