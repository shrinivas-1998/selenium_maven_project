package SortingSetExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertingHashSetToArrayList 
{
	public static void main(String[] args)
    {
       // TODO Auto-generated method stub
		
      // Step 1: Create a HashSet
     Set<Integer> hashSet = new HashSet<>();
     hashSet.add(5000);
     hashSet.add(3200);
     hashSet.add(800);
     hashSet.add(10);
    
     System.out.println("Hash Set : "+hashSet);
    
     // Step 2: Convert HashSet to ArrayList
     List<Integer> arrayList = new ArrayList<>(hashSet);
    
    // Step 3: Sort the ArrayList
     Collections.sort(arrayList);
    
     // Print the sorted ArrayList
     System.out.println("Sorted List: " + arrayList);
   }

}
