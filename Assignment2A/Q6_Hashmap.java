package Assignment2A;
import java.util.HashMap;

public class Q6_Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> a= new HashMap<>();
		a.put("abc",1);
		a.put("xyz",2);
		for(String s : a.keySet())
		{
			System.out.print(s);
			System.out.println(a.get(s));
		}
	}

}
