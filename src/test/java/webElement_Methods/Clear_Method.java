package webElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
        WebElement username_textfield =	driver.findElement(By.xpath("//input[@placeholder ='Email address or phone number']"));
        username_textfield.sendKeys("shrinivas56@gamil.com");
      
        Thread.sleep(5000);
       
        WebElement password_textfield = driver.findElement(By.xpath("//input[@placeholder ='Password']"));
        password_textfield.sendKeys("bakchod insaan");
       
		Thread.sleep(5000);
		
		password_textfield.clear();
		
		Thread.sleep(5000);

		username_textfield.clear();
		
		Thread.sleep(5000);

		driver.quit();	
	}
}
