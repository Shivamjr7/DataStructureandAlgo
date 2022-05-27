package bitmanipulation;

public class AddBinary {


    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
    public static String  addBinary(String a, String b) {


        int carry = 0;


        int i = a.length()-1;
        int j = b.length()-1;

        StringBuilder sb = new StringBuilder();

        while (j >= 0 && i >= 0) {
            int digitA = a.charAt(i) == '1' ? 1 : 0;
            int digitB = b.charAt(j) == '1' ? 1 : 0;


          carry =  doSum(digitA,digitB,carry,sb);
            j--;
            i--;
        }


        while (j >= 0) {
            int digit = b.charAt(j)=='1'?1:0;
            j--;
           carry= doSum(digit,0,carry,sb);
        }
        while (i >= 0) {
            int digit = a.charAt(i)=='1'?1:0;
            i--;
           carry =  doSum(0,digit,carry,sb);
        }

        if (carry == 1)
            sb.append(1);


        return sb.reverse().toString();
    }


   static  int  doSum(int a , int b , int carry , StringBuilder sb )
    {

        int sum = carry + a + b;

        if (sum > 2) {
            sb.append(1);
            carry = 1;
        }
        else if (sum == 2) {
            sb.append(0);
            carry = 1;
        } else {
            sb.append(sum);
            carry=0;
        }


        return carry;
    }
}
