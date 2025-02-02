package constrctorChainingUsingsuperKeyword;

public class Dog extends Animal
{
	private String breed;
	   // Constructor of the subclass


	   public Dog(String name, String breed)
	   {
	       super(name); // Calling the constructor of Animal
	       this.breed = breed;
	       System.out.println("Dog constructor called: " + breed);
	   }
	   public void displayDetails()
	   {
	       display(); // Calling superclass method
	       System.out.println("Dog breed: " + breed);
	   }

}
