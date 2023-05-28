package Assignment3;
import java.util.ArrayList;

public class Q7_Reduction {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(2);a.add(5);a.add(2);
		a.add(6);a.add(9);a.add(3);
		a.add(6);a.add(1);a.add(4);
		
		while(!a.isEmpty())
		{
			int min = Integer.MAX_VALUE;
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i)<min)
				{
					min = a.get(i);
				}
			}
			System.out.println("min = "+min);
			for(int i=0;i<a.size();i++)
			{
//				System.out.print(a.get(i) +" - "+ min + " = ");
				a.set(i, a.get(i)-min);
//				System.out.println(a.get(i));
				if(a.get(i)<=0)
				{
					a.remove(a.get(i));
				}
				
			}
			System.out.println(a);
		}
	}

}
