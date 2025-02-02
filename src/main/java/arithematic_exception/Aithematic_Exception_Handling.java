package arithematic_exception;

public class Aithematic_Exception_Handling 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int numerator = 10;
		int denominator = 0;
		
		try
		{
			int result = numerator / denominator; // Attempting division by zero
			System.out.println("Result : " +result );	
		}
		catch(ArithmeticException  e)
		{
			System.out.println("Error : can not divide by zero.");
		}


		finally
		{
			System.out.println("Finally this block will  gets executed");
		}
	}

}
