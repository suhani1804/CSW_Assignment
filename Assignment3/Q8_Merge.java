package Assignment3;
import java.util.Arrays;

public class Q8_Merge {
	static void sort(int arr1[], int[] arr2)
	{
		for(int i=arr2.length-1;i>=0;i--)
		{
			int j,l=arr1[arr1.length-1];
			for(j = arr1.length-2; j>=0 && arr1[j] > arr2[i];j--)
				arr1[j+1] = arr1[j];
			if(l>arr2[i])
			{
				arr1[j+1] = arr2[i];
				arr2[i] = l;
			}
		}
	}
	public static void main(String[] args) {
		int arr1[] = {1,5,9,10,15,20};
		int arr2[] = {2,3,8,13};
		sort(arr1,arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
