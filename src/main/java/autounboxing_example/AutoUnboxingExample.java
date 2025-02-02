package autounboxing_example;

import java.util.ArrayList;

public class AutoUnboxingExample 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 // Creating a collection that holds Integer objects
       ArrayList<Integer> numbers = new ArrayList<>();
      
       // Autoboxing: adding primitive int values to the ArrayList
       numbers.add(10);  // Autoboxed from int to Integer
       numbers.add(20);  // Autoboxed from int to Integer
       numbers.add(30);  // Autoboxed from int to Integer
      
       for (Integer number : numbers)
       {
           // Auto unboxing occurs here
           int primitiveValue = number; // Automatically converts Integer to int
           System.out.println("Primitive Value: " + primitiveValue);
       }
     
       // Auto unboxing in method parameters
       printSum(numbers.get(0), numbers.get(1)); // Integer is auto unboxed to int
	}
	
	public static void printSum(int a, int b)
	{
		int sum = a + b ; // Directly works with int
		System.out.println("Sum: " + sum); // Output: Sum: 30
	}

}
