package Assignment1;

import java.util.Arrays;

public class Q11_Max_in_rotation {
	static int max_sum(int arr[])
	{
		int real_sum=0;
		for(int i=1;i<=arr.length;i++)
			{
				int sum=0;
				int last = arr[arr.length-1];
				for(int j=arr.length-1;j>0;j--)
				{
					arr[j] = arr[j-1];
				}
				arr[0]=last;
				for(int k=0;k<arr.length;k++)
				{
					sum += k*arr[k];
				}
				if(real_sum<sum)
				{
					real_sum = sum;
				}
			}		
		return real_sum;
	}
	public static void main(String[] args) {
		int arr[]= {8,3,1,2};
		System.out.println(max_sum(arr));
	}

}
