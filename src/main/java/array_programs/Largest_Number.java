package array_programs;

public class Largest_Number 
{
	public static void main(String[] args)
	{
		// Declare and initialise the array
		int[] a = {7, 9, 11, 6, 8, 13, 19, 15, 4};
		int large = a[0];
		
		// Loop through the array to find the largest number
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > large)
			{
				large = a[i];
			}
		}
		
		// Print the largest number
		System.out.println("Largest number is: " + large);
	}

}
