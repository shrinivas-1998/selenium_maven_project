package parameterizedcConstructorExample;

public class Book 
{ 
	// Attributes
	   private String title;
	   private String author;
	  
	   // Parameterized Constructor
	   public Book(String title, String author)
	   {
	       this.title = title;
	       this.author = author;
	   }
	  
	   // Method to display book details
	   public void displayInfo()
	   {
	       System.out.println("Title: " + title);
	       System.out.println("Author: " + author);
	   }

}
