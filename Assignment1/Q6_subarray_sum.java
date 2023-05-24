package Assignment1;

public class Q6_subarray_sum {
	static int maxsum(int arr[])
	{
		int real_sum= Integer.MIN_VALUE ;
		int now_sum = 0;
		int start=0,end=0,j=0;
		for(int i=0;i<arr.length;i++)
		{
			now_sum = now_sum +arr[i];
			if(now_sum > real_sum)
			{
				real_sum = now_sum;
				start =j;
				end = i;
			}
			if(now_sum < 0)
			{
				now_sum = 0;
				j++;
			}
		}
		System.out.println("starts at "+start + "ends at "+end);
		return real_sum;
	}
	public static void main(String[] args) {
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(maxsum(arr));
	}

}
