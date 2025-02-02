package accessing_the_elements_of_an_arrylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_1 {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        // Create a ListIterator from the ArrayList
        ListIterator<Integer> l1 = a1.listIterator();

        // Move the iterator to the end
        while (l1.hasNext()) {
            l1.next();
        }

        // Print the iterator state and manipulate the list
        System.out.println(l1.hasPrevious());
        System.out.println(l1.previous());
        System.out.println(l1.previous());

        // Add a new element to the list
        a1.add(60); // Adding integer 60 instead of "Lila" for consistency
        System.out.println("After adding element:");
        System.out.println(a1);

        // Move the iterator to the end again
        while (l1.hasNext()) {
            l1.next();
        }

        // Remove elements using the iterator
        l1.previous(); // Move to the last element
        l1.remove(); // Remove the last element
        System.out.println("After removing the last element:");
        System.out.println(a1);

        l1.previous(); // Move to the previous element
        l1.remove(); // Remove this element
        System.out.println("After removing another element:");
        System.out.println(a1);
    }
}
