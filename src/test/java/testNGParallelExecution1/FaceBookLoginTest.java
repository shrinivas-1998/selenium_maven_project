package testNGParallelExecution1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookLoginTest 
{
	WebDriver driver;

	@Test()
	public void FBLoginTest() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.cssSelector("#email")).sendKeys("sb12345@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("sb@12321234");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[name = 'login']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
