package finalizeMethodExample;

public class Resource 
{
	 public void open()
	 {
	   System.out.println("Resource opened.");
	 }


	 public void close()
	 {
	   System.out.println("Resource closed.");
	 }


	    @Override
	    protected void finalize() throws Throwable
	    {
	        try
	        {
	            close(); // Clean up resource
	            System.out.println("Finalize method called.");
	        }
	        finally
	        {
	            super.finalize(); // Call the superclass finalize method
	        }
	   }

}
