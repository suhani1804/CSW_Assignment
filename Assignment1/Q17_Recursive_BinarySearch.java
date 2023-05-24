package Assignment1;

public class Q17_Recursive_BinarySearch {
	static boolean binary(int[] arr, int l , int h, int key)
	{
		while(l<=h)
		{
			int mid = (l+h)/2;
			if(arr[mid]==key)
			{
				return true;
			}
			else if(arr[mid]>key)
				return binary(arr,l,mid-1,key);	
			else
				return binary(arr,mid+1,h,key);
		}	
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {4,8,34,87,90,389};
		int l=0;
		int h = arr.length;
		int key = 8;
		System.out.println(binary(arr,l,h,key));
	}
//	Time complexity:
//		Best case: O(1)
//		Average case: O(log n)
//		Worst case: O(log n)
}
