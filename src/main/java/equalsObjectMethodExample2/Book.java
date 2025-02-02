package equalsObjectMethodExample2;

public class Book 
{
	  String name;
	   
	    Book ( String name)
	    {
	   	 this.name = name;
	    }
	   
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
			Book b1 = new Book("java");
			Book b2 = new Book("java");
			System.out.println(b1.name);
			System.out.println(b2.name);
			System.out.println(b1 == b2);
			System.out.println(b1.equals(b2));
		}

}
