package instanceofExample3;

public class Main 
{
	 public static void main(String[] args)
	 {
	        Animal myAnimal = new Dog(); // Upcasting
	        // Using instanceof to check the type of myAnimal
	        if (myAnimal instanceof Dog)
	        {
	            System.out.println("myAnimal is an instance of Dog");
	            ((Dog) myAnimal).sound(); // Safe to downcast to Dog
	        }


	        if (myAnimal instanceof Cat)
	        {
	            System.out.println("myAnimal is an instance of Cat");
	        }
	        else
	        {
	            System.out.println("myAnimal is not an instance of Cat");
	        }




	        // Example with a null reference
	        Animal anotherAnimal = null;
	        if (anotherAnimal instanceof Animal)
	        {
	            System.out.println("This won't print because anotherAnimal is null.");
	        }
	        else
	        {
	            System.out.println("anotherAnimal is null.");
	        }
	    }

}
