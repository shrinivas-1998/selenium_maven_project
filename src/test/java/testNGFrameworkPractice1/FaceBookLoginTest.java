package testNGFrameworkPractice1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FaceBookLoginTest extends BaseTest
{ 
	 @Test()
     public void FBLoginTest() throws InterruptedException
     {
    	 driver.get("https://www.facebook.com/login/");
    	 driver.findElement(By.cssSelector("#email")).sendKeys("sb12345@gmail.com");
    	 Thread.sleep(3000);
    	 driver.findElement(By.cssSelector("#pass")).sendKeys("sb@12321234");
    	 Thread.sleep(3000);
    	 driver.findElement(By.cssSelector("button[name = 'login']")).click(); 
    	 Thread.sleep(3000);
     }
}
