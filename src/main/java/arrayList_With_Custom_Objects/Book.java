package arrayList_With_Custom_Objects;

public class Book 
{
	String title;
    String author ;
   
    Book(String title, String author )
    {
   	 this.title = title;
   	 this.author = author;
    }
   
    @Override
    public String toString()
    {
   	 return title + " by " + author;
    }

}
