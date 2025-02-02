package pop_up_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Alert_Without_Using_SwitchTo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	      
	      //  ChromeDriver driver = new ChromeDriver();
	       
	        driver.manage().window().maximize();
	       
	        WebDriverWait my_wait =  new WebDriverWait(driver,Duration.ofSeconds(20)); // explicit wait
	       
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	      
	        Thread.sleep(5000);
	       
	        WebElement Click_for_JS_Confirm = driver.findElement(By.xpath("//button[text() ='Click for JS Confirm']"));
	      
	        Click_for_JS_Confirm.click();
	      
	        Thread.sleep(5000);
	        
	        Alert  my_alert = my_wait.until(ExpectedConditions.alertIsPresent()); // capturing alert
	       
	       System.out.println(my_alert.getText());
	       
	       my_alert.accept();
	       
	        Thread.sleep(5000);

	        driver.quit();
	}
}
