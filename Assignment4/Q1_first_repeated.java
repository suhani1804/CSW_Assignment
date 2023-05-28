package Assignment4;

public class Q1_first_repeated {
	static void find(int arr[]) {
		int m = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>m)
				m=arr[i];
		}
		int arr1[] = new int[m];
		int j=0;
		for(;j<arr.length;j++)
		{
			if(arr1[arr[j]]==0)
				arr1[arr[j]] = arr[j];
			else
				break;
		}
		System.out.println(arr[j]);
	}
	public static void main(String[] args) {
		int arr[] = {5,2,4,3,4,5,2,7};
		find(arr);
	}

}
