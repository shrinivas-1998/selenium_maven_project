package queueExamples;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListExample 
{
	public static void main(String[] args)
    {
    // TODO Auto-generated method stub
    // Create a LinkedList as a Deque
    Deque<String> linkedListDeque = new LinkedList<>();


    // Adding elements to the front and back
    linkedListDeque.addFirst("Xavier");
    linkedListDeque.addLast("Yasmine");
    linkedListDeque.addFirst("Zara");
    linkedListDeque.addLast("William");


    // Display the LinkedList Deque
    System.out.println("LinkedList Deque: " + linkedListDeque);
    // Remove and retrieve the first element
    String first = linkedListDeque.removeFirst();
    System.out.println("Removed first element: " + first);
    System.out.println("LinkedList Deque after removing first: " + linkedListDeque);
    // Remove and retrieve the last element
    String last = linkedListDeque.removeLast();
    System.out.println("Removed last element: " + last);
    System.out.println("LinkedList Deque after removing last: " + linkedListDeque);
	}

}
