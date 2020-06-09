package recursionandbacktrack;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		reverse(arr,arr.length-1);
		
		
		System.out.println(Arrays.toString(arr));
		
	}

	static void reverse(int[] arr , int index) {

		
		if(index <0)
			return;
		
		int ele = arr[arr.length-index-1];
		
		reverse(arr, index-1);
		
		arr[index] = ele;
		
		
	}

}
