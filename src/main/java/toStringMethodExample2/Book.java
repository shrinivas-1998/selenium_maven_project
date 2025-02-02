package toStringMethodExample2;

public class Book 
{
	 String name;
	   int noOfPages;


	   Book(String name, int noOfPages)
	   {
	       this.name = name;
	       this.noOfPages = noOfPages;
	   }


	   //  @Override
	   public String toString()
	   {
	       return "Name: " + name + ", Pages: " + noOfPages;
	   }


	   public static void main(String[] args)
	   {
	       // TODO Auto-generated method stub
	      
	       Book b1 = new Book("Java", 500);
	       Book b2 = new Book("Python", 400);
	       System.out.println(b1);
	       System.out.println(b2);
	   }

}
