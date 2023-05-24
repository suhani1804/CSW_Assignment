package Assignment2A;
import java.util.Scanner;
import java.util.TreeSet;

public class Q1_Treeset {
	public static void main(String[] args) {
		TreeSet<Integer> a = new TreeSet<>();
		a.add(5);
		a.add(4);
		a.add(3);
		for(Integer num: a)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int x =sc.nextInt();
		System.out.println(a.contains(x));
		
		a.remove(4);
	}

}
