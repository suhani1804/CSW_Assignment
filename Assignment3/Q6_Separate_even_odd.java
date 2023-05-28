package Assignment3;

public class Q6_Separate_even_odd {
	static void separate(int arr[])
	{
		int l =0;
		int r =arr.length-1;
		while(l<=r)
		{
			while(arr[l]%2 == 0)
				l++;
			while(arr[r]%2 != 0)
				r--;
			if(l<r)
			{
			int temp=arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,3,5,8,3,2,8,6,9};
		separate(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
