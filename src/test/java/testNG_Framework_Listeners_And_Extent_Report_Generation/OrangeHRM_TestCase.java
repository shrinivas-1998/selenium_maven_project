package testNG_Framework_Listeners_And_Extent_Report_Generation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(testNG_Framework_Listeners_And_Extent_Report_Generation.MyListeners.class)
public class OrangeHRM_TestCase 
{
	WebDriver driver;
	@BeforeClass
      public void SetUP() throws InterruptedException
      {
		  driver = new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	  Thread.sleep(5000);
      }
	
	@Test(priority = 1)
	public void testLogo()
	{
		boolean status =driver.findElement(By.xpath("//div[@class = 'orangehrm-login-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority = 2)
	public void testURL()
	{
	  String currentURL	=driver.getCurrentUrl();
	  Assert.assertEquals(currentURL, "https://opensource-demo");
	  // Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
	}
	
	@Test(priority = 3, dependsOnMethods = "testURL")
	public void testTitle()
	{
		 String title = driver.getTitle();
		 Assert.assertEquals(title, "OrangeHRM");
		// Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass 
	public void tearDown()
	{
		driver.quit();
	}	
}
