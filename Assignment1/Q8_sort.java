package Assignment1;

import java.util.Arrays;

public class Q8_sort {
	static void sort(int arr[])
	{
		for(int i=0;i<arr.length;)
		{
			if(arr[i]>=0 && arr[i]!=i)
			{
				int temp = arr[arr[i]];
				arr[arr[i]]= arr[i];
				arr[i] = temp;
			}
			else
			{
				i++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) 
	{
		int arr[] = {-1,5,-1,-1,4,3};
		sort(arr);
	}

}
