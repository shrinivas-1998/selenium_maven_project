package dropdown_Handling_Using_select_Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_Select_Methods_Example 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(5000);
		
	    WebElement select_dropdown = driver.findElement(By.xpath("//select[@id = 'country']"));
	    
	    Select s1 = new Select(select_dropdown);
	    
	    // selecting dropdown option 
	    
	   // s1.selectByIndex(0); // by using selectByIndex() method 
	    
	     s1.selectByValue("india"); // by using selectByValue() method 
	    
	  //  s1.selectByVisibleText("Brazil"); // by using selectByVisibleText() method 
		
		
	     // capture the options from dropdown 
	      List<WebElement> options = s1.getOptions();
	      System.out.println("numbers of in the dropdown : " + options.size());
	      
	     // printing the options
	      
	    /*  for(int i=0; i < options.size(); i++)
	      {
	    	  System.out.println(options.get(i).getText());
	    	  Thread.sleep(3000);   	  
	      } */
	      
	      // using enhanced for loop 
	      for(WebElement op:options)
	      {
	    	 System.out.println(op.getText());
	    	  Thread.sleep(3000);   	  
	      }
	      
			Thread.sleep(5000);

			driver.quit();
	}
}
