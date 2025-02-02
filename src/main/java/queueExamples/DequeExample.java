package queueExamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample 
{
	 public static void main(String[] args)
	   {
	      // TODO Auto-generated method stub
	      // Create a Deque using ArrayDeque
	       Deque<String> deque = new ArrayDeque<>();


	       // Adding elements to the deque
	       deque.addFirst("Alice");
	       deque.addLast("Bob");
	       deque.addFirst("Charlie");
	       deque.addLast("Diana");


	       // Display the deque
	       System.out.println("Deque: " + deque);


	       // Remove and retrieve the first element
	       String firstElement = deque.removeFirst();
	       System.out.println("Removed first element: " + firstElement);
	       System.out.println("Deque after removing first: " + deque);


	       // Remove and retrieve the last element
	       String lastElement = deque.removeLast();
	       System.out.println("Removed last element: " + lastElement);
	       System.out.println("Deque after removing last: " + deque);


	       // Peek at the first and last elements
	       String peekFirst = deque.peekFirst();
	       String peekLast = deque.peekLast();
	       System.out.println("First element (peek): " + peekFirst);
	       System.out.println("Last element (peek): " + peekLast);
	      
	       // Check if the deque is empty
	       System.out.println("Is the deque empty? " + deque.isEmpty());


	       // Clear the deque
	       deque.clear();
	       System.out.println("Deque after clearing: " + deque);
	       System.out.println("Is the deque empty after clearing? " + deque.isEmpty());
	      }

}
