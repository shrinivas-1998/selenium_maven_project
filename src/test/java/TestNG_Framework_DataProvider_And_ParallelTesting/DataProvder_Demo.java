package TestNG_Framework_DataProvider_And_ParallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvder_Demo 
{
	WebDriver driver;
   @BeforeClass
	   public void setup()
	   {
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   }
  
   @Test(dataProvider = "dp")
   public void TestLogin(String username, String Password) throws InterruptedException
   {
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	   driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys(username);
	   driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys(Password); 
	   driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	  
	   Thread.sleep(4000);
	   
	   boolean status = driver.findElement(By.xpath("//h6[text() = 'Dashboard']")).isDisplayed();
	   System.out.println(status);
	   
	   if(status==true)
	   {
		   driver.findElement(By.xpath("//p[text() = 'manda user']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//a[text() = 'Logout']")).click();
		   Assert.assertTrue(true);
	   }
	   else 
	   {
		   Assert.fail();
	   }
	     
   }
   
   @AfterClass
   public void TearDown()
   {
	   driver.quit();
   }
   
   @DataProvider(name = "dp")
   public Object[][] LoginData()
   {
	   Object data[][] = { 
			             {"Admin", "admin123"},
			             {"Admin1", "admin123"},
			             {"Admin2", "admin123"},
			             {"Admin3", "admin123"},
			             {"Admin4", "admin123"},
			             {"Admin5", "admin123"},
			             {"Admin", "admin123"},
	                     };
	   return data;
   }
}
