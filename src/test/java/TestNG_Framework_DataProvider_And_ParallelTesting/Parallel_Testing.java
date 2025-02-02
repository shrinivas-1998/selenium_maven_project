package TestNG_Framework_DataProvider_And_ParallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Testing 
{
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser", "url"})
      public void SetUP(String br, String url) throws InterruptedException
      {
		
		switch(br.toLowerCase())
		{
		case "chrome" :  driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case "firefox" : driver = new FirefoxDriver();
		default : System.out.println("Invalid Browser"); return;
		}
    	 
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	  driver.get(url);
    	  Thread.sleep(5000);
      }
	
	@Test(priority = 1)
	public void testLogo()
	{
		boolean status =driver.findElement(By.xpath("//div[@class = 'orangehrm-login-branding']")).isDisplayed();
		Assert.assertEquals(status, status);
	}
	
	@Test(priority = 2)
	public void testTitle()
	{
		 String title = driver.getTitle();
		 Assert.assertEquals(title, "OrangeHRM");
		// Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority = 3)
	public void testURL()
	{
	  String currentURL	=driver.getCurrentUrl();
	  Assert.assertEquals(currentURL, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  // Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
	}
	
	@AfterClass 
	public void tearDown()
	{
		driver.quit();
	}	
}
