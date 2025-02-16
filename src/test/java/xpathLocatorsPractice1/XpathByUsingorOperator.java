package xpathLocatorsPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingorOperator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		
		//driver.findElement(By.xpath("//input[@name = 'email' and @id = 'email']")).sendKeys("testuser@example.com");
		WebElement userName =driver.findElement(By.xpath("//input[@name = 'email' and @id = 'email']"));
		userName.sendKeys("testuser@example.com");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@name = 'pass' and @id = 'pass']")).sendKeys("testuser@example");
		WebElement password =driver.findElement(By.xpath("//input[@name = 'pass' and @id = 'pass']"));
		password.sendKeys("testuser@example");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[@name = 'login' or @type = 'submit']")).click();
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name = 'login' or @type = 'submit']"));
		loginBtn.click();
		
		Thread.sleep(4000);
		driver.quit();
	}
}
