package JaggedArrayExample;

public class JaggedArray
{
	  public static void main(String[] args)
	     {
			// TODO Auto-generated method stub
			 // Declaration and initialization of a jagged array
	       int[][] jaggedArray =
	       {
	           {1, 2},              // First row has 2 elements
	           {3, 4, 5},          // Second row has 3 elements
	           {6, 7, 8, 9}        // Third row has 4 elements
	       };

	       // Accessing elements
	       System.out.println("Element at (2, 3): " + jaggedArray[2][3]); // Output: 9

	       // Looping through the jagged array
	       System.out.println("Jagged Array Elements:");
	       for (int i = 0; i < jaggedArray.length; i++)
	       { 
	         // Iterate over rows
	           for (int j = 0; j < jaggedArray[i].length; j++)
	           { 
	             // Iterate over columns
	               System.out.print(jaggedArray[i][j] + " ");
	           }
	           System.out.println(); // New line for the next row
	       }
	    }

}
