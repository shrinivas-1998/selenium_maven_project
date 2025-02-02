package exception_handling_example;

public class Exception_not_get_handled {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		
		try
		{
			System.out.println(a/b);
		}
		
		catch (NullPointerException  e)
		{
			System.out.println("exception not get handled ");
			System.out.println("execution stop abruptly");

		}
	}
}
