package mapExample;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample 
{
	public static void main(String[] args)
    {
    // TODO Auto-generated method stub
		
    // Create a HashMap
    Map<String, Integer> ageMap = new HashMap<>();
   
    // Adding key-value pairs to the map
     ageMap.put("Alice", 30);
     ageMap.put("Bob", 25);
     ageMap.put("Charlie", 35);
     ageMap.put("Diana", 28);
     ageMap.put("rutvik", 25);
    
     // Display the map
     System.out.println("Age Map: " + ageMap);
    
     // Retrieve a value using a key
     Integer ageOfBob = ageMap.get("Bob");
     System.out.println("Age of Bob: " + ageOfBob);
    
     // Check if a key exists
     if (ageMap.containsKey("Charlie"))
     {
         System.out.println("Charlie is in the map.");
     }
    
    // Remove a key-value pair
     ageMap.remove("Diana");
     System.out.println("Age Map after removing Diana: " + ageMap);
    
    // Display all keys
     System.out.println("Keys in the map: " + ageMap.keySet());
    
    // Display all values
     System.out.println("Values in the map: " + ageMap.values());
    // Display all entries
     System.out.println("Entries in the map: " + ageMap.entrySet());     
	}

}
