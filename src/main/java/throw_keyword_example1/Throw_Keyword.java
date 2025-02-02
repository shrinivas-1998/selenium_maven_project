package throw_keyword_example1;

public class Throw_Keyword 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
           validateAge(15); // This will throw an exception
       }
		catch (IllegalArgumentException e)
		{
           System.out.println("Caught Exception: " + e.getMessage());
       }
   }

   // Method to validate age
   public static void validateAge(int age)
   {
       if (age < 18)
       {
           // Throwing an IllegalArgumentException if age is less than 18
           throw new IllegalArgumentException("Age must be 18 or older.");
       }
       else
       {
           System.out.println("Age is valid: " + age);
       }
	}

}
