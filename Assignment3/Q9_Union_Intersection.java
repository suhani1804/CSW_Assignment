package Assignment3;
import java.util.Arrays;

public class Q9_Union_Intersection {
	static void intersection(int arr1[], int arr2[])
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int a = arr1.length, b=arr2.length;
		int i=0,j=0;
		System.out.println("Union is ");
		while(i<a && j<b)
		{
			if(arr1[i]<arr2[j])
			{
				System.out.print(arr1[i]);
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				System.out.println(arr2[j]);
				j++;
			}
			else
			{
				System.out.println("intersection =>"+ " is equal to "+arr1[i]);
				i++;j++;
			}
		}
		while(i<a)
		{
			System.out.print(arr1[i]);
			i++;
		}
		while(j<b)
		{
			System.out.print(arr2[j]);
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int arr1[] = {2,4,6};
		intersection(arr,arr1);
	}

}
