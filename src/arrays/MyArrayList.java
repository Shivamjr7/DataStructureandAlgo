package arrays;

import java.util.Arrays;

/**
 *  List may grow from zero to infinite size (at least theoretically).
 *  List will be initialized with minimum 10 elements at the time of creation.
 *  List will provide methods for fetching, adding, removing and printing the list at any state in its lifecycle.
 */
public class MyArrayList<E> {


    // size of the array list
    private int size =0;

    // to store the data
    Object [] data ;

    public static final int DEFAULT_CAP=10;

    MyArrayList()
    {
        data = new Object[DEFAULT_CAP];
    }

    //add the element
    void add(E e)
    {
        if(size== data.length)
        {
            ensureCapacity();
        }

        data[size++] = e;

    }

    boolean isEmpty(){
        return this.size==0;
    }

    int size()
    {
        return this.size;
    }

    E get(int index)
    {
        if(index <0 || index > data.length)
        {
            throw new IndexOutOfBoundsException("Index : "+ index + " size : "+ data.length);
        }

        return (E) data[index];
    }
    void ensureCapacity()
    {

        int newSize = data.length * 2;
        Arrays.copyOf(data, newSize);
    }

    void clear()
    {
        for(int i =0;i< data.length;i++)
        {
            data[i] = null;
        }
    }


    void remove(int index)
    {
        if(index <0 || index > data.length)
        {
            throw new IndexOutOfBoundsException("Index : "+ index + " size : "+ data.length);
        }

        for(int i = index; i< this.size;i++)
        {
            data[i] = data[i+1];
        }
        this.size--;
    }


}
