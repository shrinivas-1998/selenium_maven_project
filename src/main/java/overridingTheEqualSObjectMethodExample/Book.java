package overridingTheEqualSObjectMethodExample;

public class Book 
{
	String name;
	   int no_of_pages;
	  
	   Book(String name, int no_of_pages)
	   {
	   	this.name = name;
	   	this.no_of_pages = no_of_pages;
	   }
	  
	   @Override
	   public boolean equals(Object o)  // b2 will be stored in o  (up   casting)
	   {
	   	Book temp = (Book)o; // down casting to access child states
	   	
	   	if(this.name ==temp.name && this.no_of_pages == temp.no_of_pages)
	   	{
	   		return true;
	   	}
	   	
	   	else
	   	{
	   		return false;
	   	}
	   }
	  
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
			Book b1 = new Book("java", 400);
			Book b2 = new Book("java", 400);
			System.out.println(b1==b2);
			System.out.println(b1.equals(b2));
		}

}
