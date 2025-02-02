package methodOverloading3;

public class Main 
{
	public static void main(String[] args)
	{
	      // TODO Auto-generated method stub


                   AreaCalculator calculator = new AreaCalculator();


	        // Calculate area of a rectangle
	        double rectangleArea = calculator.calculateArea(5.0, 3.0);
	        System.out.println("Area of Rectangle: " + rectangleArea);


	        // Calculate area of a square
	        double squareArea = calculator.calculateArea(4.0);
	        System.out.println("Area of Square: " + squareArea);


	        // Calculate area of a circle
	        double circleArea = calculator.calculateArea(3.0, true);
	        System.out.println("Area of Circle: " + circleArea);
	}

}
