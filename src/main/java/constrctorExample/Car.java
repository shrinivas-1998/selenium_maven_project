package constrctorExample;

public class Car 
{
	 // Instance variables
	   String make;
	   String model;
	   int year;

	   // Default constructor
	   Car()
	   {
	       make= "Unknown";
	       model= "Unknown";
	       year= 0;
	   }

	   // Parameterized constructor
	   Car(String make, String model, int year)
	   {
	       this.make = make;
	       this.model = model;
	       this.year = year;
	   }

	   // Method to display car details
	   void displayDetails()
	   {
	       System.out.println("Make: " + make+ ", Model: " + model+ ", Year: " + year);
	   }

}
