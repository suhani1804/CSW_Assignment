package Assignment2A;
import java.util.TreeMap;

class Address
{
	int plot;
	String at;
	String post;
	Address(int p, String a, String po)
	{
		this.at=a;
		this.plot=p;
		this.post=po;
	}
}
public class Q2_Address {

	public static void main(String[] args) {
		TreeMap<String,Address> b = new TreeMap<>();
		Address a = new Address(23,"kabir","har");
		b.put("Suhani", a);
		b.put("Suhi", a);
		for(String name: b.keySet())
		{
			Address ad = b.get(name);
			System.out.println(name + "  "+ad.plot+ "  "+ ad.post);
		}
	}

}
