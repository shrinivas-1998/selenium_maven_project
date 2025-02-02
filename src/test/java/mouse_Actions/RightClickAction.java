package mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
		
	       driver.manage().window().maximize();
				
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		   
		    driver.get("https://www.selenium.dev/downloads/");
		   
		    Thread.sleep(5000);
		   
		    WebElement target = driver.findElement(By.xpath("//span[text() ='Downloads']"));
		  
		    Actions action = new Actions(driver);
		   
		    Thread.sleep(5000);
		   
		    action.contextClick(target).perform();
		   
		    Thread.sleep(5000);
		   
		    driver.quit();
	}
}
