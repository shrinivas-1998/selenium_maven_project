package constructor_chaining_example_by_using_this_call_statement;

public class Person 
{
	Person()
	{
		System.out.println("no argumnet constrctor");
	}
	
	Person(int a)
	{
		this();
		System.out.println(a);
	}
	
	Person(String s1)
	{
		this(10);
		System.out.println(s1);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("main starts");
		Person p1 = new Person("hello");
		System.out.println("main ends");
	}
}
