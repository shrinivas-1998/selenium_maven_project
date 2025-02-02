package hashcodeMethodExample;

public class Book 
{
	String book_name;
	   int book_id;
	  
	   Book(String book_name, int book_id)
	   {
	   	this.book_name = book_name;
	   	this.book_id = book_id;
	   }
	  
	   @Override
	   public boolean equals(Object o)
	   {
	   	Book temp = (Book)o;
	   	if(this.book_name == temp.book_name && this.book_id == temp.book_id)
	   	{
	   		return true;
	   	}
	   	
	   	else
	   	{
	   		return false;
	   	}
	   }
	  


	   @Override
	   public int hashCode()
	   {
	   	return book_id ;
	   }
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			Book b1 = new Book("java", 500);
			Book b2 = new Book("java", 500);
			System.out.println(b1.equals(b2));
			System.out.println(b1.hashCode());
			System.out.println(b2.hashCode());
		}

}
