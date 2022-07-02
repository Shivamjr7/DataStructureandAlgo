package recursionandbacktrack.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTriangleFromArray {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        List<List<Integer>> res = new ArrayList<>();

        res.add(list);

        triangleSum(res, list);

        System.out.println(res);



        int [] arr = {1,2,3,4,5};
        triangleSum(arr);

    }

    static void triangleSum(List<List<Integer>> res, List<Integer> list) {

        List<Integer> list1 = new ArrayList<>();
        if (list.size() == 1) {
            return;
        }


        for (int i = 0; i <= list.size() - 2; i++) {
            list1.add(list.get(i) + list.get(i + 1));
        }

        res.add(list1);

        triangleSum(res, list1);

    }


    static void triangleSum(int [] arr)
    {

        if(arr.length ==0)
            return ;

        int temp[] = new int[arr.length-1];


        for(int i =0;i<arr.length-1;i++)
        {
            temp[i] = arr[i]+ arr[i+1];
        }


        System.out.println(Arrays.toString(arr));

        triangleSum(temp);

    }

}
