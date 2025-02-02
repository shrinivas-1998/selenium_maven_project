package queueExamples;

import java.util.PriorityQueue;

public class PriorityQueueMethodsExample 
{
	 public static void main(String[] args)
     {
      // TODO Auto-generated method stub	
       // Create a PriorityQueue
      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
      // Adding elements using add() and offer()
      priorityQueue.add(10);
      priorityQueue.offer(20);
      priorityQueue.add(5);
      priorityQueue.offer(15);


      // Display the PriorityQueue
      System.out.println("PriorityQueue after additions: " + priorityQueue);
      // Size of the queue
      System.out.println("Size of the PriorityQueue: " + priorityQueue.size());
      // Peek at the head element
      System.out.println("Head element (peek): " + priorityQueue.peek());
      // Remove the head element
      System.out.println("Removed element (remove): " + priorityQueue.remove());
      System.out.println("PriorityQueue after removal: " + priorityQueue);
      // Poll the head element
      System.out.println("Polled element (poll): " + priorityQueue.poll());
      System.out.println("PriorityQueue after polling: " + priorityQueue);
      // Check if the queue is empty
      System.out.println("Is the PriorityQueue empty? " + priorityQueue.isEmpty());
      // Clear the queue
      priorityQueue.clear();
      System.out.println("PriorityQueue after clear: " + priorityQueue);
      System.out.println("Is the PriorityQueue empty after clearing? " +    priorityQueue.isEmpty());
	}

}
