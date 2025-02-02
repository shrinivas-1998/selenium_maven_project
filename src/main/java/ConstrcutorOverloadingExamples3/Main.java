package ConstrcutorOverloadingExamples3;

public class Main 
{
	public static void main(String[] args)
	{
              // TODO Auto-generated method stub
             // Using the first constructor
             Book book1 = new Book("The Great Gatsby");
            book1.displayDetails();
      
            System.out.println();
            // Using the second constructor
            Book book2 = new Book("1984", "George Orwell");
            book2.displayDetails();
      
            System.out.println();


            // Using the third constructor
           Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 14.99);
            book3.displayDetails();
	}

}
