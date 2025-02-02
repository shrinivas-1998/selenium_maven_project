package abstractMethodExample;

public class Dog extends Animal
{
	// Providing implementation for the abstract method
	   @Override
	   public void sound()
	   {
	       System.out.println("The dog barks.");
	   }
}
