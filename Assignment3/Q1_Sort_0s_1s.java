package Assignment3;

public class Q1_Sort_0s_1s {
	static void sort(int arr[])
	{
		int l =0;
		int h =arr.length-1;
		while(l<h)
		{
			while(arr[l]==0)
				l++;
			while(arr[h]==1)
				h--;
			arr[l]=0;
			arr[h]=1;
			l++;
			h--;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,0,0,1,0,0,1};
		sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}	
	}
}
