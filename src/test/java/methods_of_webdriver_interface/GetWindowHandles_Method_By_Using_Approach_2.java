package methods_of_webdriver_interface;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles_Method_By_Using_Approach_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stubWebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text() = 'OrangeHRM, Inc']")).click();
		
		// Approach1
		
		Set<String>  WindowIds =  driver.getWindowHandles();
		
	/*	List<String> WindWindowIdsowList= new ArrayList(WindowIds);
	    String parentId = WindowList.get(0);
	    String ChildID= WindowList.get(1);
	    
		Thread.sleep(5000);
        // switch to child window 
	    
	    driver.switchTo().window(ChildID);
	    
	    System.out.println(driver.getTitle()); 

	    Thread.sleep(5000);
	  
       // SWITCH TO PARENT WINDOW 
	    
	    driver.switchTo().window(parentId);
	    System.out.println(driver.getTitle()); */
	    
	    
	    // APPROACH 2
	    
	    for(String winid: WindowIds)
	    {
	    	  String title = driver.switchTo().window(winid).getTitle();
	    	  
	    	  if(title.equals("OrangeHRM"))
	    	  {
	    		  System.out.println(driver.getCurrentUrl());
	    	  }
	    }
	    
		Thread.sleep(5000);

	    driver.quit();
	}
}
