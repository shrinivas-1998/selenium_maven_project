package nonStaticVariables;

public class Car 
{
	// Non-static variable
	   private String model;


	   // Constructor to initialize the non-static variable
	   public Car(String model)
	   {
	       this.model = model;
	   }


	   // Method to display the model of the car
	   public void displayModel()
	   {
	       System.out.println("Car model: " + model);
	   }

}
