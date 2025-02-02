package set_examples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_2 {

    public static void main(String[] args) {
        // Create a HashSet of Integer objects
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(10);
        h1.add(20);
        h1.add(30);
        h1.add(40);
        h1.add(50);
        h1.add(10); // Duplicates are ignored in HashSet
        
        // Print the HashSet
        System.out.println(h1); // The order of elements is not guaranteed
        
        // Using Iterator to traverse the HashSet
        Iterator<Integer> i1 = h1.iterator(); // Obtain iterator from HashSet
        
        while (i1.hasNext()) 
        {
            System.out.println(i1.next()); // Print each element
        }
    }
}
