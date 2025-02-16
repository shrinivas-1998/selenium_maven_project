package testNGParallelExecution1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CricBuzzLoginTest 
{
	WebDriver driver;

	@Test()
	public void cbloginTest() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.cssSelector("span[class = 'cb-plus-ico cb-user-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("cb-user-email-input")).sendKeys("sb123@gmail.com");
		driver.quit();
	}
}
