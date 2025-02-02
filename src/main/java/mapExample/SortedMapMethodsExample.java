package mapExample;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMethodsExample 
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


      // Display the SortedMap
      System.out.println("SortedMap: " + sortedMap);


      // Accessing first and last keys
      System.out.println("First key: " + sortedMap.firstKey());
      System.out.println("Last key: " + sortedMap.lastKey());


      // Getting a subMap
      SortedMap<String, Integer> subMap = sortedMap.subMap("Apple", "Cherry");
      System.out.println("SubMap (Apple to Cherry): " + subMap);


      // Getting a headMap
      SortedMap<String, Integer> headMap = sortedMap.headMap("Cherry");
      System.out.println("HeadMap (up to Cherry): " + headMap);


      // Getting a tailMap
      SortedMap<String, Integer> tailMap = sortedMap.tailMap("Banana");
      System.out.println("TailMap (from Banana): " + tailMap);


      // Checking if a key exists
      System.out.println("Contains 'Apple'? " + sortedMap.containsKey("Apple"));


      // Checking if a value exists
      System.out.println("Contains value 15? " + sortedMap.containsValue(15));
  }

}
