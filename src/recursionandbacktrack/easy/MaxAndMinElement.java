package recursionandbacktrack.easy;

public class MaxAndMinElement {


    public static void main(String[] args) {
        int [] arr = {1,4,3,-5,-4,8,6};
        maxAndMin(arr,0);
        System.out.println(max +" " + min);
    }

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    static void maxAndMin(int [] arr , int index )
    {

        if(index==arr.length)
            return;

        if(arr[index] > max)
            max = arr[index];
        if(arr[index]<min)
            min = arr[index];

        maxAndMin(arr,index+1);

    }
}
