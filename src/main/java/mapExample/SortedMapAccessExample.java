package mapExample;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapAccessExample 
{
	 public static void main(String[] args)
     {
     // TODO Auto-generated method stub
		
     // Create a SortedMap using TreeMap
     SortedMap<String, Integer> sortedMap = new TreeMap<>();
     // Adding key-value pairs
     sortedMap.put("Banana", 5);
     sortedMap.put("Apple", 10);
     sortedMap.put("Cherry", 15);
     sortedMap.put("Date", 20);


     // 1. Accessing a Value by Key
     Integer appleQuantity = sortedMap.get("Apple");
     System.out.println("Quantity of Apples: " + appleQuantity);


     // 2. Iterating Through All Keys
     System.out.println("Fruits in the SortedMap:");
     for (String fruit : sortedMap.keySet()) 
     {
         System.out.println(fruit);
     }


     // 3. Iterating Through All Values
     System.out.println("Quantities of Fruits:");
     for (Integer quantity : sortedMap.values()) 
     {
         System.out.println(quantity);
     }




     // 4. Iterating Through Key-Value Pairs
     System.out.println("Fruit Quantities (Key-Value Pairs):");
     for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) 
     {
         System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
     }


     // 5. Accessing First and Last Keys
     System.out.println("First key: " + sortedMap.firstKey());
     System.out.println("Last key: " + sortedMap.lastKey());


     // 6. Getting a SubMap
     SortedMap<String, Integer> subMap = sortedMap.subMap("Apple", "Cherry");
     System.out.println("SubMap (Apple to Cherry): " + subMap);
     }

}
