package list_Examples;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample 
{
	 public static void main(String[] args)
     {
     // TODO Auto-generated method stub
     ArrayList<String> names = new ArrayList<>();
     names.add("John");
     names.add("Alice");
     names.add("Bob");
    
     // Sorting the ArrayList
     Collections.sort(names);
    // Display the sorted list
     System.out.println("Sorted names: " + names); // Output: Sorted names: [Alice, Bob, John]
   }

}
