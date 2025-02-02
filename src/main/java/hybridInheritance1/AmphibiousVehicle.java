package hybridInheritance1;

public class AmphibiousVehicle extends Vehicle implements CanFly, CanSwim
{
	 public void fly()
	    {
	       System.out.println("Amphibious vehicle is flying.");
	   }
	   public void swim()
	   {
	       System.out.println("Amphibious vehicle is swimming.");
	   }

}
