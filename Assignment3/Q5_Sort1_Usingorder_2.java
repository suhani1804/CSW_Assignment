package Assignment3;

import java.util.Arrays;

public class Q5_Sort1_Usingorder_2 {
	static void sort(int arr1[], int[] arr2)
	{
		int l=0;
		for(int i=0;i<arr2.length;i++)
		{	
			for(int j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr1[j])
				{
					int temp = arr1[l];
					arr1[l] = arr1[j];
					arr1[j] = temp;
					l++;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr1[] = {11,2,4,3,2,4,3,2,1};
		int arr2[] = {3,2,4,5};
		sort(arr1,arr2);
		System.out.println(Arrays.toString(arr1));
	}

}
