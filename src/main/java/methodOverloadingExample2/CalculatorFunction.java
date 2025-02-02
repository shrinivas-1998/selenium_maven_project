package methodOverloadingExample2;

public class CalculatorFunction 
{
	public static void main(String[] args)
    {
    // TODO Auto-generated method stub
    Calculator calc = new Calculator();
   
    // Calling different add methods
    System.out.println("Sum of two integers: " + calc.add(5, 10));         // Output: 15
    System.out.println("Sum of three integers: " + calc.add(5, 10, 15));   // Output: 30
    System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));      // Output: 16.0
    }

}
