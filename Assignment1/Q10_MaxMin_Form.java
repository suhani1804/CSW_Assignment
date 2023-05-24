package Assignment1;

import java.util.Arrays;

public class Q10_MaxMin_Form {
	static void form(int arr[])
	{
		int arr1[] = new int[arr.length];
		int j = arr.length-1;
		int k=0;
		while(j>k)
		{
			for(int i=0;i<arr1.length;i++)
			{
				arr1[i]=arr[j];
				j--;i++;
				if(i<arr1.length)
				{
					arr1[i] = arr[k];
					k++;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		form(arr);
	}

}
