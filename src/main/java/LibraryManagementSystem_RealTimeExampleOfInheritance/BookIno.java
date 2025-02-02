package LibraryManagementSystem_RealTimeExampleOfInheritance;

public class BookIno 
{
	public static void main(String[] args)
    {
     // TODO Auto-generated method stub
    Textbook textbook = new Textbook();
    textbook.title = "Java Programming";
    textbook.author = "John Doe";
    textbook.ISBN = "123456789";
    textbook.subject = "Computer Science";
   
    textbook.getDetails();
    System.out.println("Subject: " + textbook.subject);
   
    Novel novel = new Novel();
    novel.title = "Mystery of the Missing Book";
    novel.author = "Jane Smith";
    novel.ISBN = "987654321";
    novel.genre = "Mystery";
   
    novel.getDetails();
    System.out.println("Genre: " + novel.genre);
	}

}
