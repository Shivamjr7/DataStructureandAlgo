package arrays;

import java.util.*;

public class ArrayListInJava {

    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>(10);
        List<Integer> integerList1 = new ArrayList<>(10);

        Integer [] arr = {1,2,3,5,7,8,9,2,5,6};
        List<Integer> integerList2 = new ArrayList<>(Arrays.asList(arr));
        // arraylist extends Abstract List which is used for unmodifiable list


        /**
         * methods
         */

        //list iterator
        ListIterator<Integer> listIterator = integerList2.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println("Next element :"+ listIterator.next() +" at index : "+listIterator.nextIndex());

            System.out.println("Has previous :"+listIterator.hasPrevious());
        }


        //for each
        integerList.forEach(System.out::println);

        System.out.println("size of arraylist : "+integerList1.size());

        //sort an arraylist
        integerList2.sort(Comparator.naturalOrder());


        System.out.println(integerList2);


        integerList.contains(1);
        integerList.isEmpty();
        integerList1.indexOf(1);


        /**
         * Test my custom arraylist
         */

        MyArrayList<Integer> myArrayList  = new MyArrayList<>();

        myArrayList.add(10);
        System.out.println("Custom arraylist size after adding element : "+ myArrayList.size());
        myArrayList.add(20);
        System.out.println("Custom arraylist size after adding element : "+ myArrayList.size());
        myArrayList.remove(1);
        System.out.println("Custom arraylist size after removing  element : "+ myArrayList.size());

        System.out.println("my arraylist : element "+ myArrayList.get(1));


        System.out.println("integer list 1  size : " + integerList.size());
        integerList.add(1);
        System.out.println("integer list 1  size : " + integerList.size());
        integerList.add(2);
        System.out.println("integer list 1  size : " + integerList.size());


        integerList.remove(1);
        System.out.println("integer list 1  size : " + integerList.size());

    }


}
