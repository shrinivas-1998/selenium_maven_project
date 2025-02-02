package defaultConstructor;

public class Person 
{
	// Instance variables
	   String name;
	   int age;


	   // Default constructor
	   Person()
	   {
	       name = "Unknown"; // Default name
	       age = 0;         // Default age
	   }


	   // Method to display person details
	   void displayDetails()
	   {
	       System.out.println("Name: " + name + ", Age: " + age);
	   }

}
