package WaysOfAccessingTheElementsOfLinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetForEachExample 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
                     LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
	        linkedHashSet.add("Apple");
	        linkedHashSet.add("Banana");
	        linkedHashSet.add("Cherry");


	        // Using forEach Method
	        System.out.println("Using forEach Method:");
	        linkedHashSet.forEach(System.out::println);
	}

}
