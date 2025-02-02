package mapExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapAccessExample 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// Create a HashMap
       Map<String, Integer> studentScores = new HashMap<>();
       // Adding key-value pairs to the HashMap
       studentScores.put("Alice", 90);
       studentScores.put("Bob", 85);
       studentScores.put("Charlie", 95);
       studentScores.put("Diana", 80);
       // 1. Accessing a Value by Key
       Integer scoreOfAlice = studentScores.get("Alice");
       System.out.println("Alice's Score: " + scoreOfAlice);
       // 2. Iterating Through All Keys
       System.out.println("Student Names:");
       for (String student : studentScores.keySet())
       {
           System.out.println(student);
       }
       // 3. Iterating Through All Values
       System.out.println("Student Scores:");
       for (Integer score : studentScores.values())
       {
           System.out.println(score);
       }
       // 4. Iterating Through Key-Value Pairs
       System.out.println("Student Scores (Key-Value Pairs):");
       for (Map.Entry<String, Integer> entry : studentScores.entrySet())
       {
           System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
       }
       // 5. Checking if a Key Exists
       if (studentScores.containsKey("Bob"))
       {
           System.out.println("Bob's Score: " + studentScores.get("Bob"));
       }
       // 6. Checking if a Value Exists
       if (studentScores.containsValue(95))
       {
           System.out.println("There is a student with a score of 95.");
	}
 }

}
