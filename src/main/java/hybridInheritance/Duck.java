package hybridInheritance;

public class Duck extends Animal implements CanFly, CanSwim
{
	public void fly()
	  {
	     System.out.println("Duck is flying.");
	  }
	   
	    public void swim()
	    {
	        System.out.println("Duck is swimming.");
	    }

}
