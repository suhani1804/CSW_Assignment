package Assignment1;
import java.util.Arrays;
public class Q7_Waveform {
	static void swap(int arr[], int a , int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	static void wave(int arr[])
	{
		for(int i=1;i<arr.length;i+=2)
		{
				if(arr[i]>arr[i+1])
				{
					swap(arr,i,i+1);
				}
				if(arr[i]>arr[i-1])
				{
					swap(arr,i,i-1);
				}
		}
		System.out.print(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[] = {2,4,8,3,1,9,4};
		wave(arr);
		
	}
	

}
