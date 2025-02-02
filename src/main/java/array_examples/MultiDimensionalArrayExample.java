package array_examples;

public class MultiDimensionalArrayExample 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int [][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
				
		                   };
//Accessing elements
System.out.println("Element at (1, 2): " + matrix[1][2]); // Output: 6


// Looping through the 2D array
System.out.println("Matrix Elements:");
for (int i = 0; i < matrix.length; i++) // Rows
 {
   for (int j = 0; j < matrix[i].length; j++)  // Columns
      {
               System.out.print(matrix[i][j] + " ");
      }
           System.out.println();
       }
   }

}
