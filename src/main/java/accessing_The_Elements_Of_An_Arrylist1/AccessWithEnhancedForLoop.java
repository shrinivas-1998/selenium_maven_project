package accessing_The_Elements_Of_An_Arrylist1;

import java.util.ArrayList;

public class AccessWithEnhancedForLoop 
{
	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
		
       ArrayList<String> animals = new ArrayList<>();
       animals.add("Dog");
       animals.add("Cat");
       animals.add("Rabbit");
      
    // Accessing elements using an enhanced for loop
       System.out.println("Animals:");
      
       for (String animal:animals)
       {
       	System.out.println(animal);
       }
	}

}
