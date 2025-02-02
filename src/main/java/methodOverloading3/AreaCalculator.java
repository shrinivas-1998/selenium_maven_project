package methodOverloading3;

public class AreaCalculator 
{
	 // Method to calculate the area of a rectangle
	   public double calculateArea(double length, double width)
	   {
	       return length * width;
	   }


	   // Method to calculate the area of a square
	   public double calculateArea(double side)
	   {
	       return side * side;
	   }


	   // Method to calculate the area of a circle
	   public double calculateArea(double radius, boolean isCircle)
	   {
	       return Math.PI * radius * radius;
	   }

}
