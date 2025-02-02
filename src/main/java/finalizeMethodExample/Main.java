package finalizeMethodExample;

public class Main 
{
	public static void main(String[] args)
    {
      // TODO Auto-generated method stub
      Resource resource = new Resource();
     resource.open();
    
     // Nullifying reference to make the object eligible for garbage collection
     resource = null;


     // Requesting garbage collection (not guaranteed to run immediately)
     System.gc();


     // Pause to allow the garbage collector to run
     try
     {
         Thread.sleep(1000); // Wait to see finalize in action
     }
     catch (InterruptedException e)
     {
         e.printStackTrace();
     }
  }

}
