package throwable_example;

public class Throwable_Class_Example 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		try
		{
			throw new Exception("This is an example exception");
		}


                         catch(Throwable t)  // Catching the superclass Throwable
		{
       	              System.out.println("caught throwable : " + t.getMessage());
       	
       	          t.printStackTrace();      // Print the stack trace
		}
	}

}
