package staticMethodExample;

public class MathUtil 
{
	   // Static method to calculate the square of a number
	   public static int square(int number)
	   {
	       return number * number; // Returns the square of the number
	   }

		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			// Calling the static method using the class name
	         int result = MathUtil.square(5);
	        System.out.println("Square of 5: " + result); // Output: Square of 5: 25
		 }
}
