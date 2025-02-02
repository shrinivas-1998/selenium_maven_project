package abstractionUsingAbstractClasses;

public abstract class Animal 
{
	// Abstract method (no body)
	   abstract void makeSound();


	   // Concrete method
	   void eat()
	   {
	       System.out.println("This animal eats food.");
	   }

}
