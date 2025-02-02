package set_examples;

import java.util.HashSet;

public class HashSetExample 
{
	 public static void main(String[] args)
     {
        // TODO Auto-generated method stub
        // Create a HashSet to store unique strings
        HashSet<String> fruits = new HashSet<>();
		
        // Adding elements to the HashSet
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Orange");
       fruits.add("Mango");
       fruits.add("Apple"); // Duplicate element (will not be added)
      
       // Displaying the elements in the HashSet
       System.out.println("Fruits in the HashSet: " + fruits);


      // Checking if an element exists
       if (fruits.contains("Banana"))
       {
           System.out.println("Banana is present in the set.");
       }
   
     // Removing an element
       fruits.remove("Orange");
       System.out.println("After removing Orange, fruits in the HashSet: " + fruits);
      
     // Iterating through the HashSet
       System.out.println("Iterating through the HashSet:");
       for (String fruit : fruits)
       {
           System.out.println(fruit);
	    }
	}

}
