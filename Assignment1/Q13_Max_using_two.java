package Assignment1;

public class Q13_Max_using_two {
	
	static int max_sum(int arrA[], int arrB[])
	{
		int sum =0;
		int indexA=0;
		int indexB=0;
		for(int i=0;i<arrA.length;i++)
		{
			for(int j=0;j<arrB.length ;j++)
			{
				if(arrA[i] == arrB[j])
				{
					indexA=i;
					indexB=j;
				}
			}
		}
		for(int i=0;i<=indexA;i++)
		{
			sum += arrA[i];
			
		}
		for(int j=indexB+1;j<arrB.length;j++)
		{
			sum+= arrB[j];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr1[] = {2,3,6,7,10};
		int arr2[] = {4,6,7,12};
		if(arr1[0]>arr2[0])
		{
			System.out.println(max_sum(arr1,arr2));
		}
		else
		{
			System.out.println(max_sum(arr2,arr1));
		}
		
	}

}
