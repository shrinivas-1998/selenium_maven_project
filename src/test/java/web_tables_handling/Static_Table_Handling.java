package web_tables_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Table_Handling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
       WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(5000);
		
		// 1) find the number of rows in table 
		
		     int rows = driver.findElements(By.xpath("//table[@name ='BookTable']//tr")).size(); // for multiple tables 
		     
		   //  driver.findElements(By.tagName("tr")).size(); // for single table
		     
		     System.out.println("the number of rows in table : "+rows);
		     
	      // 2) Find the number of columns in table 
		     
		  int columns = driver.findElements(By.xpath("//table[@name ='BookTable']//th")).size();
		  System.out.println("the number of rows in table : "+columns);
		  //  driver.findElements(By.tagName("tr")).size(); // for single table
		  
		  
		  // 3) read data from specific row and specific column (example: 5th row and 1st column)
		  
	      WebElement bookname = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[5]//td[1]"));
	      System.out.println(bookname.getText()); //Master In Selenium
	       
	     /* String bookname1 = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[5]//td[1]")).getText();
	      System.out.println(bookname1); //Master In Selenium */
	      
	/*   // 3) read data from specific row and specific column (example: 7th row and 3st column)
	      
	      WebElement bookname7 = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[7]//td[3]"));
	      System.out.println(bookname7.getText()); //Javascript
	       
	      String bookname8 = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[7]//td[3]")).getText();
	      System.out.println(bookname8); //Javascript */
	      
	     // read data from all rows and columns
	       
	    //   System.out.println("BookName" +"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
	    /*   
	      for(int r=2; r<=rows; r++)
	      {
	    	  for(int c=1; c<=columns; c++)
	    	  {
	    		   // to insert variable name into xpath use (//tr["+r+"]//td["+c+"]") this syntax 
	    		   String value = driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td["+c+"]")).getText(); 
	    		 //  System.out.println(value); // give all in one column
	    		// to get value in tabular format // " \t" used to give some space in tab
	    		   System.out.print(value+" \t");  
	    	  }
	    	  System.out.println();
	      }
	     */
	      
	      /*
	      // print the bookname whose author is mukesh
	      
	      for(int r =2; r<=rows; r++)
	      {
	    	   String author_name= driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td[2]")).getText();
	    	   
	    	   if(author_name.equals("Mukesh"))
	    	   {
	    		   String  book_name =driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td[1]")).getText();
	    		   System.out.println(book_name+"\t"+author_name);
	    	   }
	      }
	      */
	      
	      // print the price of all books and make sum of the price 
	      
	      int total =0;
	      for(int r=2; r<=rows; r++)
	      {
	    	 String price = driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td[4]")).getText();
	    	 total = total+Integer.parseInt(price);
	    	 System.out.println(price); // for print all book price 
	      }
	      
	      System.out.println("Total price of books : "+ total); // for printing total price of books   
	      
	      Thread.sleep(5000);
	      driver.quit();
	}
}
