package Assignment1;

public class Q15_GCD {
	static int gcd(int a , int b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		System.out.println(gcd(12,24));
	}
	
//	Time complexity: O(log(min(a,b))
}
