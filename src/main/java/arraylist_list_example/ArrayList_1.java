package arraylist_list_example;

import java.util.ArrayList; // Import the ArrayList class from java.util package

public class ArrayList_1 {

    public static void main(String[] args) {
        // Create an ArrayList to store elements of different types
        ArrayList<Object> a1 = new ArrayList<>(); // Using Object to store different types
        a1.add(10);
        a1.add(true);
        a1.add('d');
        a1.add(3.24f);
        a1.add("RAHU");
        a1.add(10); // Duplicates are allowed

        // Print the ArrayList
        System.out.println(a1);
    }
}
