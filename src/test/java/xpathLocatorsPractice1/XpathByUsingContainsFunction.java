package xpathLocatorsPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingContainsFunction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		
		//driver.findElement(By.xpath("//a[contains(text(), 'Forgotten account?')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, '_97w4')]")).click();
		
		Thread.sleep(4000);
		driver.quit();
	}
}
