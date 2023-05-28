package Assignment3;

public class Q2_Sort_0s_1s_2s {
	static void sort(int arr[])
	{
		int l =0;
		int mid =0;
		int h =arr.length-1;
		int temp=0;
		while(mid<h)
		{
			if(arr[mid]==0)
			{
				temp = arr[l];
				arr[l]=arr[mid];
				arr[mid]=temp;
				l++;
				mid++;
			}
			else if(arr[mid]==2)
			{
				temp = arr[h];
				arr[h]=arr[mid];
				arr[mid]=temp;
				h--;
			}
			else
				mid++;
		}
	}
	public static void main(String[] args) {
		int arr[] = {0,1,2,1,2,1,1,0,0};
		sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}	
	}

}
