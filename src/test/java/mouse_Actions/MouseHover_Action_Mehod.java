package mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Action_Mehod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
		
	       driver.manage().window().maximize();
				
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		   
		    driver.get("https://www.bluestone.com/");
		   
		    Thread.sleep(5000);
		   
		    driver.findElement(By.xpath("//span[@id ='denyBtn']")).click();
		   
		    Thread.sleep(5000);
		   
		    WebElement target = driver.findElement(By.xpath("//a[@title ='Watch Jewellery']"));
		  
		    Actions act = new Actions(driver);
		   
			act.moveToElement(target).build().perform();
			
			//act.moveToElement(target).perform();
			  
		    Thread.sleep(5000);
		   
		    driver.findElement(By.xpath("//a[text() ='Band']")).click();
		   
		    Thread.sleep(5000);
		   
		    driver.quit();
	}
}
