package testNGFrameworkPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InstagramLoginTest extends BaseTest
{
	@Test()
   public void instaLoginTest() throws InterruptedException
   {
	  driver.get("https://www.instagram.com/");
	  driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("sb1234@gmail.com");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("sb@1234");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[text() = 'Log in']"));  
   }
}
