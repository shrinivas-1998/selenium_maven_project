package exception_handling_example;

public class exception_object_propagation_example 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			test();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("exception handled from calling method");
		}
	}
	
	public static void test()
	{
		int a = 10/0;
	}
}
