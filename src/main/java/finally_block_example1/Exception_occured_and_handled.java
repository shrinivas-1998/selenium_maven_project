package finally_block_example1;

public class Exception_occured_and_handled 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			int a = 8/0;
			System.out.println(a);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("exception is handled");
		}
		finally
		{
			System.out.println("finally blocks executed");
		}
		System.out.println("normal flow continues");
	}

}
