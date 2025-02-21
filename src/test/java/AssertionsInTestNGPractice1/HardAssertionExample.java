package AssertionsInTestNGPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertionExample 
{
	WebDriver driver;

	@BeforeTest
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void testLogin() 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();

		// **Hard Assertion**
		// String expectedTitle = "OrangeHRM";
		String expectedTitle = "OrangeHRM123";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");

		// This step will be skipped if the assertion fails
		WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		Assert.assertTrue(dashboard.isDisplayed(), "Dashboard is not displayed!");
	}

	@AfterTest
	public void tearDown() 
	{
		driver.quit();
	}
}
