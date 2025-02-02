package list_Examples;

import java.util.ArrayList;

public class ArrayList1
{
	 public static void main(String[] args) 
	 {
	        // Create an ArrayList to store elements of different types
	        ArrayList<Object> a1 = new ArrayList<>(); // Using Object to store different types
	        a1.add(10);
	        a1.add(true);
	        a1.add('d');
	        a1.add(3.24f);
	        a1.add("RAHUL");
	        a1.add(10); // Duplicates are allowed
	        // Print the ArrayList
	        System.out.println(a1);
	    }

}
