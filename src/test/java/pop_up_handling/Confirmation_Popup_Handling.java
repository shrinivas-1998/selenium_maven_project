package pop_up_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Popup_Handling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		   WebDriver driver = new ChromeDriver();
	      
	      //  ChromeDriver driver = new ChromeDriver();
	       
	        driver.manage().window().maximize();
	       
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	       
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	      
	        Thread.sleep(5000);
	       
	       WebElement Click_for_JS_Confirm = driver.findElement(By.xpath("//button[text() ='Click for JS Confirm']"));
	      
	        Click_for_JS_Confirm.click();
	      
	        Thread.sleep(5000);
  
	        Alert a1 = driver.switchTo().alert();
	       
	       System.out.println(a1.getText());
	      
	       Thread.sleep(5000);
	       
	       a1.accept(); // closing alert by using  ok button
	           
	      //  a1.dismiss(); // closing alert by using cancel button
	       
	        Thread.sleep(5000);
            driver.quit();
	}
}
