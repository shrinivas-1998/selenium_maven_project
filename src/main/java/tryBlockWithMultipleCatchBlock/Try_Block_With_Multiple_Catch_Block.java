package tryBlockWithMultipleCatchBlock;

public class Try_Block_With_Multiple_Catch_Block 
{ 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
        {
           // Code that may throw exceptions
           int result = 10 / 0; // This will throw ArithmeticException
           String str = null;
           System.out.println(str.length()); // This will throw NullPointerException
        }
		catch (ArithmeticException e)
		{
           System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        }
		catch (NullPointerException e)
		{
           System.out.println("Caught NullPoisnterException: String is null.");
        }
		catch (Exception e)
		{
           System.out.println("Caught a general exception: " + e.getMessage());
        }
		finally
		{
           System.out.println("This block always executes.");
       }
   }
}
