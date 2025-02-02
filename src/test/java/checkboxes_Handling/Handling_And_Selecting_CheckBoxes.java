package checkboxes_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_And_Selecting_CheckBoxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(5000);
		
		List<WebElement> Check_Boxes = driver.findElements(By.xpath("//input[@class ='form-check-input' and (@type = 'checkbox')]"));
		
		
		// by using for loop
        /* for (int i=0; i<Check_Boxes.size(); i++)
         {
        	 Check_Boxes.get(i).click();
        	 Thread.sleep(3000);
         }
         
         // by using for each loop */
         
         for (WebElement checbox :Check_Boxes)
         {
        	 checbox.click();
        	 Thread.sleep(3000);
         }  
         
 		Thread.sleep(5000);
 		
 		driver.quit();     
	}
}
