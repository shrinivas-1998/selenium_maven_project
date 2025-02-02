package webElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(5000);
		
	    WebElement login_Button = driver.findElement(By.xpath("//div[text() ='Log in']"));
	    
		Thread.sleep(5000);
  
	   // login_Button.click();
	    boolean check = login_Button.isEnabled();
	    
	    System.out.println(check);
	    System.out.println(login_Button.isEnabled());
		
		Thread.sleep(5000);

		driver.quit();	
	}
}
