package finally_block_example;

public class exception_is_occured_and_not_handled 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			int a = 6/0;
			System.out.println(a);
		}
		finally 
		{
			System.out.println("finally block get executed");
		}
         System.out.println("normal flow continues");
	}
}
