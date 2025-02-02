package stringClassExample3;

public class Example3 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String name1 = new String("ram");
		String name2 = new String("ram");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name1 == name2 );
		System.out.println(name1.equals(name2));
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
	}

}
