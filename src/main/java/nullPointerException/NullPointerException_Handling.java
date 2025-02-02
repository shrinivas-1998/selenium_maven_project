package nullPointerException;

public class NullPointerException_Handling 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str = null; // str is initialised to null
		
		try
		{
			// attempting to call method on a null object
			System.out.println("Length of String : "+str.length() );
		}


		catch( NullPointerException e)
		{
			System.out.println("Error: Attempted to access a method on a null reference.");
		}


		finally
		{
			System.out.println("This block always executes");
		}
	}

}
