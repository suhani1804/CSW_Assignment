package Assignment4;

public class Q2_Duplicate {
	static void duplicate(int arr[])
	{
		int m = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>m)
				m=arr[i];
		}
		int arr1[] = new int[m+1];
		int j=0;
		for(;j<arr.length;j++)
		{
			if(arr1[arr[j]]==0)
				arr1[arr[j]] = arr[j];
			else
				System.out.println(arr1[arr[j]]);
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,4,8,3,2,8,4,3};
		duplicate(arr);
	}

}
