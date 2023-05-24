package Assignment2A;
import java.util.LinkedHashSet;

public class Q5_Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<Double> a= new LinkedHashSet<>();
		a.add(3.6);
		a.add(2.5);
		for(Double s : a)
		{
			System.out.println(s);
		}
	}

}
