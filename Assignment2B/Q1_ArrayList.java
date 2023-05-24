package Assignment2B;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<>();
		a.add(2);
		a.add(5);
		while(!a.isEmpty())
		{
			for(Integer x : a)
			{
				System.out.println(x);
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number to check is present or not");
			int y =sc.nextInt();
			System.out.println(a.contains(y));

			System.out.println("Enter position of number ");
			int z =sc.nextInt();
			a.remove(a.get(z));
		}
		}

}
