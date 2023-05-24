package Assignment1;
import java.util.Arrays;

public class Q9_smallest_missing {
	static int find(int arr[])
	{
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
				continue;
			if(arr[i]!=j)
				return j;
			j++;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {-3,6,3,4,0,2,-1,5};
		System.out.println(find(arr));
	}

}
