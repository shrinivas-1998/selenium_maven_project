package constructorChainingCombinationExample;

public class Car extends Vehicle
{
	private String model;


	   // Constructor of the subclass with one parameter
	   public Car(String model)
	   {
	       this(model, "Default Brand"); // Calls the two-parameter constructor in Car
	   }


	   // Constructor of the subclass with two parameters
	   public Car(String model, String brand)
	   {
	       super(brand); // Calls the constructor of Vehicle
	       this.model = model;
	       System.out.println("Car constructor called: " + model);
	   }


	   public void displayDetails()
	   {
	       displayBrand(); // Calls method from Vehicle
	       System.out.println("Model: " + model);
	   }

}
