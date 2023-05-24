package Assignment1;

public class Q14_TowerOf_hanoi {
	static void TowerOfHanoi(int n, char A, char B, char C)
	{
		if(n==0)
			return ;
		TowerOfHanoi(n-1, A,C,B);
		System.out.println("Move disk "+n+" from rod "+A+" to "+B);
		TowerOfHanoi(n-1,C,B,A);
	}
	public static void main(String[] args) {
		int n =3;
		TowerOfHanoi(n,'A','B','C');
	}

}
