package Assignment2A;
import java.util.HashSet;
import java.util.Scanner;

public class Q7_No_duplicate {
	public static void main(String[] args)
	{
		HashSet<Integer> a = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items ");
		int x = sc.nextInt();
		for(int i=1;i<=x;i++)
		{
			System.out.println("Enter the numbers");
			//int y = sc.nextInt();
			a.add(sc.nextInt());
		}
		System.out.println(a);
	}
}
