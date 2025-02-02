package non_static_methods_examples;

public class Dog 
{
	// Instance variable
	   String name;
	   // Constructor
	   Dog(String name)
	   {
	       this.name = name;
	   }


	   // Non-static method
	   void bark()
	   {
	       System.out.println(name + " says Woof!");
	   }

}
