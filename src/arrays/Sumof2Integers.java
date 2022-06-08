package arrays;

public class Sumof2Integers {


    public static void main(String[] args) {
        System.out.println(getSum(-1000, 1000));
    }

    public static int getSum(int a, int b) {

        int res = 0;
        int mask = 1;

        int base = 1;
        int carry = 0;

        // approach
        //step 1 : obtain each bit of both digits
        //step 2 : xor them  (digA ^ digB ^ carry : this step is equivalent to
        // adding the bits with carry)
        //step 3: OR the prev res with res and multiply base by 2 in each iteration

        for(int i =0;i<32;i++)
        {

            int digA = a & mask;
            int digB = b & mask;

            //OR each res obtained
            res = res | (base) * (digA ^ digB ^ carry);

            if(digA==1 && digB==1)
                carry=1;
            else if(carry==1 && (digA==1 | digB==1))
                carry=1;
            else
                carry=0;


            base = base * 2;



            a = a>>1;
            b = b>>1;

        }

        return res;
    }


}
