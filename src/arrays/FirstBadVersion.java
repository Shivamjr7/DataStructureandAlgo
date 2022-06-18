package arrays;

public class FirstBadVersion {

    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (!isBadVersion(mid - 1) && isBadVersion(mid)) {
                return mid;
            } else if (isBadVersion(mid - 1)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }


        }

        return start;
    }


    boolean isBadVersion(int n)
    {
        return true;
    }

}
