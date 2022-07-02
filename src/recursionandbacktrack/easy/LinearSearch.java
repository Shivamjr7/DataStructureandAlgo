package recursionandbacktrack.easy;

import java.util.ArrayList;

public class LinearSearch {


    public static void main(String[] args) {
        int [] arr = {1,4,6,12,3,90};
        System.out.println(search(arr,90));
        System.out.println(search(arr,190));


        //search when list is outside

        ArrayList<Integer> ans1 = search1(arr,12,0, new ArrayList<>());
        System.out.println(ans1);


        ArrayList<Integer> ans2 = search2(arr,12,0);
        System.out.println(ans2);


    }

    static boolean search(int [] arr , int target)
    {
        return helper(arr,target,0);
    }

    static boolean helper(int [] arr , int target ,int index)
    {
        if(index==arr.length)
            return false;

        return (target==arr[index]) || helper(arr,target,index+1);
    }




    static ArrayList<Integer> search1(int [] arr , int target , int index , ArrayList<Integer> list)
    {

        if(index == arr.length)
            return list;

        if(target == arr[index])
            list.add(index);

        return search1(arr, target,index+1, list);

    }


    static ArrayList<Integer> search2(int [] arr , int target , int index)
    {

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
            return list;

        if(target == arr[index])
            list.add(index);

        ArrayList<Integer> ansFromAboveStacks = search2(arr,target,index+1);

        list.addAll(ansFromAboveStacks);
        return list;

    }
}
