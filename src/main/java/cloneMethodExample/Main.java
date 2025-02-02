package cloneMethodExample;

public class Main 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	             try
	            {
	            Person original = new Person("Alice", 30);
	            Person cloned = (Person) original.clone(); // Clone the original object
	            System.out.println("Original: " + original);
	            System.out.println("Cloned: " + cloned);


	            // Modifying cloned object
	            cloned.age = 35; // Change age of cloned object
	            System.out.println("After modifying cloned object:");
	            System.out.println("Original: " + original); // Original remains unchanged
	            System.out.println("Cloned: " + cloned);
	            }
		 catch (CloneNotSupportedException e)
		 {
	                     e.printStackTrace();
	               }
	}

}
