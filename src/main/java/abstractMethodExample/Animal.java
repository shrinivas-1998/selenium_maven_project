package abstractMethodExample;

public abstract class Animal 
{
	   //Abstract method
	   public abstract void sound();
	   // Concrete method
	   public void eat()
	   {
	       System.out.println("This animal eats food.");
	   }
}
