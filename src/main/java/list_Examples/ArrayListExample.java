package list_Examples;

import java.util.ArrayList;

public class ArrayListExample 
{
	public static void main(String[] args)
    {
    // TODO Auto-generated method stub
    // Create an ArrayList to store integers
     ArrayList<Integer> numbers = new ArrayList<>();
     // Adding elements
     numbers.add(10);
     numbers.add(20);
     numbers.add(30);
     numbers.add(10); // Duplicates are allowed


     // Display the ArrayList
     System.out.println("Numbers: " + numbers); // Output: [10, 20, 30, 10]


     // Accessing elements
     int firstNumber = numbers.get(0);
     System.out.println("First number: " + firstNumber); // Output: 10


     // Removing an element
     numbers.remove(1); // Removes the element at index 1
     System.out.println("After removal: " + numbers); // Output: [10, 30, 10]


     // Checking size
     System.out.println("Size of the list: " + numbers.size()); // Output: 3
   }

}
