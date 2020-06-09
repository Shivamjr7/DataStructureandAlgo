package recursionandbacktrack;

public class ArraySum {

	public static void main(String[] args) {
		
		
		
		int []arr ={15, 12, 13, 10};

		
		System.out.println(arrSum(arr,0,0));
	}

	
	static int arrSum(int [] arr , int sum , int index)
	{
		if(index ==arr.length-1)
			return arr[index];
		
		sum += arrSum(arr, sum , index+1);
		
		
		return sum +arr[index];
	}
}
