package parameterisationInTestNGPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ByUsingDataProvider 
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
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();

		Thread.sleep(4000);

		boolean status = driver.findElement(By.xpath("//h6[text() = 'Dashboard']")).isDisplayed();
		System.out.println(status);

		if (status == true) 
		{
			driver.findElement(By.xpath("//p[@class = 'oxd-userdropdown-name']")).click();
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
	public void TearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.quit();
	}

	@DataProvider(name = "dp")
	// @DataProvider(name = "dp", indices={0, 1, 6}) // if you want to select some
	// credentials only them=n use this
	public Object[][] loginData() 
	{
		Object data[][] = { { "Admin", "admin123" }, { "Admin", "admin1234" }, { "Admin1", "admin123" },
				{ "Admin2", "admin123" }, { "Admin", "admin1235" }, { "Adminr", "admin1234" },
				{ "Admin234", "admin123" }, };
		return data;
	}
}
