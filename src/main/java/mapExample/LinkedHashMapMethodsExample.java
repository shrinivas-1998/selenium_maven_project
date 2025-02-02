package mapExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMethodsExample 
{
	 public static void main(String[] args)
     {
     // TODO Auto-generated method stub
		
     // Create a LinkedHashMap
      LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();


      // Add key-value pairs
      linkedHashMap.put("A", 1);
      linkedHashMap.put("B", 2);
      linkedHashMap.put("C", 3);
      linkedHashMap.put("D", 4);


      // Display the LinkedHashMap
      System.out.println("LinkedHashMap: " + linkedHashMap);


      // Get a value by key
      Integer value = linkedHashMap.get("B");
      System.out.println("Value for key 'B': " + value);


      // Check if a key exists
      System.out.println("Contains key 'C': " + linkedHashMap.containsKey("C"));


      // Remove a key
      linkedHashMap.remove("D");
      System.out.println("After removing key 'D': " + linkedHashMap);


      // Get the size of the map
      System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());


      // Check if the map is empty
      System.out.println("Is LinkedHashMap empty? " + linkedHashMap.isEmpty());


      // Iterate through keys
      System.out.println("Keys in LinkedHashMap:");
      for (String key : linkedHashMap.keySet())
      {
          System.out.println(key);
      }


      // Iterate through values
      System.out.println("Values in LinkedHashMap:");
      for (Integer val : linkedHashMap.values())
      {
          System.out.println(val);
      }
      // Iterate through entries
      System.out.println("Entries in LinkedHashMap:");
      for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet())
      {
          System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
      }


      // Clear the map
      linkedHashMap.clear();
      System.out.println("After clearing: " + linkedHashMap);
      }

}
