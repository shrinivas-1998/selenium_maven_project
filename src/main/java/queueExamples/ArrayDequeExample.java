package queueExamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample 
{
	 public static void main(String[] args)
	  {
	    // TODO Auto-generated method stub
	   // Create an ArrayDeque
	       Deque<String> arrayDeque = new ArrayDeque<>();


	       // Adding elements to the front and back
	       arrayDeque.addFirst("Alice");
	       arrayDeque.addLast("Bob");
	       arrayDeque.addFirst("Charlie");
	       arrayDeque.addLast("Diana");


	       // Display the ArrayDeque
	       System.out.println("ArrayDeque: " + arrayDeque);


	       // Remove and retrieve the first element
	       String first = arrayDeque.removeFirst();
	       System.out.println("Removed first element: " + first);
	       System.out.println("ArrayDeque after removing first: " + arrayDeque);


	       // Remove and retrieve the last element
	       String last = arrayDeque.removeLast();
	       System.out.println("Removed last element: " + last);
	       System.out.println("ArrayDeque after removing last: " + arrayDeque);


	       // Peek at the first and last elements
	       System.out.println("First element (peek): " + arrayDeque.peekFirst());
	       System.out.println("Last element (peek): " + arrayDeque.peekLast());


	       // Check if the deque is empty
	       System.out.println("Is the ArrayDeque empty? " + arrayDeque.isEmpty());


	       // Clear the ArrayDeque
	       arrayDeque.clear();
	       System.out.println("ArrayDeque after clearing: " + arrayDeque);
	       System.out.println("Is the ArrayDeque empty after clearing? " + arrayDeque.isEmpty());
	    }

}
