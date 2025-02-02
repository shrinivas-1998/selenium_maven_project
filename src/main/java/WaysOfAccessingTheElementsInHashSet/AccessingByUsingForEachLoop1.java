package WaysOfAccessingTheElementsInHashSet;

import java.util.HashSet;

public class AccessingByUsingForEachLoop1 
{
	 public static void main(String[] args)
     {
       // TODO Auto-generated method stub
		
       HashSet<String> fruits = new HashSet<>();
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Mango");
      
    // Using enhanced for loop to access elements
       for (String fruit : fruits)
       {
           System.out.println(fruit);
       }
   }

}
