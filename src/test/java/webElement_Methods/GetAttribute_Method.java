package webElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(5000);
		
		WebElement attribute_value =driver.findElement(By.xpath("//a[@class ='nav-link']"));
		System.out.println(attribute_value.getAttribute("class"));
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
