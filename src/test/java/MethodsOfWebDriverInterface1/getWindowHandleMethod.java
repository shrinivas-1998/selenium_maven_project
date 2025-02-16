package MethodsOfWebDriverInterface1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandleMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		// Store the main window handle
        String ParentWindowHandle = driver.getWindowHandle();
        System.out.println("Main Window Handle: " + ParentWindowHandle);

        // Get all window handles 
       Set<String> allWindowHandles = driver.getWindowHandles();
       Iterator<String> iterator = allWindowHandles.iterator();
       
       while(iterator.hasNext())
       {
    	  String ChildWindowHandle = iterator.next();
    	  if(!ParentWindowHandle.equals(ChildWindowHandle))
    	  {
    		  driver.switchTo().window(ChildWindowHandle);
              System.out.println("Switched to window: " + driver.getTitle());

              // Perform actions in the child window
              // Example: Print the title of the child window
              System.out.println("Child Window Title: " + driver.getTitle());

              // Close the child window
              driver.close();
              System.out.println("Closed window: " + driver.getTitle());
    		  
    	  }
       }
       // Switch back to the main window
       driver.switchTo().window(ParentWindowHandle);
       System.out.println("Switched back to parent window: " + driver.getTitle());
       
       Thread.sleep(4000);
       driver.quit();
	}
}
