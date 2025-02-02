package cloneMethodDeepCopyExample;

public class Main 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
           try
           {
           Address address = new Address("New York");
           Person original = new Person("Alice", 30, address);
           Person cloned = (Person) original.clone(); // Clone the original object
           System.out.println("Original: " + original);
           System.out.println("Cloned: " + cloned);


           // Modifying the address of the cloned object
           cloned.address.city = "Los Angeles";
           System.out.println("After modifying cloned object:");
           System.out.println("Original: " + original); // Original reflects change if shallow copy
           System.out.println("Cloned: " + cloned);
       }
      catch (CloneNotSupportedException e)
      {
           e.printStackTrace();
       }
    }

}
