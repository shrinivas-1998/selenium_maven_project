package ConstrcutorOverloadingExamples3;

public class Book 
{
	 private String title;
	   private String author;
	   private double price;


	   // Constructor with one parameter
	   public Book(String title)
	   {
	       this.title = title;
	       this.author = "Unknown";
	       this.price = 0.0;
	   }


	   // Constructor with two parameters
	   public Book(String title, String author)
	   {
	       this.title = title;
	       this.author = author;
	       this.price = 0.0;
	   }


	   // Constructor with three parameters
	   public Book(String title, String author, double price)
	   {
	       this.title = title;
	       this.author = author;
	       this.price = price;
	   }


	   // Method to display book details
	   public void displayDetails()
	   {
	       System.out.println("Title: " + title);
	       System.out.println("Author: " + author);
	       System.out.println("Price: $" + price);
	   }

}
