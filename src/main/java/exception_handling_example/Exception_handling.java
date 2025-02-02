package exception_handling_example;

public class Exception_handling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		
		try
		{
			System.out.println(a/b);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("denominator should not be zero");
			System.out.println(e.getMessage());
		}
	}
}
