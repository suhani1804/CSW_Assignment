package Assignment1;

public class Q4_binary_search {
	static void binary(int[] arr, int l , int h, int key)
	{
		while(l<=h)
		{
			int mid = (l+h)/2;
			if(arr[mid]==key)
			{
				System.out.println("Index is at "+mid);
				break;
			}
			else if(arr[mid]>key)
				h=mid-1;	
			else
				l=mid+1;
		}	
	}
	public static void main(String[] args) 
	{
		int arr[] = {4,8,34,87,90,389};
		int l=0;
		int h = arr.length;
		int key = 8;
		binary(arr,l,h,key);
	}

}
