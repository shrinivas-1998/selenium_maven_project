package mapExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample 
{
	 public static void main(String[] args)
     {
      // TODO Auto-generated method stub
     // Create a LinkedHashMap
     LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();


     // Adding key-value pairs
     linkedHashMap.put("A", 1);
     linkedHashMap.put("B", 2);
     linkedHashMap.put("C", 3);
     linkedHashMap.put("D", 4);
     linkedHashMap.put("E", 5);


     // Display the LinkedHashMap
     System.out.println("LinkedHashMap: " + linkedHashMap);


     // Accessing a value by key
     Integer value = linkedHashMap.get("C");
     System.out.println("Value for key 'C': " + value);


     // Checking if a key exists
     boolean hasKey = linkedHashMap.containsKey("B");
     System.out.println("Contains key 'B': " + hasKey);


     // Removing an entry
     linkedHashMap.remove("D");
     System.out.println("After removing key 'D': " + linkedHashMap);


     // Iterating through the LinkedHashMap
     System.out.println("Iterating through LinkedHashMap:");
     for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet())
     {
         System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
     }


     // Size of the map
     System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());


     // Clear the map
     linkedHashMap.clear();
     System.out.println("After clearing, size: " + linkedHashMap.size());
    }

}
