package POMByUsingPageFactoryPractice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FaceBookLoginTest 
{
   WebDriver driver;
   FaceBookLoginPage fbLoginPage;
   
   @BeforeTest
   public void setUp()
   {
	   driver = new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.facebook.com/login/");
	   
	   fbLoginPage = new FaceBookLoginPage(driver);  
   }
   
   @Test
   public void fbLoginTest()
   {
	   fbLoginPage.loginToFaceBook("sb123@gmail.com", "sd@12345");
   }
   
   @AfterTest
   public void tearDown() throws InterruptedException
   {
	   Thread.sleep(5000);
	   driver.quit();
   }
}
