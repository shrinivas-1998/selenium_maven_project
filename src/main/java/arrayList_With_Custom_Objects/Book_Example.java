package arrayList_With_Custom_Objects;

import java.util.ArrayList;

public class Book_Example 
{
	 public static void main(String[] args)
     {
        // TODO Auto-generated method stub
		
       // Create an ArrayList to store Book objects
       ArrayList<Book> books = new ArrayList<>();
     
      // Adding Book objects to the ArrayList
      books.add(new Book ("Effective Java", "Joshua Bloch"));
      books.add(new Book ("Clean Code", "Robert C. Martin"));
     
   // Display the list of books
      System.out.println("Books in the list: " + books);
    // Output: Books in the list: [Effective Java by Joshua Bloch, Clean Code by Robert C. Martin]
 }

}
