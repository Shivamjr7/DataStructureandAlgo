package bitmanipulation;

public class SingleNumbeII {


    public static void main(String[] args) {

        int [] arr = {-2,-2 , 3 , -2};

//        System.out.println(Integer.toBinaryString(-2));
        System.out.println(singleNumber(arr));

    }
    public static  int singleNumber(int[] nums) {


        int[] count = new int[32];

        int res = 0;
        int base = 1;


        for (int n : nums) {
            int nocount = 0;


            for(int j = 0;j<32;j++)
            {
                if(n==0)
                    break;
                if((n & 1)==1)
                    count[nocount]++;
                n = n>>1;
                nocount++;
            }


        }


        for (int i = 0; i < 32; i++) {
            if (count[i] %3 == 1)
                res = res + base;

            base = base * 2;
        }

        return res;
    }

}
