package Assignment1;

import java.util.Scanner;

public class Q1_Prime 
{
	static boolean check(int a)
	{
		boolean flag = false;
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i ==0)
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to check");
		int a = sc.nextInt();
		boolean x = check(a);
		if(x==false)
		{
			System.out.println("Is prime ");
		}
		else
		{
			System.out.println("Not prime ");
		}
		

	}

}
