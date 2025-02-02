package parameterizedcConstructorExample;

public class BookInfo 
{
	public static void main(String[] args)
	{
          // TODO Auto-generated method stub
          // Creating objects of Book using the parameterized constructor
          Book book1 = new Book("1984", "George Orwell");
          Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
      
           // Displaying book details
            book1.displayInfo();
           book2.displayInfo();
	}

}
