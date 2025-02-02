package classExample;

public class Car 
{
	 // Attributes (fields)
	   private String model;
	   private String colour;
	   private int year;


	   // Constructor
	   public Car(String model, String colour, int year)
	   {
	       this.model = model;
	       this.colour = colour;
	       this.year = year;
	   }


	   // Method to display car details
	   public void displayDetails()
	   {
	       System.out.println("Car Model: " + model);
	       System.out.println("Car Colour: " + colour);
	       System.out.println("Car Year: " + year);
	   }

}
