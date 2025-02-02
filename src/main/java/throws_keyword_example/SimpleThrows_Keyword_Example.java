package throws_keyword_example;

public class SimpleThrows_Keyword_Example 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
           // Calling the divide method
           int result = divide(10, 0); // This will throw an exception
           System.out.println("Result: " + result);
       }
		catch (ArithmeticException e)
		{
           System.out.println("Caught Exception: " + e.getMessage());
       }
   }
   // Method that declares it can throw an ArithmeticException
   public static int divide(int a, int b) throws ArithmeticException
   {
       return a / b; // This may throw ArithmeticException if b is zero
   }

}
