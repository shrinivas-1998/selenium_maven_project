package keyboard_Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action_website_Openthelinkinnewtab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://demo.nopcommerce.com/");
        
        Thread.sleep(5000);
        
         WebElement  registration_link = driver.findElement(By.xpath("//a[text() ='Register']"));
    
        Actions action = new Actions(driver);
       
         // Control + clicking on regeistration link
       
        action.keyDown(Keys.CONTROL).click(registration_link).keyUp(Keys.CONTROL).build().perform();
       
        Thread.sleep(5000);

         // switching to registration page 
         Set<String>   ids = driver.getWindowHandles(); 
           //  List<String> ids = new ArrayList(driver.getWindowHandles());
           // converting Set<String> into List<String> to access to the webelement index
         List<String> ids1 = new ArrayList(driver.getWindowHandles());
             
          // registration 
            
          driver.switchTo().window(ids1.get(1));
          driver.findElement(By.xpath("//input[@id = 'FirstName']")).sendKeys("niraj khatri");
      
          Thread.sleep(5000);

          // switching to home page again and searching anything in search text field
          driver.switchTo().window(ids1.get(0));
          driver.findElement(By.xpath("//input[@id = 'small-searchterms']")).sendKeys("tshirts");
          
          Thread.sleep(5000);
          driver.quit();
	}
}
