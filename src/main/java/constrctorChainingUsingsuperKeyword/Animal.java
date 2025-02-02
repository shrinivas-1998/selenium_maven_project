package constrctorChainingUsingsuperKeyword;

public class Animal 
{
	private String name;


	   // Constructor of the superclass
	   public Animal(String name)
	   {
	       this.name = name;
	       System.out.println("Animal constructor called: " + name);
	   }


	     public void display()
	     {
	       System.out.println("Animal name: " + name);
	    }

}
