package arrays;

public class HowManySmallerThanCurrent {


    public int[] smallerNumbersThanCurrent(int[] nums) {


        int[] count = new int[101];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }


        int[] res = new int[nums.length];


        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == 0)
                res[j] = 0;
            else
                res[j] = count[nums[j] - 1];
        }

        return res;

    }


}
