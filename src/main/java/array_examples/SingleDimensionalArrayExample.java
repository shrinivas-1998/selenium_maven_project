package array_examples;

public class SingleDimensionalArrayExample 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// declare and initialise an array of integers
		
		int[] numbers = {10, 20, 30, 40, 50};
		
		// accessing and printing array elements using for loop
		
		for(int i =0; i<numbers.length; i++)
		{
			System.out.println("Element at index " + i + ":" + numbers[i]);
		}
	}

}
