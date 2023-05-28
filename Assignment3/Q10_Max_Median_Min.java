package Assignment3;

public class Q10_Max_Median_Min {
	static void max(int arr[])
	{
		int x = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>x)
			{
				x=arr[i];
			}
		}
		System.out.println(x);
	}
	static void min(int arr[])
	{
		int x = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<x)
			{
				x=arr[i];
			}
		}
		System.out.println(x);
	}
	static void median(int arr[])
	{
		double x = 0;
		for(int i=0;i<arr.length;i++)
		{
			x+=arr[i];
		}
		System.out.println(x/arr.length);
	}

	public static void main(String[] args) {
		int arr[] = {2,5,8,2,6,8,0,4,7};
		max(arr);
		min(arr);
		median(arr);
	}

}
