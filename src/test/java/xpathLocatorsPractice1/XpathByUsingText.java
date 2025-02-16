package xpathLocatorsPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		
		//driver.findElement(By.xpath("//a[text() = 'Sign up for Facebook']")).click();
		driver.findElement(By.xpath("//a[. = 'Sign up for Facebook']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
