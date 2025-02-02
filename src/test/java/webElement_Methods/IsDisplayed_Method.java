package webElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(5000);
		
		WebElement download =driver.findElement(By.xpath("//a[@class ='nav-link']"));
		
		Thread.sleep(5000);
	
		boolean check = download.isDisplayed();
		
		System.out.println(check);
		
		Thread.sleep(5000);
		
		driver.quit();	
	}
}
