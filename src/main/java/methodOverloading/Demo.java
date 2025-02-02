package methodOverloading;

public class Demo 
{
	public static int add(int a, int b)
	{
		System.out.println(a+b);
		return (a+b);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(add(5.1,3.2));
	}


	public static  double add (double a, double b)
	{
		return a+b;
	}

}
