package testNGFrameworkPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CricBuzzLoginTest extends BaseTest 
{
	@Test()
	public void cbloginTest() throws InterruptedException 
	{
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.cssSelector("span[class = 'cb-plus-ico cb-user-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("cb-user-email-input")).sendKeys("sb123@gmail.com");
	}
}
