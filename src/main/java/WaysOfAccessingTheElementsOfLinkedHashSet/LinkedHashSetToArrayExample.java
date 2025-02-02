package WaysOfAccessingTheElementsOfLinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetToArrayExample 
{
	public static void main(String[] args)
	{
	        // TODO Auto-generated method stub
                     LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
	        linkedHashSet.add("Apple");
	        linkedHashSet.add("Banana");
	        linkedHashSet.add("Cherry");


	        // Convert to Array
	        String[] array = linkedHashSet.toArray(new String[0]);
	        System.out.println("First element: " + array[0]); // Access the first element
	}

}
