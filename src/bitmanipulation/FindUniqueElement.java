package bitmanipulation;

public class FindUniqueElement {


    public static void main(String[] args) {

        int[] arr = {3, 1, 12, 3, 12, 1, 3, 1, 2, 2, 2, 5, 12};
        System.out.println("Unique element : " + findUnique(arr));
    }

    public static int findUnique(int[] arr) {

        int[] count = new int[32];


        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            int n = arr[i];

            while (n > 0) {
                if ((n & 1) == 1) {
                    count[32 - counter - 1]++;
                }

                n = n >> 1;
                counter++;
            }
        }


        int res = 0;
        for (int i = 31; i >= 0; i--) {

            if (count[i] % 3 == 1) {
                res = (int) (res + Math.pow(2, 31 - i));
            }
        }
        return res;
    }
}
