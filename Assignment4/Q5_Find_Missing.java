package Assignment4;

public class Q5_Find_Missing {
	static void find(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] != arr[i-1]+1)
			{
				System.out.println(arr[i]-1);
				break;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,8,9};
		find(arr);
	}

}
