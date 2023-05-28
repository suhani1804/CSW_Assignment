package Assignment3;
import java.util.Arrays;

public class Q4_Sortby_Given_Value {
	static void sort(int arr[],int key)
	{
		int l=0;
		int h =arr.length-1;
		while(l<h)
		{
			if(arr[l]>key)
			{
				int temp =arr[l];
				arr[l]=arr[h];
				arr[h]=temp;
				h--;
			}
			else if(arr[l]<key)
			{
				l++;
			}
		}
		
	}
	public static void main(String[] args) {
		int arr [] = {2,4,7,33,53,7,3};
		int key=8;
		sort(arr,key);
		System.out.println(Arrays.toString(arr));
		
	}

}
