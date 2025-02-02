package WaysOfAccessingTheElementsOfLinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetEnhancedForLoopExample 
{
	public static void main(String[] args)
	{
	         // TODO Auto-generated method stub
                      LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
	        linkedHashSet.add("Apple");
	        linkedHashSet.add("Banana");
	        linkedHashSet.add("Cherry");


	        // Using Enhanced For Loop
	        System.out.println("Using Enhanced For Loop:");
	        for (String fruit : linkedHashSet)
	        {
	            System.out.println(fruit);
	        }
	}

}
