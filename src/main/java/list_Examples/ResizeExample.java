package list_Examples;

import java.util.ArrayList;

public class ResizeExample 
{
	 public static void main(String[] args)
     {
     // TODO Auto-generated method stub
     ArrayList<String> colours = new ArrayList<>();
     // Adding elements
     colours .add("Red");
     colours .add("Green");
     colours .add("Blue");
     System.out.println("Initial list: " + colours); // Output: [Red, Green, Blue]
     // Removing an element
     colours.remove("Green");
     System.out.println("After removal: " + colours); // Output: [Red, Blue]
     // Adding more elements
     colours.add("Yellow");
     colours.add("Orange");
     System.out.println("After adding more colours: " + colours); // Output: [Red, Blue, Yellow, Orange]
 }

}
