package exception_handling_example;

public class exception_get_handled_example {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("start of main method");
		int a = 20;
		int b = 0;
		
		try
		{
			int c = a/b;
			System.out.println(c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("exception handled");
			System.out.println("from catch block");

		}
		
		System.out.println("end of main method");
	}
}
