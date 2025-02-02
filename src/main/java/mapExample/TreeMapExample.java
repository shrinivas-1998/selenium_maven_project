package mapExample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample 
{
	 public static void main(String[] args)
     {
       // TODO Auto-generated method stub
      // Create a TreeMap
      TreeMap<String, Integer> fruitQuantities = new TreeMap<>();
      // Adding key-value pairs
      fruitQuantities.put("Banana", 5);
      fruitQuantities.put("Apple", 10);
      fruitQuantities.put("Cherry", 15);
      fruitQuantities.put("Date", 20);


      // Display the TreeMap
      System.out.println("TreeMap: " + fruitQuantities);


      // Accessing a value by key
      Integer appleQuantity = fruitQuantities.get("Apple");
      System.out.println("Quantity of Apples: " + appleQuantity);


      // Accessing the first and last keys
      System.out.println("First key: " + fruitQuantities.firstKey());
      System.out.println("Last key: " + fruitQuantities.lastKey());


      // Removing a key-value pair
      fruitQuantities.remove("Banana");
      System.out.println("After removing Banana: " + fruitQuantities);


      // Getting a subMap
      Map<String, Integer> subMap = fruitQuantities.subMap("Apple", "Date");
      System.out.println("SubMap (Apple to Date): " + subMap);
      }

}
