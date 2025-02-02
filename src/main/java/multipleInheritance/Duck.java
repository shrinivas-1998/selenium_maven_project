package multipleInheritance;

public class Duck implements CanFly, CanSwim
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
