package abstraction_example_2;

public class Maruti extends Car
{
   @Override
   public void start()
   {
	   System.out.println("maruti started");
   }
   
   @Override
   public void shiftgears()
   {
	   System.out.println("gear shifted");
   }
   
   @Override
   public void stop()
   {
	   System.out.println("maruti stopped");
   }
   
}
