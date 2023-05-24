package Assignment2B;
import java.util.LinkedList;
import java.util.Scanner;

class student 
{
	String name;
	int age;
	int mark;
	student(String s, int a, int m)
	{
		this.name=s;
		this.age=a;
		this.mark=m;
	}
	public String toString()
	{
		return this.name+" "+ this.age+" "+this.mark;
	}
	public boolean equals(student o)
	{
		if(o == this)
		{
			return true;
		}
		return name.compareTo(o.name)==0 && Integer.compare(mark, o.mark)==0 && Integer.compare(age, o.age)==0;
	}
}
public class Q2_Student_LinkedList {

	public static void main(String[] args) {
		LinkedList<student> a = new LinkedList<>();
		student b = new student("xyz",12,88);
		student c = new student("abc",13,76);
		a.add(b);
		a.add(c);
		for(student s: a)
		{
			System.out.println(s.toString());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a object to check is present or not");
		String name =sc.next();
		int age = sc.nextInt();
		int mark = sc.nextInt();
		student s = new student(name,age,mark);
		for(student e : a)
		{
			if(e.equals(s))
			{
				System.out.println("true");
				break;
			}
			System.out.println("false");
		}
		
		a.remove(b);
		System.out.println(a.toString());
		
		int count = a.size();
		System.out.println(count);
	}

}

