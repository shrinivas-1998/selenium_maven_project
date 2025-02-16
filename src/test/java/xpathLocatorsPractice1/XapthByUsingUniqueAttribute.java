package xpathLocatorsPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XapthByUsingUniqueAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		
		WebElement EmailAddress =driver.findElement(By.xpath("//input[@placeholder = 'Email address or phone number']"));
		EmailAddress.sendKeys("shrinivas@gmail.com");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
