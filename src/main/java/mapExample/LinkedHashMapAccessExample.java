package mapExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAccessExample 
{
	 public static void main(String[] args)
     {
      // TODO Auto-generated method stub
		
       // Create a LinkedHashMap
       LinkedHashMap<String, Integer> fruitQuantities = new LinkedHashMap<>();
       // Adding key-value pairs
       fruitQuantities.put("Apple", 10);
       fruitQuantities.put("Banana", 20);
       fruitQuantities.put("Cherry", 15);
       fruitQuantities.put("Date", 5);


       // 1. Accessing a Value by Key
       Integer appleQuantity = fruitQuantities.get("Apple");
       System.out.println("Quantity of Apples: " + appleQuantity);


       // 2. Iterating Through All Keys
       System.out.println("Fruits in the LinkedHashMap:");
       for (String fruit : fruitQuantities.keySet())
       {
           System.out.println(fruit);
       }


       // 3. Iterating Through All Values
       System.out.println("Quantities of Fruits:");
       for (Integer quantity : fruitQuantities.values()) {
           System.out.println(quantity);
       }


       // 4. Iterating Through Key-Value Pairs
       System.out.println("Fruit Quantities (Key-Value Pairs):");
       for (Map.Entry<String, Integer> entry : fruitQuantities.entrySet())
       {
           System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
       }
       // 5. Checking if a Key Exists
       if (fruitQuantities.containsKey("Banana"))
       {
           System.out.println("Banana is available with quantity: " + fruitQuantities.get("Banana"));
       }


       // 6. Checking if a Value Exists
       if (fruitQuantities.containsValue(15))
       {
           System.out.println("There is a fruit with a quantity of 15.");
       }
   }

}
