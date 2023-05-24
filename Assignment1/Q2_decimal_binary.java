package Assignment1;

import java.util.Scanner;

public class Q2_decimal_binary 
{
	static int conversion(int a)
	{
		if(a==0)
		{
			return 0;
		}
		else
		{
			return (a %2 + 10 * conversion(a/2));
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the decimal number ");
		int a = sc.nextInt();
		
		System.out.println("The binary number is "+conversion(a));
	}

}
