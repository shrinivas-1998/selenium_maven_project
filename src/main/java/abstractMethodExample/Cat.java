package abstractMethodExample;

public class Cat extends Animal
{
	// Providing implementation for the abstract method
	   @Override
	   public void sound()
	   {
	       System.out.println("The cat meows.");
	   }
}
