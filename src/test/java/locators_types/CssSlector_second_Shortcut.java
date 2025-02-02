package locators_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSlector_second_Shortcut 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
        Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("email")).sendKeys("shrinivas1234@gamil.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("pass")).sendKeys("SHRINIVAS1234");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("button[class $ ='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
