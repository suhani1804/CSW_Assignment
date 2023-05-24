package Assignment2B;
import java.util.Stack;

public class Q3_decimal_to_binary_stack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		int a =8;
		int b=0;
		while(a>0)
		{
			b = a % 2;
			s.push(b);
			a = a/2;
		}
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}	
	}

}
