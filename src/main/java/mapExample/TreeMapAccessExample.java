package mapExample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapAccessExample 
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


    // 1. Accessing a Value by Key
    Integer appleQuantity = fruitQuantities.get("Apple");
    System.out.println("Quantity of Apples: " + appleQuantity);


    // 2. Iterating Through All Keys
    System.out.println("Fruits in the TreeMap:");
    for (String fruit : fruitQuantities.keySet())
    {
        System.out.println(fruit);
    }


    // 3. Iterating Through All Values
    System.out.println("Quantities of Fruits:");
    for (Integer quantity : fruitQuantities.values())
    {
        System.out.println(quantity);
    }


    // 4. Iterating Through Key-Value Pairs
    System.out.println("Fruit Quantities (Key-Value Pairs):");
    for (Map.Entry<String, Integer> entry : fruitQuantities.entrySet())
    {
        System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
    }


    // 5. Accessing First and Last Keys
    System.out.println("First key: " + fruitQuantities.firstKey());
    System.out.println("Last key: " + fruitQuantities.lastKey());
    // 6. Getting a SubMap


    Map<String, Integer> subMap = fruitQuantities.subMap("Apple", "Date");
    System.out.println("SubMap (Apple to Date): " + subMap);


    // 7. Navigating with Higher and Lower Keys
    System.out.println("Higher than 'Apple': " + fruitQuantities.higherKey("Apple"));
    System.out.println("Lower than 'Cherry': " + fruitQuantities.lowerKey("Cherry"));
	}

}
