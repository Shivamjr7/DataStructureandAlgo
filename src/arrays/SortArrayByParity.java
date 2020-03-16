package arrays;

import java.util.Arrays;

public class SortArrayByParity {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2, 4 };
		
		SortArrayByParity obj = new SortArrayByParity();
		System.out.println(Arrays.toString(obj.sortArrayByParity(arr)));
		
	}

	public int[] sortArrayByParity(int[] A) {

		
		int j =0;
		
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]%2==0)
			{
				swap(A,i,j);
				j++;
			}
		}
		
		return A;
	}
	
	void swap(int []arr , int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
