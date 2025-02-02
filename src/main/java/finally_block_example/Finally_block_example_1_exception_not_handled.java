package finally_block_example;

public class Finally_block_example_1_exception_not_handled 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 try
		 {
			 int a = 10/2;
			 System.out.println(a);
		 }
		 
		 catch(ArithmeticException e)
		 {
			 System.out.println(" exception is handled ");
		 }

		 finally
		 {
			 System.out.println("finally blocks gets executed");
		 }
		 
		 System.out.println("normal flow continues");	 
	}
}
