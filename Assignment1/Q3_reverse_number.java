package Assignment1;

import java.util.Scanner;

public class Q3_reverse_number {
	static int i=0;
	static double reverse(int a)
	{
//		int b =0;
//		while(a!=0)
//		{
//			int r = a%10;
//			b = b*10 + r ;
//			a = a/10;
//		}
		if(a==0)
		{
			return 0;
		}
		else
		{
			return Math.pow(10,i)*a%10 + reverse(a/10);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		System.out.println("Reversed number "+reverse(a));
	}

}
