package constructorChainingCombinationExample;

public class Main 
{
	public static void main(String[] args)
	{
             // TODO Auto-generated method stub
		
            // Using the one-parameter constructor
             Car car1 = new Car("Sedan");
            car1.displayDetails();
            System.out.println();


           // Using the two-parameter constructor
           Car car2 = new Car("SUV", "Toyota");
           car2.displayDetails();
         }

}
