package Assignment1;

public class Q5_Rotate_Array {
	static void rotate(int arr[], int k)
	{
//Time complexity = n and Space complexity = n		
		
		int arr1[] = new int [arr.length];
		for(int i =0;i<k;i++)
		{
			arr1[i] = arr[arr.length-k+i];
		}
		int j=0;
		for(int i = k;i<arr.length;i++)
		{
			arr1[i] = arr[j];
			j++;
		}
		for(int x=0;x<arr1.length;x++)
		{
			System.out.print(arr1[x]);
		}
		
		
//Time complexity = n2 and Space complexity = 1		
//		for(int i=1;i<=k;i++)
//		{
//			int last = arr[arr.length-1];
//			for(int j=arr.length-1;j>0;j--)
//			{
//				arr[j] = arr[j-1];
//			}
//			arr[0]=last;
//		}
//		for(int x=0;x<arr.length;x++)
//			{
//				System.out.println(arr[x]);
//			}
	}
	public static void main(String [] args)
	{
		int arr[] = {1,2,3,4,5,6,7};
		int k=2;
		rotate(arr,k);
	}
}
