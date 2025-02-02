package abstractMethodExample;

public class AbstractMethodExample 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		  // Animal dog = new Dog();
         // Animal cat = new Cat();
		
		   Dog dog = new Dog();
		   Cat cat = new Cat();
	     // Calling the implemented abstract method
	     dog.sound(); // Output: The dog barks.
	     cat.sound(); // Output: The cat meows.
	     // Calling the concrete method
	     dog.eat(); // Output: This animal eats food.
	     cat.eat(); // Output: This animal eats food.
	}
}
