package variableShadowing1;

public class Child extends Parent
{
	// Instance variable in the Child class (shadows the Parent's variable)
	   String name = "Child Name";


	   void showName() 
	{
	       System.out.println("Name from Child: " + name);
	      
	       // Accessing the superclass variable using super
	       System.out.println("Name from Parent using super: " + super.name);
	   }

}
