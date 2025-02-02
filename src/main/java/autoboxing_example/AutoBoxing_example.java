package autoboxing_example;

import java.util.ArrayList;

public class AutoBoxing_example 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 // Creating a collection that holds Integer objects
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// Autoboxing: adding primitive int values to the ArrayList
		numbers.add(10); // Automatically converts int to Integer
		numbers.add(20); // Automatically converts int to Integer
		numbers.add(30); // Automatically converts int to Integer
		
		// Displaying the values
		for(Integer number:numbers)
		{
			System.out.println("Number : "+ number);
		}
		
		// Autoboxing in method parameters
		 printSum(5, 15); // Here, int is autoboxed to Integer
	}
       public static void printSum(Integer a, Integer b)
       {
       	int sum = a+b; // Unboxing: converting Integer back to int
       	System.out.println("sum : "+ sum );
       }

}
