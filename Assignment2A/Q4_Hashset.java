package Assignment2A;
import java.util.HashSet;

public class Q4_Hashset {

	public static void main(String[] args) {
		HashSet<String> a= new HashSet<>();
		a.add("abc");
		a.add("xyz");
		for(String s : a)
		{
			System.out.println(s);
		}
	}

}
